define(["dijit/form/Form", "dijit/form/ValidationTextBox", "dijit/form/Button", "dijit/form/FilteringSelect",
    "dijit/registry", "app/util/constants", "dojox/widget/Standby", "dojo/_base/xhr", "app/util/jsUtils"
],
        function(Form, ValidationTextBox, Button, FilteringSelect, registry, constants, Standby, xhr, jsUtils) {

            var formCapUsuario, username, passwordCap, passwordCapConf, nombreUsuarioCap, email,
                    preguntaCap, respuestaCap, actInactCap, idUsuario, btnAceptarCap, standby;

            function init() {
                initCampos();
                initBotones();
                standby.hide();
            }

            function initCampos() {
                formCapUsuario = new Form({}, 'registraUsuario');

                standby = new Standby({
                    id: 'standby_initRegistraUsuario',
                    target: "registraUsuario",
                    'class': "dijitContentPaneLoading"
                });
                document.body.appendChild(standby.domNode);
                standby.startup();
                standby.show();

                username = new ValidationTextBox({
                    name: 'username',
                    id: 'username',
                    placeHolder: 'Indique su R.F.C.',
                    regExp: constants.RFC_VALID,
                    missingMessage: 'Obligatorio',
                    required: true,
                    uppercase: true,
                    maxLength: 13,
                    onChange: function(data) {
                        setUsuario();
                    }
                }, 'username');

                nombreUsuarioCap = new ValidationTextBox({
                    name: 'nombreUsuario',
                    id: 'nombreUsuario',
                    placeHolder: 'Nombre del usuario',
                    type: 'text',
                    style: constants.LONG_STYLE,
                    required: true,
                    disabled: true
                }, 'vNombreUsuario');

                email = new ValidationTextBox({
                    placeHolder: 'Indique el E-mail',
                    name: 'email',
                    id: 'email',
                    regExp: constants.MAIL_VALID,
                    type: 'text',
                    style: constants.LONG_STYLE,
                    required: true,
                    uppercase: false,
                    maxLength: 100
                }, 'email');

                preguntaCap = new FilteringSelect({
                    name: "idPregunta",
                    id: 'idPregunta',
                    //	store: object,
                    searchAttr: "descripcion",
                    placeHolder: 'Seleccione la pregunta',
                    style: constants.LONG_STYLE,
                    required: true
                }, "idPregunta");

                jsUtils.getMemory({
                    urlBase: dojo.config.app.urlBase,
                    requestMapping: 'configuracion/preguntas/todos/' + Math.floor(Math.random() * 1000),
                    load: function(object) {
                        preguntaCap.set('store', object);
                    }
                });

                respuestaCap = new ValidationTextBox({
                    name: 'respuesta',
                    id: 'respuesta',
                    placeHolder: 'Indique la respuesta a la pregunta seleccionada',
                    type: 'text',
                    style: constants.LONG_STYLE,
                    required: true,
                    uppercase: true, 
                    maxLength: 30
                }, 'vRespuesta');

                passwordCap = new ValidationTextBox({
                    placeHolder: 'Indique la Contrase\u00F1a',
                    regExp: constants.PASSWORD_VALID,
                    type: 'text',
                    style: constants.LONG_STYLE,
                    required: true,
                    uppercase: false,
                    type: 'password',
                    maxLength: 18
                }, 'vPassword');

                passwordCapConf = new ValidationTextBox({
                    placeHolder: 'Confirme la Contrase\u00F1a',
                    regExp: constants.PASSWORD_VALID,
                    type: 'text',
                    style: constants.LONG_STYLE,
                    required: true,
                    uppercase: false,
                    type: 'password',
                    maxLength: 18
                }, 'vPasswordC');

                actInactCap = new ValidationTextBox({
                    name: 'usuarioActivo',
                    id: 'usuarioActivo',
                    type: 'hidden'
                }, 'usuarioActivo');

                idUsuario = new ValidationTextBox({
                    name: 'idUsuario',
                    id: 'idUsuario',
                    required: true,
                    type: 'hidden'
                }, 'idUsuario');
            }

            function initBotones() {
                new Button({
                    type: 'button',
                    label: 'Cancelar',
                    onClick: function() {
                        standby.destroy();
                        location.href="login.jsp";
                    }
                }, 'btnCancelarUsuario');

                btnAceptarCap = new Button({
                    type: 'button',
                    label: 'Aceptar',
                    disabled: true,
                    onClick: function() {
                            onAceptar();
                    }
                }, 'btnAceptarUsuario');
            }

            function setUsuario() {
                iniDatos();
                if (username.validate()) {
                    var object = {
                        username: username.get('value')
                    }
                    xhr.post({
                        url: dojo.config.app.urlBase + 'configuracion/usuario/registrarCuenta/buscaPorRfc/',
                        postData: dojo.toJson(object),
                        headers: {
                            "Content-Type": "application/json; charset=UTF-8"
                        },
                        handleAs: 'json',
                        load: function(data) {
                            if (!data[0]) {
                                alert("El RFC no esta registrado como empleado activo de la Secretar\u00EDa");
                                btnAceptarCap.set('disabled', true);
                                return;
                            } else {
                                if (data[0].usuarioHabilitado == true) {
                                    alert("El usuario ya ha sido registrado");
                                    btnAceptarCap.set('disabled', true);
                                    return;
                                }
                                if (data[0].usuarioActivo == false) {
                                    alert("El usuario se encuentra inhabilitado para ingresar al Portal de Autoservicios");
                                    btnAceptarCap.set('disabled', true);
                                    return;
                                } else {
                                    objectSet = {
                                        nombreUsuario: data[0].nombreUsuario,
                                        idUsuario: data[0].idUsuario,
                                        usuarioActivo: data[0].usuarioActivo
                                    };
                                    jsUtils.setVarWidgetFromObject(objectSet, null);
                                    btnAceptarCap.set('disabled', false);
                                }
                            }
                        }
                    });
                }
            }
            
            function iniDatos(){
                nombreUsuarioCap.reset();
                preguntaCap.reset();
                respuestaCap.reset();
                email.reset();
                passwordCap.reset();
                passwordCapConf.reset();
                idUsuario.reset();
            }
            
            function onAceptar() {
                if (formCapUsuario.validate()) {
                    if (passwordCap.get('value') != passwordCapConf.get('value')) {
                        alert("La contrase\u00F1a y su confirmaci\u00F3n no son iguales, verifique");
                        return(-1);
                    }
                    if (confirm('\u00BFDesea registrar la informaci\u00F3n de Usuario?')) {
                        var object = {
                            username: username.get('value'),
                            nombreUsuario: nombreUsuarioCap.get('value'),
                            email: email.get('value'),
                            idPregunta: preguntaCap.item.idPregunta,
                            respuesta: respuestaCap.get('value'),
                            password: passwordCap.get('value'),
                            usuarioActivo: actInactCap.get('value'),
                            usuarioHabilitado: true,
                            idUsuario: idUsuario.get('value')
                        };
                        
                        console.log(dojo.config.app.urlBase + 'configuracion/usuario/registrarCuenta/registrar');
                        jsUtils.submitObject({
                            urlBase: dojo.config.app.urlBase,
                            requestMapping: 'configuracion/usuario/registrarCuenta/registrar',
                            data: object,
                            configModule: { standby: standby},
                            load: function(data) {
                                username.reset();
                                iniDatos();
                                alert("Se registr\u00F3 correctamente la cuenta de Usuario");
                                standby.destroy();
                                location.href="login.jsp";
                            }
                        });
                    }
                }
            }

            return {
                init: init
            };
        });
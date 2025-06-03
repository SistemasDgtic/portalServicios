define(["dijit/form/Form",
    "dijit/form/ValidationTextBox",
    "dijit/form/Button",
    "dijit/form/CheckBox",
    "dijit/form/FilteringSelect",
    "dijit/registry",
    "app/util/constants",
    "dojo/_base/lang",
    "dojo/dom-style",
    "dojo/_base/xhr",
    "app/util/jsUtils"
],
        function(Form,
                ValidationTextBox,
                Button,
                CheckBox,
                FilteringSelect,
                registry,
                constants,
                lang,
                Style,
                xhr,
                jsUtils) {

            var modConfig;
            var formCapUsuario, username, passwordCap, passwordCapConf, nombreUsuarioCap, email, ckBoxPasswordCap,
                    preguntaCap, respuestaCap, actInactCap, idUsuario, btnAceptarCap;

            var objectWidget = function() {
                return {
                    idPregunta: preguntaCap,
                    username: username,
                    nombreusuario: nombreUsuarioCap,
                    email: email,
                    respuesta: respuestaCap,
                    usuarioActivo: actInactCap,
                    idUsuario: idUsuario
                };
            };

            function init(config) {
                configModule = config;

                aleatorio = "CC" + Math.floor(Math.random() * 1000);
                var output = lang.replace(
                        lang.clone(configModule.template + ""),
                        {aleatorio: aleatorio}
                );
                configModule.contenedor.set('content', output);
                initCampos();
                initBotones();
                deshabilitaPass();
            }

            function initCampos() {
                formCapUsuario = new Form({}, 'cambioClave' + aleatorio);

                username = new ValidationTextBox({
                    name: 'username',
                    id: 'username' + aleatorio,
                    placeHolder: 'Indique clave del Usuario',
                    type: 'text',
                    style: constants.LONG_STYLE,
                    required: false,
                    readOnly: true
                }, 'username' + aleatorio);

                nombreUsuarioCap = new ValidationTextBox({
                    name: 'nombreUsuario',
                    id: 'nombreUsuario' + aleatorio,
                    placeHolder: 'Indique Nombre del usuario',
                    type: 'text',
                    style: constants.LONG_STYLE,
                    required: false,
                    readOnly: true
                }, 'vNombreUsuario' + aleatorio);

                email = new ValidationTextBox({
                    placeHolder: 'Indique el E-mail',
                    name: 'email',
                    id: 'email' + aleatorio,
                    regExp: constants.MAIL_VALID,
                    type: 'text',
                    style: constants.LONG_STYLE,
                    required: true,
                    uppercase: false,
                    maxLength: 100
                }, 'email' + aleatorio);

                preguntaCap = new FilteringSelect({
                    name: "idPregunta",
                    id: 'idPregunta' + aleatorio,
                    //	store: object,
                    searchAttr: "descripcion",
                    placeHolder: 'Seleccione la pregunta',
                    style: constants.LONG_STYLE,
                    required: true
                }, "idPregunta" + aleatorio);

                jsUtils.getMemory({
                    urlBase: dojo.config.app.urlBase,
                    requestMapping: 'configuracion/preguntas/todos/' + Math.floor(Math.random() * 1000),
                    load: function(object) {
                        preguntaCap.set('store', object);
                    }
                });

                respuestaCap = new ValidationTextBox({
                    name: 'respuesta',
                    id: 'respuesta' + aleatorio,
                    placeHolder: 'Indique la respuesta a la pregunta seleccionada',
                    type: 'text',
                    style: constants.LONG_STYLE,
                    required: false,
                    uppercase: true,
                    maxLength: 30
                }, 'vRespuesta' + aleatorio);

                ckBoxPasswordCap = new CheckBox({
                    name: "ckPassword",
                    value: "true",
                    checked: false,
                    title: "Seleccione si desea actualizar contrase\u00F1a",
                    onChange: function(b) {
                        onActPassword(b);
                    }
                }, 'ckPassword' + aleatorio);

                passwordCap = new ValidationTextBox({
                    placeHolder: 'Indique la Contrase\u00F1a',
                    regExp: constants.PASSWORD_VALID,
                    type: 'text',
                    style: constants.LONG_STYLE,
                    required: true,
                    uppercase: false,
                    type: 'password',
                            maxLength: 18
                }, 'vPassword' + aleatorio);

                passwordCapConf = new ValidationTextBox({
                    placeHolder: 'Confirme la Contrase\u00F1a',
                    regExp: constants.PASSWORD_VALID,
                    type: 'text',
                    style: constants.LONG_STYLE,
                    required: true,
                    uppercase: false,
                    type: 'password',
                            maxLength: 18
                }, 'vPasswordC' + aleatorio);
                
                actInactCap = new ValidationTextBox({
                    name: 'usuarioActivo',
                    id: 'usuarioActivo' + aleatorio,
                    type: 'hidden'
                }, 'usuarioActivo' + aleatorio);
                
                idUsuario = new ValidationTextBox({
                    name: 'idUsuario',
                    id: 'idUsuario' + aleatorio,
                    type: 'hidden'
                }, 'idUsuario' + aleatorio);

                xhr.get({
                    url: configModule.urlBase + 'seguridad/menu/obtieneUsuario/' + Math.floor(Math.random() * 1000),
                    handleAs: 'json',
                    load: function(data) {
                        jsUtils.setVarWidgetFromObject(data, objectWidget(), aleatorio);
                        console.log(data);
                    }
                });
                
            }

            function initBotones() {
                new Button({
                    type: 'button',
                    label: 'Cancelar',
                    onClick: function() {
                        configModule.cerrarTab();
                    }
                }, 'btnCancelarUsuario' + aleatorio);

                btnAceptarCap = new Button({
                    type: 'button',
                    label: 'Aceptar',
                    onClick: function() {
                        onAceptar();
                    }
                }, 'btnAceptarUsuario' + aleatorio);
            }

            function deshabilitaPass() {
                passwordCap.set('disabled', true);
                passwordCapConf.set('disabled', true);
            }

            function onActPassword(objectValue) {
                if (objectValue == true) {
                    passwordCap.set('disabled', false);
                    passwordCapConf.set('disabled', false);
                } else {
                    passwordCap.set('disabled', true);
                    passwordCapConf.set('disabled', true);
                }
            }

            function onAceptar() {
                if (formCapUsuario.validate()) {
                    if (passwordCap.get('value') != passwordCapConf.get('value')) {
                        alert("La contrase\u00F1a y su confirmaci\u00F3n no son iguales, verifique");
                        return(-1);
                    }
                    if (confirm('\u00BFDesea modificar la informaci\u00F3n de Usuario?')) {
                        var object = {
                            username: username.get('value'),
                            nombreUsuario: nombreUsuarioCap.get('value'),
                            email: email.get('value'),
                            idPregunta: preguntaCap.item.idPregunta,
                            respuesta: respuestaCap.get('value'),
                            password: passwordCap.get('value'),
                            usuarioActivo: actInactCap.get('value'),
                            idUsuario: idUsuario.get('value')
                        };
                        
                        var accion;
                        if (ckBoxPasswordCap.get('value')) {
                            accion = "modificarPassword";
                        } else {
                            accion = "modificar";
                            object.password = null;
                        }
                        console.log(configModule.urlBase + 'configuracion/usuario/modificarPassword/' + ckBoxPasswordCap.get('value'));
                        jsUtils.submitObject({
                            urlBase: configModule.urlBase,
                            requestMapping: 'configuracion/usuario/' + accion,
                            data: object,
                            configModule: configModule,
                            load: function(data) {
                                dojo.publish("/app/notificacion", [{
                                        message: 'Se actualiz\u00F3 correctamente el Usuario',
                                        type: "message",
                                        duration: 4000
                                    }]);
                            }
                        });
                    }
                }
            }

            return {
                init: init
            };
        });
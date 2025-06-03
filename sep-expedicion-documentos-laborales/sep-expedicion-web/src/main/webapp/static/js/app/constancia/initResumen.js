define(["dijit/form/Form",
    "dijit/form/ValidationTextBox",
    "dijit/form/Button",
    "dijit/registry",
    "app/util/constants",
    "dojo/_base/lang",
    "dojo/dom-style",
    "dojo/_base/xhr",
    "app/util/jsUtils",
    "dojo/dom-form",
    "dojo/dom",
],
        function(Form,
                ValidationTextBox,
                Button,
                registry,
                constants,
                lang,
                Style,
                xhr,
                jsUtils,
                domForm,
                dom) {

            var configModule = null;
            var aleatorio = null;
            var formCapUsuario, username, nombreUsuario, anio, btnImprimir;

            var objectWidget = function() {
                return {
                    username: username,
                    nombreusuario: nombreUsuario,
                    anio: anio
                };
            };

            function init(config) {
                configModule = config;

                aleatorio = "Resumen" + Math.floor(Math.random() * 1000);
                var output = lang.replace(
                        lang.clone(configModule.template + ""),
                        {aleatorio: aleatorio}
                );
                configModule.contenedor.set('content', output);
                initCampos();
                initBotones();
            }

            function initCampos() {
                formCapUsuario = new Form({}, 'resumen' + aleatorio);

                username = new ValidationTextBox({
                    name: 'username',
                    id: 'username' + aleatorio,
                    placeHolder: 'Indique R.F.C.',
                    type: 'text',
                    style: constants.LONG_STYLE,
                    required: true,
                    disabled: true
                }, 'username' + aleatorio);

                nombreUsuario = new ValidationTextBox({
                    name: 'nombreUsuario',
                    id: 'nombreUsuario' + aleatorio,
                    placeHolder: 'Indique Nombre del trabajador',
                    type: 'text',
                    style: constants.LONG_STYLE,
                    required: true,
                    disabled: true
                }, 'vNombreUsuario' + aleatorio);

                anio = new ValidationTextBox({
                    placeHolder: 'Indique el A\u00F1o Fiscal',
                    name: 'anio',
                    id: 'anio' + aleatorio,
                    regExp: constants.ANIO_VALID,
                    type: 'text',
                    style: constants.MEDIUM_STYLE,
                    required: true,
                    maxLength: 4
                }, 'anio' + aleatorio);

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
                }, 'btnCancelarResumen' + aleatorio);

                btnImprimir = new Button({
                    type: 'button',
                    label: 'Imprimir',
                    onClick: function() {
                        if (anio.get('value') != "") {
                            send(username.get('value'), anio.get('value'));
                        } else {
                            dojo.publish("/app/notificacion", [{
                                    message: 'Indique el ejercicio fiscal',
                                    type: "error",
                                    duration: 4000
                                }]);
                        }
                    }
                }, 'btnImprimirResumen' + aleatorio);
            }

            function send(username, anio) {
                var tokenVar = new Date().getTime();
                var object = {username: username,
                    anio: anio,
                    token: tokenVar};
                object = jsUtils.excludeNullProperties(object);
                var contentForm = dom.byId('contentForm' + aleatorio);
                var proper = {
                    name: 'sendForm' + aleatorio,
                    id: 'sendForm' + aleatorio,
                    method: 'GET',
                    action: configModule.urlBase + 'jasper/repResumen',
                    target: 'hiddenIFrame' + aleatorio
                };
                var form = jsUtils.objectToForm(object, contentForm, proper);
                console.log(form);
                form.submit();
                btnImprimir.set('disabled', true);
                var pollDownload = setInterval(function() {
                    if (document.cookie.indexOf("downloadResumen=" + tokenVar) > -1) {
                        document.cookie = "downloadResumen=" + tokenVar + "; expires=" + new Date(0).toGMTString() + "; path=/";
                        btnImprimir.set('disabled', false);
                        clearInterval(pollDownload);
                    }
                }, 500);
            }

            return {
                init: init
            };
        });
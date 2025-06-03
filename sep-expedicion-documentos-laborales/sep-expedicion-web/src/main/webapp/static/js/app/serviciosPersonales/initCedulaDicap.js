define([
    "dojo/_base/xhr",
    "dojox/data/JsonRestStore",
    "dijit/form/ValidationTextBox",
    "dijit/form/Form",
    "dijit/form/NumberTextBox",
    "dijit/form/FilteringSelect",
    "dijit/form/DateTextBox",
    "dijit/form/Button",
    "dojo/_base/lang",
    "dojo/_base/json",
    "app/util/constants",
    "app/util/jsUtils",
    "dojo/data/ObjectStore",
    "dojox/data/JsonRestStore",
    "dojo/store/Memory",
    "dijit/Tooltip",
    "dojo/on",
    "dojo/window",
    "dojo/dom-form",
    "dojo/dom",
    "dojox/grid/EnhancedGrid",
    "dojox/grid/enhanced/plugins/Pagination"
],
        function(
                xhr,
                JsonRestStore,
                ValidationTextBox,
                Form,
                NumberTextBox,
                FilteringSelect,
                DateTextBox,
                Button,
                lang,
                dojo,
                constants,
                jsUtils,
                ObjectStore,
                JsonRestStore,
                Memory,
                Tooltip,
                on,
                win,
                domForm,
                dom,
                EnhancedGrid
                ) {
            var configModule = null;
            var aleatorio = null;
            var registroDicapForm;
            var rfc;
            var btnGuardar;
            function init(config) {
                configModule = config;
                aleatorio = "registroDicap" + Math.floor(Math.random() * 1000);
                var output = lang.replace(
                        configModule.template,
                        {aleatorio: aleatorio}
                );
                configModule.contenedor.set('content', output);
                initCampos();
                initBotones();
            }

            //Se verifica si hay session:
            function checkSesion() {
                var checkSesion = dojo.xhrGet({//								
                    url: dojo.config.app.urlBase + "seguridad/menu/checkSesion",
                    handleAs: "text",
                    sync: true,
                    timeout: 5000, // Time in milliseconds
                    preventCache: true,
                    load: function(response, ioArgs) {
                        //Se verifica si por el framework de seguridad, se obtuvo una respuesta no boolean
                        if (response.length != 4) {
                            alert("LA SESI\u00D3N DE USUARIO HA CADUCADO, VUELVA A INGRESAR SU USUARIO Y CONTRASE\u00D1A");
                            location.href = "login.jsp";
                        }
                        return response;
                    },
                    // The ERROR function will be called in an error case.
                    error: function(response, ioArgs) { //
                        alert("LA SESI\u00D3N DE USUARIO HA CADUCADO, VUELVA A INGRESAR SU USUARIO Y CONTRASE\u00D1A");
                        location.href = "login.jsp";
                        return response;
                    }
                });
            }


            function initCampos() {
                registroDicapForm = new Form({id: 'registroDicapForm' + aleatorio}, 'registroDicapForm' + aleatorio);
                rfc = new ValidationTextBox({
                    placeHolder: 'Indique el R.F.C.',
                    name: 'rfc',
                    id: 'rfc' + aleatorio,
                    regExp: constants.RFC_VALID,
                    type: 'text',
                    style: constants.MEDIUM_STYLE,
                    required: true,
                    uppercase: true,
                    //missingMessage: 'Obligatorio',
                    maxLength: 13
                }, 'rfc' + aleatorio);
            }

            function initBotones() {
                new Button({
                    type: 'button',
                    label: 'Guardar',
                    id: 'btnGuardar' + aleatorio,
                    onClick: function() {
                        checkSesion();
                        buscar();
                    }
                }, 'btnGuardar' + aleatorio);
            }

            return {
                init: init
            };
        });




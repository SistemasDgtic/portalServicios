define([
    "dojo/_base/xhr",
    "dojox/data/JsonRestStore",
    "dijit/form/ValidationTextBox",
    "dijit/form/Form",
    "dijit/form/Button",
    "dojo/_base/lang",
    "dojo/_base/json",
    "app/util/constants",
    "app/util/jsUtils",
    "dojox/data/JsonRestStore",
    "dijit/Tooltip",
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
                Button,
                lang,
                dojo,
                constants,
                jsUtils,
                JsonRestStore,
                Tooltip,
                domForm,
                dom,
                EnhancedGrid
                ) {
            var configModule = null;

            var aleatorio = null;
            var busquedaConstanciasForm;
            var idConstancia, rfc, anio, token;
            var bndRol = 2;
            var gridConstancias;
            var btnImp;

            function init(config) {
                configModule = config;
                aleatorio = "constanciaEmpl" + Math.floor(Math.random() * 1000);
                var output = lang.replace(
                        configModule.template,
                        {aleatorio: aleatorio}
                );
                configModule.contenedor.set('content', output);
                initCriteriosBusqueda();
                initBotones();
                initGrid();
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


            function initCriteriosBusqueda() {
                busquedaConstanciasForm = new Form({id: 'busquedaConstanciasForm' + aleatorio}, 'busquedaConstanciasForm' + aleatorio);

                idConstancia = new ValidationTextBox({
                    name: 'idConstancia',
                    id: 'idConstancia' + aleatorio,
                    regExp: constants.NUMBER_VALID_IN,
                    maxLength: 12,
                    type: 'hidden',
                    style: constants.MEDIUM_STYLE
                }, 'idConstancia' + aleatorio);
                busquedaConstanciasForm.startup();

                rfc = new ValidationTextBox({
                    placeHolder: 'Indique el R.F.C.',
                    name: 'rfc',
                    id: 'rfc' + aleatorio,
                    regExp: constants.RFC_VALID,
                    type: 'text',
                    style: constants.MEDIUM_STYLE,
                    required: true,
                    uppercase: true,
                    maxLength: 13
                }, 'rfc' + aleatorio);

                anio = new ValidationTextBox({
                    placeHolder: 'Indique el A\u00F1o Fiscal',
                    name: 'anio',
                    id: 'anio' + aleatorio,
                    regExp: constants.ANIO_VALID,
                    type: 'text',
                    style: constants.MEDIUM_STYLE,
                    required: false,
                    uppercase: true,
                    maxLength: 4
                }, 'anio' + aleatorio);

                xhr.get({
                    url: configModule.urlBase + 'configuracion/usuario/obtieneRol/' + Math.floor(Math.random() * 10000),
                    load: function(data) {
                        console.log("rol-" + data);
                        jsUtils.submitUrl({
                            urlBase: configModule.urlBase,
                            requestMapping: 'seguridad/menu/obtieneUsuarioSesion/' + Math.floor(Math.random() * 10000),
                            configModule: configModule,
                            load: function(data2) {
                                rfc.set('value', data2.username);
                                console.log("username-" + data2.username);
                            }
                        });
                        if (data == 'ROLE_ADMINISTRADOR') {
                            rfc.set('readOnly', false);
                            bndRol = 1;
                        } else if (data == 'ROLE_USUARIO') {
                            bndRol = 2;
                            rfc.set('readOnly', true);
                        } else {
                            bndRol = 3;
                            rfc.set('readOnly', false);
                        }
                    }
                });
            }

            function initBotones() {
                new Button({
                    type: 'button',
                    label: 'Buscar',
                    id: 'btnBuscar' + aleatorio,
                    onClick: function() {
                        checkSesion();
                        buscar();
                    }
                }, 'btnBuscar' + aleatorio);
                new Tooltip({
                    connectId: ['btnBuscar' + aleatorio],
                    label: "Encontrar una constancia",
                    position: ['above']
                });

                btnImp = new Button({
                    type: 'button',
                    label: 'Imprimir',
                    id: 'btnImprimir' + aleatorio,
                    onClick: function() {
                        var items = gridConstancias.selection.getSelected();
                        if (items.length) {
                            console.log("---id:" + items[0].idConstancia);
                            send(items[0].idConstancia, items[0].anio);
                        } else {
                            alert("Seleccione la constancia a imprimir, de clic en el registro deseado");
                            return;
                        }
                    }
                }, 'btnImprimir' + aleatorio);
                new Tooltip({
                    connectId: ['btnImprimir' + aleatorio],
                    label: "Imprimir constancia",
                    position: ['above']
                });

                new Button({
                    type: 'button',
                    label: 'Limpiar',
                    id: 'btnLimpiar' + aleatorio,
                    onClick: function() {
                        if (bndRol == 1 || bndRol == 3) {
                            busquedaConstanciasForm.reset();
                        } else {
                            anio.set('value', "");
                        }
                        var emptyStore = "";
                        gridConstancias.selection.clear();
                        gridConstancias.setStore(emptyStore);
                    }
                }, 'btnLimpiar' + aleatorio);
                new Tooltip({
                    connectId: ['btnLimpiar' + aleatorio],
                    label: "Limpiar criterios de b\u00FAsqueda",
                    position: ['above']
                });

                new Button({
                    type: 'button',
                    label: 'Cancelar',
                    id: 'btnCerrar' + aleatorio,
                    onClick: function() {
                        toolTipCerrar.destroyRecursive();
                        configModule.cerrarTab();
                    }
                }, 'btnCerrar' + aleatorio);
                var toolTipCerrar = new Tooltip({
                    connectId: ['btnCerrar' + aleatorio],
                    label: "Cerrar la impresi\u00F3n de constancias",
                    position: ['above']
                });
            }

            function initGrid() {
                formatCalculo = function(calculo) {
                    if (calculo == 'S') {
                        return 'SI';
                    }
                    if (calculo == 'N') {
                        return 'NO';
                    }
                };

                var layoutConstancias = [
                    {name: "A\u00F1o Fiscal", field: "anio", width: "10%"},
                    {name: "RFC", field: "rfc", width: "10%"},
                    {name: "CURP", field: "cveUnica", width: "20%"},
                    {name: "Nombre", field: "nomEmp", width: "30%"},
                    {name: "Patr\u00F3n Realiz\u00F3 C\u00E1lculo Anual", field: "calculo", formatter: formatCalculo, width: "30%"}
                ];

                gridConstancias = new EnhancedGrid({
                    structure: layoutConstancias,
                    selectionMode: "single",
                    rowsPerPage: 10,
                    rowSelector: '20px',
                    style: {height: '300px', width: '100%'},
                    escapeHTMLInData: false, //aplicar esta propiedad
                    errorMessage: "Problemas al recuperar informaci\u00F3n",
                    loadingMessage: "Cargando informaci\u00F3n",
                    noDataMessage: "No existe informaci\u00F3n para mostrar",
                    plugins: {
                        pagination: {
                            description: true,
                            sizeSwitch: false,
                            pageStepper: true,
                            gotoButton: true,
                            //page step to be displayed
                            maxPageStep: 4,
                            //position of the pagination bar
                            position: "bottom"
                        }
                    }
                }, "gridConstancias" + aleatorio);
                gridConstancias.startup();
                gridConstancias.resize();
            }

            function buscar() {
                if (busquedaConstanciasForm.validate()) {
                    var formObject = domForm.toObject('busquedaConstanciasForm' + aleatorio);
                    var object = jsUtils.excludeNullProperties(formObject);
                    var formQuery = jsUtils.objectToQuery(object);
                    var criterios = "?";
                    criterios += formQuery
                    criterios += "&none=1";
                    var store = new JsonRestStore({target: dojo.config.app.urlBase + "/constancias/form37/" + criterios});
                    gridConstancias.setStore(store);
                    gridConstancias.currentPage(1);
                }
            }

            function send(idConstancia, anio) {
                var tokenVar = new Date().getTime();
                var object = {idConstancia: idConstancia,
                    anio: anio,
                    token: tokenVar};
                object = jsUtils.excludeNullProperties(object);
                var contentForm = dom.byId('contentForm' + aleatorio);
                var proper = {
                    name: 'sendForm' + aleatorio,
                    id: 'sendForm' + aleatorio,
                    method: 'GET',
                    action: configModule.urlBase + 'jasper/repConstanciaForm37',
                    target: 'hiddenIFrame' + aleatorio
                };
                var form = jsUtils.objectToForm(object, contentForm, proper);
                console.log(form);
                form.submit();
                btnImp.set('disabled', true);
                var pollDownload = setInterval(function() {
                    if (document.cookie.indexOf("downloadForm37=" + tokenVar) > -1) {
                        document.cookie = "downloadForm37=" + tokenVar + "; expires=" + new Date(0).toGMTString() + "; path=/";
                        btnImp.set('disabled', false);
                        clearInterval(pollDownload);
                    }
                }, 500);
            }


            return {
                init: init
            };

        });


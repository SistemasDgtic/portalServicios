
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
            var busquedaComprobanteForm;
            var idComprobante, rfc, anio, quincena;
            var bndRol = 2;
            var gridComprobantes;
            var btnImp;
            function init(config) {
                configModule = config;
                aleatorio = "comprobanteEmpl" + Math.floor(Math.random() * 1000);
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
                busquedaComprobanteForm = new Form({id: 'busquedaComprobanteForm' + aleatorio}, 'busquedaComprobanteForm' + aleatorio);
                idComprobante = new ValidationTextBox({
                    name: 'idComprobante',
                    id: 'idComprobante' + aleatorio,
                    placeHolder: 'Indique el n\u00FAmero de comprobante',
                    invalidMessage: "N\u00FAmero comprobante no valido.",
                    regExp: constants.NUMBER_VALID_IN,
                    maxLength: 12,
                    type: 'hidden',
                    style: constants.MEDIUM_STYLE
                }, 'idComprobante' + aleatorio);
                busquedaComprobanteForm.startup();
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
                anio = new ValidationTextBox({
                    placeHolder: 'Indique el A\u00F1o',
                    name: 'anio',
                    id: 'anio' + aleatorio,
                    regExp: constants.ANIO_VALID,
                    type: 'text',
                    style: constants.MEDIUM_STYLE,
                    required: false,
                    uppercase: true,
                    //missingMessage: 'Obligatorio',
                    maxLength: 4
                }, 'anio' + aleatorio);
                var quincenaStore = new Memory({
                    data: [
                        {descripcion: "01", idQna: "01"},
                        {descripcion: "02", idQna: "02"},
                        {descripcion: "03", idQna: "03"},
                        {descripcion: "04", idQna: "04"},
                        {descripcion: "05", idQna: "05"},
                        {descripcion: "06", idQna: "06"},
                        {descripcion: "07", idQna: "07"},
                        {descripcion: "08", idQna: "08"},
                        {descripcion: "09", idQna: "09"},
                        {descripcion: "10", idQna: "10"},
                        {descripcion: "11", idQna: "11"},
                        {descripcion: "12", idQna: "12"},
                        {descripcion: "13", idQna: "13"},
                        {descripcion: "14", idQna: "14"},
                        {descripcion: "15", idQna: "15"},
                        {descripcion: "16", idQna: "16"},
                        {descripcion: "17", idQna: "17"},
                        {descripcion: "18", idQna: "18"},
                        {descripcion: "19", idQna: "19"},
                        {descripcion: "20", idQna: "20"},
                        {descripcion: "21", idQna: "21"},
                        {descripcion: "22", idQna: "22"},
                        {descripcion: "23", idQna: "23"},
                        {descripcion: "24", idQna: "24"}
                    ]
                });
                quincena = new FilteringSelect({
                    name: "quincena",
                    id: 'quincena' + aleatorio,
                    searchAttr: "descripcion",
                    store: quincenaStore,
                    placeHolder: 'Seleccione',
                    style: constants.MEDIUM_STYLE,
                    required: false
                }, "quincena" + aleatorio);
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
                    label: "Encontrar un comprobante",
                    position: ['above']
                });
                btnImp = new Button({
                    type: 'button',
                    label: 'Imprimir',
                    id: 'btnImprimir' + aleatorio,
                    onClick: function() {
                        var items = gridComprobantes.selection.getSelected();
                        if (items.length) {
                            console.log("---id:" + items[0].idComprobante + " " + items[0].qnaProc+ " "+ items[0].consQnaProc);
                            send(items[0].idComprobante, items[0].qnaProc, items[0].consQnaProc);
                        } else {
                            alert("Seleccione un comprobante a imprimir, de clic en el registro deseado");
                            return;
                        }
                        /*if (!busquedaComprobanteForm.validate()) {
                         return;
                         }*/
                    }
                }, 'btnImprimir' + aleatorio);
                new Tooltip({
                    connectId: ['btnImprimir' + aleatorio],
                    label: "Imprimir el comprobante",
                    position: ['above']
                });
                new Button({
                    type: 'button',
                    label: 'Limpiar',
                    id: 'btnLimpiar' + aleatorio,
                    onClick: function() {
                        if (bndRol == 1 || bndRol == 3) {
                            busquedaComprobanteForm.reset();
                        } else {
                            anio.set('value', "");
                            quincena.reset();
                        }
                        var emptyStore = "";
                        gridComprobantes.selection.clear();
                        gridComprobantes.setStore(emptyStore);
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
                    label: "Cerrar la impresi\u00F3n del comprobante",
                    position: ['above']
                });
            }

            var imprimeDobleClick = function() {
                var item = gridComprobantes.selection.getSelected();
                send(item[0].idComprobante);
            }

            function initGrid() {
                formatDate = function(fch) {
                    return dojo.date.locale.format(new Date(fch), {datePattern: "dd/MM/yyyy", selector: "date"});
                };
                formatPeriodo = function(fields) {
                    var ini = formatDate(fields[0]);
                    var fin = formatDate(fields[1]);
                    return ini + " al " + fin;
                };
                var layoutComprobantes = [
                    {name: "R.F.C.", field: "rfc", width: "13%"},
                    {name: "No. Comprobante", field: "numComprobante", width: "11%"},
                    {name: "Clave Presupuestal", field: "clavePresupuestal", width: "22%"},
                    {name: "Centro de Trabajo", field: "centroTrabajo", width: "15%"},
                    {name: "Fecha de Pago", field: "fechaPago", formatter: formatDate, width: "10%"},
                    {name: "Periodo de pago", fields: ["fechaIni", "fechaFin"], formatter: formatPeriodo, width: "19%"},
                    {name: "L\u00EDquido", field: "totNetoCheque", width: "10%"}
                ];
                gridComprobantes = new EnhancedGrid({
                    structure: layoutComprobantes,
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
                }, "gridComprobantes" + aleatorio);
                gridComprobantes.startup();
                gridComprobantes.resize();
                //on(gridComprobantes, "dblClick", imprimeDobleClick);
            }

            function buscar() {
                if (busquedaComprobanteForm.validate()) {
                    var formObject = domForm.toObject('busquedaComprobanteForm' + aleatorio);
                    var object = jsUtils.excludeNullProperties(formObject, ['quincena']);
                    if (quincena.item != null) {
                        if (quincena.item.idQna < "01" || quincena.item.idQna > "24") {
                            alert("La Quincena debe seleccionarse entre 01 y 24");
                            quincena.focus();
                            return;
                        }
                        if (anio.get('value') == "") {
                            alert("Debe capturar el A\u00F1o para continuar con la b\u00FAsqueda");
                            anio.focus();
                            return;
                        }
                        object.quincena = quincena.item.idQna;
                    }
                    var formQuery = jsUtils.objectToQuery(object);
                    var criterios = "?";
                    criterios += formQuery
                    criterios += "&none=1";
                    var store = new JsonRestStore({target: dojo.config.app.urlBase + "/comprobantes/pago/" + criterios});
                    gridComprobantes.setStore(store);
                    gridComprobantes.currentPage(1);
                }
            }

            function send(idComprobante, qnaProc, consQnaProc) {
                var tokenVar = new Date().getTime();
                btnImp.set('disabled', true);
                var object = {nuComprobante: idComprobante, qnaProc: qnaProc, consQnaProc: consQnaProc };
                //object = jsUtils.excludeNullProperties(object);
                var contentForm = dom.byId('contentForm' + aleatorio);
                var proper = {
                    name: 'sendForm' + aleatorio,
                    id: 'sendForm' + aleatorio,
                    method: 'GET',
                    action: configModule.urlBase + 'jasper/repReciboPago/' + tokenVar,
                    target: 'hiddenIFrame' + aleatorio,
                };
                var form = jsUtils.objectToForm(object, contentForm, proper);
                form.submit();
                var pollDownload = setInterval(function() {
                    if (document.cookie.indexOf("downloadRepReciboPago=" + tokenVar) > -1) {
                        document.cookie = "downloadRepReciboPago=" + tokenVar + "; expires=" + new Date(0).toGMTString() + "; path=/";
                        clearInterval(pollDownload);
                        btnImp.set('disabled', false);
                        jsUtils.submitUrl({
                            urlBase: configModule.urlBase,
                            requestMapping: 'jasper/eliminaQR/' + idComprobante,
                            configModule: configModule,
                            load: function(data) {
                                console.log("QR eliminado");
                            }
                        });
                    }
                }, 500);
            }


            return {
                init: init
            };
        });


define(["dojo/_base/xhr",
    "dojox/data/JsonRestStore",
    "dijit/form/ValidationTextBox",
    "dijit/form/FilteringSelect",
    "dijit/form/Button",
    "dojo/_base/lang",
    "dojo/date/locale",
    "dojo/_base/json",
    "app/util/constants",
    "app/util/jsUtils",
    "dojox/data/JsonRestStore",
    "dojo/store/Memory",
    "dijit/Tooltip",
    "dojo/on",
    "dojo/window",
    "dojo/dom-form",
    "dojo/dom",
    "app/configuracion/dialogFormQuincenas",
    "dojox/grid/EnhancedGrid",
    "dojox/grid/enhanced/plugins/Pagination"
],
        function(
                xhr,
                JsonRestStore,
                ValidationTextBox,
                FilteringSelect,
                Button,
                lang,
                locale,
                dojo,
                constants,
                jsUtils,
                JsonRestStore,
                Memory,
                Tooltip,
                on,
                win,
                domForm,
                dom,
                capQuincenasForm,
                EnhancedGrid
                ) {

            var configModule = null;
            var anioConsult, quincenaConsult, gridQuincenas, usuarioConsult;
            var aleatorio = null;

            function init(config) {
                configModule = config;
                console.log("#Entrando#");
                aleatorio = "ctrlQnas" + Math.floor(Math.random() * 1000);
                var output = lang.replace(
                        configModule.template,
                        {aleatorio: aleatorio}
                );
                configModule.contenedor.set('content', output);
                initCriteriosBusqueda();
                initGridQuincenas();
                initBotones();
                buscar();
                capQuincenasForm.init({});
            }

            function initCriteriosBusqueda() {
                anioConsult = new ValidationTextBox({
                    placeHolder: 'Indique el A\u00F1o',
                    name: 'anio',
                    id: 'anio' + aleatorio,
                    regExp: constants.ANIO_VALID,
                    uppercase: true,
                    type: 'text',
                    maxLength: 4,
                    style: 'width: 400px'
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

                quincenaConsult = new FilteringSelect({
                    name: "quincena",
                    id: 'quincena' + aleatorio,
                    searchAttr: "descripcion",
                    store: quincenaStore,
                    placeHolder: 'Seleccione',
                    style: constants.MEDIUM_STYLE,
                    required: false
                }, "quincena" + aleatorio);

                usuarioConsult = new ValidationTextBox({
                    name: 'usuario',
                    id: 'usuario' + aleatorio,
                    uppercase: true,
                    type: 'hidden',
                    style: 'width: 400px'
                }, 'usuario' + aleatorio);


                jsUtils.submitUrl({
                    urlBase: configModule.urlBase,
                    requestMapping: 'seguridad/menu/obtieneUsuarioSesion/' + Math.floor(Math.random() * 10000),
                    configModule: configModule,
                    load: function(data) {
                        usuarioConsult.set('value', data.username);
                        console.log("username-" + data.username);
                    }
                });
            }

            function formatDate(fch) {
                return locale.format(new Date(fch), {datePattern: constants.DOJO_DATETIME, selector: "date"});
            }

            function initGridQuincenas() {
                var layout = [
                    {name: "Quincena", field: "qnaProc", width: "30%"},
                    {name: "Usuario", field: "usuario", width: "35%"},
                    {name: "Fecha", field: "fechaCap", width: "35%", formatter: formatDate}
                ];

                gridQuincenas = new EnhancedGrid({
                    structure: layout,
                    selectionMode: "single",
                    rowsPerPage: 10,
                    rowSelector: '20px',
                    style: {height: '350px', width: '100%'},
                    errorMessage: "Problemas al recuperar información",
                    loadingMessage: "Cargando información",
                    noDataMessage: "No existe información para mostrar",
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
                }, "gridQuincenas" + aleatorio);
                gridQuincenas.startup();
                gridQuincenas.resize();
            }

            function initBotones() {
                new Button({
                    type: 'button',
                    id: 'btnConsulta' + aleatorio,
                    label: 'Buscar',
                    onClick: function() {
                        if (!quincenaConsult.isValid() || !anioConsult.isValid()) {
                            alert('Capture correctamente los criterios de b\u00FAsqueda ingresados');
                            return;
                        }
                        buscar();
                    }
                }, 'btnConsulta' + aleatorio);
                new Tooltip({
                    connectId: ['btnConsulta' + aleatorio],
                    label: "Encontrar quincena",
                    position: ['above']
                });

                new Button({
                    type: 'button',
                    id: 'btnAgrega' + aleatorio,
                    label: 'Habilitar',
                    onClick: function() {
                        capQuincenasForm.show({usuario: usuarioConsult.get('value')}, 'new');
                        capQuincenasForm.setOnAceptar(onAceptarNew);
                    }
                }, 'btnAgrega' + aleatorio);
                new Tooltip({
                    connectId: ['btnAgrega' + aleatorio],
                    label: 'Habilitar Quincena',
                    position: ['above']
                });

                new Button({
                    type: 'button',
                    id: 'btnElimina' + aleatorio,
                    label: 'Inhabilitar',
                    onClick: function() {
                        var items = gridQuincenas.selection.getSelected();
                        if (items.length) {
                            if (confirm('¿Desea inhabilitar la quincena ' + items[0].qnaProc + '? \n Este registro se eliminar\u00E1, pero podr\u00E1 capturarlo (Habilitar) \n en otro momento si as\u00ED lo requiere')) {
                                console.log(items[0]);
                                var object = {qnaProc: items[0].qnaProc};
                                send(object, 'eliminar', 'Se inhabilit\u00F3 correctamente la quincena ' + items[0].qnaProc);
                            }
                        } else {
                            alert("Seleccione un registro");
                        }
                    }
                }, 'btnElimina' + aleatorio);
                new Tooltip({
                    connectId: ['btnElimina' + aleatorio],
                    label: 'Inhabilitar Quincena',
                    position: ['above']
                });

                new Button({
                    type: 'button',
                    id: 'btnLimpiar' + aleatorio,
                    label: 'Limpiar',
                    onClick: function() {
                        limpiar();
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
                    onClick: function() {
                        configModule.cerrarTab();
                    }
                }, 'btnCerrar' + aleatorio);
                new Tooltip({
                    connectId: ['btnCerrar' + aleatorio],
                    label: "Cerrar control de quincenas",
                    position: ['above']
                });
            }

            function onAceptarNew(object) {
                send(object, 'guardar', 'Se habilit\u00F3 correctamente la quincena ' + object.qnaProc);
            }

            function send(object, action, message) {
                console.log(configModule.urlBase + 'configuracion/quincenas/' + action);
                console.log(object);
                configModule.standby.show();
                xhr.post({
                    url: configModule.urlBase + 'configuracion/quincenas/' + action,
                    postData: dojo.toJson(object),
                    headers: {
                        "Content-Type": "application/json; charset=UTF-8"
                    },
                    handleAs: 'json',
                    load: function(data) {
                        dojo.publish("/app/notificacion", [{
                                message: message,
                                type: "message",
                                duration: 4000
                            }]);
                        buscar();
                    },
                    handle: function() {
                        configModule.standby.hide();
                    }
                });
            }

            function buscar() {
                if (dijit.byId('quincena' + aleatorio).get('displayedValue') != "" && anioConsult.get('value') == "") {
                    alert("Debe capturar el A\u00F1o para continuar con la b\u00FAsqueda");
                    anioConsult.focus();
                    return;
                }
                var criterios = "";
                var qna = dijit.byId('quincena' + aleatorio).get('displayedValue');
                criterios += "?anio=" + anioConsult.get('value') + "&";
                criterios += "quincena=" + qna;
                criterios += "&none=1";
                var store = new JsonRestStore({target: dojo.config.app.urlBase + "/configuracion/quincenas" + criterios});
                gridQuincenas.setStore(store);
                gridQuincenas.currentPage(1);
            }

            function limpiar() {
                anioConsult.set('value', '');
                quincenaConsult.set('value', '');
                gridQuincenas.currentPage(1);
                buscar();
            }

            return {
                init: init
            };
        });
        
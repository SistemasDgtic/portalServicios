define(["dojo/_base/xhr",
    "dojox/data/JsonRestStore",
    "dijit/form/ValidationTextBox",
    "dijit/form/Form",
    "dijit/form/FilteringSelect",
    "dijit/form/Button",
    "dojo/_base/lang",
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
    "app/configuracion/dialogFormDatosDim",
    "dojox/grid/EnhancedGrid",
    "dijit/form/DateTextBox",
    "dojox/grid/enhanced/plugins/Pagination"

],
        function(
                xhr,
                JsonRestStore,
                ValidationTextBox,
                Form,
                FilteringSelect,
                Button,
                lang,
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
                capDatosDimForm,
                EnhancedGrid,
                DateTextBox
                ) {

            var configModule = null;
            var anioConsult, folioConsult, fechaConsult, gridDatosDim, usuarioConsult, usuario;
            var aleatorio = null;

            function init(config) {
                configModule = config;
                console.log("#Entrando#");
                aleatorio = "ctrlDatosDim" + Math.floor(Math.random() * 1000);
                var output = lang.replace(
                        configModule.template,
                        {aleatorio: aleatorio}
                );
                console.log("#aleatorio#" + aleatorio);
                configModule.contenedor.set('content', output);
                initCriteriosBusqueda();
                initGridDatosDim();
                initBotones();
                buscar();
                capDatosDimForm.init({});
            }

            function initCriteriosBusqueda() {

                anioConsult = new ValidationTextBox({
                    placeHolder: 'Indique el A\u00F1o',
                    name: 'anio',
                    id: 'anio' + aleatorio,
                    regExp: constants.ANIO_VALID,
                    type: 'text',
                    maxLength: 4,
                    style: 'width: 400px'
                }, 'anio' + aleatorio);

                folioConsult = new ValidationTextBox({
                    placeHolder: 'Indique el N\u00FAmero de Folio',
                    name: 'folio',
                    id: 'folio' + aleatorio,
                    regExp: constants.INTEXT_VALID,
                    type: 'text',
                    style: 'width: 400px'
                }, 'folio' + aleatorio);

                usuarioConsult = new ValidationTextBox({
                    name: 'usuarioConsult',
                    id: 'usuarioConsult' + aleatorio,
                    placeHolder: 'Indique el usuario',
                    uppercase: true,
                    regExp: constants.RFC_VALID,
                    type: 'text',
                    style: 'width: 400px'
                }, 'usuarioConsult' + aleatorio);

                usuario = new ValidationTextBox({
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
                        usuario.set('value', data.username);
                        console.log("username-" + data.username);
                    }
                });
            }

            function formatDate(fch) {
                return dojo.date.locale.format(new Date(fch), {datePattern: constants.DOJO_SHORT_DATE, selector: "date"});
            }
            ;

            function initGridDatosDim() {
                var layout = [
                    {name: "A\u00F1o", field: "anio", width: "10%"},
                    {name: "N\u00FAmero de Folio", field: "numFolio", width: "30%"},
                    {name: "Fecha de Presentaci\u00F3n", field: "fechaPresentacion", width: "30%", formatter: formatDate},
                    {name: "Usuario", field: "usuario", width: "20%"}
                ];

                gridDatosDim = new EnhancedGrid({
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
                }, "gridDatosDim" + aleatorio);
                gridDatosDim.startup();
                gridDatosDim.resize();
            }

            function initBotones() {
                new Button({
                    type: 'button',
                    id: 'btnConsulta' + aleatorio,
                    label: 'Buscar',
                    onClick: function() {
                        if (!anioConsult.isValid() || !folioConsult.isValid() || !usuarioConsult.isValid()) {
                            alert('Capture correctamente los criterios de b\u00FAsqueda ingresados');
                            return;
                        }
                        buscar();
                    }
                }, 'btnConsulta' + aleatorio);
                new Tooltip({
                    connectId: ['btnConsulta' + aleatorio],
                    label: "Encontrar el n\u00FAmero de folio",
                    position: ['above']
                });

                new Button({
                    type: 'button',
                    id: 'btnAgrega' + aleatorio,
                    label: 'Agregar',
                    onClick: function() {
                        capDatosDimForm.show(null, 'new', usuario.get('value'));
                        capDatosDimForm.setOnAceptar(onAceptarNew);
                    }
                }, 'btnAgrega' + aleatorio);
                new Tooltip({
                    connectId: ['btnAgrega' + aleatorio],
                    label: 'Agregar nuevo folio',
                    position: ['above']
                });

                new Button({
                    type: 'button',
                    id: 'btnElimina' + aleatorio,
                    label: 'Eliminar',
                    onClick: function() {
                        var items = gridDatosDim.selection.getSelected();
                        if (items.length) {
                            if (confirm('\u00BFDesea eliminar el registro del a\u00F1o ' + items[0].anio + '? ')) {
                                console.log(items[0]);
                                var object = {idDatos: items[0].idDatos};
                                send(object, 'eliminar', 'Se elimin\u00F3 correctamente el a\u00F1o ' + items[0].anio);
                            }
                        } else {
                            alert("Seleccione un registro");
                        }
                    }
                }, 'btnElimina' + aleatorio);
                new Tooltip({
                    connectId: ['btnElimina' + aleatorio],
                    label: 'Eliminar Folio',
                    position: ['above']
                });

                new Button({
                    type: 'button',
                    id: 'btnModifica' + aleatorio,
                    label: 'Modificar',
                    onClick: function() {
                        var items = gridDatosDim.selection.getSelected();
                        if (items.length) {
                            capDatosDimForm.show(items[0], 'edit', usuario.get('value'));
                            capDatosDimForm.setOnAceptar(onAceptarEdit);
                        } else {
                            alert("Seleccione un registro");
                        }
                    }
                }, 'btnModifica' + aleatorio);

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
                    label: "Cerrar control de Datos de Presetaci\u00F3n del DIM",
                    position: ['above']
                });
            }

            function onAceptarEdit(object) {
                if (confirm('¿Desea modificar el registro seleccionado?')) {
                    send(object, 'modificar', 'Se actualiz\u00F3 correctamente el registro del A\u00F1o ' + object.anio);
                }
            }

            function onAceptarNew(object) {
                send(object, 'guardar', 'Se almacen\u00F3 correctamente el registro del A\u00F1o ' + object.anio);
            }

            function send(object, action, message) {
                console.log(configModule.urlBase + 'configuracion/datosDim/' + action);
                console.log(object);
                configModule.standby.show();
                xhr.post({
                    url: configModule.urlBase + 'configuracion/datosDim/' + action,
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
                var criterios = "";
                criterios += "?anio=" + anioConsult.get('value') + "&";
                criterios += "folio=" + folioConsult.get('value') + "&";
                criterios += "usuario=" + usuarioConsult.get('value');
                criterios += "&none=1";
                var store = new JsonRestStore({target: dojo.config.app.urlBase + "/configuracion/datosDim" + criterios});
                gridDatosDim.setStore(store);
                gridDatosDim.currentPage(1);
            }

            function limpiar() {
                anioConsult.set('value', '');
                folioConsult.set('value', '');
                usuarioConsult.set('value', '');
                gridDatosDim.currentPage(1);
                buscar();
            }

            return {
                init: init
            };
        });
define(["dojo/_base/xhr",
        "dojox/data/JsonRestStore",
        "dijit/form/ValidationTextBox",
        "dijit/form/Button",
        "dijit/form/Select",
        "dojo/_base/lang",
        "dojo/_base/json",
        "app/util/constants",
        "app/configuracion/dialogFormPreguntas",
        "dojox/grid/EnhancedGrid",
        "dojox/grid/enhanced/plugins/Pagination"
    ],
        function(xhr,
                JsonRestStore,
                ValidationTextBox,
                Button,
                Select,
                lang,
                dojo,
                constants,
                capPreguntasForm,
                EnhancedGrid
    ) {

            var configModule = null;
            var idPreguntaConsult, descripcionPreguntaConsult, activoPreguntaConsult, gridPreguntas;
            var aleatorio = null;

            function init(config) {
                configModule = config;
                console.log("#Entrando#");
                aleatorio = "tps009" + Math.floor(Math.random() * 1000);
                var output = lang.replace(
                        lang.clone(configModule.template + ""),
                        {aleatorio: aleatorio}
                );
                configModule.contenedor.set('content', output);
                initCriteriosBusqueda();
                initGridPreguntas();
                initBotones();
                buscar();
                capPreguntasForm.init({});
            }

            function initCriteriosBusqueda() {
                idPreguntaConsult = new ValidationTextBox({
                    placeHolder: 'Indique Id.',
                    name: 'idPregunta',
                    id: 'idPregunta' + aleatorio,
                    regExp: constants.NUMBER_VALID,
                    uppercase: true,
                    type: 'text',
                    maxLength: 5,
                    style: 'width: 400px'
                }, 'idPregunta' + aleatorio);

                descripcionPreguntaConsult = new ValidationTextBox({
                    placeHolder: 'Indique la pregunta clave',
                    name: 'descripcion',
                    id: 'descripcion' + aleatorio,
                    regExp: constants.CHARACTERS_VALID,
                    uppercase: false,
                    type: 'text',
                    maxLength: 60,
                    style: 'width: 400px'
                }, 'descripcion' + aleatorio);

                activoPreguntaConsult = new Select({
                    name: "activo",
                    options: [{label: "Activa", value: "true"}, {label: "Inactiva", value: "false"}],
                    placeHolder: 'Indique si la pregunta se encuentra activa',
                    required: true,
                    style: 'width: 400px;',
                }, 'activo' + aleatorio);
            }

            function initGridPreguntas() {
                var layout = [
                    {name: "Id. Pregunta", field: "idPregunta", width: "20%"},
                    {name: "Descripci\u00F3n", field: "descripcion", width: "60%"},
                    {name: "Activa", field: "activo", width: "20%"}
                ];

                gridPreguntas = new EnhancedGrid({
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
                }, "gridPreguntas" + aleatorio);
                gridPreguntas.startup();
                gridPreguntas.resize();
            }

            function initBotones() {
                new Button({
                    type: 'button',
                    id: 'btnConsulta' + aleatorio,
                    label: 'Buscar',
                    onClick: function() {
                        buscar();
                    }
                }, 'btnConsulta' + aleatorio);

                new Button({
                    type: 'button',
                    id: 'btnAgrega' + aleatorio,
                    label: 'Agregar',
                    onClick: function() {
                        capPreguntasForm.show(null, 'new');
                        capPreguntasForm.setOnAceptar(onAceptarNew);
                    }
                }, 'btnAgrega' + aleatorio);

                new Button({
                    type: 'button',
                    id: 'btnModifica' + aleatorio,
                    label: 'Modificar',
                    onClick: function() {
                        var items = gridPreguntas.selection.getSelected();
                        if (items.length) {
                            capPreguntasForm.show(items[0], 'edit');
                            capPreguntasForm.setOnAceptar(onAceptarEdit);
                        } else {
                            alert("Seleccione un registro");
                        }
                    }
                }, 'btnModifica' + aleatorio);

                new Button({
                    type: 'button',
                    id: 'btnElimina' + aleatorio,
                    label: 'Eliminar',
                    onClick: function() {
                        var items = gridPreguntas.selection.getSelected();
                        if (items.length) {
                            if (confirm('¿Desea eliminar el registro seleccionado?')) {
                                console.log(items[0]);
                                var object = {idPregunta: items[0].idPregunta};
                                send(object, 'eliminar', 'Se elimin\u00F3 correctamente el registro ' + items[0].idPregunta);
                            }
                        } else {
                            alert("Seleccione un registro");
                        }
                    }
                }, 'btnElimina' + aleatorio);

                new Button({
                    type: 'button',
                    id: 'btnCancela' + aleatorio,
                    label: 'Limpiar',
                    onClick: function() {
                        limpiar();
                    }
                }, 'btnCancela' + aleatorio);

                new Button({
                    type: 'button',
                    label: 'Cancelar',
                    onClick: function() {
                        configModule.cerrarTab();
                    }
                }, 'btnCerrar' + aleatorio);
            }

            function onAceptarEdit(object) {
                if (confirm('¿Desea modificar el registro seleccionado?')) {
                    send(object, 'modificar', 'Se actualiz\u00F3 correctamente el registro ' + object.idPregunta);
                }
            }

            function onAceptarNew(object) {
                send(object, 'guardar', 'Se agreg\u00F3 correctamente el registro ' + object.idPregunta);
            }

            function send(object, action, message) {
                console.log(configModule.urlBase + 'configuracion/preguntas/' + action);
                console.log(object);
                configModule.standby.show();
                xhr.post({
                    url: configModule.urlBase + 'configuracion/preguntas/' + action,
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
                criterios += "?idPregunta=" + idPreguntaConsult.get('value') + "&";
                criterios += "descripcion=" + descripcionPreguntaConsult.get('value') + "&";
                criterios += "activo=" + activoPreguntaConsult.get('value');
                criterios += "&none=1";
                var store = new JsonRestStore({target: dojo.config.app.urlBase + "/configuracion/preguntas" + criterios});
                gridPreguntas.setStore(store);
            }

            function limpiar() {
                idPreguntaConsult.set('value', '');
                descripcionPreguntaConsult.set('value', '');
                activoPreguntaConsult.set('value','true')
                gridPreguntas.currentPage(1);
                buscar();
            }


            return {
                init: init
            };
});
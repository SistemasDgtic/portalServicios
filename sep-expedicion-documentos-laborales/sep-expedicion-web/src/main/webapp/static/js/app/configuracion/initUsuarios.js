define(["dojo/_base/xhr",
    "dijit/form/ValidationTextBox",
    "dijit/form/Button",
    "dijit/form/Select",
    "dojox/data/JsonRestStore",
    "dojo/_base/lang",
    "app/configuracion/dialogFormUsuario",
    "dojo/_base/json",
    "app/util/constants",
    "dojox/grid/EnhancedGrid",
    "dojox/grid/enhanced/plugins/Pagination"
],
        function(
                xhr,
                ValidationTextBox,
                Button,
                Select,
                JsonRestStore,
                lang,
                capUsuarioForm,
                dojo,
                constants,
                EnhancedGrid
                ) {
            var configModule = null;
            var usernameConsult, nombreUsuarioConsult, activoUsuarioConsult, gridUsuario, usuarioRol;
            var aleatorio = null;

            function init(config) {
                configModule = config;
                console.log("#Entrando#");
                aleatorio = "tps005" + Math.floor(Math.random() * 1000);
                var output = lang.replace(
                        lang.clone(configModule.template + ""),
                        {aleatorio: aleatorio}
                );
                configModule.contenedor.set('content', output);

                initCriteriosBusqueda();
                initGrid();
                initBotones();
                buscar();
                capUsuarioForm.init({});
            }

            function initCriteriosBusqueda() {
                usernameConsult = new ValidationTextBox({
                    placeHolder: 'Indique la clave del Usuario',
                    name: 'username',
                    id: 'username' + aleatorio,
                    regExp: constants.CHARACTERS_VALID,
                    type: 'text',
                    style: 'width: 400px;',
                    uppercase: true,
                    maxLength: 100
                }, 'username' + aleatorio);

                nombreUsuarioConsult = new ValidationTextBox({
                    placeHolder: 'Indique el nombre del Usuario',
                    name: 'nombreUsuario',
                    id: 'nombreUsuario' + aleatorio,
                    regExp: constants.CHARACTERS_VALID,
                    type: 'text',
                    style: 'width: 400px;',
                    uppercase: true,
                    maxLength: 100
                }, 'nombreUsuario' + aleatorio);

                activoUsuarioConsult = new Select({
                    name: "lUsuarioActivo",
                    options: [{label: "Activo", value: "true"}, {label: "Inactivo", value: "false"}],
                    placeHolder: 'Indique si el usuario esta activo',
                    style: 'width: 400px;',
                    required: true
                }, 'usuarioActivo' + aleatorio);

                xhr.get({
                    url: configModule.urlBase + 'configuracion/usuario/obtieneRol/' + Math.floor(Math.random() * 10000),
                    load: function(data) {
                        console.log("rol-" + data);
                        usuarioRol = data;
                    }
                });
            }

            var formatRol = function(idRol) {
                return (idRol == 1 ? "Administrador" : (idRol == 2 ? "Usuario" : "Personal de Apoyo"));
            };

            function initGrid() {
                var layout = [
                    {name: "Id. Usuario", field: "idUsuario", width: "15%"},
                    {name: "Clave Usuario", field: "username", width: "20%"},
                    {name: "Nombre del Usuario", field: "nombreUsuario", width: "35%"},
                    {name: "Rol", field: "idRol", width: "20%", formatter: formatRol},
                    {name: "Activo", field: "usuarioActivo", width: "10%"}
                ];

                gridUsuario = new EnhancedGrid({
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
                }, "gridUsuario" + aleatorio);
                gridUsuario.startup();
                gridUsuario.resize();
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
                    id: 'btnAgregarUsuario' + aleatorio,
                    label: 'Agregar',
                    onClick: function() {
                        capUsuarioForm.show(null, null, 'new');
                        capUsuarioForm.setOnAceptar(onAceptarNew);
                    }
                }, 'btnAgregarUsuario' + aleatorio);

                new Button({
                    type: 'button',
                    id: 'btnModificarUsuario' + aleatorio,
                    label: 'Modificar',
                    onClick: function() {
                        var items = gridUsuario.selection.getSelected();
                        if (items.length) {
                            capUsuarioForm.show(items[0], usuarioRol, 'edit');
                            capUsuarioForm.setOnAceptar(onAceptarEdit);
                        } else {
                            alert("Seleccione un registro");
                        }
                    }
                }, 'btnModificarUsuario' + aleatorio);

                new Button({
                    type: 'button',
                    id: 'btnEliminarUsuario' + aleatorio,
                    label: 'Eliminar',
                    onClick: function() {
                        var items = gridUsuario.selection.getSelected();
                        if (items.length) {
                            if (confirm('¿Desea eliminar al usuario seleccionado?')) {
                                console.log(items[0]);
                                var object = {idUsuario: items[0].idUsuario};
                                send(object, 'eliminar', 'Se elimin\u00F3 correctamente al usuario ' + items[0].username);
                            }
                        } else {
                            alert("Seleccione un registro");
                        }
                    }
                }, 'btnEliminarUsuario' + aleatorio);

                new Button({
                    type: 'button',
                    id: 'btnLimpia' + aleatorio,
                    label: 'Limpiar',
                    onClick: function() {
                        limpiar();
                    }
                }, 'btnLimpia' + aleatorio);

                new Button({
                    type: 'button',
                    label: 'Ver detalle',
                    id: 'btnConsultarUsuario' + aleatorio,
                    onClick: function() {
                        var items = gridUsuario.selection.getSelected();
                        if (items.length) {
                            capUsuarioForm.show(items[0], null, 'read');
                        } else {
                            alert("Seleccione un registro");
                        }
                    }
                }, 'btnConsultarUsuario' + aleatorio);

                new Button({
                    type: 'button',
                    label: 'Cancelar',
                    onClick: function() {
                        configModule.cerrarTab();
                    }
                }, 'btnCerrar' + aleatorio);

                /*Oculto btnAgregarUsuario y btnEliminarUsuario*/
                require(['dojo/dom-style', 'dijit/registry'], function(domStyle, registry) {
                    domStyle.set(registry.byId('btnAgregarUsuario' + aleatorio).domNode, 'display', 'none');
                    domStyle.set(registry.byId('btnEliminarUsuario' + aleatorio).domNode, 'display', 'none');
                });
            }

            function onAceptarEdit(object, act, rolAnt) {
                if (confirm('\u00BFDesea modificar la informaci\u00F3n del Usuario?')) {
                    if (rolAnt != object.idRol) {
                        sendId(object, 'modificar', 'Se actualiz\u00F3 correctamente el Rol del Usuario '
                                + object.username + " a " + (object.idRol == 1 ? "Administrador" : (object.idRol == 2 ? "Usuario" : "Personal de Apoyo")));
                    }
                    delete object.idRol;
                    delete object.idRolAnterior;
                    if (act == false) {
                        send(object, 'modificar', 'Se actualizaron correctamente los datos del Usuario ' + object.username);
                    } else {
                        send(object, 'modificarPassword', 'Se actualizaron correctamente los datos del Usuario ' + object.username);
                    }
                }
            }

            function onAceptarNew(object) {
                send(object, 'guardar', 'Se agreg\u00F3 correctamente el nuevo usuario ' + object.username);
            }

            function send(object, action, message) {
                console.log(configModule.urlBase + 'configuracion/usuario/' + action);
                console.log(object);
                configModule.standby.show();
                xhr.post({
                    url: configModule.urlBase + 'configuracion/usuario/' + action,
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

            function sendId(object, action, message) {
                console.log(configModule.urlBase + 'configuracion/rolUsuario/' + action);
                console.log(object);
                configModule.standby.show();
                xhr.post({
                    url: configModule.urlBase + 'configuracion/rolUsuario/' + action,
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
                criterios += "?vUsername=" + usernameConsult.get('value') + "&";
                criterios += "vNombreUsuario=" + nombreUsuarioConsult.get('value') + "&";
                criterios += "vUsuarioActivo=" + activoUsuarioConsult.get('value');
                criterios += "&none=1";
                var store = new JsonRestStore({target: dojo.config.app.urlBase + "/configuracion/usuario" + criterios});
                gridUsuario.setStore(store);
                gridUsuario.currentPage(1);
            }

            function limpiar() {
                usernameConsult.set('value', '');
                nombreUsuarioConsult.set('value', '');
                activoUsuarioConsult.set('value', 'true')
                gridUsuario.currentPage(1);
                buscar();
            }

            return {
                init: init
            };
        });
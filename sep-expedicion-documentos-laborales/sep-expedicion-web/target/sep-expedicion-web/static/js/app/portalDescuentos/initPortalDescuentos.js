define(["dijit/form/Form",
    "dijit/registry",
    "dijit/form/ValidationTextBox",
    "dojo/_base/lang",
    "dojo/_base/xhr",
    "dojo/_base/json",
    "app/util/jsUtils"
],
        function(Form,
                registry,
                ValidationTextBox,
                lang,
                xhr,
                dojo,
                jsUtils) {

            var portalDescuentosForm;
            function init(config) {
                configModule = config;
                aleatorio = "portalDes" + Math.floor(Math.random() * 1000);
                var output = lang.replace(
                        lang.clone(configModule.template + ""),
                        {aleatorio: aleatorio}
                );
                configModule.contenedor.set('content', output);
                initCampos();
            }

            function initCampos() {
                portalDescuentosForm = new Form({}, 'portalDescuentosForm' + aleatorio);
                //ventana = window.open("https://www.google.com", "_self");
                //console.log(ventana);
                xhr.get({
                    url: configModule.urlBase + 'seguridad/menu/obtieneUsuario/' + Math.floor(Math.random() * 1000),
                    handleAs: 'json',
                    load: function(data) {
                        console.log("entre data");
                        var object = {rfcTrabajador: data.username};
                        xhr.post({
                            url: configModule.urlBase + 'portal/descuentos/guardar',
                            postData: dojo.toJson(object),
                            headers: {
                                "Content-Type": "application/json; charset=UTF-8"
                            },
                            handleAs: 'json',
                            load: function(data1) {
                                console.log("entre data1");
                                console.log(data1);
                                window.open("https://sgdn.sep.gob.mx/sep/validar_servidor_sep.php?llaveCompuesta=" + data1.llaveCompuesta +
                                        "&rfcTrabajador=" + data1.rfcTrabajador +
                                        "&nominaTrabajador=" + data1.nominaTrabajador,"_self");
                                //configModule.cerrarTab();
                            },
                            error: function() {
                                console.log("ocurrió un error inesperado");
                                jsUtils.notification("Ocurri\u00F3 un error inesperado, favor de ingresar nuevamente a la opci\u00F3n Portal de Descuentos", "error", 15000);
                                configModule.cerrarTab();
                            }
                        });
                    }
                });

//                ventana.location.href = "https://sgdn.sep.gob.mx/sep/validar_servidor_sep.php?llaveCompuesta=" + llaveCompuesta.get('value') +
//                        "&rfcTrabajador=" + rfcTrabajador.get('value') +
//                        "&nominaTrabajador=" + nominaTrabajador.get('value');
//                configModule.cerrarTab();
            }

            return {
                init: init
            };
        });
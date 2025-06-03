define([
    "dojo/_base/xhr",
    "dojox/data/JsonRestStore",
    "dijit/layout/TabContainer",
    "dijit/layout/ContentPane",
    "dojo/_base/lang",
    "dojo/_base/json",
    "app/util/jsUtils",
    "dojo/window",
    "dojo/dom"
],
        function(
                xhr,
                JsonRestStore,
                TabContainer,
                ContentPane,
                lang,
                dojo,
                jsUtils,
                win
                ) {
            var configModule = null;
            var aleatorio = null;
            var tabContainer;
            var cpBienvenidos;
            var heigthGrid;
            function init(config) {
                var vs = win.getBox();
                var divisor = 5;
                console.log('viewport size:', ' width: ', vs.w, ', height: ', vs.h, ', left: ', vs.l, ', top: ', vs.t);
                if (vs.h < 900) {
                    divisor = 4;
                }
                heigthGrid = (vs.h - (vs.h / divisor));
                configModule = config;
                aleatorio = "bienvenidos" + Math.floor(Math.random() * 1000);
                var output = lang.replace(
                        configModule.template,
                        {aleatorio: aleatorio,
                            heigthGrid: heigthGrid
                        }
                );
                configModule.contenedor.set('content', output);
                initTabContainer();
                //memoria();                        
            }

            function memoria() {
                jsUtils.submitObject({
                    configModule: configModule,
                    urlBase: configModule.urlBase,
                    requestMapping: 'index/memoria',
                    data: {},
                    load: function(response) {

                    }
                });
            }

            function initTabContainer() {
                var jspBienvenida = 'bienvenidos';
                xhr.get({
                    url: configModule.urlBase + 'seguridad/menu/obtieneImagenBienvenida/' + Math.floor(Math.random() * 1000),
                    load: function(data) {
                        if (data == '1') {
                            jspBienvenida = 'bienvenidosEsp';
                        }
                        console.log('Jsp Bienvenida ' + jspBienvenida);
                        tabContainer = new TabContainer({
                            style: "width: 100%; height: " + heigthGrid + "px; border-color: #005ce5;",
                            id: 'divTabConteinerBienvenidos' + aleatorio,
                            tabPosition: "right-h"
                        }, 'divTabConteinerBienvenido' + aleatorio);
                        cpBienvenidos = new ContentPane({
                            title: "Bienvenidos",
                            id: 'divTabBienvenidos' + aleatorio,
                            href: dojo.config.app.urlBase + 'bienvenidos/' + jspBienvenida,
                            selected: true
                        }, 'divTabBienvenidos' + aleatorio);

                        tabContainer.addChild(cpBienvenidos);
                        tabContainer.startup();

                        tabContainer.resize();
                        cpBienvenidos.resize();
                    }
                });
            }


            return {
                init: init
            };

        });


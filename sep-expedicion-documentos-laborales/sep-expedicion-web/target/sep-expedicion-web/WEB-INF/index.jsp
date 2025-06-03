<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="pragma" content="no-cache">
        <meta http-equiv="cache-control" content="no-cache">
        <meta http-equiv="expires" content="0">
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <title>Portal de Autoservicios SEP Desarrollo</title>
        <link rel="stylesheet" href="static/css/style.css" media="screen">
        <link rel="stylesheet"
              href="static/js/libs/dijit/themes/tundra/tundra.css" media="screen"> 
        <link rel="stylesheet"
              href="static/js/libs/dojox/widget/Toaster/Toaster.css" />
        <link rel="stylesheet"
              href="static/js//libs/dojox/grid/resources/tundraGrid.css" />
        <link rel="stylesheet"
              href="static/js//libs/dojox/grid/enhanced/resources/EnhancedGrid.css" />
        <link rel="stylesheet"
              href="static/js//libs/dojox/grid/enhanced/resources/EnhancedGrid_rtl.css" />
        <script type="text/javascript">

            var _gaq = _gaq || [];
            _gaq.push(['_setAccount', 'UA-47535067-1']);
            _gaq.push(['_trackPageview']);

            (function() {
                var ga = document.createElement('script');
                ga.type = 'text/javascript';
                ga.async = true;
                ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
                var s = document.getElementsByTagName('script')[0];
                s.parentNode.insertBefore(ga, s);
            })();

        </script>
        <!--[if IE]>
        <script type="text/javascript">
                var e = ("abbr,article,aside,audio,canvas,datalist,details,figure,footer,header,hgroup,mark,menu,meter,nav,output,progress,section,time,video").split(',');
                for (var i=0; i<e.length; i++) {
                        document.createElement(e[i]);
                }
        </script>
        <![endif]-->
        <script>
            //versión 18/09/2013 13:35:00
            dojoConfig = {
                has: {
                    "dojo-firebug": true,
                    "dojo-debug-messages": true
                },
                app: {
                    urlBase: '<c:url value="/mvc/"/>',
                    urlStatic: '<c:url value="/static/"/>'
                },
                packages: [{
                        name: 'app',
                        location: '<c:url value="/static/"/>js/app'
                    }, {
                        name: 'content',
                        location: '<c:url value="/mvc"/>'
                    }, {
                        name: 'static',
                        location: '<c:url value="/static"/>'
                    }],
                parseOnLoad: false,
                async: true,
                debugAtAllCosts: true,
                ioPublish: true,
                cacheBust: true,
                locale: 'es-es',
            };
        </script>
        <script src="static/js/libs/dojo/dojo.js"></script>
        <script>
            require(["app/util/TreeMenu", "dojo/_base/xhr", "dojo/_base/array", "dojo/_base/lang",
                "dijit/registry", "dijit/layout/BorderContainer",
                "dijit/layout/TabContainer", "dijit/layout/ContentPane",
                "dijit/layout/AccordionContainer", "dijit/form/Button", "dojox/widget/Standby",
                "dojo/string", "dojox/widget/Toaster", "dojo/_base/Deferred",
                "dijit/form/DropDownButton", "dijit/TooltipDialog", "dojo/DeferredList",
                "app/util/errorHandler", "dojo/domReady!"],
                    function(TreeMenu, xhr, arrayUtil, lang, registry, BorderContainer, TabContainer, ContentPane,
                            AccordionContainer, Button, Standby, string, Toaster, Deferred, DropDownButton, TooltipDialog, DeferredList) {

                        /**
                         * Callback para el evento de click sobre las opciones del menú
                         */
                        var onClickOpcion = function(item, node, evt) {
                            var url = item.url;
                            var idOp = item.id;
                            var titulo = item.opcion;
                            var standby;
                            // se verifica que la opción tenga un url
                            if (url && string.trim(url) !== '') {
                                _gaq.push(['_trackEvent', titulo, 'clicked']);
                                var idPanel = 'contentTab_' + idOp;
                                // Si ya existe un panel con ese id, simplemente se muestra.
                                if (registry.byId(idPanel)) {
                                    contentTabs.selectChild(registry.byId(idPanel));
                                    return;
                                }
                                // Creamos el panel principal para la opción de menú seleccionada.

                                var panel;
                                if (node === null || node.declaredClass === "dijit._TreeNode") {
                                    panel = new ContentPane({
                                        title: titulo,
                                        id: idPanel,
                                        closable: true,
                                        style: "overflow:scroll",
                                        onClose: function() {
                                            if (item.focusParent) {
                                                var tabConteiner = registry.byId(item.focusParent);
                                                if (tabConteiner != undefined) {
                                                    contentTabs.selectChild(tabConteiner);
                                                }
                                            }

                                            standby.destroy();
                                            return true;
                                        }
                                    });
                                    // Se agrega y se muestra el nuevo panel en el contenedor de tabs.
                                    contentTabs.addChild(panel);
                                    contentTabs.selectChild(panel);
                                    // Creamos y mostramos un bloqueo en pantalla para esperar la carga del
                                    // contenido del panel.
                                    standby = new Standby({
                                        id: 'standby_contentTab_' + idOp,
                                        target: idPanel,
                                        'class': "dijitContentPaneLoading"
                                    });

                                } else {
                                    panel = node;
                                    standby = new Standby({
                                        id: 'standby_contentTab_' + idOp,
                                        target: idOp,
                                        'class': "dijitContentPaneLoading"
                                    });
                                }
                                document.body.appendChild(standby.domNode);
                                //Se verifica si hay session:
                                var checkSesion = dojo.xhrGet({//								
                                    url: dojo.config.app.urlBase + "seguridad/menu/checkSesion",
                                    handleAs: "text",
                                    sync: true,
                                    timeout: 5000, // Time in milliseconds
                                    preventCache: true,
                                    load: function(response, ioArgs) {
                                        //Se verifica si por el framework de seguridad, se obtuvo una respuesta no boolean
                                        if (response.length != 4) {
                                            alert("LA SESIÓN DE USUARIO HA CADUCADO, VUELVA A INGRESAR SU USUARIO Y CONTRASEÑA");
                                            location.href = "login.jsp";
                                        }
                                        return response;
                                    },
                                    // The ERROR function will be called in an error case.
                                    error: function(response, ioArgs) { //
                                        alert("LA SESIÓN DE USUARIO HA CADUCADO, VUELVA A INGRESAR SU USUARIO Y CONTRASEÑA");
                                        location.href = "login.jsp";
                                        return response;
                                    }
                                });
                                standby.startup();
                                standby.show();
                                // Cargamos el módulo responsable de la opción seleccionada y el template que le corresponde.
                                require(['app/' + url, 'app/util/text!content/' + url + '!strip;no-cache'], function(modulo, template) {
                                    var _module = null;
                                    if (item.likeNewInstance && item.likeNewInstance == true) {
                                        _module = new modulo();
                                    } else {
                                        _module = modulo;
                                    }
                                    // Si el módulo devuelve un objeto con una función init la llamamos pasando
                                    // al módulo un objeto con información útil.
                                    if (_module.init && lang.isFunction(_module.init)) {
                                        var deferred = _module.init({
                                            contenedor: panel,
                                            idContenedor: 'contentTabs_' + idOp,
                                            template: template,
                                            urlBase: dojo.config.app.urlBase,
                                            standby: standby,
                                            cerrarTab: function() {
                                                contentTabs.closeChild(panel);
                                            },
                                            recursive: onClickOpcion,
                                            item: item,
                                            parentFocus: idPanel
                                        });

                                        // Si el init devuelve un objeto deferred válido lo utilizamos
                                        // para saber cupando retirar el bloqueo visual del panel.
                                        if (deferred && lang.isFunction(deferred.then)) {
                                            deferred.then(function(result) {
                                                standby.hide();
                                            });
                                        } else {
                                            //si no se devolvió algún deferred quitamos el bloqueo de inmediato
                                            standby.hide();
                                        }
                                    } else {
                                        // si no hay init quitamos el bloqueo de inmediato
                                        standby.hide();
                                    }
                                });
                            }
                        };



                        // Layout principal de la aplicación.
                        var layoutPrincipal = new BorderContainer({
                            design: "headline"
                        }, "layoutPrincipal");

                        // Cada sección del acordeón contendrá un objeto Tree para mostrar las opciones
                        // de un módulo de la aplicación.
                        var contentAccordion = new AccordionContainer();

                        // En la parte dentral del layout se mostrará un contenedor de tabs.
                        var contentTabs = new TabContainer({
                            region: "center",
                            id: "contenedorTabs",
                            tabPosition: "bottom"
                        });

                        var tpoManual = "";
                        dojo.xhrGet({
                            url: dojo.config.app.urlBase + 'configuracion/usuario/obtieneRol/' + Math.floor(Math.random() * 10000),
                            load: function(data) {
                                console.log("rol -" + data);
                                if (data == "ROLE_ADMINISTRADOR" || data == 'ROLE_APOYO') {
                                    tpoManual = "ManualUsuarioAdmin";
                                } else if (data == 'ROLE_USUARIO') {
                                    tpoManual = "ManualUsuario";
                                }
                                layoutPrincipal.addChild(contentTabs);
                                var rutaSer = "<c:url value='/'/>";
                                var contentDer = "<table width='100%' border='0' style='height:87px;'> " +
                                        "	<tr>				" +
                                        "		<td width='7%' rowspan='2' style='text-align: right; height:87px;'>" +
                                        "			<img src='static/images/backgrounds/baner_logo_sep.jpg'>" +
                                        "		</td>	" +
                                        "		<td width='84%' rowspan='2' style='text-align: right; vertical-align: bottom; height:87px; " +
                                        "                                background-image:url(static/images/backgrounds/baner_titulo.jpg); " +
                                        "                               background-repeat: no-repeat; background-position: center ;'>" +
                                        "		<img src='static/images/manual_descarga.png' height='23px' width='154x' onclick=window.open('static/documents/" + tpoManual + ".pdf','ManualUsuario','toolbar=1');parent.opener=top " +
                                        "               title='Clic aquí para descargar el manual de usuario'>" +
                                        "		</td>	" +
                                        "		<td width='9%' style='text-align: left; height:40px;'>" +
                                        "			<img src='static/images/backgrounds/baner_dgtic.jpg' height='40px'>" +
                                        "		</td>" +
                                        "	</tr>" +
                                        "	<tr>" +
                                        "		<td style='text-align: right; height:40px;'>" +
                                        "			" +
                                        "			<div id='dropdownButtonContainerSesion'/>" +
                                        "		</td>" +
                                        "	</tr>" +
                                        "</table>";
                                layoutPrincipal.addChild(
                                        new ContentPane({
                                            //style: 'text-align: right; background-image:url(static/images/backgrounds/banner.jpg); background-repeat:no-repeat; height:87px;',
                                            content: contentDer,
                                            region: "top",
                                            id: "panelEncabezado",
                                            //content: btnLogout
                                        })
                                        );

                                // Del la izquierdo se coloca el panel tipo acordeón como parte de nuestro menú principal.
                                layoutPrincipal.addChild(
                                        new ContentPane({
                                            region: "left",
                                            id: "panelMenu",
                                            content: contentAccordion,
                                            splitter: true,
                                            minSize: 200
                                        })
                                        );


                                // Obtenemos todos los módulos que el usuario podrá visualizar.
                                var defAllStores;
                                var def1 = xhr.get({
                                    handleAs: "json",
                                    url: dojo.config.app.urlBase + "seguridad/menu/modulos" + '?currentSystem=' + new Date().getTime(),
                                    load: function(data) {
                                        // Por cada módulo agregamos un panel al acordeón.
                                        arrayUtil.forEach(data, function(mod) {
                                            contentAccordion.addChild(new ContentPane({
                                                title: mod.modulo,
                                                idModulo: mod.id,
                                                // Dentro de cada panel del acordeón creamos un menú en forma de árbol para
                                                // mostrar las opciones del módulo.
                                                content: new TreeMenu(mod.id, onClickOpcion).getTree()
                                            }));
                                        });
                                        layoutPrincipal.startup();
                                    }
                                });
                                defAllStores = new DeferredList([def1]);
                                // Publicamos un mecanismo para generar mensajes no intrusivos en la aplicación,
                                // estos pueden ser utilizados desde cualquier módulo de la aplicación.
                                new Toaster({
                                    id: 'panelMensaje',
                                    positionDirection: 'tl-down',
                                    messageTopic: '/app/notificacion'
                                }, 'panelNotificaciones');

                                // Botón para provocar un logout de la aplicación. 


                                var dialog = new TooltipDialog({
                                    content: "<table width='300px' border=0>" +
                                            "	<tr>" +
                                            "		<td>Usuario activo:</td>" +
                                            "		<td><c:out value="${usuario.nombre}"></c:out></td>" +
                                            "	</tr>" +
                                            "	<tr>" +
                                            "		<td>Inicio de sesi&oacute;n:</td>" +
                                            "		<td><fmt:formatDate type="both" value="${usuario.fechaAcceso}" /></td>" +
                                            "	</tr>" +
                                            "	<tr>" +
                                            "		<td colspan='2' align=center>" +
                                            "			<button data-dojo-type='dijit.form.Button' type='button' iconClass='dijitIconUsers' onclick=\"window.location.href='j_spring_security_logout';\">Salir</button>" +
                                            "		</td>" +
                                            "	</tr>" +
                                            "</table>",
                                    position: ['above']

                                });

                                var button = new DropDownButton({
                                    label: "Salir",
                                    dropDown: dialog,
                                    iconClass: 'dijitIconUsers'
                                });
                                dojo.byId("dropdownButtonContainerSesion").appendChild(button.domNode);
                                // Agregamos un panel de bienvenida al contenedor de tabs. 
                                defAllStores.then(function() {
                                    var panelBienvenidos = new ContentPane({
                                        content: "<pre>Al dar click en las opciones del menú se mostrarán nuevos tabs.</pre>",
                                        title: "Bienvenido",
                                        id: 'panel_bienvenidos'
                                    })
                                    contentTabs.addChild(
                                            panelBienvenidos
                                            );

                                    onClickOpcion(
                                            {
                                                url: 'bienvenidos/initBienvenidos',
                                                id: 'panel_bienvenidos',
                                                opcion: 'Bienvenidos'
                                            },
                                    panelBienvenidos
                                            );
                                });
                            }
                        });
                    });


        </script>
    </head>
    <body class="tundra">

        <div id="panelNotificaciones"></div>
        <div id="layoutPrincipal"></div>
    </body>
</html>

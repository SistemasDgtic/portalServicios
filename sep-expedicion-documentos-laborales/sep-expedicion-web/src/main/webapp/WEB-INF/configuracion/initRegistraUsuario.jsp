<%-- 
    Document   : initRegistraUsuario
    Created on : 18-dic-2013, 20:38:09
    Author     : abraham.aguirre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>${login.title}</title>
        <link rel="stylesheet" href="<c:url value="/static/"/>css/style.css" media="screen">
        <link rel="stylesheet"
              href="<c:url value="/static/"/>js/libs/dijit/themes/tundra/tundra.css" media="screen">        
        <script type="text/javascript">

            var _gaq = _gaq || [];
            _gaq.push(['_setAccount', '${id.analytics}']);
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
        <script>
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
                locale: 'es-es'
            };
        </script>
        <script src="<c:url value="/static/"/>js/libs/dojo/dojo.js"></script>
        <script>
            require(["app/configuracion/initRegistraUsuario"], function(module) {
                module.init();
            });
        </script>
    </head>
    <body class="tundra">
        <form id="registraUsuario">
            <table class="pageTable" width="100%">
                <tr>
                    <td colspan="2" align="center" class="tituloFondoGris">
                        REGISTRAR CUENTA PARA INGRESAR AL PORTAL DE AUTOSERVICIOS</td>
                </tr>
                <tr>
                    <td width="25%" class="contenidos">RFC: * </td>
                    <td width="75%"><input id="username" /></td>
                </tr>
                <tr>
                    <td class="contenidos">Nombre: *</td>
                    <td><input id="vNombreUsuario" /></td>
                </tr>
                <tr>
                    <td class="contenidos">Correo Electrónico: *</td>
                    <td><input id="email" /></td>
                </tr>
                <tr>
                    <td class="contenidos">Pregunta: *</td>
                    <td><input id="idPregunta"/></td>
                </tr>
                <tr>
                    <td class="contenidos">Respuesta: *</td>
                    <td><input id="vRespuesta" /></td>
                </tr>
                <tr>
                    <td class="contenidos">Contrase&ntilde;a: *</td>
                    <td><input id="vPassword" /></td>
                </tr>
                <tr>
                    <td class="contenidos">Confirme Contrase&ntilde;a: *</td>
                    <td><input id="vPasswordC" /></td>
                </tr>
                <tr>
                    <td><input id="usuarioActivo" /></td>
                    <td><input id="idUsuario" /></td>
                </tr>
                <tr>
                    <td colspan="2">&nbsp;</td>
                </tr>
                <tr>
                    <td colspan="2" class=tituloFondoGris>Elementos a considerar para su contraseña</td>
                </tr>
                <tr>
                    <td class="contenidos" colspan="2">1.- La contraseña debe tener 5 caracteres como mínimo y 18 como máximo.</td>
                </tr>
                <tr>
                    <td class="contenidos" colspan="2">2.- Es sensible a mayúsculas y minúsculas.</td>
                </tr>
                <tr>
                    <td class="contenidos" colspan="2">3.- Solo acepta caracteres alfanuméricos.</td>
                </tr>
                <tr>
                    <td colspan="2">&nbsp;</td>
                </tr>
                <tr>
                    <td align="center" colspan="2">
                        <input id="btnAceptarUsuario" />
                        <input id="btnCancelarUsuario" />
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>

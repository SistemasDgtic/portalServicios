<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>${login.title}</title>
        <link rel="stylesheet" href="<c:url value="/static/"/>css/style.css"
              media="screen">
        <link rel="stylesheet"
              href="<c:url value="/static/"/>js/libs/dijit/themes/tundra/tundra.css"
              media="screen">
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
            require(["app/configuracion/initEnviaPassword"], function(module) {
                module.init();
            });
        </script>
    </head>
    <body class="tundra">
        <form id="formEnviaPassword">
            <table class="pageTable" width="100%">
                <tr>
                    <td colspan="2" align="center" class="tituloFondoGris">RECUPERAR
                        CONTRASE&Ntilde;A</td>
                </tr>
                <tr>
                    <td width="25%" class="contenidos">RFC: *</td>
                    <td width="75%"><input id="username" /></td>
                </tr>
                <tr>
                    <td class="contenidos">Pregunta:</td>
                    <td><input id="idPregunta" /></td>
                </tr>
                <tr>
                    <td class="contenidos">Respuesta: *</td>
                    <td><input id="vRespuesta" /></td>
                </tr>
                <tr>
                    <td align="center" colspan="2"><input id="btnAceptarUsuario" />
                        <input id="btnCancelarUsuario" /></td>
                </tr>
            </table>
        </form>
    </body>
</html>

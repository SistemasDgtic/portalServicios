<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--v 1.2.6 -->
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>${login.title}</title>
        <link href="https://framework-gb.cdn.gob.mx/assets/styles/main.css" rel="stylesheet">
        <style>
            .soria .dijitDialogUnderlay {
                background: #000;
            }
        </style>
        <link rel="stylesheet"
              href="static/js/libs/dijit/themes/tundra/tundra.css" media="screen">
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
        <script src="static/js/libs/dojo/dojo.js"></script>
        <script>
            require(["dijit/Dialog", "dijit/form/ValidationTextBox", "dijit/form/Button", "dijit/form/Form", "dojo/dom", "dijit/Tooltip", "app/util/constants", "dojo/dom-style", "dojo/ready"], function(Dialog, ValidationTextBox, Button, Form, dom, Tooltip, constants, domStyle, ready) {
                ready(function(){
                    var form = new Form({
                        method: 'POST',
                        action: 'j_spring_security_check'
                    }, 'loginForm');

                    var txtBoxUsuario = new ValidationTextBox({
                        name: 'j_username',
                        placeHolder: 'Ingrese su R.F.C.',
                        regExp: constants.RFC_VALID,
                        missingMessage: 'Obligatorio',
                        required: true,
                        uppercase: true,
                        maxLength: 13
                    }, 'username');

                    var txtBoxPass = new ValidationTextBox({
                        name: 'j_password',
                        placeHolder: 'Ingrese su contraseña',
                        regExp: constants.CHARACTERS_VALID,
                        missingMessage: 'Obligatorio',
                        required: true,
                        type: 'password'
                    }, 'password');

                    var btnLogin = new Button({
                        iconClass: 'dijitIconKey',
                        type: 'button',
                        label: 'Entrar',
                        onClick: function() {
                            if (form.validate()) {
                                form.submit();
                            } else {
                                alert("Ingrese la informaci\u00F3n solicitada para acceder al portal.");
                            }
                        }
                    }, 'btnLogin');

                    new Tooltip({
                        connectId: ['imgUserWarnin'],
                        label: "Las posibles razones de autenticaci&oacute;n incorrecta al portal son:<br/>- Usuario no existe o no ha sido registrado.<br/>- Contrase&ntilde;a incorrecta.<br/>- El usuario esta inhabilitado.</li>",
                        position: ['below']
                    });

                    txtBoxPass.startup();
                    txtBoxUsuario.startup();
                    btnLogin.startup();

                    var dialog = new Dialog({
                        // Dialog title
                        title: "Acceso Portal de Autoservicios",
                        content: dom.byId('formContent'),
                        onCancel: function() {
                            console.log('*******');
                        }
                    });
                    dialog.closeButtonNode.style.display = "none";
                    dialog._onKey = function(evt) {
                        key = evt.keyCode;
                        if (key == dojo.keys.ESCAPE) {
                            dojo.stopEvent(evt);
                        }
                    };

                    dialog.show();
                    domStyle.set('formContent', {
                        display: "inline"
                    });
                    <c:if test="${param.authfailed == true}" >
                        var messageException = "<c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}"/>";
                        var mensajeError = "Problema al ingresar al Portal de Autoservicios";
                        if ("Bad credentials" === messageException) {
                            mensajeError = "RFC o contrase\u00F1a inv\u00E1lida para autenticar al portal.";
                        } else if ("User is disabled" === messageException) {
                            mensajeError = "El usuario se encuentra inhabilitado, verifique con el área de Recursos Humanos.";
                        } else if ("User account is locked" === messageException) {
                            mensajeError = "La cuenta de usuario no ha sido registrada.";
                        }
                        domStyle.set('imgUserWarnin', {
                            display: "inline-block"
                        });
                        alert(mensajeError);
                    </c:if>
                });

            });

            window.onload = function() {

            };

            function f_activar() {
                window.location.href = dojoConfig.app.urlBase + 'configuracion/usuario/registrarCuenta';
            }
            function f_recuperaPass() {
                window.location.href = dojoConfig.app.urlBase + 'configuracion/usuario/enviaPassword';
            }
        </script>
    </head>
    <body class="tundra" style=" background-image:url(static/images/backgrounds/${login.background}); background-repeat:no-repeat; background-position:top; height:720px;" >
        <div id="formContent" style="display: none;">
            <form id="loginForm">
                <table>
                    <tr>
                        <td><label for="username">RFC:</label></td>
                        <td><input id="username"></td>
                    </tr>
                    <tr>
                        <td><label for="password">Contraseña:</label></td>
                        <td><input id="password"><br></td>
                    </tr>
                    <tr>
                        <td>
                            <img src="<c:url value="/static/images/user-warm.png"/>" id="imgUserWarnin" style="display: none"/>
                        </td>
                        <td style="text-align: right;"><input
                                id="btnLogin" type="submit" value="Entrar"></td>
                    </tr>
                    <tr>
                        <td style="text-align: left; font-size: 1em;" colspan="2">
                            <a href="javascript:f_activar();">Registrar Cuenta Para Ingresar al Portal</a>
                        </td>
                    </tr>
                    <tr>
                        <td style="text-align: left; font-size: 1em;" colspan="2">
                            <a href="javascript:f_recuperaPass();">¿Has olvidado tu contraseña?</a>
                        </td>
                    </tr>
                </table>
            </form>
            <!--<form id="errorAuth">
                    <table>
                            <tr>
                                    <td>ERROR AL AUTENTICAR USUARIO</td>
                            </tr>
                            <tr>
                                    <td colspan="2" style="text-align: right;"><input
                                            id="btnAceptar" type="submit" value="Aceptar"></td>
                            </tr>
                    </table>
            </form>-->
        </div>
    </body>
</html>
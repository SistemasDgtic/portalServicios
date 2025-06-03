<%-- 
    Document   : initCambioAcceso
    Created on : 17/12/2013, 11:43:09 AM
    Author     : eduardo.hernandez
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<form id="cambioClave{aleatorio}">
    <table class="pageTable" width="100%">
        <tr>
            <td colspan="2" align="center" class="tituloFondoGris">
                CAMBIO DE CONTRASEÑA Y/O CORREO ELECTRÓNICO</td>
        </tr>
        <tr>
            <td width="25%" class="contenidos">Usuario: * </td>
            <td width="75%"><input id="username{aleatorio}" /></td>
        </tr>
        <tr>
            <td class="contenidos">Nombre: *</td>
            <td><input id="vNombreUsuario{aleatorio}" /></td>
        </tr>
        <tr>
            <td class="contenidos">Correo Electrónico: *</td>
            <td><input id="email{aleatorio}" /></td>
        </tr>
        <tr>
            <td class="contenidos">Pregunta: *</td>
            <td><input id="idPregunta{aleatorio}"/></td>
        </tr>
        <tr>
            <td class="contenidos">Respuesta: *</td>
            <td><input id="vRespuesta{aleatorio}" /></td>
        </tr>
        <tr>
            <td class="contenidos">Cambio de Contraseña: *</td>
            <td id="actP{aleatorio}"><input id="ckPassword{aleatorio}" /></td>
        </tr>
        <tr>
            <td class="contenidos">Nueva Contrase&ntilde;a: *</td>
            <td><input id="vPassword{aleatorio}" /></td>
        </tr>
        <tr>
            <td class="contenidos">Confirme Nueva Contrase&ntilde;a: *</td>
            <td><input id="vPasswordC{aleatorio}" /></td>
        </tr>
        <tr>
            <td><input id="usuarioActivo{aleatorio}" /></td>
            <td><input id="idUsuario{aleatorio}" /></td>
        </tr>
        <tr>
            <td colspan="2">&nbsp;</td>
        </tr>
        <tr>
            <td colspan="2" class=tituloFondoGris>Elementos a considerar para su nueva contraseña</td>
        </tr>
        <tr>
            <td class="contenidos" colspan="2">1.- La contrase&ntilde;a debe tener 5 caracteres como m&iacute;nimo y 18 como m&aacute;ximo.</td>
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
                <input id="btnAceptarUsuario{aleatorio}" />
                <input id="btnCancelarUsuario{aleatorio}" />
            </td>
        </tr>
    </table>
</form>

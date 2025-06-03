<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<form id="registroDicap{aleatorio}">
    <table class="pageTable">
        <tr>
            <td colspan="4" align="center" class="tituloFondoGris">
                Registra tu Dicap
            </td>
        </tr>
        <tr>
            <td>
                R.F.C.: *
            </td>
            <td >
                <input name="rfc" id="rfc{aleatorio}"/>
            </td>
            <td colspan="2">
                &nbsp;
            </td>
        </tr>
    </table>
    <table width="100%" border="0" height="100%">
        <tr>
            <td align="center">
                <input id="btnGuardar{aleatorio}" />
            </td>
        </tr>
    </table>
</form>

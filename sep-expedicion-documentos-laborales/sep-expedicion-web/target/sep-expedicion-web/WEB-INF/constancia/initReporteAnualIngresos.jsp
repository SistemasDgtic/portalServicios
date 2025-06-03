<%-- 
    Document   : initResumen
    Created on : 12/05/2025, 12:43:09 AM
    Author     : abraham.aguirre
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<form id="resumen{aleatorio}">
    <table class="pageTable" width="100%">
        <tr>
            <td colspan="2" align="center" class="tituloFondoGris">
                REPORTE ANUAL DE INGRESOS NETOS</td>
        </tr>
        <tr>
            <td colspan="2" align="center" class="tituloFondoGris">
                Criterios de B&uacute;squeda
            </td>
        </tr>
        <tr>
            <td width="25%" class="contenidos">R.F.C.: * </td>
            <td width="75%"><input id="username{aleatorio}" /></td>
        </tr>
        <tr>
            <td class="contenidos">Nombre: *</td>
            <td><input id="vNombreUsuario{aleatorio}" /></td>
        </tr>
        <tr>
            <td class="contenidos">Ejercicio Fiscal: *</td>
            <td><input id="anio{aleatorio}" /></td>
        </tr>
        <tr>
            <td colspan="2">&nbsp;</td>
        </tr>
        <tr>
            <td colspan="2">&nbsp;</td>
        </tr>
        <tr>
            <td align="center" colspan="2">
                <input id="btnImprimirReporteAnualIngresos{aleatorio}" />
                <input id="btnCancelarReporteAnualIngresos{aleatorio}" />
            </td>
        </tr>
    </table>
</form>
<iframe style="width:0px;height:0px;border:0px;" id="hiddenIFrame{aleatorio}" name="hiddenIFrame{aleatorio}" ></iframe>
<div id="contentForm{aleatorio}"></div>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<form id="busquedaComprobanteForm{aleatorio}">
    <table class="pageTable">
        <tr>
            <td colspan="4" align="center" class="tituloFondoGris">
                Impresi&oacute;n de comprobantes de pago de empleados
            </td>
        </tr>
        <tr>
            <td colspan="4" align="center" class="tituloFondoGris">
                Criterios de B&uacute;squeda
            </td>
        </tr>
        <tr>
            <td>
                R.F.C.: *
            </td>
            <td >
                <input name="rfc" id="rfc{aleatorio}"/><input name="idComprobante" id="idComprobante{aleatorio}"/>
            </td>
            <td colspan="2">
                &nbsp;
            </td>
        </tr>
        <tr>
            <td>
                Año: 
            </td>
            <td >
                <input name="anio" id="anio{aleatorio}"/>
            </td>
            <td colspan="2">
                &nbsp;
            </td>
        </tr>
        <tr>
            <td>
                Quincena: 
            </td>
            <td >
                <input name="quincena" id="quincena{aleatorio}"/>
            </td>
            <td>
                <input id="btnBuscar{aleatorio}" />
                <input id="btnLimpiar{aleatorio}" />
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td colspan="4">
                &nbsp;
            </td>
        </tr>
    </table>
    <table width="100%" border="0" height="100%">
        <tr>
            <td align="center" class="tituloFondoGris">Comprobantes de pago encontrados </td>
        </tr>
        <tr>
            <td width="100%">
                <div id="gridComprobantes{aleatorio}" style="height: 350px; width: 100%"/>
            </td>
        </tr>
    </table>
    <table width="100%" border="0" height="100%">
        <tr>
            <td align="center">
                <input id="btnImprimir{aleatorio}" />
                <input id="btnCerrar{aleatorio}" />
            </td>
        </tr>
    </table>
</form>
<iframe style="width:0px;height:0px;border:0px;" id="hiddenIFrame{aleatorio}" name="hiddenIFrame{aleatorio}" ></iframe>
<div id="contentForm{aleatorio}"></div>

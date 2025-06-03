<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<form id="busquedaConstanciasForm{aleatorio}">    
    <table class="pageTable">
        <tr>
            <td colspan="3" align="center" class="tituloFondoGris">
                Impresi&oacute;n de Constancia de Sueldos y Salarios (Formulario 37)
            </td>
        </tr>
        <tr>
            <td colspan="3" align="center" class="tituloFondoGris">
                Criterios de B&uacute;squeda
            </td>
        </tr>
        <tr>
            <td>
                R.F.C.: *
            </td>
            <td >
                <input name="rfc" id="rfc{aleatorio}"/><input name="idConstancia" id="idConstancia{aleatorio}"/>
            </td>
            <td colspan="2">
                &nbsp;
            </td>
        </tr>
        <tr>
            <td>
                Año Fiscal: 
            </td>
            <td >
                <input name="anio" id="anio{aleatorio}"/>
            </td>
            <td>
                <input id="btnBuscar{aleatorio}" />
                <input id="btnLimpiar{aleatorio}" />
            </td>            
        </tr>
        <tr>
            <td colspan="3">
                &nbsp;
            </td>
        </tr>
    </table>
    <table width="100%" border="0" height="100%">
        <tr>
            <td align="center" class="tituloFondoGris">Constancias encontradas </td>
        </tr>
        <tr>
            <td width="100%">
                <div id="gridConstancias{aleatorio}" style="height: 350px; width: 100%"/>
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

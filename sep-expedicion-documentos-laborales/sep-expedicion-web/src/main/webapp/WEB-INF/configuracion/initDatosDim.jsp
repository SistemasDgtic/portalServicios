<%-- 
    Document   : initDatosDim
    Created on : 8/12/2014, 10:12:46 AM
    Author     : itzel.pantoja
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form id="datosDimForm{aleatorio}">
    <input id="usuario{aleatorio}"/>
    <table class="pageTable">
        <tr>
            <td colspan="5" align="center" class="tituloFondoGris">
                DATOS DE PRESENTACIÓN DEL DIM
            </td>
        </tr>
        <tr>
            <td colspan="5" align="center" class="tituloFondoGris">
                Criterios de Búsqueda
            </td>
        </tr>        
        <tr>
            <td width="15%" class="contenidos">
                <label for="lAnio">A&ntilde;o:</label>
            </td>
            <td colspan="2">
                <input id="anio{aleatorio}"/>
            </td>
        </tr>
        <tr>
            <td width="15%" class="contenidos">
                <label for="lFolio">Número de Folio:</label>
            </td>
            <td colspan="2">
                <input id="folio{aleatorio}"/>
            </td>
        </tr>        
        <tr>
            <td width="15%" class="contenidos">
                <label for="lUsuario">Usuario:</label>
            </td>
            <td colspan="2">
                <input id="usuarioConsult{aleatorio}"/>
            </td>
            <td width="20%">
                <input id="btnConsulta{aleatorio}"/>
                <input id="btnLimpiar{aleatorio}"/>
            </td>
        </tr>        
        <tr>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td colspan="5" align="center" class="tituloFondoGris">
                Registros Recuperados
            </td>
        </tr>
        <tr>
            <td colspan="5">
                <div id="gridDatosDim{aleatorio}"></div>
            </td>
        </tr>
        <td align="center" colspan="3">
            <input id="btnAgrega{aleatorio}" />
            <input id="btnModifica{aleatorio}" />
            <input id="btnElimina{aleatorio}" />
            <input id="btnCerrar{aleatorio}" />
        </td>
    </table>	
</form>
<div id="dialogFormDatosDim"></div>


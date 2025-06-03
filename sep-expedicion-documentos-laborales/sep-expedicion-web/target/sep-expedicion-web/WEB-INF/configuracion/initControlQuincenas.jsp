<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form id="quincenasForm{aleatorio}">
	<table class="pageTable">
		<tr>
			<td colspan="5" align="center" class="tituloFondoGris">
				CONTROL QUINCENAS
			</td>
		</tr>
		<tr>
			<td colspan="5" align="center" class="tituloFondoGris">
				Criterios de Búsqueda
			</td>
		</tr>
                <tr>
			<td width="15%"></td>
			<td colspan="2">
				<input id="usuario{aleatorio}"/>
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
				<label for="lQuincena">Quincena:</label>
			</td>
			<td colspan="2">
				<input id="quincena{aleatorio}"/>
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
				<div id="gridQuincenas{aleatorio}"></div>
			</td>
		</tr>
		<tr>
			<td align="center" colspan="5">
				<input id="btnAgrega{aleatorio}" />				
				<input id="btnElimina{aleatorio}" />
				<input id="btnCerrar{aleatorio}" />
			</td>
		</tr>
	</table>	
</form>
<div id="dialogFormQuincenas"></div>


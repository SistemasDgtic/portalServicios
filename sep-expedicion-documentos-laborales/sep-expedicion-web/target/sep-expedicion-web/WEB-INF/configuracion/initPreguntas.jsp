<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form id="preguntasForm{aleatorio}">
	<table class="pageTable">
		<tr>
			<td colspan="5" align="center" class="tituloFondoGris">
				PREGUNTAS CLAVE
			</td>
		</tr>
		<tr>
			<td colspan="3" align="center" class="tituloFondoGris">
				Criterios de Búsqueda
			</td>
		</tr>
		<tr>
			<td width="15%" class="contenidos">
				<label for="lIdPregunta">Id. Pregunta:</label>
			</td>
			<td colspan="2" class="contenidos">
				<input id="idPregunta{aleatorio}"/>
			</td>
		</tr>
                <tr>
			<td width="15%" class="contenidos">
				<label for="lDescripcion">Descripci&oacute;n:</label>
			</td>
			<td colspan="2">
				<input id="descripcion{aleatorio}"/>
			</td>
		</tr>
		<tr>		
			<td class="contenidos">
                            <label for="lActivo">Activa/Inactiva : </label>
			</td>
			<td>
				<input id="activo{aleatorio}"/>
			</td>		
			<td width="20%">
				<input id="btnConsulta{aleatorio}"/>
				<input id="btnCancela{aleatorio}"/>
			</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td colspan="3" align="center" class="tituloFondoGris">
				Registros Recuperados
			</td>
		</tr>
		<tr>
			<td colspan="5">
				<div id="gridPreguntas{aleatorio}"></div>
			</td>
		</tr>
		<tr>
			<td align="center" colspan="3">
				<input id="btnAgrega{aleatorio}" />
				<input id="btnModifica{aleatorio}" />
				<input id="btnElimina{aleatorio}" />
				<input id="btnCerrar{aleatorio}" />
			</td>
		</tr>
	</table>	
</form>
<div id="dialogFormPreguntas"></div>

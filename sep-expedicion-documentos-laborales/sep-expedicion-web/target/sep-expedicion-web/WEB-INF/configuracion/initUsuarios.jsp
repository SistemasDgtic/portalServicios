<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<form id="usuariosForm{aleatorio}">
	<table class="pageTable">
                <tr>
                    <td colspan="3" align="center" class="tituloFondoGris">
                        USUARIOS
                    </td>
		</tr>
		<tr>
			<td colspan="3" align="center" class="tituloFondoGris">
				Criterios de Búsqueda
                        </td>
		</tr>                               
		<tr>
			<td width="23%" class="contenidos"><label>Usuario: </label></td>
			<td colspan="2"><input id="username{aleatorio}" /></td>
		</tr>
                <tr>
                        <td  width="23%" class="contenidos"><label>Nombre: </label></td>
                        <td colspan="2"><input id="nombreUsuario{aleatorio}" /></td>
                </tr>
                <tr>
                        <td width="23%" class="contenidos"><label for="lActivo">Activo/Inactivo : </label></td>
			<td><input id="usuarioActivo{aleatorio}"/></td>	
			<td width="37%">
                            <input id="btnConsulta{aleatorio}" />
                            <input id="btnLimpia{aleatorio}" />
                        </td>
		</tr>
		<tr>
			<td colspan="3">&nbsp;</td>
		</tr>
		<tr>
			<td colspan="3" align="center" class="tituloFondoGris">
				Registros Recuperados</td>
		</tr>
		<tr>
			<td colspan="3">
				<div id="gridUsuario{aleatorio}"></div>
			</td>
		</tr>
		<tr>
			<td align="center" colspan="3">                            
                            <input  id="btnConsultarUsuario{aleatorio}" /> 
                            <input  id="btnAgregarUsuario{aleatorio}" /> 
                            <input  id="btnModificarUsuario{aleatorio}" /> 
                            <input  id="btnEliminarUsuario{aleatorio}" />
                            <input  id="btnCerrar{aleatorio}" />
                        </td>
		</tr>
	</table>
</form>
<div id="dialogFormUsuario"></div>

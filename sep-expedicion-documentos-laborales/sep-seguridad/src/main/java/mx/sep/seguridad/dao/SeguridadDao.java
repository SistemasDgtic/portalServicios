package mx.sep.seguridad.dao;

import java.util.List;

import mx.sep.seguridad.modelo.RolSeguridad;
import mx.sep.seguridad.modelo.UsuarioSeguridad;
import org.apache.ibatis.annotations.Param;

/**
 * Servicios de acceso a datos para roles y usuario de seguridad.
 * 
 * @author Alejandro Pimentel
 *
 */
public interface SeguridadDao {

	List<UsuarioSeguridad> consultarUsarios();
	
	List<RolSeguridad> consultarRoles();
	
	UsuarioSeguridad consultarUsuarioConRoles(String username);
	
	int deleteAllRolesUsuario( @Param("idTrUsuario") Integer idTrUsuario );
	
	int insertRolUsuario( @Param("idTrUsuario") Integer idTrUsuario, @Param("idTrRol") Integer idTrRol );
}

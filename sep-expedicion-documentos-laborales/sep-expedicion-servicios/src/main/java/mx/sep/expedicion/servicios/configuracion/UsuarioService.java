/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.expedicion.servicios.configuracion;

import java.util.List;
import mx.sep.expedicion.datos.vo.RolUsuarioVO;
import mx.sep.expedicion.modelo.Tps005Usuarios;
import mx.sep.util.datos.vo.FiltroBusquedaVO;

/**
 *
 * @author eduardo.hernandez
 */
public interface UsuarioService {

    List<RolUsuarioVO> consultaPagina(FiltroBusquedaVO filtroBusquedaVO, RolUsuarioVO usuarioRolVO) throws Exception;

    Integer consultaContar(RolUsuarioVO usuarioRolVO) throws Exception;

    void eliminar(Tps005Usuarios tps005Usuarios) throws Exception;

    void modificar(Tps005Usuarios tps005Usuarios, Boolean actPassword) throws Exception;

    void guardar(Tps005Usuarios tps005Usuarios) throws Exception;

    List<Tps005Usuarios> consultaTodos() throws Exception;

    Tps005Usuarios consultaUsuario(Tps005Usuarios tps005Usuarios) throws Exception;
    
    List<Tps005Usuarios> consultaPorRfc(Tps005Usuarios tps005Usuarios) throws Exception;
    
    List<Tps005Usuarios> consultaPorRespuestayRfc(Tps005Usuarios tps005Usuarios) throws Exception;
    
    void enviaMail(Tps005Usuarios tps005Usuarios) throws Exception;    
    
    int consultaBienvenidaEsp(Tps005Usuarios tps005Usuarios) throws Exception;
}

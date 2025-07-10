/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.expedicion.web.controller.configuracion;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.sep.expedicion.datos.vo.RolUsuarioVO;
import mx.sep.expedicion.modelo.Tps005Usuarios;
import mx.sep.expedicion.servicios.configuracion.UsuarioService;
import mx.sep.seguridad.util.SeguridadUtil;
import mx.sep.util.datos.vo.FiltroBusquedaVO;
import mx.sep.util.servicios.LoggerUtil;
import mx.sep.util.web.ControllerBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author eduardo.hernandez
 */
@Controller
@RequestMapping(value = "/configuracion/usuario")
public class UsuarioController extends ControllerBase {

    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<RolUsuarioVO> buscaPaginaRest(@RequestHeader("Range") String rango,
            HttpServletResponse response,
            HttpServletRequest request) throws Exception {        
        String vUsername = (request.getParameter("vUsername") == null || "".equals(new String(request.getParameter("vUsername").getBytes("ISO-8859-1"),"UTF-8")) ? null:"" + new String(request.getParameter("vUsername").getBytes("ISO-8859-1"),"UTF-8"));
        String vNombreUsuario = (request.getParameter("vNombreUsuario") == null || "".equals(new String(request.getParameter("vNombreUsuario").getBytes("ISO-8859-1"),"UTF-8")) ? null:"" + new String(request.getParameter("vNombreUsuario").getBytes("ISO-8859-1"),"UTF-8"));        
        Boolean vUsuarioActivo = ("".equals(request.getParameter("vUsuarioActivo")) ? true : Boolean.valueOf(request.getParameter("vUsuarioActivo")));
        LoggerUtil.debug(this, "Valor: vUsername=" + vUsername + ", vNombreUsuario=" + vNombreUsuario + ", vUsuarioActivo" + vUsuarioActivo);
        RolUsuarioVO usuarioRolVO = new RolUsuarioVO();
        usuarioRolVO.setUsername(vUsername);
        usuarioRolVO.setNombreUsuario(vNombreUsuario);
        usuarioRolVO.setUsuarioActivo(vUsuarioActivo);
        Integer total = usuarioService.consultaContar(usuarioRolVO);
        FiltroBusquedaVO filtroBusquedaVO = this.manejarRestPaging(rango, total, request, response);
        List<RolUsuarioVO> list = null;
        list = usuarioService.consultaPagina(filtroBusquedaVO, usuarioRolVO);
        return list;
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    @ResponseBody
    public void guardarFormulario(@RequestBody Tps005Usuarios tps005Usuarios) throws Exception {
        usuarioService.guardar(tps005Usuarios);
    }

    @RequestMapping(value = "/modificar", method = RequestMethod.POST)
    @ResponseBody
    public void modificarFormulario(@RequestBody Tps005Usuarios tps005Usuarios) throws Exception {
        usuarioService.modificar(tps005Usuarios, false);
    }

    @RequestMapping(value = "/modificarPassword", method = RequestMethod.POST)
    @ResponseBody
    public void modificarFormularioPass(@RequestBody Tps005Usuarios tps005Usuarios) throws Exception {
        usuarioService.modificar(tps005Usuarios, true);
    }

    @RequestMapping(value = "/eliminar", method = RequestMethod.POST)
    @ResponseBody
    public void eliminarFormulario(@RequestBody Tps005Usuarios tps005Usuarios) throws Exception {
        usuarioService.eliminar(tps005Usuarios);
    }

    @RequestMapping(value = "/todos/{aleatorio}", method = RequestMethod.GET)
    @ResponseBody
    public List<Tps005Usuarios> consultaTodos(@PathVariable Integer aleatorio) throws Exception {
        List<Tps005Usuarios> list = null;
        list = usuarioService.consultaTodos();
        return list;
    }
    
    @RequestMapping(value = "/enviaPassword", method = RequestMethod.GET)
    public String enviaPassword(HttpServletRequest request) throws Exception {
        return "configuracion/initEnviaPassword";
    }

    @RequestMapping(value = "/enviaPassword/buscaPorRfc", method = RequestMethod.POST)
    @ResponseBody
    public List<Tps005Usuarios> buscaPorAsunto(@RequestBody Tps005Usuarios tps005Usuarios) throws Exception {
        return usuarioService.consultaPorRfc(tps005Usuarios);
    }

    @RequestMapping(value = "/enviaPassword/buscaPorRespyRfc", method = RequestMethod.POST)
    @ResponseBody
    public List<Tps005Usuarios> buscaPorRespuestayRfc(@RequestBody Tps005Usuarios tps005Usuarios) throws Exception {
        return usuarioService.consultaPorRespuestayRfc(tps005Usuarios);
    }

    @RequestMapping(value = "/enviaPassword/enviaMail", method = RequestMethod.POST)
    @ResponseBody
    public void enviaMail(@RequestBody Tps005Usuarios tps005Usuarios) throws Exception {
        String password = usuarioService.modificar(tps005Usuarios);
        usuarioService.enviaMail(tps005Usuarios, password);
    }

    @RequestMapping(value = "/obtieneRol/{aleatorio}", method = RequestMethod.GET)
    @ResponseBody
    public String obtieneRol(@PathVariable Integer aleatorio) throws Exception {
        String nombreRol = SeguridadUtil.getUnicoRol();
        return nombreRol;
    }

    @RequestMapping(value = "/registrarCuenta", method = RequestMethod.GET)
    public String registrarUsuario(HttpServletRequest request) throws Exception {
        return "configuracion/initRegistraUsuario";
    }
    
    @RequestMapping(value = "/registrarCuenta/buscaPorRfc", method = RequestMethod.POST)
    @ResponseBody
    public List<Tps005Usuarios> buscaPorRfc(@RequestBody Tps005Usuarios tps005Usuarios) throws Exception {
        return usuarioService.consultaPorRfc(tps005Usuarios);
    }

    @RequestMapping(value = "/registrarCuenta/registrar", method = RequestMethod.POST)
    @ResponseBody
    public void registrar(@RequestBody Tps005Usuarios tps005Usuarios) throws Exception {
        System.out.println(">>> id Usuario " + tps005Usuarios.getIdUsuario() + " habilitado " + tps005Usuarios.getUsuarioHabilitado());
        usuarioService.modificar(tps005Usuarios, true);
    }

}

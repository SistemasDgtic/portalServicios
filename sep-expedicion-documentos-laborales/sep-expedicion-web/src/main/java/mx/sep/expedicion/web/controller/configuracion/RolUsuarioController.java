/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.sep.expedicion.web.controller.configuracion;

import mx.sep.expedicion.datos.vo.RolUsuarioVO;
import mx.sep.expedicion.servicios.configuracion.RolUsuarioService;
import mx.sep.util.web.ControllerBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Elisa Pérez
 */
@Controller
@RequestMapping(value = "/configuracion/rolUsuario")
public class RolUsuarioController extends ControllerBase {
    
    @Autowired
    private RolUsuarioService rolUsuarioService;
    
    @RequestMapping(value = "/modificar", method = RequestMethod.POST)
    @ResponseBody
    public void modificarRol(@RequestBody RolUsuarioVO usuarioRolVO) throws Exception {
        rolUsuarioService.modificar(usuarioRolVO);
    }   
    
}

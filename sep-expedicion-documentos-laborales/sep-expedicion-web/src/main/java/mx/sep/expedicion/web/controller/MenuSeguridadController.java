package mx.sep.expedicion.web.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import mx.sep.expedicion.modelo.Tps005Usuarios;
import mx.sep.expedicion.servicios.configuracion.UsuarioService;

import mx.sep.seguridad.modelo.ModuloMenu;
import mx.sep.seguridad.modelo.OpcionMenu;
import mx.sep.seguridad.modelo.UsuarioSeguridad;
import mx.sep.seguridad.servicios.MenuSeguridadServicio;
import mx.sep.seguridad.util.SeguridadUtil;
import org.jfree.util.Log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controller que se encarga de atender la peticiones del cliente para el menú
 * de opciones que será mostrado.
 *
 * @author Alejandro Pimentel
 *
 */
@Controller
@RequestMapping("/seguridad/menu")
public class MenuSeguridadController {

    @Autowired
    private MenuSeguridadServicio menuSeguridadServicio;
    @Autowired
    private UsuarioService usuarioService;

    /**
     * Obtiene un objeto tipo {@link OpcionMenu}, verifica si cada uno de sus
     * subopciones tendrán o no hijos a su vez.
     *
     * @param id El id de la opción de menu que se desea obtener.
     * @return Un objeto tipo {@link OpcionMenu} que contiene la información de
     * la opción y de sus subopciones.
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public OpcionMenu obtenerOpciones(@PathVariable Long id) {
        UsuarioSeguridad us = SeguridadUtil.getUsuarioActual();
        OpcionMenu opcion = menuSeguridadServicio.consultarOpcionSubOpcionesGranted(id, us.getUsername());
        //OpcionMenu opcion = menuSeguridadServicio.consultarOpcionSubOpciones(id);
        for (OpcionMenu op : opcion.getOpciones()) {
            if (!StringUtils.hasLength(op.getUrl())) {
				// con un arreglo vacío indicamos que tiene hijos
                // que posteriormente podrían ser cargados.
                op.setOpciones(new ArrayList<OpcionMenu>());
            }
        }

        return opcion;
    }

    /**
     * Consulta un módulo por id y lo devuelve como una OpcionMenu. Coloca
     * además en {@link OpcionMenu#setOpciones(List)} una lista vacía
     * indicando que dado que es un módulo este siempre tendra opciones hijas.
     *
     * @param id El id de la opción de menu que se desea obtener.
     * @return
     */
    @RequestMapping(value = "/modulo/{id}", method = RequestMethod.GET)
    @ResponseBody
    public OpcionMenu obtenerModulo(@PathVariable Long id) {
        ModuloMenu modulo = menuSeguridadServicio.consultarModuloMenu(id);
        OpcionMenu opcion = new OpcionMenu();
        opcion.setId(modulo.getId());
        opcion.setOpcion(modulo.getModulo());
		// con un arreglo vacío indicamos que tiene hijos
        // que posteriormente podrían ser cargados.		
        opcion.setOpciones(new ArrayList<OpcionMenu>());

        return opcion;
    }

    /**
     * Devuelve la lista de módulo que se mostrará en el menú.
     *
     * @return lista de módulos.
     */
    @RequestMapping(value = "/modulos", method = RequestMethod.GET)
    @ResponseBody
    public List<ModuloMenu> obtenerModulos() {
        List<ModuloMenu> modulos = menuSeguridadServicio.consultarModulos();

        return modulos;
    }

    @RequestMapping(value = "/checkSesion", method = RequestMethod.GET)
    @ResponseBody
    public boolean checkSesion(HttpServletRequest request) {
        if (((SecurityContextImpl) request.getSession().getAttribute("SPRING_SECURITY_CONTEXT")).getAuthentication() == null) {
            return false;
        }
        return true;
    }

    @RequestMapping(value = "/obtieneUsuario/{aleatorio}", method = RequestMethod.GET)
    @ResponseBody
    public Tps005Usuarios getUsuarioActual(@PathVariable Integer aleatorio) throws Exception {
        UsuarioSeguridad us = SeguridadUtil.getUsuarioActual();
        Tps005Usuarios tps005 = new Tps005Usuarios();
        tps005.setUsername(us.getUsername());
        tps005.setNombreUsuario(us.getNombre());
        tps005 = usuarioService.consultaUsuario(tps005);
        return tps005;
    }

    @RequestMapping(value = "/obtieneUsuarioSesion/{aleatorio}", method = RequestMethod.GET)
    @ResponseBody
    public UsuarioSeguridad getUsuarioSesion(@PathVariable Integer aleatorio) throws Exception {
        UsuarioSeguridad us = SeguridadUtil.getUsuarioActual();
        return us;
    }
    
    @RequestMapping(value = "/obtieneImagenBienvenida/{aleatorio}", method = RequestMethod.GET)
    @ResponseBody
    public int obtenerImagenBienvenida(@PathVariable Integer aleatorio) throws Exception {
        UsuarioSeguridad us = SeguridadUtil.getUsuarioActual();
        Tps005Usuarios tps005Usuarios = new Tps005Usuarios();
        tps005Usuarios.setUsername(us.getUsername());
        int bienvenidaEspecial = 0;
        bienvenidaEspecial = usuarioService.consultaBienvenidaEsp(tps005Usuarios);
        return bienvenidaEspecial;
    }
}

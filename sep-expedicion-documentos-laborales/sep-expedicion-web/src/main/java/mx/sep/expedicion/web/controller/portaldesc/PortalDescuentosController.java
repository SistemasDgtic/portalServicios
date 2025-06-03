/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.expedicion.web.controller.portaldesc;

import mx.sep.expedicion.modelo.Tps020RegNomipay;
import mx.sep.expedicion.servicios.portaldesc.PortalDescuentosService;
import mx.sep.util.web.ControllerBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ana.perezh
 */
@Controller
@RequestMapping(value = "/portal/descuentos")
public class PortalDescuentosController extends ControllerBase {

    @Autowired
    private PortalDescuentosService portalDescuentosService;

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    @ResponseBody
    public Tps020RegNomipay guardarFormulario(@RequestBody Tps020RegNomipay tps020RegNomipay) throws Exception {
        return portalDescuentosService.guardar(tps020RegNomipay);
    }
}

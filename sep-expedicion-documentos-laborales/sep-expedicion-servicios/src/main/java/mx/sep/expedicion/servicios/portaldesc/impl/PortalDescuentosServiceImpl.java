/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.expedicion.servicios.portaldesc.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import mx.sep.expedicion.dao.Tps020RegNomipayMapper;
import mx.sep.expedicion.modelo.Tps020RegNomipay;
import mx.sep.expedicion.servicios.portaldesc.PortalDescuentosService;
import mx.sep.expedicion.servicios.util.EncryptUtil;
import mx.sep.expedicion.servicios.util.RandomUtil;
import mx.sep.util.servicios.LoggerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 *
 * @author ana.perezh
 */
@Service
public class PortalDescuentosServiceImpl implements PortalDescuentosService {

    @Value("${app.upcve}")
    private Short upCve;
    @Autowired
    private Tps020RegNomipayMapper tps020RegNomipayMapper;

    /**
     * Inserta un nuevo registro en tps020_reg_nomipay
     *
     * @param tps020RegNomipay
     * @return Tps020RegNomipay
     * @throws Exception
     */
    public Tps020RegNomipay guardar(Tps020RegNomipay tps020RegNomipay) throws Exception {
        String llaveCompuesta = "";
        String llaveCompuestaEncrypt = "";
        tps020RegNomipay.setIdRegistro(0);
        tps020RegNomipay.setFechaRegistro(new Date());
        SimpleDateFormat objFormatoFecha = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");        
        llaveCompuesta = tps020RegNomipay.getRfcTrabajador() + objFormatoFecha.format(tps020RegNomipay.getFechaRegistro()) + RandomUtil.obtenAleatorio(4);
        //LoggerUtil.debug(this, "llaveCompuesta: " + llaveCompuesta);        
        llaveCompuestaEncrypt = EncryptUtil.encriptaMd5(llaveCompuesta);
        //LoggerUtil.debug(this, "llaveCompuestaMD5: " + llaveCompuestaEncrypt);
        tps020RegNomipay.setLlaveCompuesta(llaveCompuestaEncrypt);
        tps020RegNomipay.setNominaTrabajador(upCve);
        tps020RegNomipay.setEstatus("t");
        tps020RegNomipayMapper.insert(tps020RegNomipay);
        return tps020RegNomipay;
    }

}

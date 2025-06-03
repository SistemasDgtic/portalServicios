/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.expedicion.servicios.configuracion.impl;

import java.util.List;
import mx.sep.expedicion.dao.Tps018DatosDimMapper;
import mx.sep.expedicion.dao.join.Tps018DatosDimJoinMapper;
import mx.sep.expedicion.modelo.Tps018DatosDim;
import mx.sep.expedicion.modelo.custom.Tps018DatosDimExample;
import mx.sep.expedicion.servicios.configuracion.DatosDimService;
import mx.sep.util.datos.vo.FiltroBusquedaVO;
import mx.sep.util.servicios.ErrorNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author itzel.pantoja
 */
@Service
public class DatosDimServiceImp extends ConfiguracionBase<Tps018DatosDim> implements DatosDimService {

    @Autowired
    private Tps018DatosDimMapper tps018DatosDimMapper;

    @Autowired
    private Tps018DatosDimJoinMapper tps018DatosDimJoinMapper;

    public List<Tps018DatosDim> consultaPagina(FiltroBusquedaVO filtroBusquedaVO, Tps018DatosDim tps018DatosDim) throws Exception {
        Tps018DatosDimExample tps018DatosDimExample = getCriterios(filtroBusquedaVO, tps018DatosDim);
        tps018DatosDimExample.setOrderByClause("anio desc");
        List<Tps018DatosDim> list = null;
        System.out.println("+++ Fecha en Imp " + tps018DatosDim.getFechaPresentacion());
        list = tps018DatosDimJoinMapper.selectPageByExample(tps018DatosDimExample);
        return list;
    }

    public Integer consultaContar(Tps018DatosDim tps018DatosDim) throws Exception {
        Tps018DatosDimExample tps018DatosDimExample = getCriterios(null, tps018DatosDim);
        Integer count = null;
        count = tps018DatosDimMapper.countByExample(tps018DatosDimExample);
        return count;
    }

    @Override
    public void guardar(Tps018DatosDim tps018DatosDim) throws Exception {
        try {
            tps018DatosDim.setIdDatos(0);
            tps018DatosDimMapper.insert(tps018DatosDim);
        } catch (Exception ex) {
            throw new ErrorNegocio(new Object[]{},
                    "servicios.catalogo.error.save.dim.duplicado");
        }
    }

    @Override
    public void modificar(Tps018DatosDim tps018DatosDim) throws Exception {
        try {
            tps018DatosDimMapper.updateByPrimaryKey(tps018DatosDim);
        } catch (Exception ex) {
            throw new ErrorNegocio(new Object[]{},
                    "servicios.catalogo.error.save.dim.duplicado");
        }
    }

    @Override
    public void eliminar(Tps018DatosDim tps018DatosDim) throws Exception {
        try {
            tps018DatosDimMapper.deleteByPrimaryKey(tps018DatosDim.getIdDatos());
        } catch (Exception ex) {
            throw new ErrorNegocio(new Object[]{},
                    "servicios.catalogo.error.delete.referencia");
        }
    }

    @Override
    public List<Tps018DatosDim> consultaTodos() throws Exception {
        Tps018DatosDimExample tps018DatosDimExample = new Tps018DatosDimExample();
        return tps018DatosDimMapper.selectByExample(tps018DatosDimExample);
    }

    private Tps018DatosDimExample getCriterios(FiltroBusquedaVO filtroBusquedaVO, Tps018DatosDim tps018DatosDim) {
        Tps018DatosDimExample tps018DatosDimExample = new Tps018DatosDimExample();
        tps018DatosDimExample.setFiltroBusquedaVO(filtroBusquedaVO);
        Tps018DatosDimExample.Criteria criteria = tps018DatosDimExample.createCriteria();
        if (tps018DatosDim.getAnio() != null) {
            criteria.andAnioEqualTo(tps018DatosDim.getAnio());
        }
        if (tps018DatosDim.getNumFolio() != null) {
            criteria.andNumFolioEqualTo(tps018DatosDim.getNumFolio());
        }
        if (tps018DatosDim.getUsuario() != null) {
            criteria.andUsuarioEqualTo(tps018DatosDim.getUsuario());
        }
        return tps018DatosDimExample;
    }

}

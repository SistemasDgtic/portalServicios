package mx.sep.expedicion.servicios.constancias.impl;

import java.util.List;
import mx.sep.expedicion.dao.Tps015IsrAnualMapper;
import mx.sep.expedicion.dao.join.Tps015IsrAnualJoinMapper;
import mx.sep.expedicion.modelo.Tps015IsrAnual;
import mx.sep.expedicion.modelo.custom.Tps015IsrAnualExample;
import mx.sep.expedicion.servicios.constancias.ConstanciaIsrAnualService;
import mx.sep.util.datos.vo.FiltroBusquedaVO;
import mx.sep.util.servicios.ErrorInfraestructura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ana.perezh
 */
@Service
public class ConstanciaIsrAnualServiceImpl implements ConstanciaIsrAnualService {
    
    @Autowired
    private Tps015IsrAnualMapper tps015IsrAnualMapper;
    @Autowired
    private Tps015IsrAnualJoinMapper tps015IsrAnualJoinMapper;

    /**
     * Busca total de registros recuperados
     *
     * @param Tps015IsrAnual
     * @return Lista de objetos Tps015IsrAnual
     * @throws Exception
     */
    public Integer consultaContar(Tps015IsrAnual tps015IsrAnual) throws Exception {
        Tps015IsrAnualExample tps015IsrAnualExample = new Tps015IsrAnualExample();
        Tps015IsrAnualExample.Criteria criteria = tps015IsrAnualExample.createCriteria();
        if (tps015IsrAnual.getRfc() != null) {
            criteria.andRfcEqualTo(tps015IsrAnual.getRfc() );
            System.out.println("RFC: " + tps015IsrAnual.getRfc());
        }
        if (tps015IsrAnual.getAnio() != 0) {
            criteria.andAnioEqualTo(tps015IsrAnual.getAnio() );
            System.out.println("ANIO: " + tps015IsrAnual.getAnio());
        }    
        Integer count = null;
        count = tps015IsrAnualJoinMapper.countByExample(tps015IsrAnualExample);
        return count;
    }

    /**
     * Busca los registros de las constancias
     *
     * @return Lista de objetos Tps015IsrAnual
     * @throws Exception
     */
    public List<Tps015IsrAnual> consultaPagina(FiltroBusquedaVO filtroBusquedaVO, Tps015IsrAnual tps015IsrAnual) throws Exception {
        Tps015IsrAnualExample tps015IsrAnualExample = new Tps015IsrAnualExample();
        tps015IsrAnualExample.setDesde(filtroBusquedaVO.getDesde());
        tps015IsrAnualExample.setElementos(filtroBusquedaVO.getHasta());
        Tps015IsrAnualExample.Criteria criteria = tps015IsrAnualExample.createCriteria();
        tps015IsrAnualExample.setOrderByClause("a.anio desc");
        if (tps015IsrAnual.getRfc() != null) {
            criteria.andRfcEqualTo(tps015IsrAnual.getRfc());
        }
        if (tps015IsrAnual.getAnio() != 0) {
            criteria.andAnioEqualTo(tps015IsrAnual.getAnio());
        }
        List<Tps015IsrAnual> lstTps015 = null;
        lstTps015 = tps015IsrAnualJoinMapper.selectPageByExample(tps015IsrAnualExample);
        return lstTps015;
    }

    /**
     * Inserta un registro en la tabla tps015_isr_anual
     *
     * @param tps015IsrAnual información a almacenar
     * @throws Exception
     */
    public void guardar(Tps015IsrAnual tps015IsrAnual) throws Exception {
        tps015IsrAnualMapper.insert(tps015IsrAnual);
    }

    /**
     * Actualiza la información de tps015_isr_anual
     *
     * @param tps015IsrAnual información a almacenar
     * @throws Exception
     */
    public void modificar(Tps015IsrAnual tps015IsrAnual) throws Exception {
        tps015IsrAnualMapper.updateByPrimaryKey(tps015IsrAnual);
    }

    /**
     * Elimina un registro de tps015_isr_anual
     *
     * @param tps015IsrAnual de la constancia a eliminar
     * @throws Exception
     */
    public void eliminar(Tps015IsrAnual tps015IsrAnual) throws Exception {
        try {
            tps015IsrAnualMapper.deleteByPrimaryKey(tps015IsrAnual.getIdConstancia());
        } catch (DataIntegrityViolationException e) {
            throw new ErrorInfraestructura("No se puede eliminar, esta información la esta ocupando otra tabla relacionada.", e);
        }
    }

    /**
     * Obtiene la información de tps015_isr_anual
     *
     * @return Lista de objetos Tps015IsrAnual
     * @throws Exception
     */
    public List<Tps015IsrAnual> consultaTodos() throws Exception {
        Tps015IsrAnualExample tps015IsrAnualExample = new Tps015IsrAnualExample();
        return tps015IsrAnualMapper.selectByExample(tps015IsrAnualExample);
    }
    
    /**
     * Obtiene la información de tps015_isr_anual
     *
     * @return Objeto Tps015IsrAnual
     * @throws Exception
     */
    public Tps015IsrAnual consultaPorConstancia(Integer idConstancia) throws Exception {
        return tps015IsrAnualMapper.selectByPrimaryKey(idConstancia);
    }
}

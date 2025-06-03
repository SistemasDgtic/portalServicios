/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.expedicion.servicios.comprobantes.impl;

import java.util.List;
import mx.sep.expedicion.dao.Tps003ComprobanteMapper;
import mx.sep.expedicion.dao.join.Tps003ComprobanteJoinMapper;
import mx.sep.expedicion.modelo.Tps003Comprobante;
import mx.sep.expedicion.modelo.custom.Tps003ComprobanteExample;
import mx.sep.expedicion.servicios.comprobantes.ComprobantePagoService;
import mx.sep.util.datos.vo.FiltroBusquedaVO;
import mx.sep.util.servicios.ErrorInfraestructura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

/**
 *
 * @author eduardo.hernandez
 */
@Service
public class ComprobantePagoServiceImpl implements ComprobantePagoService {

    @Autowired
    private Tps003ComprobanteMapper tps003ComprobanteMapper;
    @Autowired
    private Tps003ComprobanteJoinMapper tps003ComprobanteJoinMapper;

    /**
     * Busca total de registros recuperados
     *
     * @param tps003Comprobante
     * @return Lista de objetos Tps003Comprobantes
     * @throws Exception
     */
    public Integer consultaContar(Tps003Comprobante tps003Comprobante, String anio, String quincena) throws Exception {
        Tps003ComprobanteExample tps003ComprobanteExample = new Tps003ComprobanteExample();
        Tps003ComprobanteExample.Criteria criteria = tps003ComprobanteExample.createCriteria();
        if (tps003Comprobante.getRfc() != null) {
            criteria.andRfcEqualTo(tps003Comprobante.getRfc() );
        }
        if(anio != null){
            if(quincena != null){
                String qnaProc = anio.concat(quincena);
                tps003Comprobante.setQnaProc(Integer.parseInt(qnaProc));
                criteria.andQnaProcEqualTo(tps003Comprobante.getQnaProc());
            }else{
                String qnaIni = anio.concat("01");
                String qnaFin = anio.concat("24");
                criteria.andQnaProcBetween(Integer.valueOf(qnaIni), Integer.valueOf(qnaFin));
            }
        }
        Integer count = null;
        count = tps003ComprobanteJoinMapper.countByExample(tps003ComprobanteExample);
        return count;
    }

    /**
     * Busca los registros de comprobantes
     *
     * @return Lista de objetos Tps003Comprobante
     * @throws Exception
     */
    public List<Tps003Comprobante> consultaPagina(FiltroBusquedaVO filtroBusquedaVO,
            Tps003Comprobante tps003Comprobante, String anio, String quincena) throws Exception {
        Tps003ComprobanteExample tps003ComprobanteExample = new Tps003ComprobanteExample();
        tps003ComprobanteExample.setDesde(filtroBusquedaVO.getDesde());
        tps003ComprobanteExample.setElementos(filtroBusquedaVO.getHasta());
        Tps003ComprobanteExample.Criteria criteria = tps003ComprobanteExample.createCriteria();
        tps003ComprobanteExample.setOrderByClause("a.qna_proc desc");
        if (tps003Comprobante.getRfc() != null) {
            criteria.andRfcEqualTo(tps003Comprobante.getRfc());
        }
        if(anio != null){
            if(quincena != null){
                String qnaProc = anio.concat(quincena);
                tps003Comprobante.setQnaProc(Integer.parseInt(qnaProc));
                criteria.andQnaProcEqualTo(tps003Comprobante.getQnaProc());
            }else{
                String qnaIni = anio.concat("01");
                String qnaFin = anio.concat("24");
                criteria.andQnaProcBetween(Integer.valueOf(qnaIni), Integer.valueOf(qnaFin));
            }
        }
        List<Tps003Comprobante> lstTps003 = null;
        lstTps003 = tps003ComprobanteJoinMapper.selectPageByExample(tps003ComprobanteExample);
        return lstTps003;
    }

    /**
     * Inserta un registro en la tabla tps003_comprobante
     *
     * @param tps003Comprobante información a almacenar
     * @throws Exception
     */
    public void guardar(Tps003Comprobante tps003Comprobante) throws Exception {
        tps003ComprobanteMapper.insert(tps003Comprobante);
    }

    /**
     * Actualiza la información de tps003_comprobante
     *
     * @param tps003Comprobante información a almacenar
     * @throws Exception
     */
    public void modificar(Tps003Comprobante tps003Comprobante) throws Exception {
        tps003ComprobanteMapper.updateByPrimaryKey(tps003Comprobante);
    }

    /**
     * Elimina un registro de comprobante
     *
     * @param tps003Comprobante del comprobante a eliminar
     * @throws Exception
     */
    public void eliminar(Tps003Comprobante tps003Comprobante) throws Exception {
        try {
            tps003ComprobanteMapper.deleteByPrimaryKey(tps003Comprobante.getIdComprobante());
        } catch (DataIntegrityViolationException e) {
            throw new ErrorInfraestructura("No se puede eliminar, esta información la esta ocupando otra tabla relacionada.", e);
        }
    }

    /**
     * Obtiene la información de tps003_comprobante
     *
     * @return Lista de objetos Tps003Comprobantes
     * @throws Exception
     */
    public List<Tps003Comprobante> consultaTodos() throws Exception {
        Tps003ComprobanteExample tps003ComprobanteExample = new Tps003ComprobanteExample();
        return tps003ComprobanteMapper.selectByExample(tps003ComprobanteExample);
    }
    
    /**
     * Obtiene la información de tps003_comprobante
     *
     * @return Objeto Tps003Comprobante
     * @throws Exception
     */
    public Tps003Comprobante consultaPorComprobante(Integer idComprobante) throws Exception {
        return tps003ComprobanteMapper.selectByPrimaryKey(idComprobante);
    }

}

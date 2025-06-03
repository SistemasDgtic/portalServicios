/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.sep.expedicion.servicios.configuracion.impl;

import java.util.List;
import mx.sep.expedicion.dao.Tps011QuincenasMapper;
import mx.sep.expedicion.dao.join.Tps011QuincenasJoinMapper;
import mx.sep.expedicion.modelo.Tps011Quincenas;
import mx.sep.expedicion.modelo.custom.Tps011QuincenasExample;
import mx.sep.expedicion.servicios.configuracion.QuincenasService;
import mx.sep.util.datos.vo.FiltroBusquedaVO;
import mx.sep.util.servicios.ErrorNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Elisa Pérez
 */
@Service
public class QuincenasServiceImpl extends ConfiguracionBase<Tps011Quincenas> implements QuincenasService {
        @Autowired 
        private Tps011QuincenasJoinMapper tps011QuincenasJoinMapper;
        @Autowired
        private Tps011QuincenasMapper tps011QuincenasMapper;
        
        public List<Tps011Quincenas> consultaPagina(FiltroBusquedaVO filtroBusquedaVO, Tps011Quincenas tps011Quincenas, String anio, String quincena) throws Exception {
                Tps011QuincenasExample tps011QuincenasExample = getCriterios(filtroBusquedaVO, tps011Quincenas, anio, quincena);
                Tps011QuincenasExample.Criteria criteria = tps011QuincenasExample.createCriteria();
                tps011QuincenasExample.setOrderByClause("qna_proc asc");
                if(anio != null){
                    if(quincena != null){   
                        String qnaProc = anio.concat(quincena);
                        tps011Quincenas.setQnaProc(Integer.parseInt(qnaProc));
                        criteria.andQnaProcEqualTo(tps011Quincenas.getQnaProc());                        
                    }else{
                        String qnaIni = anio.concat("01");
                        String qnaFin = anio.concat("24");
                        criteria.andQnaProcBetween(Integer.valueOf(qnaIni), Integer.valueOf(qnaFin));                        
                    }
                }
                List<Tps011Quincenas> list = null;
                list = tps011QuincenasJoinMapper.selectPageByExample(tps011QuincenasExample);
                return list;
        }         
        
        public Integer consultaContar(Tps011Quincenas tps011Quincenas, String anio, String quincena) throws Exception {
                Tps011QuincenasExample tps011QuincenasExample = getCriterios( null, tps011Quincenas, anio, quincena);
                Tps011QuincenasExample.Criteria criteria = tps011QuincenasExample.createCriteria();
                if(anio != null){
                    if(quincena != null){  
                        String qnaProc = anio.concat(quincena);
                        tps011Quincenas.setQnaProc(Integer.parseInt(qnaProc));
                        criteria.andQnaProcEqualTo(tps011Quincenas.getQnaProc());                        
                    }else{
                        String qnaIni = anio.concat("01");
                        String qnaFin = anio.concat("24");
                        criteria.andQnaProcBetween(Integer.valueOf(qnaIni), Integer.valueOf(qnaFin));                        
                    }
                }
		Integer count=null;
		count = tps011QuincenasMapper.countByExample( tps011QuincenasExample );
		return count;
        }

        @Override
        public void guardar(Tps011Quincenas tps011Quincenas) throws Exception {
            try{
                java.util.Date utilDate = new java.util.Date(); 
                long lnMilisegundos = utilDate.getTime();
                java.sql.Date sqlDate = new java.sql.Date(lnMilisegundos);                
                tps011Quincenas.setFechaCap(sqlDate);
                tps011QuincenasMapper.insert(tps011Quincenas);
            }catch(Exception ex){
                throw new ErrorNegocio(new Object[]{},
                        "servicios.catalogo.error.save.quincena.duplicado");
            }
        }

        @Override
        public void modificar(Tps011Quincenas object) throws Exception {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void eliminar(Tps011Quincenas tps011Quincenas) throws Exception {
            try{
                tps011QuincenasMapper.deleteByPrimaryKey(tps011Quincenas.getQnaProc());
            }catch(Exception ex){
                throw new ErrorNegocio(new Object[]{},
                            "servicios.catalogo.error.delete.referencia");
            }
        }

        @Override
        public List<Tps011Quincenas> consultaTodos() throws Exception {
            Tps011QuincenasExample tps011QuincenasExample = new Tps011QuincenasExample();
            return tps011QuincenasMapper.selectByExample(tps011QuincenasExample);
        }
        
        private Tps011QuincenasExample getCriterios(FiltroBusquedaVO filtroBusquedaVO, Tps011Quincenas tps011Quincenas, String anio, String quincena) {
            Tps011QuincenasExample tps011QuincenasExample = new Tps011QuincenasExample();
            tps011QuincenasExample.setFiltroBusquedaVO(filtroBusquedaVO);
            Tps011QuincenasExample.Criteria criteria = tps011QuincenasExample.createCriteria();
            if(anio != null){
                    if(quincena != null){   
                        String qnaProc = anio.concat(quincena);
                        tps011Quincenas.setQnaProc(Integer.parseInt(qnaProc));
                        criteria.andQnaProcEqualTo(tps011Quincenas.getQnaProc());                        
                    }else{
                        String qnaIni = anio.concat("01");
                        String qnaFin = anio.concat("24");
                        criteria.andQnaProcBetween(Integer.valueOf(qnaIni), Integer.valueOf(qnaFin));
                        System.out.println("por año:" + anio + " " + quincena);
                    }
                }                    
            return tps011QuincenasExample;
        }      

    @Override
    public Integer consultaContar(Tps011Quincenas object) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Tps011Quincenas> consultaPagina(FiltroBusquedaVO filtroBusquedaVO, Tps011Quincenas object) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

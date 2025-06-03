/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.sep.expedicion.servicios.configuracion.impl;

import java.util.List;
import mx.sep.expedicion.dao.Tps009PreguntasMapper;
import mx.sep.expedicion.dao.join.Tps009PreguntasJoinMapper;
import mx.sep.expedicion.modelo.Tps009Preguntas;
import mx.sep.expedicion.modelo.custom.Tps009PreguntasExample;
import mx.sep.expedicion.servicios.configuracion.PreguntasService;
import mx.sep.util.datos.vo.FiltroBusquedaVO;
import static mx.sep.util.servicios.Constants.ACTIVO_BOOLEAN;
import static mx.sep.util.servicios.Constants.DESACTIVO_BOOLEAN;
import mx.sep.util.servicios.ErrorNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Elisa Pérez
 */
@Service
public class PreguntasServiceImpl extends ConfiguracionBase<Tps009Preguntas> implements PreguntasService {
        @Autowired
        private Tps009PreguntasJoinMapper tps009PreguntasJoinMapper;
        @Autowired
        private Tps009PreguntasMapper tps009PreguntasMapper;

        @Override
        public List<Tps009Preguntas> consultaPagina(FiltroBusquedaVO filtroBusquedaVO, Tps009Preguntas tps009Preguntas) throws Exception {
                Tps009PreguntasExample tps009PreguntasExample = getCriterios(filtroBusquedaVO, tps009Preguntas);
                List<Tps009Preguntas> list = null;
                list = tps009PreguntasJoinMapper.selectPageByExample(tps009PreguntasExample);
                return list;
        }  
        
        @Override
        public Integer consultaContar(Tps009Preguntas tps009Preguntas) throws Exception {
                Tps009PreguntasExample tps009PreguntasExample = getCriterios( null, tps009Preguntas);
		Integer count=null;
		count = tps009PreguntasMapper.countByExample( tps009PreguntasExample );
		return count;
        }
        
        @Override
        public List<Tps009Preguntas> consultaPorPregunta(Integer idPregunta) throws Exception {
                Tps009PreguntasExample tps009PreguntasExample = new Tps009PreguntasExample();
		tps009PreguntasExample.createCriteria().andActivoEqualTo(ACTIVO_BOOLEAN).andIdPreguntaEqualTo(idPregunta);
		return tps009PreguntasMapper.selectByExample(tps009PreguntasExample);
        }

        @Override
        public void guardar(Tps009Preguntas tps009Preguntas) throws Exception {
                try{
                    tps009Preguntas.setIdPregunta(tps009PreguntasJoinMapper.selectMaxPrimaryKey() + 1);                                           
                    tps009PreguntasMapper.insert(tps009Preguntas);
                }catch(Exception ex){
                    throw new ErrorNegocio(new Object[]{},
                            "servicios.catalogo.error.save.referencia");
                }
        }

        @Override
        public void modificar(Tps009Preguntas tps009Preguntas) throws Exception {
                try{
                    tps009PreguntasMapper.updateByPrimaryKey(tps009Preguntas);
                }catch(Exception ex){
                    throw new ErrorNegocio(new Object[]{},
                            "servicios.catalogo.error.update.referencia");
                }
        }

        @Override
        public void eliminar(Tps009Preguntas tps009Preguntas) throws Exception {
            try{
                tps009PreguntasMapper.deleteByPrimaryKey(tps009Preguntas.getIdPregunta());
            }catch(Exception ex){
                throw new ErrorNegocio(new Object[]{},
                            "servicios.catalogo.error.delete.referencia");
            }
        }

        @Override
        public List consultaTodos() throws Exception {
                Tps009PreguntasExample tps009PreguntasExample = new Tps009PreguntasExample();
		tps009PreguntasExample.createCriteria().andActivoEqualTo(ACTIVO_BOOLEAN);
		return tps009PreguntasMapper.selectByExample(tps009PreguntasExample);
        }

        private Tps009PreguntasExample getCriterios(FiltroBusquedaVO filtroBusquedaVO, Tps009Preguntas tps009Preguntas) {
            Tps009PreguntasExample tps009PreguntasExample = new Tps009PreguntasExample();
            tps009PreguntasExample.setFiltroBusquedaVO(filtroBusquedaVO);
            Tps009PreguntasExample.Criteria criteria = tps009PreguntasExample.createCriteria();
            if ( tps009Preguntas.getIdPregunta() != null ){
                    criteria.andIdPreguntaEqualTo(tps009Preguntas.getIdPregunta());
            }
            if ( tps009Preguntas.getDescripcion() != null ){
                    criteria.andDescripcionLike("%" + tps009Preguntas.getDescripcion() + "%");
            }
            if ( tps009Preguntas.getActivo() != null ){
                    criteria.andActivoEqualTo(tps009Preguntas.getActivo() );
            }
            return tps009PreguntasExample;
        }
        
}

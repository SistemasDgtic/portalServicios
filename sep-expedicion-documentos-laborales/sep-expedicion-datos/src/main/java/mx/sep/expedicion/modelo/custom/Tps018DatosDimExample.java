/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.sep.expedicion.modelo.custom;

import mx.sep.util.datos.vo.FiltroBusquedaVO;

/**
 *
 * @author itzel.pantoja
 */

public class Tps018DatosDimExample extends mx.sep.expedicion.modelo.Tps018DatosDimExample{
        private Integer desde;
        private Integer elementos;

        public Integer getDesde() {
                return desde;
        }

        public void setDesde(Integer desde) {
                this.desde = desde;
        }

        public Integer getElementos() {
                return elementos;
        }

        public void setElementos(Integer elementos) {
                this.elementos = elementos;
        }

        public void setFiltroBusquedaVO( FiltroBusquedaVO filtroBusquedaVO ){
                if ( filtroBusquedaVO == null ) return;
                this.desde = filtroBusquedaVO.getDesde();
                this.elementos = filtroBusquedaVO.getHasta();
        }    
    
}


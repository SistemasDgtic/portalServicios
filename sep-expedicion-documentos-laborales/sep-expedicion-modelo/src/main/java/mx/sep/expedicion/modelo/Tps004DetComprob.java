package mx.sep.expedicion.modelo;

import java.math.BigDecimal;

public class Tps004DetComprob {
    private Integer idComprobante;

    private Short consecutivo;

    private String percDed;

    private String concepto;

    private BigDecimal importe;

    public Integer getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(Integer idComprobante) {
        this.idComprobante = idComprobante;
    }

    public Short getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(Short consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getPercDed() {
        return percDed;
    }

    public void setPercDed(String percDed) {
        this.percDed = percDed == null ? null : percDed.trim();
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto == null ? null : concepto.trim();
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Tps004DetComprob other = (Tps004DetComprob) that;
        return (this.getIdComprobante() == null ? other.getIdComprobante() == null : this.getIdComprobante().equals(other.getIdComprobante()))
            && (this.getConsecutivo() == null ? other.getConsecutivo() == null : this.getConsecutivo().equals(other.getConsecutivo()))
            && (this.getPercDed() == null ? other.getPercDed() == null : this.getPercDed().equals(other.getPercDed()))
            && (this.getConcepto() == null ? other.getConcepto() == null : this.getConcepto().equals(other.getConcepto()))
            && (this.getImporte() == null ? other.getImporte() == null : this.getImporte().equals(other.getImporte()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdComprobante() == null) ? 0 : getIdComprobante().hashCode());
        result = prime * result + ((getConsecutivo() == null) ? 0 : getConsecutivo().hashCode());
        result = prime * result + ((getPercDed() == null) ? 0 : getPercDed().hashCode());
        result = prime * result + ((getConcepto() == null) ? 0 : getConcepto().hashCode());
        result = prime * result + ((getImporte() == null) ? 0 : getImporte().hashCode());
        return result;
    }
}
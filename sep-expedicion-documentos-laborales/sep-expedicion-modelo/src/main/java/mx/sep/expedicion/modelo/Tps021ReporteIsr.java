package mx.sep.expedicion.modelo;

import java.math.BigDecimal;

public class Tps021ReporteIsr {
    private Integer idRepIsr;

    private String rfc;

    private Short anio;

    private String nombre;

    private String curp;

    private BigDecimal ingAnualSueldo;

    private BigDecimal ingExcSueldo;

    private BigDecimal ingAcumSueldo;

    private BigDecimal subsidioSueldo;

    private BigDecimal impRetSueldo;

    private BigDecimal ingAnualHonor;

    private BigDecimal ingExcHonor;

    private BigDecimal ingAcumHonor;

    private BigDecimal subsidioHonor;

    private BigDecimal impRetHonor;

    private BigDecimal ingAnualSepara;

    private BigDecimal ingExcSepara;

    private BigDecimal ingAcumSepara;

    private BigDecimal subsidioSepara;

    private BigDecimal impRetSepara;

    public Integer getIdRepIsr() {
        return idRepIsr;
    }

    public void setIdRepIsr(Integer idRepIsr) {
        this.idRepIsr = idRepIsr;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc == null ? null : rfc.trim();
    }

    public Short getAnio() {
        return anio;
    }

    public void setAnio(Short anio) {
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre == null ? null : nombre.trim();
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp == null ? null : curp.trim();
    }

    public BigDecimal getIngAnualSueldo() {
        return ingAnualSueldo;
    }

    public void setIngAnualSueldo(BigDecimal ingAnualSueldo) {
        this.ingAnualSueldo = ingAnualSueldo;
    }

    public BigDecimal getIngExcSueldo() {
        return ingExcSueldo;
    }

    public void setIngExcSueldo(BigDecimal ingExcSueldo) {
        this.ingExcSueldo = ingExcSueldo;
    }

    public BigDecimal getIngAcumSueldo() {
        return ingAcumSueldo;
    }

    public void setIngAcumSueldo(BigDecimal ingAcumSueldo) {
        this.ingAcumSueldo = ingAcumSueldo;
    }

    public BigDecimal getSubsidioSueldo() {
        return subsidioSueldo;
    }

    public void setSubsidioSueldo(BigDecimal subsidioSueldo) {
        this.subsidioSueldo = subsidioSueldo;
    }

    public BigDecimal getImpRetSueldo() {
        return impRetSueldo;
    }

    public void setImpRetSueldo(BigDecimal impRetSueldo) {
        this.impRetSueldo = impRetSueldo;
    }

    public BigDecimal getIngAnualHonor() {
        return ingAnualHonor;
    }

    public void setIngAnualHonor(BigDecimal ingAnualHonor) {
        this.ingAnualHonor = ingAnualHonor;
    }

    public BigDecimal getIngExcHonor() {
        return ingExcHonor;
    }

    public void setIngExcHonor(BigDecimal ingExcHonor) {
        this.ingExcHonor = ingExcHonor;
    }

    public BigDecimal getIngAcumHonor() {
        return ingAcumHonor;
    }

    public void setIngAcumHonor(BigDecimal ingAcumHonor) {
        this.ingAcumHonor = ingAcumHonor;
    }

    public BigDecimal getSubsidioHonor() {
        return subsidioHonor;
    }

    public void setSubsidioHonor(BigDecimal subsidioHonor) {
        this.subsidioHonor = subsidioHonor;
    }

    public BigDecimal getImpRetHonor() {
        return impRetHonor;
    }

    public void setImpRetHonor(BigDecimal impRetHonor) {
        this.impRetHonor = impRetHonor;
    }

    public BigDecimal getIngAnualSepara() {
        return ingAnualSepara;
    }

    public void setIngAnualSepara(BigDecimal ingAnualSepara) {
        this.ingAnualSepara = ingAnualSepara;
    }

    public BigDecimal getIngExcSepara() {
        return ingExcSepara;
    }

    public void setIngExcSepara(BigDecimal ingExcSepara) {
        this.ingExcSepara = ingExcSepara;
    }

    public BigDecimal getIngAcumSepara() {
        return ingAcumSepara;
    }

    public void setIngAcumSepara(BigDecimal ingAcumSepara) {
        this.ingAcumSepara = ingAcumSepara;
    }

    public BigDecimal getSubsidioSepara() {
        return subsidioSepara;
    }

    public void setSubsidioSepara(BigDecimal subsidioSepara) {
        this.subsidioSepara = subsidioSepara;
    }

    public BigDecimal getImpRetSepara() {
        return impRetSepara;
    }

    public void setImpRetSepara(BigDecimal impRetSepara) {
        this.impRetSepara = impRetSepara;
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
        Tps021ReporteIsr other = (Tps021ReporteIsr) that;
        return (this.getIdRepIsr() == null ? other.getIdRepIsr() == null : this.getIdRepIsr().equals(other.getIdRepIsr()))
            && (this.getRfc() == null ? other.getRfc() == null : this.getRfc().equals(other.getRfc()))
            && (this.getAnio() == null ? other.getAnio() == null : this.getAnio().equals(other.getAnio()))
            && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()))
            && (this.getCurp() == null ? other.getCurp() == null : this.getCurp().equals(other.getCurp()))
            && (this.getIngAnualSueldo() == null ? other.getIngAnualSueldo() == null : this.getIngAnualSueldo().equals(other.getIngAnualSueldo()))
            && (this.getIngExcSueldo() == null ? other.getIngExcSueldo() == null : this.getIngExcSueldo().equals(other.getIngExcSueldo()))
            && (this.getIngAcumSueldo() == null ? other.getIngAcumSueldo() == null : this.getIngAcumSueldo().equals(other.getIngAcumSueldo()))
            && (this.getSubsidioSueldo() == null ? other.getSubsidioSueldo() == null : this.getSubsidioSueldo().equals(other.getSubsidioSueldo()))
            && (this.getImpRetSueldo() == null ? other.getImpRetSueldo() == null : this.getImpRetSueldo().equals(other.getImpRetSueldo()))
            && (this.getIngAnualHonor() == null ? other.getIngAnualHonor() == null : this.getIngAnualHonor().equals(other.getIngAnualHonor()))
            && (this.getIngExcHonor() == null ? other.getIngExcHonor() == null : this.getIngExcHonor().equals(other.getIngExcHonor()))
            && (this.getIngAcumHonor() == null ? other.getIngAcumHonor() == null : this.getIngAcumHonor().equals(other.getIngAcumHonor()))
            && (this.getSubsidioHonor() == null ? other.getSubsidioHonor() == null : this.getSubsidioHonor().equals(other.getSubsidioHonor()))
            && (this.getImpRetHonor() == null ? other.getImpRetHonor() == null : this.getImpRetHonor().equals(other.getImpRetHonor()))
            && (this.getIngAnualSepara() == null ? other.getIngAnualSepara() == null : this.getIngAnualSepara().equals(other.getIngAnualSepara()))
            && (this.getIngExcSepara() == null ? other.getIngExcSepara() == null : this.getIngExcSepara().equals(other.getIngExcSepara()))
            && (this.getIngAcumSepara() == null ? other.getIngAcumSepara() == null : this.getIngAcumSepara().equals(other.getIngAcumSepara()))
            && (this.getSubsidioSepara() == null ? other.getSubsidioSepara() == null : this.getSubsidioSepara().equals(other.getSubsidioSepara()))
            && (this.getImpRetSepara() == null ? other.getImpRetSepara() == null : this.getImpRetSepara().equals(other.getImpRetSepara()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdRepIsr() == null) ? 0 : getIdRepIsr().hashCode());
        result = prime * result + ((getRfc() == null) ? 0 : getRfc().hashCode());
        result = prime * result + ((getAnio() == null) ? 0 : getAnio().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        result = prime * result + ((getCurp() == null) ? 0 : getCurp().hashCode());
        result = prime * result + ((getIngAnualSueldo() == null) ? 0 : getIngAnualSueldo().hashCode());
        result = prime * result + ((getIngExcSueldo() == null) ? 0 : getIngExcSueldo().hashCode());
        result = prime * result + ((getIngAcumSueldo() == null) ? 0 : getIngAcumSueldo().hashCode());
        result = prime * result + ((getSubsidioSueldo() == null) ? 0 : getSubsidioSueldo().hashCode());
        result = prime * result + ((getImpRetSueldo() == null) ? 0 : getImpRetSueldo().hashCode());
        result = prime * result + ((getIngAnualHonor() == null) ? 0 : getIngAnualHonor().hashCode());
        result = prime * result + ((getIngExcHonor() == null) ? 0 : getIngExcHonor().hashCode());
        result = prime * result + ((getIngAcumHonor() == null) ? 0 : getIngAcumHonor().hashCode());
        result = prime * result + ((getSubsidioHonor() == null) ? 0 : getSubsidioHonor().hashCode());
        result = prime * result + ((getImpRetHonor() == null) ? 0 : getImpRetHonor().hashCode());
        result = prime * result + ((getIngAnualSepara() == null) ? 0 : getIngAnualSepara().hashCode());
        result = prime * result + ((getIngExcSepara() == null) ? 0 : getIngExcSepara().hashCode());
        result = prime * result + ((getIngAcumSepara() == null) ? 0 : getIngAcumSepara().hashCode());
        result = prime * result + ((getSubsidioSepara() == null) ? 0 : getSubsidioSepara().hashCode());
        result = prime * result + ((getImpRetSepara() == null) ? 0 : getImpRetSepara().hashCode());
        return result;
    }
}
package mx.sep.expedicion.modelo;

import java.math.BigDecimal;

public class Tps022AnualSdo {
    private Short anio;

    private String rfc;

    private BigDecimal totImp;

    public Short getAnio() {
        return anio;
    }

    public void setAnio(Short anio) {
        this.anio = anio;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc == null ? null : rfc.trim();
    }

    public BigDecimal getTotImp() {
        return totImp;
    }

    public void setTotImp(BigDecimal totImp) {
        this.totImp = totImp;
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
        Tps022AnualSdo other = (Tps022AnualSdo) that;
        return (this.getAnio() == null ? other.getAnio() == null : this.getAnio().equals(other.getAnio()))
            && (this.getRfc() == null ? other.getRfc() == null : this.getRfc().equals(other.getRfc()))
            && (this.getTotImp() == null ? other.getTotImp() == null : this.getTotImp().equals(other.getTotImp()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAnio() == null) ? 0 : getAnio().hashCode());
        result = prime * result + ((getRfc() == null) ? 0 : getRfc().hashCode());
        result = prime * result + ((getTotImp() == null) ? 0 : getTotImp().hashCode());
        return result;
    }
}
package mx.sep.expedicion.modelo;

public class Tps016DetalleIsr {
    private Integer idConstancia;

    private Short clave;

    private Integer impTotal;

    private Integer impExento;

    public Integer getIdConstancia() {
        return idConstancia;
    }

    public void setIdConstancia(Integer idConstancia) {
        this.idConstancia = idConstancia;
    }

    public Short getClave() {
        return clave;
    }

    public void setClave(Short clave) {
        this.clave = clave;
    }

    public Integer getImpTotal() {
        return impTotal;
    }

    public void setImpTotal(Integer impTotal) {
        this.impTotal = impTotal;
    }

    public Integer getImpExento() {
        return impExento;
    }

    public void setImpExento(Integer impExento) {
        this.impExento = impExento;
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
        Tps016DetalleIsr other = (Tps016DetalleIsr) that;
        return (this.getIdConstancia() == null ? other.getIdConstancia() == null : this.getIdConstancia().equals(other.getIdConstancia()))
            && (this.getClave() == null ? other.getClave() == null : this.getClave().equals(other.getClave()))
            && (this.getImpTotal() == null ? other.getImpTotal() == null : this.getImpTotal().equals(other.getImpTotal()))
            && (this.getImpExento() == null ? other.getImpExento() == null : this.getImpExento().equals(other.getImpExento()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdConstancia() == null) ? 0 : getIdConstancia().hashCode());
        result = prime * result + ((getClave() == null) ? 0 : getClave().hashCode());
        result = prime * result + ((getImpTotal() == null) ? 0 : getImpTotal().hashCode());
        result = prime * result + ((getImpExento() == null) ? 0 : getImpExento().hashCode());
        return result;
    }
}
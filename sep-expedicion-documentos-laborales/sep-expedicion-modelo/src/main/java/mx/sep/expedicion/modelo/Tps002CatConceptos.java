package mx.sep.expedicion.modelo;

public class Tps002CatConceptos {
    private String percDed;

    private String concepto;

    private String descripcion;

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion == null ? null : descripcion.trim();
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
        Tps002CatConceptos other = (Tps002CatConceptos) that;
        return (this.getPercDed() == null ? other.getPercDed() == null : this.getPercDed().equals(other.getPercDed()))
            && (this.getConcepto() == null ? other.getConcepto() == null : this.getConcepto().equals(other.getConcepto()))
            && (this.getDescripcion() == null ? other.getDescripcion() == null : this.getDescripcion().equals(other.getDescripcion()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPercDed() == null) ? 0 : getPercDed().hashCode());
        result = prime * result + ((getConcepto() == null) ? 0 : getConcepto().hashCode());
        result = prime * result + ((getDescripcion() == null) ? 0 : getDescripcion().hashCode());
        return result;
    }
}
package mx.sep.expedicion.modelo;

public class Tsp005Periodos {
    private Short anio;

    private Short mes;

    private Short quincena;

    public Short getAnio() {
        return anio;
    }

    public void setAnio(Short anio) {
        this.anio = anio;
    }

    public Short getMes() {
        return mes;
    }

    public void setMes(Short mes) {
        this.mes = mes;
    }

    public Short getQuincena() {
        return quincena;
    }

    public void setQuincena(Short quincena) {
        this.quincena = quincena;
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
        Tsp005Periodos other = (Tsp005Periodos) that;
        return (this.getAnio() == null ? other.getAnio() == null : this.getAnio().equals(other.getAnio()))
            && (this.getMes() == null ? other.getMes() == null : this.getMes().equals(other.getMes()))
            && (this.getQuincena() == null ? other.getQuincena() == null : this.getQuincena().equals(other.getQuincena()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAnio() == null) ? 0 : getAnio().hashCode());
        result = prime * result + ((getMes() == null) ? 0 : getMes().hashCode());
        result = prime * result + ((getQuincena() == null) ? 0 : getQuincena().hashCode());
        return result;
    }
}
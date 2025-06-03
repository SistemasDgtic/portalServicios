package mx.sep.expedicion.modelo;

public class Tps001TipoNomina {
    private String idTipoNomina;

    private String descripcion;

    public String getIdTipoNomina() {
        return idTipoNomina;
    }

    public void setIdTipoNomina(String idTipoNomina) {
        this.idTipoNomina = idTipoNomina == null ? null : idTipoNomina.trim();
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
        Tps001TipoNomina other = (Tps001TipoNomina) that;
        return (this.getIdTipoNomina() == null ? other.getIdTipoNomina() == null : this.getIdTipoNomina().equals(other.getIdTipoNomina()))
            && (this.getDescripcion() == null ? other.getDescripcion() == null : this.getDescripcion().equals(other.getDescripcion()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdTipoNomina() == null) ? 0 : getIdTipoNomina().hashCode());
        result = prime * result + ((getDescripcion() == null) ? 0 : getDescripcion().hashCode());
        return result;
    }
}
package mx.sep.expedicion.modelo;

public class Tps022Carrera {
    private Integer idCarrera;

    private String descripcion;

    private String actInact;

    public Integer getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(Integer idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion == null ? null : descripcion.trim();
    }

    public String getActInact() {
        return actInact;
    }

    public void setActInact(String actInact) {
        this.actInact = actInact == null ? null : actInact.trim();
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
        Tps022Carrera other = (Tps022Carrera) that;
        return (this.getIdCarrera() == null ? other.getIdCarrera() == null : this.getIdCarrera().equals(other.getIdCarrera()))
            && (this.getDescripcion() == null ? other.getDescripcion() == null : this.getDescripcion().equals(other.getDescripcion()))
            && (this.getActInact() == null ? other.getActInact() == null : this.getActInact().equals(other.getActInact()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdCarrera() == null) ? 0 : getIdCarrera().hashCode());
        result = prime * result + ((getDescripcion() == null) ? 0 : getDescripcion().hashCode());
        result = prime * result + ((getActInact() == null) ? 0 : getActInact().hashCode());
        return result;
    }
}
package mx.sep.expedicion.modelo;

public class Tps009Preguntas {
    private Integer idPregunta;

    private String descripcion;

    private Boolean activo;

    public Integer getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(Integer idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion == null ? null : descripcion.trim();
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
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
        Tps009Preguntas other = (Tps009Preguntas) that;
        return (this.getIdPregunta() == null ? other.getIdPregunta() == null : this.getIdPregunta().equals(other.getIdPregunta()))
            && (this.getDescripcion() == null ? other.getDescripcion() == null : this.getDescripcion().equals(other.getDescripcion()))
            && (this.getActivo() == null ? other.getActivo() == null : this.getActivo().equals(other.getActivo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdPregunta() == null) ? 0 : getIdPregunta().hashCode());
        result = prime * result + ((getDescripcion() == null) ? 0 : getDescripcion().hashCode());
        result = prime * result + ((getActivo() == null) ? 0 : getActivo().hashCode());
        return result;
    }
}
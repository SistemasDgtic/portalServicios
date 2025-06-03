package mx.sep.expedicion.modelo;

public class Tps006Roles {
    private Integer idRol;

    private String rol;

    private Boolean activo;

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol == null ? null : rol.trim();
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
        Tps006Roles other = (Tps006Roles) that;
        return (this.getIdRol() == null ? other.getIdRol() == null : this.getIdRol().equals(other.getIdRol()))
            && (this.getRol() == null ? other.getRol() == null : this.getRol().equals(other.getRol()))
            && (this.getActivo() == null ? other.getActivo() == null : this.getActivo().equals(other.getActivo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdRol() == null) ? 0 : getIdRol().hashCode());
        result = prime * result + ((getRol() == null) ? 0 : getRol().hashCode());
        result = prime * result + ((getActivo() == null) ? 0 : getActivo().hashCode());
        return result;
    }
}
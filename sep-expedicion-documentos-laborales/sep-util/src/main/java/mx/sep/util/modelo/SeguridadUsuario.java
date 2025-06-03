package mx.sep.util.modelo;
public class SeguridadUsuario {
    private Integer idTUsuario;

    private String vUsername;

    private String vPassword;

    private String vNombreUsuario;

    private Boolean lUsuarioActivo;

    private String correoElectronico;

    public Integer getIdTUsuario() {
        return idTUsuario;
    }

    public void setIdTUsuario(Integer idTUsuario) {
        this.idTUsuario = idTUsuario;
    }

    public String getvUsername() {
        return vUsername;
    }

    public void setvUsername(String vUsername) {
        this.vUsername = vUsername == null ? null : vUsername.trim();
    }

    public String getvPassword() {
        return vPassword;
    }

    public void setvPassword(String vPassword) {
        this.vPassword = vPassword == null ? null : vPassword.trim();
    }

    public String getvNombreUsuario() {
        return vNombreUsuario;
    }

    public void setvNombreUsuario(String vNombreUsuario) {
        this.vNombreUsuario = vNombreUsuario == null ? null : vNombreUsuario.trim();
    }

    public Boolean getlUsuarioActivo() {
        return lUsuarioActivo;
    }

    public void setlUsuarioActivo(Boolean lUsuarioActivo) {
        this.lUsuarioActivo = lUsuarioActivo;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico == null ? null : correoElectronico.trim();
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
        SeguridadUsuario other = (SeguridadUsuario) that;
        return (this.getIdTUsuario() == null ? other.getIdTUsuario() == null : this.getIdTUsuario().equals(other.getIdTUsuario()))
            && (this.getvUsername() == null ? other.getvUsername() == null : this.getvUsername().equals(other.getvUsername()))
            && (this.getvPassword() == null ? other.getvPassword() == null : this.getvPassword().equals(other.getvPassword()))
            && (this.getvNombreUsuario() == null ? other.getvNombreUsuario() == null : this.getvNombreUsuario().equals(other.getvNombreUsuario()))
            && (this.getlUsuarioActivo() == null ? other.getlUsuarioActivo() == null : this.getlUsuarioActivo().equals(other.getlUsuarioActivo()))
            && (this.getCorreoElectronico() == null ? other.getCorreoElectronico() == null : this.getCorreoElectronico().equals(other.getCorreoElectronico()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdTUsuario() == null) ? 0 : getIdTUsuario().hashCode());
        result = prime * result + ((getvUsername() == null) ? 0 : getvUsername().hashCode());
        result = prime * result + ((getvPassword() == null) ? 0 : getvPassword().hashCode());
        result = prime * result + ((getvNombreUsuario() == null) ? 0 : getvNombreUsuario().hashCode());
        result = prime * result + ((getlUsuarioActivo() == null) ? 0 : getlUsuarioActivo().hashCode());
        result = prime * result + ((getCorreoElectronico() == null) ? 0 : getCorreoElectronico().hashCode());
        return result;
    }
}
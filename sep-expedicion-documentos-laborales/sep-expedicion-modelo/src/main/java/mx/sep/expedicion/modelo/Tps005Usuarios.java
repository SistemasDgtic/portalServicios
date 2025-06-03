package mx.sep.expedicion.modelo;

public class Tps005Usuarios {
    private Integer idUsuario;

    private Integer idPregunta;

    private String username;

    private String password;

    private String nombreUsuario;

    private String email;

    private String respuesta;

    private Boolean usuarioActivo;

    private Boolean usuarioHabilitado;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(Integer idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario == null ? null : nombreUsuario.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta == null ? null : respuesta.trim();
    }

    public Boolean getUsuarioActivo() {
        return usuarioActivo;
    }

    public void setUsuarioActivo(Boolean usuarioActivo) {
        this.usuarioActivo = usuarioActivo;
    }

    public Boolean getUsuarioHabilitado() {
        return usuarioHabilitado;
    }

    public void setUsuarioHabilitado(Boolean usuarioHabilitado) {
        this.usuarioHabilitado = usuarioHabilitado;
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
        Tps005Usuarios other = (Tps005Usuarios) that;
        return (this.getIdUsuario() == null ? other.getIdUsuario() == null : this.getIdUsuario().equals(other.getIdUsuario()))
            && (this.getIdPregunta() == null ? other.getIdPregunta() == null : this.getIdPregunta().equals(other.getIdPregunta()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getNombreUsuario() == null ? other.getNombreUsuario() == null : this.getNombreUsuario().equals(other.getNombreUsuario()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getRespuesta() == null ? other.getRespuesta() == null : this.getRespuesta().equals(other.getRespuesta()))
            && (this.getUsuarioActivo() == null ? other.getUsuarioActivo() == null : this.getUsuarioActivo().equals(other.getUsuarioActivo()))
            && (this.getUsuarioHabilitado() == null ? other.getUsuarioHabilitado() == null : this.getUsuarioHabilitado().equals(other.getUsuarioHabilitado()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdUsuario() == null) ? 0 : getIdUsuario().hashCode());
        result = prime * result + ((getIdPregunta() == null) ? 0 : getIdPregunta().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getNombreUsuario() == null) ? 0 : getNombreUsuario().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getRespuesta() == null) ? 0 : getRespuesta().hashCode());
        result = prime * result + ((getUsuarioActivo() == null) ? 0 : getUsuarioActivo().hashCode());
        result = prime * result + ((getUsuarioHabilitado() == null) ? 0 : getUsuarioHabilitado().hashCode());
        return result;
    }
}
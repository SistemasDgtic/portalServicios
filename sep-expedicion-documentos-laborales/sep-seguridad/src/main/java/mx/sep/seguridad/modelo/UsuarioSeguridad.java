package mx.sep.seguridad.modelo;

import java.util.Date;
import java.util.List;

public class UsuarioSeguridad extends BaseModelo{
	
	private String username;
	private String password;
	private String nombre;
	private boolean activo;
	private List<RolSeguridad> roles;
        private boolean habilitado;
	
	private Date fechaAcceso;
	
	public UsuarioSeguridad(){}
	
	public UsuarioSeguridad(String username, String password, String nombre,
			boolean activo, boolean habilitado) {
		this.username = username;
		this.password = password;
		this.nombre = nombre;
		this.activo = activo;
                this.habilitado = habilitado;
	}	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public List<RolSeguridad> getRoles() {
		return roles;
	}
	public void setRoles(List<RolSeguridad> roles) {
		this.roles = roles;
	}

	public Date getFechaAcceso() {
		return fechaAcceso;
	}

	public void setFechaAcceso(Date fechaAcceso) {
		this.fechaAcceso = fechaAcceso;
	}

    /**
     * @return the habilitado
     */
    public boolean isHabilitado() {
        return habilitado;
    }

    /**
     * @param habilitado the habilitado to set
     */
    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
	
	
}

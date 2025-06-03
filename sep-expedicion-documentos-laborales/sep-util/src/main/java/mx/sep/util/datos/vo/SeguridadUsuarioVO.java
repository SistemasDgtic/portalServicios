package mx.sep.util.datos.vo;

import java.util.List;
import mx.sep.util.modelo.SeguridadUsuario;

/**
 *
 * @author jose.hernandezb
 */
public class SeguridadUsuarioVO extends SeguridadUsuario{
	private String unidades;
	private List<String> idUnidadRespList;
	
	private Integer idTrRol;

	public SeguridadUsuarioVO() {
	}
	
	public SeguridadUsuarioVO(SeguridadUsuario  seguridadUsuario) {
		super.setIdTUsuario( seguridadUsuario.getIdTUsuario() );
		super.setvUsername( seguridadUsuario.getvUsername() );
		super.setvNombreUsuario( seguridadUsuario.getvNombreUsuario() );
		super.setlUsuarioActivo( seguridadUsuario.getlUsuarioActivo() );
		super.setCorreoElectronico( seguridadUsuario.getCorreoElectronico() );
	}
	
	public String getUnidades() {
		return unidades;
	}

	public void setUnidades(String unidades) {
		this.unidades = unidades;
	}

	public List<String> getIdUnidadRespList() {
		return idUnidadRespList;
	}

	public void setIdUnidadRespList(List<String> idUnidadRespList) {
		this.idUnidadRespList = idUnidadRespList;
	}

	public Integer getIdTrRol() {
		return idTrRol;
	}

	public void setIdTrRol(Integer idTrRol) {
		this.idTrRol = idTrRol;
	}
	
	
	
}

package mx.sep.expedicion.modelo;

import java.util.Date;

public class Tps018DatosDim {
    private Integer idDatos;

    private Integer anio;

    private String numFolio;

    private Date fechaPresentacion;

    private String usuario;

    public Integer getIdDatos() {
        return idDatos;
    }

    public void setIdDatos(Integer idDatos) {
        this.idDatos = idDatos;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getNumFolio() {
        return numFolio;
    }

    public void setNumFolio(String numFolio) {
        this.numFolio = numFolio == null ? null : numFolio.trim();
    }

    public Date getFechaPresentacion() {
        return fechaPresentacion;
    }

    public void setFechaPresentacion(Date fechaPresentacion) {
        this.fechaPresentacion = fechaPresentacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario == null ? null : usuario.trim();
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
        Tps018DatosDim other = (Tps018DatosDim) that;
        return (this.getIdDatos() == null ? other.getIdDatos() == null : this.getIdDatos().equals(other.getIdDatos()))
            && (this.getAnio() == null ? other.getAnio() == null : this.getAnio().equals(other.getAnio()))
            && (this.getNumFolio() == null ? other.getNumFolio() == null : this.getNumFolio().equals(other.getNumFolio()))
            && (this.getFechaPresentacion() == null ? other.getFechaPresentacion() == null : this.getFechaPresentacion().equals(other.getFechaPresentacion()))
            && (this.getUsuario() == null ? other.getUsuario() == null : this.getUsuario().equals(other.getUsuario()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdDatos() == null) ? 0 : getIdDatos().hashCode());
        result = prime * result + ((getAnio() == null) ? 0 : getAnio().hashCode());
        result = prime * result + ((getNumFolio() == null) ? 0 : getNumFolio().hashCode());
        result = prime * result + ((getFechaPresentacion() == null) ? 0 : getFechaPresentacion().hashCode());
        result = prime * result + ((getUsuario() == null) ? 0 : getUsuario().hashCode());
        return result;
    }
}
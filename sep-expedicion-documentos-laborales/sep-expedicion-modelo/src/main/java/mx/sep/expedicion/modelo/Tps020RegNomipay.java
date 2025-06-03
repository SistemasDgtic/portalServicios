package mx.sep.expedicion.modelo;

import java.util.Date;

public class Tps020RegNomipay {
    private Integer idRegistro;

    private Date fechaRegistro;

    private String llaveCompuesta;

    private String rfcTrabajador;

    private Short nominaTrabajador;

    private String estatus;

    public Integer getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getLlaveCompuesta() {
        return llaveCompuesta;
    }

    public void setLlaveCompuesta(String llaveCompuesta) {
        this.llaveCompuesta = llaveCompuesta == null ? null : llaveCompuesta.trim();
    }

    public String getRfcTrabajador() {
        return rfcTrabajador;
    }

    public void setRfcTrabajador(String rfcTrabajador) {
        this.rfcTrabajador = rfcTrabajador == null ? null : rfcTrabajador.trim();
    }

    public Short getNominaTrabajador() {
        return nominaTrabajador;
    }

    public void setNominaTrabajador(Short nominaTrabajador) {
        this.nominaTrabajador = nominaTrabajador;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus == null ? null : estatus.trim();
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
        Tps020RegNomipay other = (Tps020RegNomipay) that;
        return (this.getIdRegistro() == null ? other.getIdRegistro() == null : this.getIdRegistro().equals(other.getIdRegistro()))
            && (this.getFechaRegistro() == null ? other.getFechaRegistro() == null : this.getFechaRegistro().equals(other.getFechaRegistro()))
            && (this.getLlaveCompuesta() == null ? other.getLlaveCompuesta() == null : this.getLlaveCompuesta().equals(other.getLlaveCompuesta()))
            && (this.getRfcTrabajador() == null ? other.getRfcTrabajador() == null : this.getRfcTrabajador().equals(other.getRfcTrabajador()))
            && (this.getNominaTrabajador() == null ? other.getNominaTrabajador() == null : this.getNominaTrabajador().equals(other.getNominaTrabajador()))
            && (this.getEstatus() == null ? other.getEstatus() == null : this.getEstatus().equals(other.getEstatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdRegistro() == null) ? 0 : getIdRegistro().hashCode());
        result = prime * result + ((getFechaRegistro() == null) ? 0 : getFechaRegistro().hashCode());
        result = prime * result + ((getLlaveCompuesta() == null) ? 0 : getLlaveCompuesta().hashCode());
        result = prime * result + ((getRfcTrabajador() == null) ? 0 : getRfcTrabajador().hashCode());
        result = prime * result + ((getNominaTrabajador() == null) ? 0 : getNominaTrabajador().hashCode());
        result = prime * result + ((getEstatus() == null) ? 0 : getEstatus().hashCode());
        return result;
    }
}
package mx.sep.expedicion.modelo;

import java.math.BigDecimal;
import java.util.Date;

public class Tps003Comprobante {
    private Integer idComprobante;

    private Integer numComprobante;

    private String rfc;

    private String cveUnica;

    private String nombre;

    private String clavePresupuestal;

    private String centroTrabajo;

    private String idTipoNomina;

    private Date fechaIni;

    private Date fechaFin;

    private Date fechaPago;

    private Integer qnaProc;

    private Short consQnaProc;

    private BigDecimal totPercCheque;

    private BigDecimal totDedCheque;

    private BigDecimal totNetoCheque;

    private Short numPerc;

    private Short numDesc;

    private String clabeInter;

    private String mensajeImpresion;

    private String codigoSeguridad;

    private String numeroSs;

    public Integer getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(Integer idComprobante) {
        this.idComprobante = idComprobante;
    }

    public Integer getNumComprobante() {
        return numComprobante;
    }

    public void setNumComprobante(Integer numComprobante) {
        this.numComprobante = numComprobante;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc == null ? null : rfc.trim();
    }

    public String getCveUnica() {
        return cveUnica;
    }

    public void setCveUnica(String cveUnica) {
        this.cveUnica = cveUnica == null ? null : cveUnica.trim();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre == null ? null : nombre.trim();
    }

    public String getClavePresupuestal() {
        return clavePresupuestal;
    }

    public void setClavePresupuestal(String clavePresupuestal) {
        this.clavePresupuestal = clavePresupuestal == null ? null : clavePresupuestal.trim();
    }

    public String getCentroTrabajo() {
        return centroTrabajo;
    }

    public void setCentroTrabajo(String centroTrabajo) {
        this.centroTrabajo = centroTrabajo == null ? null : centroTrabajo.trim();
    }

    public String getIdTipoNomina() {
        return idTipoNomina;
    }

    public void setIdTipoNomina(String idTipoNomina) {
        this.idTipoNomina = idTipoNomina == null ? null : idTipoNomina.trim();
    }

    public Date getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Integer getQnaProc() {
        return qnaProc;
    }

    public void setQnaProc(Integer qnaProc) {
        this.qnaProc = qnaProc;
    }

    public Short getConsQnaProc() {
        return consQnaProc;
    }

    public void setConsQnaProc(Short consQnaProc) {
        this.consQnaProc = consQnaProc;
    }

    public BigDecimal getTotPercCheque() {
        return totPercCheque;
    }

    public void setTotPercCheque(BigDecimal totPercCheque) {
        this.totPercCheque = totPercCheque;
    }

    public BigDecimal getTotDedCheque() {
        return totDedCheque;
    }

    public void setTotDedCheque(BigDecimal totDedCheque) {
        this.totDedCheque = totDedCheque;
    }

    public BigDecimal getTotNetoCheque() {
        return totNetoCheque;
    }

    public void setTotNetoCheque(BigDecimal totNetoCheque) {
        this.totNetoCheque = totNetoCheque;
    }

    public Short getNumPerc() {
        return numPerc;
    }

    public void setNumPerc(Short numPerc) {
        this.numPerc = numPerc;
    }

    public Short getNumDesc() {
        return numDesc;
    }

    public void setNumDesc(Short numDesc) {
        this.numDesc = numDesc;
    }

    public String getClabeInter() {
        return clabeInter;
    }

    public void setClabeInter(String clabeInter) {
        this.clabeInter = clabeInter == null ? null : clabeInter.trim();
    }

    public String getMensajeImpresion() {
        return mensajeImpresion;
    }

    public void setMensajeImpresion(String mensajeImpresion) {
        this.mensajeImpresion = mensajeImpresion == null ? null : mensajeImpresion.trim();
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad == null ? null : codigoSeguridad.trim();
    }

    public String getNumeroSs() {
        return numeroSs;
    }

    public void setNumeroSs(String numeroSs) {
        this.numeroSs = numeroSs == null ? null : numeroSs.trim();
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
        Tps003Comprobante other = (Tps003Comprobante) that;
        return (this.getIdComprobante() == null ? other.getIdComprobante() == null : this.getIdComprobante().equals(other.getIdComprobante()))
            && (this.getNumComprobante() == null ? other.getNumComprobante() == null : this.getNumComprobante().equals(other.getNumComprobante()))
            && (this.getRfc() == null ? other.getRfc() == null : this.getRfc().equals(other.getRfc()))
            && (this.getCveUnica() == null ? other.getCveUnica() == null : this.getCveUnica().equals(other.getCveUnica()))
            && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()))
            && (this.getClavePresupuestal() == null ? other.getClavePresupuestal() == null : this.getClavePresupuestal().equals(other.getClavePresupuestal()))
            && (this.getCentroTrabajo() == null ? other.getCentroTrabajo() == null : this.getCentroTrabajo().equals(other.getCentroTrabajo()))
            && (this.getIdTipoNomina() == null ? other.getIdTipoNomina() == null : this.getIdTipoNomina().equals(other.getIdTipoNomina()))
            && (this.getFechaIni() == null ? other.getFechaIni() == null : this.getFechaIni().equals(other.getFechaIni()))
            && (this.getFechaFin() == null ? other.getFechaFin() == null : this.getFechaFin().equals(other.getFechaFin()))
            && (this.getFechaPago() == null ? other.getFechaPago() == null : this.getFechaPago().equals(other.getFechaPago()))
            && (this.getQnaProc() == null ? other.getQnaProc() == null : this.getQnaProc().equals(other.getQnaProc()))
            && (this.getConsQnaProc() == null ? other.getConsQnaProc() == null : this.getConsQnaProc().equals(other.getConsQnaProc()))
            && (this.getTotPercCheque() == null ? other.getTotPercCheque() == null : this.getTotPercCheque().equals(other.getTotPercCheque()))
            && (this.getTotDedCheque() == null ? other.getTotDedCheque() == null : this.getTotDedCheque().equals(other.getTotDedCheque()))
            && (this.getTotNetoCheque() == null ? other.getTotNetoCheque() == null : this.getTotNetoCheque().equals(other.getTotNetoCheque()))
            && (this.getNumPerc() == null ? other.getNumPerc() == null : this.getNumPerc().equals(other.getNumPerc()))
            && (this.getNumDesc() == null ? other.getNumDesc() == null : this.getNumDesc().equals(other.getNumDesc()))
            && (this.getClabeInter() == null ? other.getClabeInter() == null : this.getClabeInter().equals(other.getClabeInter()))
            && (this.getMensajeImpresion() == null ? other.getMensajeImpresion() == null : this.getMensajeImpresion().equals(other.getMensajeImpresion()))
            && (this.getCodigoSeguridad() == null ? other.getCodigoSeguridad() == null : this.getCodigoSeguridad().equals(other.getCodigoSeguridad()))
            && (this.getNumeroSs() == null ? other.getNumeroSs() == null : this.getNumeroSs().equals(other.getNumeroSs()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdComprobante() == null) ? 0 : getIdComprobante().hashCode());
        result = prime * result + ((getNumComprobante() == null) ? 0 : getNumComprobante().hashCode());
        result = prime * result + ((getRfc() == null) ? 0 : getRfc().hashCode());
        result = prime * result + ((getCveUnica() == null) ? 0 : getCveUnica().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        result = prime * result + ((getClavePresupuestal() == null) ? 0 : getClavePresupuestal().hashCode());
        result = prime * result + ((getCentroTrabajo() == null) ? 0 : getCentroTrabajo().hashCode());
        result = prime * result + ((getIdTipoNomina() == null) ? 0 : getIdTipoNomina().hashCode());
        result = prime * result + ((getFechaIni() == null) ? 0 : getFechaIni().hashCode());
        result = prime * result + ((getFechaFin() == null) ? 0 : getFechaFin().hashCode());
        result = prime * result + ((getFechaPago() == null) ? 0 : getFechaPago().hashCode());
        result = prime * result + ((getQnaProc() == null) ? 0 : getQnaProc().hashCode());
        result = prime * result + ((getConsQnaProc() == null) ? 0 : getConsQnaProc().hashCode());
        result = prime * result + ((getTotPercCheque() == null) ? 0 : getTotPercCheque().hashCode());
        result = prime * result + ((getTotDedCheque() == null) ? 0 : getTotDedCheque().hashCode());
        result = prime * result + ((getTotNetoCheque() == null) ? 0 : getTotNetoCheque().hashCode());
        result = prime * result + ((getNumPerc() == null) ? 0 : getNumPerc().hashCode());
        result = prime * result + ((getNumDesc() == null) ? 0 : getNumDesc().hashCode());
        result = prime * result + ((getClabeInter() == null) ? 0 : getClabeInter().hashCode());
        result = prime * result + ((getMensajeImpresion() == null) ? 0 : getMensajeImpresion().hashCode());
        result = prime * result + ((getCodigoSeguridad() == null) ? 0 : getCodigoSeguridad().hashCode());
        result = prime * result + ((getNumeroSs() == null) ? 0 : getNumeroSs().hashCode());
        return result;
    }
}
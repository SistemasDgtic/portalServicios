package mx.sep.expedicion.modelo;

import java.math.BigDecimal;

public class Tps015IsrAnual {
    private Integer idConstancia;

    private String rfc;

    private Short anio;

    private String cveUnica;

    private String nomEmp;

    private Short entFed;

    private String areaGeografica;

    private Integer qnaIni;

    private Integer qnaFin;

    private Integer impSub;

    private BigDecimal isrAnual;

    private Integer subNoAcre;

    private Integer subAcre;

    private Integer totalCs;

    private BigDecimal saldoDet;

    private BigDecimal credSal;

    private BigDecimal totImp;

    private String calculo;

    private String tipoContrato;

    public Integer getIdConstancia() {
        return idConstancia;
    }

    public void setIdConstancia(Integer idConstancia) {
        this.idConstancia = idConstancia;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc == null ? null : rfc.trim();
    }

    public Short getAnio() {
        return anio;
    }

    public void setAnio(Short anio) {
        this.anio = anio;
    }

    public String getCveUnica() {
        return cveUnica;
    }

    public void setCveUnica(String cveUnica) {
        this.cveUnica = cveUnica == null ? null : cveUnica.trim();
    }

    public String getNomEmp() {
        return nomEmp;
    }

    public void setNomEmp(String nomEmp) {
        this.nomEmp = nomEmp == null ? null : nomEmp.trim();
    }

    public Short getEntFed() {
        return entFed;
    }

    public void setEntFed(Short entFed) {
        this.entFed = entFed;
    }

    public String getAreaGeografica() {
        return areaGeografica;
    }

    public void setAreaGeografica(String areaGeografica) {
        this.areaGeografica = areaGeografica == null ? null : areaGeografica.trim();
    }

    public Integer getQnaIni() {
        return qnaIni;
    }

    public void setQnaIni(Integer qnaIni) {
        this.qnaIni = qnaIni;
    }

    public Integer getQnaFin() {
        return qnaFin;
    }

    public void setQnaFin(Integer qnaFin) {
        this.qnaFin = qnaFin;
    }

    public Integer getImpSub() {
        return impSub;
    }

    public void setImpSub(Integer impSub) {
        this.impSub = impSub;
    }

    public BigDecimal getIsrAnual() {
        return isrAnual;
    }

    public void setIsrAnual(BigDecimal isrAnual) {
        this.isrAnual = isrAnual;
    }

    public Integer getSubNoAcre() {
        return subNoAcre;
    }

    public void setSubNoAcre(Integer subNoAcre) {
        this.subNoAcre = subNoAcre;
    }

    public Integer getSubAcre() {
        return subAcre;
    }

    public void setSubAcre(Integer subAcre) {
        this.subAcre = subAcre;
    }

    public Integer getTotalCs() {
        return totalCs;
    }

    public void setTotalCs(Integer totalCs) {
        this.totalCs = totalCs;
    }

    public BigDecimal getSaldoDet() {
        return saldoDet;
    }

    public void setSaldoDet(BigDecimal saldoDet) {
        this.saldoDet = saldoDet;
    }

    public BigDecimal getCredSal() {
        return credSal;
    }

    public void setCredSal(BigDecimal credSal) {
        this.credSal = credSal;
    }

    public BigDecimal getTotImp() {
        return totImp;
    }

    public void setTotImp(BigDecimal totImp) {
        this.totImp = totImp;
    }

    public String getCalculo() {
        return calculo;
    }

    public void setCalculo(String calculo) {
        this.calculo = calculo == null ? null : calculo.trim();
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato == null ? null : tipoContrato.trim();
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
        Tps015IsrAnual other = (Tps015IsrAnual) that;
        return (this.getIdConstancia() == null ? other.getIdConstancia() == null : this.getIdConstancia().equals(other.getIdConstancia()))
            && (this.getRfc() == null ? other.getRfc() == null : this.getRfc().equals(other.getRfc()))
            && (this.getAnio() == null ? other.getAnio() == null : this.getAnio().equals(other.getAnio()))
            && (this.getCveUnica() == null ? other.getCveUnica() == null : this.getCveUnica().equals(other.getCveUnica()))
            && (this.getNomEmp() == null ? other.getNomEmp() == null : this.getNomEmp().equals(other.getNomEmp()))
            && (this.getEntFed() == null ? other.getEntFed() == null : this.getEntFed().equals(other.getEntFed()))
            && (this.getAreaGeografica() == null ? other.getAreaGeografica() == null : this.getAreaGeografica().equals(other.getAreaGeografica()))
            && (this.getQnaIni() == null ? other.getQnaIni() == null : this.getQnaIni().equals(other.getQnaIni()))
            && (this.getQnaFin() == null ? other.getQnaFin() == null : this.getQnaFin().equals(other.getQnaFin()))
            && (this.getImpSub() == null ? other.getImpSub() == null : this.getImpSub().equals(other.getImpSub()))
            && (this.getIsrAnual() == null ? other.getIsrAnual() == null : this.getIsrAnual().equals(other.getIsrAnual()))
            && (this.getSubNoAcre() == null ? other.getSubNoAcre() == null : this.getSubNoAcre().equals(other.getSubNoAcre()))
            && (this.getSubAcre() == null ? other.getSubAcre() == null : this.getSubAcre().equals(other.getSubAcre()))
            && (this.getTotalCs() == null ? other.getTotalCs() == null : this.getTotalCs().equals(other.getTotalCs()))
            && (this.getSaldoDet() == null ? other.getSaldoDet() == null : this.getSaldoDet().equals(other.getSaldoDet()))
            && (this.getCredSal() == null ? other.getCredSal() == null : this.getCredSal().equals(other.getCredSal()))
            && (this.getTotImp() == null ? other.getTotImp() == null : this.getTotImp().equals(other.getTotImp()))
            && (this.getCalculo() == null ? other.getCalculo() == null : this.getCalculo().equals(other.getCalculo()))
            && (this.getTipoContrato() == null ? other.getTipoContrato() == null : this.getTipoContrato().equals(other.getTipoContrato()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdConstancia() == null) ? 0 : getIdConstancia().hashCode());
        result = prime * result + ((getRfc() == null) ? 0 : getRfc().hashCode());
        result = prime * result + ((getAnio() == null) ? 0 : getAnio().hashCode());
        result = prime * result + ((getCveUnica() == null) ? 0 : getCveUnica().hashCode());
        result = prime * result + ((getNomEmp() == null) ? 0 : getNomEmp().hashCode());
        result = prime * result + ((getEntFed() == null) ? 0 : getEntFed().hashCode());
        result = prime * result + ((getAreaGeografica() == null) ? 0 : getAreaGeografica().hashCode());
        result = prime * result + ((getQnaIni() == null) ? 0 : getQnaIni().hashCode());
        result = prime * result + ((getQnaFin() == null) ? 0 : getQnaFin().hashCode());
        result = prime * result + ((getImpSub() == null) ? 0 : getImpSub().hashCode());
        result = prime * result + ((getIsrAnual() == null) ? 0 : getIsrAnual().hashCode());
        result = prime * result + ((getSubNoAcre() == null) ? 0 : getSubNoAcre().hashCode());
        result = prime * result + ((getSubAcre() == null) ? 0 : getSubAcre().hashCode());
        result = prime * result + ((getTotalCs() == null) ? 0 : getTotalCs().hashCode());
        result = prime * result + ((getSaldoDet() == null) ? 0 : getSaldoDet().hashCode());
        result = prime * result + ((getCredSal() == null) ? 0 : getCredSal().hashCode());
        result = prime * result + ((getTotImp() == null) ? 0 : getTotImp().hashCode());
        result = prime * result + ((getCalculo() == null) ? 0 : getCalculo().hashCode());
        result = prime * result + ((getTipoContrato() == null) ? 0 : getTipoContrato().hashCode());
        return result;
    }
}
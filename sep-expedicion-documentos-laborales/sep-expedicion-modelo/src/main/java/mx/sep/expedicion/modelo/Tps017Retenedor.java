package mx.sep.expedicion.modelo;

public class Tps017Retenedor {
    private Integer idRetenedor;

    private String rfc;

    private String razonSocial;

    private String nomRepresentante;

    private String cveUnica;

    private Integer anioIni;

    private Integer anioFin;

    private byte[] firmaDigital;

    private byte[] selloRetenedor;

    public Integer getIdRetenedor() {
        return idRetenedor;
    }

    public void setIdRetenedor(Integer idRetenedor) {
        this.idRetenedor = idRetenedor;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc == null ? null : rfc.trim();
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial == null ? null : razonSocial.trim();
    }

    public String getNomRepresentante() {
        return nomRepresentante;
    }

    public void setNomRepresentante(String nomRepresentante) {
        this.nomRepresentante = nomRepresentante == null ? null : nomRepresentante.trim();
    }

    public String getCveUnica() {
        return cveUnica;
    }

    public void setCveUnica(String cveUnica) {
        this.cveUnica = cveUnica == null ? null : cveUnica.trim();
    }

    public Integer getAnioIni() {
        return anioIni;
    }

    public void setAnioIni(Integer anioIni) {
        this.anioIni = anioIni;
    }

    public Integer getAnioFin() {
        return anioFin;
    }

    public void setAnioFin(Integer anioFin) {
        this.anioFin = anioFin;
    }

    public byte[] getFirmaDigital() {
        return firmaDigital;
    }

    public void setFirmaDigital(byte[] firmaDigital) {
        this.firmaDigital = firmaDigital;
    }

    public byte[] getSelloRetenedor() {
        return selloRetenedor;
    }

    public void setSelloRetenedor(byte[] selloRetenedor) {
        this.selloRetenedor = selloRetenedor;
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
        Tps017Retenedor other = (Tps017Retenedor) that;
        return (this.getIdRetenedor() == null ? other.getIdRetenedor() == null : this.getIdRetenedor().equals(other.getIdRetenedor()))
            && (this.getRfc() == null ? other.getRfc() == null : this.getRfc().equals(other.getRfc()))
            && (this.getRazonSocial() == null ? other.getRazonSocial() == null : this.getRazonSocial().equals(other.getRazonSocial()))
            && (this.getNomRepresentante() == null ? other.getNomRepresentante() == null : this.getNomRepresentante().equals(other.getNomRepresentante()))
            && (this.getCveUnica() == null ? other.getCveUnica() == null : this.getCveUnica().equals(other.getCveUnica()))
            && (this.getAnioIni() == null ? other.getAnioIni() == null : this.getAnioIni().equals(other.getAnioIni()))
            && (this.getAnioFin() == null ? other.getAnioFin() == null : this.getAnioFin().equals(other.getAnioFin()))
            && (this.getFirmaDigital() == null ? other.getFirmaDigital() == null : this.getFirmaDigital().equals(other.getFirmaDigital()))
            && (this.getSelloRetenedor() == null ? other.getSelloRetenedor() == null : this.getSelloRetenedor().equals(other.getSelloRetenedor()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdRetenedor() == null) ? 0 : getIdRetenedor().hashCode());
        result = prime * result + ((getRfc() == null) ? 0 : getRfc().hashCode());
        result = prime * result + ((getRazonSocial() == null) ? 0 : getRazonSocial().hashCode());
        result = prime * result + ((getNomRepresentante() == null) ? 0 : getNomRepresentante().hashCode());
        result = prime * result + ((getCveUnica() == null) ? 0 : getCveUnica().hashCode());
        result = prime * result + ((getAnioIni() == null) ? 0 : getAnioIni().hashCode());
        result = prime * result + ((getAnioFin() == null) ? 0 : getAnioFin().hashCode());
        result = prime * result + ((getFirmaDigital() == null) ? 0 : getFirmaDigital().hashCode());
        result = prime * result + ((getSelloRetenedor() == null) ? 0 : getSelloRetenedor().hashCode());
        return result;
    }
}
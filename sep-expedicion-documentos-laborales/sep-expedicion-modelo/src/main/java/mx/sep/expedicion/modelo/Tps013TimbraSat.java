package mx.sep.expedicion.modelo;

public class Tps013TimbraSat {
    private Integer idComprobante;

    private String selloDigSep;

    private String uuid;

    private String selloDigSat;

    private String numCertificado;

    public Integer getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(Integer idComprobante) {
        this.idComprobante = idComprobante;
    }

    public String getSelloDigSep() {
        return selloDigSep;
    }

    public void setSelloDigSep(String selloDigSep) {
        this.selloDigSep = selloDigSep == null ? null : selloDigSep.trim();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getSelloDigSat() {
        return selloDigSat;
    }

    public void setSelloDigSat(String selloDigSat) {
        this.selloDigSat = selloDigSat == null ? null : selloDigSat.trim();
    }

    public String getNumCertificado() {
        return numCertificado;
    }

    public void setNumCertificado(String numCertificado) {
        this.numCertificado = numCertificado == null ? null : numCertificado.trim();
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
        Tps013TimbraSat other = (Tps013TimbraSat) that;
        return (this.getIdComprobante() == null ? other.getIdComprobante() == null : this.getIdComprobante().equals(other.getIdComprobante()))
            && (this.getSelloDigSep() == null ? other.getSelloDigSep() == null : this.getSelloDigSep().equals(other.getSelloDigSep()))
            && (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getSelloDigSat() == null ? other.getSelloDigSat() == null : this.getSelloDigSat().equals(other.getSelloDigSat()))
            && (this.getNumCertificado() == null ? other.getNumCertificado() == null : this.getNumCertificado().equals(other.getNumCertificado()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdComprobante() == null) ? 0 : getIdComprobante().hashCode());
        result = prime * result + ((getSelloDigSep() == null) ? 0 : getSelloDigSep().hashCode());
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getSelloDigSat() == null) ? 0 : getSelloDigSat().hashCode());
        result = prime * result + ((getNumCertificado() == null) ? 0 : getNumCertificado().hashCode());
        return result;
    }
}
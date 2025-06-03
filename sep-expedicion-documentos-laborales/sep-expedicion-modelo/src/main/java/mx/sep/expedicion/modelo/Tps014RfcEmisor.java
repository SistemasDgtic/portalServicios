package mx.sep.expedicion.modelo;

public class Tps014RfcEmisor {
    private String rfcEmisor;

    private Integer qnaProc;

    public String getRfcEmisor() {
        return rfcEmisor;
    }

    public void setRfcEmisor(String rfcEmisor) {
        this.rfcEmisor = rfcEmisor == null ? null : rfcEmisor.trim();
    }

    public Integer getQnaProc() {
        return qnaProc;
    }

    public void setQnaProc(Integer qnaProc) {
        this.qnaProc = qnaProc;
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
        Tps014RfcEmisor other = (Tps014RfcEmisor) that;
        return (this.getRfcEmisor() == null ? other.getRfcEmisor() == null : this.getRfcEmisor().equals(other.getRfcEmisor()))
            && (this.getQnaProc() == null ? other.getQnaProc() == null : this.getQnaProc().equals(other.getQnaProc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRfcEmisor() == null) ? 0 : getRfcEmisor().hashCode());
        result = prime * result + ((getQnaProc() == null) ? 0 : getQnaProc().hashCode());
        return result;
    }
}
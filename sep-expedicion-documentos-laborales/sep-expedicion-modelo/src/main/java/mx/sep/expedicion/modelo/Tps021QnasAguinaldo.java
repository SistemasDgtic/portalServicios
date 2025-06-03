package mx.sep.expedicion.modelo;

public class Tps021QnasAguinaldo {
    private Integer qnaProc;

    private Short consQnaProc;

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
        Tps021QnasAguinaldo other = (Tps021QnasAguinaldo) that;
        return (this.getQnaProc() == null ? other.getQnaProc() == null : this.getQnaProc().equals(other.getQnaProc()))
            && (this.getConsQnaProc() == null ? other.getConsQnaProc() == null : this.getConsQnaProc().equals(other.getConsQnaProc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getQnaProc() == null) ? 0 : getQnaProc().hashCode());
        result = prime * result + ((getConsQnaProc() == null) ? 0 : getConsQnaProc().hashCode());
        return result;
    }
}
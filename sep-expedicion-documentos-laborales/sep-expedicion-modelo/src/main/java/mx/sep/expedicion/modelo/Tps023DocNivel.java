package mx.sep.expedicion.modelo;

public class Tps023DocNivel {
    private Integer idDoc;

    private Integer nivAcademico;

    public Integer getIdDoc() {
        return idDoc;
    }

    public void setIdDoc(Integer idDoc) {
        this.idDoc = idDoc;
    }

    public Integer getNivAcademico() {
        return nivAcademico;
    }

    public void setNivAcademico(Integer nivAcademico) {
        this.nivAcademico = nivAcademico;
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
        Tps023DocNivel other = (Tps023DocNivel) that;
        return (this.getIdDoc() == null ? other.getIdDoc() == null : this.getIdDoc().equals(other.getIdDoc()))
            && (this.getNivAcademico() == null ? other.getNivAcademico() == null : this.getNivAcademico().equals(other.getNivAcademico()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdDoc() == null) ? 0 : getIdDoc().hashCode());
        result = prime * result + ((getNivAcademico() == null) ? 0 : getNivAcademico().hashCode());
        return result;
    }
}
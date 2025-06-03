package mx.sep.expedicion.modelo;

import java.util.Date;

public class Tps011Quincenas {
    private Integer qnaProc;

    private String usuario;

    private Date fechaCap;

    public Integer getQnaProc() {
        return qnaProc;
    }

    public void setQnaProc(Integer qnaProc) {
        this.qnaProc = qnaProc;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario == null ? null : usuario.trim();
    }

    public Date getFechaCap() {
        return fechaCap;
    }

    public void setFechaCap(Date fechaCap) {
        this.fechaCap = fechaCap;
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
        Tps011Quincenas other = (Tps011Quincenas) that;
        return (this.getQnaProc() == null ? other.getQnaProc() == null : this.getQnaProc().equals(other.getQnaProc()))
            && (this.getUsuario() == null ? other.getUsuario() == null : this.getUsuario().equals(other.getUsuario()))
            && (this.getFechaCap() == null ? other.getFechaCap() == null : this.getFechaCap().equals(other.getFechaCap()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getQnaProc() == null) ? 0 : getQnaProc().hashCode());
        result = prime * result + ((getUsuario() == null) ? 0 : getUsuario().hashCode());
        result = prime * result + ((getFechaCap() == null) ? 0 : getFechaCap().hashCode());
        return result;
    }
}
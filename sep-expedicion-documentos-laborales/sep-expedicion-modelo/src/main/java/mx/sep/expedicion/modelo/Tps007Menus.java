package mx.sep.expedicion.modelo;

public class Tps007Menus {
    private Integer idOpcion;

    private String descripcion;

    private String opcion;

    private String url;

    private Integer idOpcionPadre;

    public Integer getIdOpcion() {
        return idOpcion;
    }

    public void setIdOpcion(Integer idOpcion) {
        this.idOpcion = idOpcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion == null ? null : descripcion.trim();
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion == null ? null : opcion.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getIdOpcionPadre() {
        return idOpcionPadre;
    }

    public void setIdOpcionPadre(Integer idOpcionPadre) {
        this.idOpcionPadre = idOpcionPadre;
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
        Tps007Menus other = (Tps007Menus) that;
        return (this.getIdOpcion() == null ? other.getIdOpcion() == null : this.getIdOpcion().equals(other.getIdOpcion()))
            && (this.getDescripcion() == null ? other.getDescripcion() == null : this.getDescripcion().equals(other.getDescripcion()))
            && (this.getOpcion() == null ? other.getOpcion() == null : this.getOpcion().equals(other.getOpcion()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getIdOpcionPadre() == null ? other.getIdOpcionPadre() == null : this.getIdOpcionPadre().equals(other.getIdOpcionPadre()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdOpcion() == null) ? 0 : getIdOpcion().hashCode());
        result = prime * result + ((getDescripcion() == null) ? 0 : getDescripcion().hashCode());
        result = prime * result + ((getOpcion() == null) ? 0 : getOpcion().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getIdOpcionPadre() == null) ? 0 : getIdOpcionPadre().hashCode());
        return result;
    }
}
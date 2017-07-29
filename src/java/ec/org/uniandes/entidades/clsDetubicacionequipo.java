
package ec.org.uniandes.entidades;

public class clsDetubicacionequipo {
    private int _iddetalle;
    private clsEquipo _idequipo;
    private clsUbicacion _idubicacion;
    private String _fecha;
    private String _estado;

    public clsDetubicacionequipo() {
    }

    public clsDetubicacionequipo(int _iddetalle, clsEquipo _idequipo, clsUbicacion _idubicacion, String _fecha, String _estado) {
        this._iddetalle = _iddetalle;
        this._idequipo = _idequipo;
        this._idubicacion = _idubicacion;
        this._fecha = _fecha;
        this._estado = _estado;
    }

    public int getIddetalle() {
        return _iddetalle;
    }

    public void setIddetalle(int _iddetalle) {
        this._iddetalle = _iddetalle;
    }

    public clsEquipo getIdequipo() {
        return _idequipo;
    }

    public void setIdequipo(clsEquipo _idequipo) {
        this._idequipo = _idequipo;
    }

    public clsUbicacion getIdubicacion() {
        return _idubicacion;
    }

    public void setIdubicacion(clsUbicacion _idubicacion) {
        this._idubicacion = _idubicacion;
    }

    public String getFecha() {
        return _fecha;
    }

    public void setFecha(String _fecha) {
        this._fecha = _fecha;
    }

    public String getEstado() {
        return _estado;
    }

    public void setEstado(String _estado) {
        this._estado = _estado;
    }

    @Override
    public String toString() {
        return "clsDetubicacionequipo{" + "_iddetalle=" + _iddetalle + ", _idequipo=" + _idequipo + ", _idubicacion=" + _idubicacion + ", _fecha=" + _fecha + ", _estado=" + _estado + '}';
    }
    
}

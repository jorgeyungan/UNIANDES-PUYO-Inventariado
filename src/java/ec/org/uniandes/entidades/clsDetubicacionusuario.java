
package ec.org.uniandes.entidades;

public class clsDetubicacionusuario {
    private int _iddetalle;
    private clsUsuario _idusuario;
    private clsUbicacion _idubicacion;
    private String _fecha;

    public clsDetubicacionusuario() {
    }

    public clsDetubicacionusuario(int _iddetalle, clsUsuario _idusuario, clsUbicacion _idubicacion, String _fecha) {
        this._iddetalle = _iddetalle;
        this._idusuario = _idusuario;
        this._idubicacion = _idubicacion;
        this._fecha = _fecha;
    }

    public String getFecha() {
        return _fecha;
    }

    public void setFecha(String _fecha) {
        this._fecha = _fecha;
    }

    public int getIddetalle() {
        return _iddetalle;
    }

    public void setIddetalle(int _iddetalle) {
        this._iddetalle = _iddetalle;
    }

    public clsUsuario getIdusuario() {
        return _idusuario;
    }

    public void setIdusuario(clsUsuario _idusuario) {
        this._idusuario = _idusuario;
    }

    public clsUbicacion getIdubicacion() {
        return _idubicacion;
    }

    public void setIdubicacion(clsUbicacion _idubicacion) {
        this._idubicacion = _idubicacion;
    }

    @Override
    public String toString() {
        return "clsDetubicacionusuario{" + "_iddetalle=" + _iddetalle + ", _idusuario=" + _idusuario + ", _idubicacion=" + _idubicacion + ", _fecha=" + _fecha + '}';
    }
    
}

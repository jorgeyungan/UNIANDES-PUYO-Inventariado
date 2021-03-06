
package ec.org.uniandes.entidades;

public class clsDetequiposoftware {
    private int _iddetalle;
    private clsEquipo _idequipo;
    private clsSoftware _idsoftware;
    private String _fecha;

    public clsDetequiposoftware() {
    }

    public clsDetequiposoftware(int _iddetalle, clsEquipo _idequipo, clsSoftware _idsoftware, String _fecha) {
        this._iddetalle = _iddetalle;
        this._idequipo = _idequipo;
        this._idsoftware = _idsoftware;
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

    public clsEquipo getIdequipo() {
        return _idequipo;
    }

    public void setIdequipo(clsEquipo _idequipo) {
        this._idequipo = _idequipo;
    }

    public clsSoftware getIdsoftware() {
        return _idsoftware;
    }

    public void setIdsoftware(clsSoftware _idsoftware) {
        this._idsoftware = _idsoftware;
    }

    @Override
    public String toString() {
        return "clsDetequiposoftware{" + "_iddetalle=" + _iddetalle + ", _idequipo=" + _idequipo + ", _idsoftware=" + _idsoftware + ", _fecha=" + _fecha + '}';
    }
    
}

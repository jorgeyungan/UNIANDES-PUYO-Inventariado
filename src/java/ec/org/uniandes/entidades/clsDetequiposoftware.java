
package ec.org.uniandes.entidades;

public class clsDetequiposoftware {
    private int _iddetalle;
    private clsEquipo _idequipo;
    private clsSoftware _idsoftware;

    public clsDetequiposoftware() {
    }

    public clsDetequiposoftware(int _iddetalle, clsEquipo _idequipo, clsSoftware _idsoftware) {
        this._iddetalle = _iddetalle;
        this._idequipo = _idequipo;
        this._idsoftware = _idsoftware;
    }

    public clsSoftware getIdsoftware() {
        return _idsoftware;
    }

    public void setIdsoftware(clsSoftware _idsoftware) {
        this._idsoftware = _idsoftware;
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

    @Override
    public String toString() {
        return "clsDetPcSoftware{" + "_iddetalle=" + _iddetalle + ", _idequipo=" + _idequipo + ", _idsoftware=" + _idsoftware + '}';
    }
    
    
}

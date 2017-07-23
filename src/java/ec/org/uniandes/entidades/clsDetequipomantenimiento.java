
package ec.org.uniandes.entidades;

public class clsDetequipomantenimiento {
    private int _iddetalle;
    private clsEquipo _idequipo;
    private clsMantenimiento _idmantenimiento;
    private String _reporte;

    public clsDetequipomantenimiento() {
    }

    public clsDetequipomantenimiento(int _iddetalle, clsEquipo _idequipo, clsMantenimiento _idmantenimiento, String _reporte) {
        this._iddetalle = _iddetalle;
        this._idequipo = _idequipo;
        this._idmantenimiento = _idmantenimiento;
        this._reporte = _reporte;
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

    public clsMantenimiento getIdmantenimiento() {
        return _idmantenimiento;
    }

    public void setIdmantenimiento(clsMantenimiento _idmantenimiento) {
        this._idmantenimiento = _idmantenimiento;
    }

    public String getReporte() {
        return _reporte;
    }

    public void setReporte(String _reporte) {
        this._reporte = _reporte;
    }

    @Override
    public String toString() {
        return "clsDetequipomantenimiento{" + "_iddetalle=" + _iddetalle + ", _idequipo=" + _idequipo + ", _idmantenimiento=" + _idmantenimiento + ", _reporte=" + _reporte + '}';
    }
    
}

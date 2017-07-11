
package ec.org.uniandes.entidades;

public class clsDetequipomantenimiento {
    private int _iddetalle;
    private clsEquipo _idequipo;
    private clsMantenimiento _idmantenimiento;

    public clsDetequipomantenimiento() {
    }

    public clsDetequipomantenimiento(int _iddetalle, clsEquipo _idequipo, clsMantenimiento _idmantenimiento) {
        this._iddetalle = _iddetalle;
        this._idequipo = _idequipo;
        this._idmantenimiento = _idmantenimiento;
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

    @Override
    public String toString() {
        return "clsDetequipomantenimiento{" + "_iddetalle=" + _iddetalle + ", _idequipo=" + _idequipo + ", _idmantenimiento=" + _idmantenimiento + '}';
    }
    
}

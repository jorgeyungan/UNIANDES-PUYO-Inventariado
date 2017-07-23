package ec.org.uniandes.entidades;


public class clsMantenimiento {
    private int _idmantenimiento;
    private String _fechamantenimiento;

    public clsMantenimiento() {
    }

    public clsMantenimiento(int _idmantenimiento, String _fechamantenimiento) {
        this._idmantenimiento = _idmantenimiento;
        this._fechamantenimiento = _fechamantenimiento;
    }

    public int getIdmantenimiento() {
        return _idmantenimiento;
    }

    public void setIdmantenimiento(int _idmantenimiento) {
        this._idmantenimiento = _idmantenimiento;
    }

    public String getFechamantenimiento() {
        return _fechamantenimiento;
    }

    public void setFechamantenimiento(String _fechamantenimiento) {
        this._fechamantenimiento = _fechamantenimiento;
    }

    @Override
    public String toString() {
        return "clsMantenimiento{" + "_idmantenimiento=" + _idmantenimiento + ", _fechamantenimiento=" + _fechamantenimiento + '}';
    }
    
}

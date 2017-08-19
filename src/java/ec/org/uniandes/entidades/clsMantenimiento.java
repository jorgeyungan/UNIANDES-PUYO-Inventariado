package ec.org.uniandes.entidades;


public class clsMantenimiento {
    private int _idmantenimiento;
    private String _fecha;
    private String _reporte;
    private String _estado;
    private clsUsuario _idusuario;
    private clsEquipo _idequipo;

    public clsMantenimiento() {
    }

    public clsMantenimiento(int _idmantenimiento, String _fecha, String _reporte, String _estado, clsUsuario _idusuario, clsEquipo _idequipo) {
        this._idmantenimiento = _idmantenimiento;
        this._fecha = _fecha;
        this._reporte = _reporte;
        this._estado = _estado;
        this._idusuario = _idusuario;
        this._idequipo = _idequipo;
    }

    public int getIdmantenimiento() {
        return _idmantenimiento;
    }

    public void setIdmantenimiento(int _idmantenimiento) {
        this._idmantenimiento = _idmantenimiento;
    }

    public String getFecha() {
        return _fecha;
    }

    public void setFecha(String _fecha) {
        this._fecha = _fecha;
    }

    public String getReporte() {
        return _reporte;
    }

    public void setReporte(String _reporte) {
        this._reporte = _reporte;
    }

    public String getEstado() {
        return _estado;
    }

    public void setEstado(String _estado) {
        this._estado = _estado;
    }

    public clsUsuario getIdusuario() {
        return _idusuario;
    }

    public void setIdusuario(clsUsuario _idusuario) {
        this._idusuario = _idusuario;
    }

    public clsEquipo getIdequipo() {
        return _idequipo;
    }

    public void setIdequipo(clsEquipo _idequipo) {
        this._idequipo = _idequipo;
    }

    @Override
    public String toString() {
        return "clsMantenimiento{" + "_idmantenimiento=" + _idmantenimiento + ", _fecha=" + _fecha + ", _reporte=" + _reporte + ", _estado=" + _estado + ", _idusuario=" + _idusuario + ", _idequipo=" + _idequipo + '}';
    }
  
}
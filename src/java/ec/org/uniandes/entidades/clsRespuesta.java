package ec.org.uniandes.entidades;


public class clsRespuesta {
    private int _idrespuesta;
    private clsMantenimiento _idmantenimiento;
    private clsUsuario _idusuario;
    private String _fecha;
    private String _informe;

    public clsRespuesta() {
    }

    public clsRespuesta(int _idrespuesta, clsMantenimiento _idmantenimiento, clsUsuario _idusuario, String _fecha, String _informe) {
        this._idrespuesta = _idrespuesta;
        this._idmantenimiento = _idmantenimiento;
        this._idusuario = _idusuario;
        this._fecha = _fecha;
        this._informe = _informe;
    }

    public String getInforme() {
        return _informe;
    }

    public void setInforme(String _informe) {
        this._informe = _informe;
    }

    public int getIdrespuesta() {
        return _idrespuesta;
    }

    public void setIdrespuesta(int _idrespuesta) {
        this._idrespuesta = _idrespuesta;
    }

    public clsMantenimiento getIdmantenimiento() {
        return _idmantenimiento;
    }

    public void setIdmantenimiento(clsMantenimiento _idmantenimiento) {
        this._idmantenimiento = _idmantenimiento;
    }

    public clsUsuario getIdusuario() {
        return _idusuario;
    }

    public void setIdusuario(clsUsuario _idusuario) {
        this._idusuario = _idusuario;
    }

    public String getFecha() {
        return _fecha;
    }

    public void setFecha(String _fecha) {
        this._fecha = _fecha;
    }

    @Override
    public String toString() {
        return "clsRespuesta{" + "_idrespuesta=" + _idrespuesta + ", _idmantenimiento=" + _idmantenimiento + ", _idusuario=" + _idusuario + ", _fecha=" + _fecha + ", _informe=" + _informe + '}';
    }
    
}
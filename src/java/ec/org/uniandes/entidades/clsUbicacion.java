
package ec.org.uniandes.entidades;
public class clsUbicacion {
    private int _idubicacion;
    private String _edificio;
    private String _piso;
    private String _carrera;
    private String _laboratorio;
    private String _dependencia;
    private clsUsuario _idusuario;

    public clsUbicacion() {
    }

    public clsUbicacion(int _idubicacion, String _edificio, String _piso, String _carrera, String _laboratorio, String _dependencia, clsUsuario _idusuario) {
        this._idubicacion = _idubicacion;
        this._edificio = _edificio;
        this._piso = _piso;
        this._carrera = _carrera;
        this._laboratorio = _laboratorio;
        this._dependencia = _dependencia;
        this._idusuario = _idusuario;
    }

    public int getIdubicacion() {
        return _idubicacion;
    }

    public void setIdubicacion(int _idubicacion) {
        this._idubicacion = _idubicacion;
    }

    public String getEdificio() {
        return _edificio;
    }

    public void setEdificio(String _edificio) {
        this._edificio = _edificio;
    }

    public String getPiso() {
        return _piso;
    }

    public void setPiso(String _piso) {
        this._piso = _piso;
    }

    public String getCarrera() {
        return _carrera;
    }

    public void setCarrera(String _carrera) {
        this._carrera = _carrera;
    }

    public String getLaboratorio() {
        return _laboratorio;
    }

    public void setLaboratorio(String _laboratorio) {
        this._laboratorio = _laboratorio;
    }

    public String getDependencia() {
        return _dependencia;
    }

    public void setDependencia(String _dependencia) {
        this._dependencia = _dependencia;
    }

    public clsUsuario getIdusuario() {
        return _idusuario;
    }

    public void setIdusuario(clsUsuario _idusuario) {
        this._idusuario = _idusuario;
    }

    @Override
    public String toString() {
        return "clsUbicacion{" + "_idubicacion=" + _idubicacion + ", _edificio=" + _edificio + ", _piso=" + _piso + ", _carrera=" + _carrera + ", _laboratorio=" + _laboratorio + ", _dependencia=" + _dependencia + ", _idusuario=" + _idusuario + '}';
    }
    
}

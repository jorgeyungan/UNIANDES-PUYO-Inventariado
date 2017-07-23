
package ec.org.uniandes.entidades;
public class clsUbicacion {
    private int _idubicacion;
    private String _edificio;
    private String _piso;
    private String _carrera;
    private String _sala;
    private String _sector;

    public clsUbicacion() {
    }

    public clsUbicacion(int _idubicacion, String _edificio, String _piso, String _carrera, String _sala, String _sector) {
        this._idubicacion = _idubicacion;
        this._edificio = _edificio;
        this._piso = _piso;
        this._carrera = _carrera;
        this._sala = _sala;
        this._sector = _sector;
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

    public String getSala() {
        return _sala;
    }

    public void setSala(String _sala) {
        this._sala = _sala;
    }

    public String getSector() {
        return _sector;
    }

    public void setSector(String _sector) {
        this._sector = _sector;
    }

    @Override
    public String toString() {
        return "clsUbicacion{" + "_idubicacion=" + _idubicacion + ", _edificio=" + _edificio + ", _piso=" + _piso + ", _carrera=" + _carrera + ", _sala=" + _sala + ", _sector=" + _sector + '}';
    }
    
}

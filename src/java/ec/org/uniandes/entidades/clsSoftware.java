
package ec.org.uniandes.entidades;


public class clsSoftware {
    private int _idsoftware;
    private String _nombre;
    private String _compania;
    private String _version;
    private String _licencia;
    private String _Descripcion;
    private String _fecha;

    public clsSoftware() {
    }

    public clsSoftware(int _idsoftware, String _nombre, String _compania, String _version, String _licencia, String _Descripcion, String _fecha) {
        this._idsoftware = _idsoftware;
        this._nombre = _nombre;
        this._compania = _compania;
        this._version = _version;
        this._licencia = _licencia;
        this._Descripcion = _Descripcion;
        this._fecha = _fecha;
    }

    public int getIdsoftware() {
        return _idsoftware;
    }

    public void setIdsoftware(int _idsoftware) {
        this._idsoftware = _idsoftware;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String getCompania() {
        return _compania;
    }

    public void setCompania(String _compania) {
        this._compania = _compania;
    }

    public String getVersion() {
        return _version;
    }

    public void setVersion(String _version) {
        this._version = _version;
    }

    public String getLicencia() {
        return _licencia;
    }

    public void setLicencia(String _licencia) {
        this._licencia = _licencia;
    }

    public String getDescripcion() {
        return _Descripcion;
    }

    public void setDescripcion(String _Descripcion) {
        this._Descripcion = _Descripcion;
    }

    public String getFecha() {
        return _fecha;
    }

    public void setFecha(String _fecha) {
        this._fecha = _fecha;
    }

    @Override
    public String toString() {
        return "clsSoftware{" + "_idsoftware=" + _idsoftware + ", _nombre=" + _nombre + ", _compania=" + _compania + ", _version=" + _version + ", _licencia=" + _licencia + ", _Descripcion=" + _Descripcion + ", _fecha=" + _fecha + '}';
    }

     
}
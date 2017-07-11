
package ec.org.uniandes.entidades;


public class clsSoftware {
    private int _idsoftware;
    private String _nombre;
    private String _compania;
    private String _version;
    private String _requisitos;
    private String _licencia;
    private clsCategoria _idcategoria;
    private String _fecha_compra;

    public clsSoftware() {
    }

    public clsSoftware(int _idsoftware, String _nombre, String _compania, String _version, String _requisitos, String _licencia, clsCategoria _idcategoria, String _fecha_compra) {
        this._idsoftware = _idsoftware;
        this._nombre = _nombre;
        this._compania = _compania;
        this._version = _version;
        this._requisitos = _requisitos;
        this._licencia = _licencia;
        this._idcategoria = _idcategoria;
        this._fecha_compra = _fecha_compra;
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

    public String getRequisitos() {
        return _requisitos;
    }

    public void setRequisitos(String _requisitos) {
        this._requisitos = _requisitos;
    }

    public String getLicencia() {
        return _licencia;
    }

    public void setLicencia(String _licencia) {
        this._licencia = _licencia;
    }

    public clsCategoria getIdcategoria() {
        return _idcategoria;
    }

    public void setIdcategoria(clsCategoria _idcategoria) {
        this._idcategoria = _idcategoria;
    }

    public String getFecha_compra() {
        return _fecha_compra;
    }

    public void setFecha_compra(String _fecha_compra) {
        this._fecha_compra = _fecha_compra;
    }

    @Override
    public String toString() {
        return "clsSoftware{" + "_idsoftware=" + _idsoftware + ", _nombre=" + _nombre + ", _compania=" + _compania + ", _version=" + _version + ", _requisitos=" + _requisitos + ", _licencia=" + _licencia + ", _idcategoria=" + _idcategoria + ", _fecha_compra=" + _fecha_compra + '}';
    }
    
}

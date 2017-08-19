
package ec.org.uniandes.entidades;

public class clsEquipo {
    private int _idequipo;
    private String _codigo;
    private String _modelo;
    private String _marca;
    private String _nombre;
    private String _tamaño;
    private String _procesador;
    private String _tipo;
    private int _numeropuertos;
    private String _detalle;
    private String _administrable;
    private String _dependencia;
    private String _fecha_compra;
    private String _fecha_fabrica;

    public clsEquipo() {
    }

    public clsEquipo(int _idequipo, String _codigo, String _modelo, String _marca, String _nombre, String _tamaño, String _procesador, String _tipo, int _numeropuertos, String _detalle, String _administrable, String _dependencia, String _fecha_compra, String _fecha_fabrica) {
        this._idequipo = _idequipo;
        this._codigo = _codigo;
        this._modelo = _modelo;
        this._marca = _marca;
        this._nombre = _nombre;
        this._tamaño = _tamaño;
        this._procesador = _procesador;
        this._tipo = _tipo;
        this._numeropuertos = _numeropuertos;
        this._detalle = _detalle;
        this._administrable = _administrable;
        this._dependencia = _dependencia;
        this._fecha_compra = _fecha_compra;
        this._fecha_fabrica = _fecha_fabrica;
    }

    public int getIdequipo() {
        return _idequipo;
    }

    public void setIdequipo(int _idequipo) {
        this._idequipo = _idequipo;
    }

    public String getCodigo() {
        return _codigo;
    }

    public void setCodigo(String _codigo) {
        this._codigo = _codigo;
    }

    public String getModelo() {
        return _modelo;
    }

    public void setModelo(String _modelo) {
        this._modelo = _modelo;
    }

    public String getMarca() {
        return _marca;
    }

    public void setMarca(String _marca) {
        this._marca = _marca;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String getTamaño() {
        return _tamaño;
    }

    public void setTamaño(String _tamaño) {
        this._tamaño = _tamaño;
    }

    public String getProcesador() {
        return _procesador;
    }

    public void setProcesador(String _procesador) {
        this._procesador = _procesador;
    }

    public String getTipo() {
        return _tipo;
    }

    public void setTipo(String _tipo) {
        this._tipo = _tipo;
    }

    public int getNumeropuertos() {
        return _numeropuertos;
    }

    public void setNumeropuertos(int _numeropuertos) {
        this._numeropuertos = _numeropuertos;
    }

    public String getDetalle() {
        return _detalle;
    }

    public void setDetalle(String _detalle) {
        this._detalle = _detalle;
    }

    public String getAdministrable() {
        return _administrable;
    }

    public void setAdministrable(String _administrable) {
        this._administrable = _administrable;
    }

    public String getDependencia() {
        return _dependencia;
    }

    public void setDependencia(String _dependencia) {
        this._dependencia = _dependencia;
    }

    public String getFecha_compra() {
        return _fecha_compra;
    }

    public void setFecha_compra(String _fecha_compra) {
        this._fecha_compra = _fecha_compra;
    }

    public String getFecha_fabrica() {
        return _fecha_fabrica;
    }

    public void setFecha_fabrica(String _fecha_fabrica) {
        this._fecha_fabrica = _fecha_fabrica;
    }

    @Override
    public String toString() {
        return "clsEquipo{" + "_idequipo=" + _idequipo + ", _codigo=" + _codigo + ", _modelo=" + _modelo + ", _marca=" + _marca + ", _nombre=" + _nombre + ", _tama\u00f1o=" + _tamaño + ", _procesador=" + _procesador + ", _tipo=" + _tipo + ", _numeropuertos=" + _numeropuertos + ", _detalle=" + _detalle + ", _administrable=" + _administrable + ", _dependencia=" + _dependencia + ", _fecha_compra=" + _fecha_compra + ", _fecha_fabrica=" + _fecha_fabrica + '}';
    }

    
}

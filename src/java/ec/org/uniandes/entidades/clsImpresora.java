
package ec.org.uniandes.entidades;

public class clsImpresora {
    private int _idequipo;
    private String _codigo;
    private String _modelo;
    private String _marca;
    private String _nombre;
    private String _fecha_compra;
    private String _fecha_fabrica;
    private String _estado;
    private String _tipo;
    private String _detalle;
    private String _dependencia;

    public clsImpresora() {
    }

    public clsImpresora(int _idequipo, String _codigo, String _modelo, String _marca, String _nombre, String _fecha_compra, String _fecha_fabrica, String _estado, String _tipo, String _detalle, String _dependencia) {
        this._idequipo = _idequipo;
        this._codigo = _codigo;
        this._modelo = _modelo;
        this._marca = _marca;
        this._nombre = _nombre;
        this._fecha_compra = _fecha_compra;
        this._fecha_fabrica = _fecha_fabrica;
        this._estado = _estado;
        this._tipo = _tipo;
        this._detalle = _detalle;
        this._dependencia = _dependencia;
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

    public String getEstado() {
        return _estado;
    }

    public void setEstado(String _estado) {
        this._estado = _estado;
    }

    public String getTipo() {
        return _tipo;
    }

    public void setTipo(String _tipo) {
        this._tipo = _tipo;
    }

    public String getDetalle() {
        return _detalle;
    }

    public void setDetalle(String _detalle) {
        this._detalle = _detalle;
    }

    public String getDependencia() {
        return _dependencia;
    }

    public void setDependencia(String _dependencia) {
        this._dependencia = _dependencia;
    }

    @Override
    public String toString() {
        return "clsImpresora{" + "_idequipo=" + _idequipo + ", _codigo=" + _codigo + ", _modelo=" + _modelo + ", _marca=" + _marca + ", _nombre=" + _nombre + ", _fecha_compra=" + _fecha_compra + ", _fecha_fabrica=" + _fecha_fabrica + ", _estado=" + _estado + ", _tipo=" + _tipo + ", _detalle=" + _detalle + ", _dependencia=" + _dependencia + '}';
    }
    
}

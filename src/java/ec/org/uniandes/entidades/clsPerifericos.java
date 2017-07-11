
package ec.org.uniandes.entidades;

public class clsPerifericos {
    private int _idperifericos;
    private clsEquipo _idequipo;
    private String _serie;
    private String _nombre;
    private String _modelo;
    private String _marca;
    private String _estado;
    private String _fechacompra;

    public clsPerifericos() {
    }

    public clsPerifericos(int _idperifericos, clsEquipo _idequipo, String _serie, String _nombre, String _modelo, String _marca, String _estado, String _fechacompra) {
        this._idperifericos = _idperifericos;
        this._idequipo = _idequipo;
        this._serie = _serie;
        this._nombre = _nombre;
        this._modelo = _modelo;
        this._marca = _marca;
        this._estado = _estado;
        this._fechacompra = _fechacompra;
    }

    public int getIdperifericos() {
        return _idperifericos;
    }

    public void setIdperifericos(int _idperifericos) {
        this._idperifericos = _idperifericos;
    }

    public clsEquipo getIdequipo() {
        return _idequipo;
    }

    public void setIdequipo(clsEquipo _idequipo) {
        this._idequipo = _idequipo;
    }

    public String getSerie() {
        return _serie;
    }

    public void setSerie(String _serie) {
        this._serie = _serie;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
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

    public String getEstado() {
        return _estado;
    }

    public void setEstado(String _estado) {
        this._estado = _estado;
    }

    public String getFechacompra() {
        return _fechacompra;
    }

    public void setFechacompra(String _fechacompra) {
        this._fechacompra = _fechacompra;
    }

    @Override
    public String toString() {
        return "clsPerifericos{" + "_idperifericos=" + _idperifericos + ", _idequipo=" + _idequipo + ", _serie=" + _serie + ", _nombre=" + _nombre + ", _modelo=" + _modelo + ", _marca=" + _marca + ", _estado=" + _estado + ", _fechacompra=" + _fechacompra + '}';
    }
    
}

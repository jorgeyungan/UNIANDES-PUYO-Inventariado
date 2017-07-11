
package ec.org.uniandes.entidades;




public class clsImpresora {
    private int _idimpresora;
    private String _serie;
    private String _marca;
    private String _modelo;
    private String _estado;
    private String _tipo;
    private String _fechacompra;

    public clsImpresora() {
    }

    public clsImpresora(int _idimpresora, String _serie, String _marca, String _modelo, String _estado, String _tipo, String _fechacompra) {
        this._idimpresora = _idimpresora;
        this._serie = _serie;
        this._marca = _marca;
        this._modelo = _modelo;
        this._estado = _estado;
        this._tipo = _tipo;
        this._fechacompra = _fechacompra;
    }

    public int getIdimpresora() {
        return _idimpresora;
    }

    public void setIdimpresora(int _idimpresora) {
        this._idimpresora = _idimpresora;
    }

    public String getSerie() {
        return _serie;
    }

    public void setSerie(String _serie) {
        this._serie = _serie;
    }

    public String getMarca() {
        return _marca;
    }

    public void setMarca(String _marca) {
        this._marca = _marca;
    }

    public String getModelo() {
        return _modelo;
    }

    public void setModelo(String _modelo) {
        this._modelo = _modelo;
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

    public String getFechacompra() {
        return _fechacompra;
    }

    public void setFechacompra(String _fechacompra) {
        this._fechacompra = _fechacompra;
    }

    @Override
    public String toString() {
        return "clsImpresora{" + "_idimpresora=" + _idimpresora + ", _serie=" + _serie + ", _marca=" + _marca + ", _modelo=" + _modelo + ", _estado=" + _estado + ", _tipo=" + _tipo + ", _fechacompra=" + _fechacompra + '}';
    }
    
}

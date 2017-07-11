
package ec.org.uniandes.entidades;


public class clsUps {
    private int _idups;
    private clsEquipo _idequipo;
    private String _serie;
    private String _marca;
    private String _modelo;
    private String _estado;
    private String _fecha_compra;

    public clsUps() {
    }

    public clsUps(int _idups, clsEquipo _idequipo, String _serie, String _marca, String _modelo, String _estado, String _fecha_compra) {
        this._idups = _idups;
        this._idequipo = _idequipo;
        this._serie = _serie;
        this._marca = _marca;
        this._modelo = _modelo;
        this._estado = _estado;
        this._fecha_compra = _fecha_compra;
    }

    public int getIdups() {
        return _idups;
    }

    public void setIdups(int _idups) {
        this._idups = _idups;
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

    public String getFecha_compra() {
        return _fecha_compra;
    }

    public void setFecha_compra(String _fecha_compra) {
        this._fecha_compra = _fecha_compra;
    }

    @Override
    public String toString() {
        return "clsUps{" + "_idups=" + _idups + ", _idequipo=" + _idequipo + ", _serie=" + _serie + ", _marca=" + _marca + ", _modelo=" + _modelo + ", _estado=" + _estado + ", _fecha_compra=" + _fecha_compra + '}';
    }
        
}

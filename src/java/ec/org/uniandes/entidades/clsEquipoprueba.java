
package ec.org.uniandes.entidades;

public class clsEquipoprueba {
    private int _idequipo;
    private String _codigo;
    private String _modelo;
    private String _marca;

    public clsEquipoprueba() {
    }

    public clsEquipoprueba(int _idequipo, String _codigo, String _modelo, String _marca) {
        this._idequipo = _idequipo;
        this._codigo = _codigo;
        this._modelo = _modelo;
        this._marca = _marca;
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

    @Override
    public String toString() {
        return "clsEquipoprueba{" + "_idequipo=" + _idequipo + ", _codigo=" + _codigo + ", _modelo=" + _modelo + ", _marca=" + _marca + '}';
    }
    

}

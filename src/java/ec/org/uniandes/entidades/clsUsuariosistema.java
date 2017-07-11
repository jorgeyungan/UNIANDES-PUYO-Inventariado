package ec.org.uniandes.entidades;

public class clsUsuariosistema {
    private int _idusuariosistema;
    private String _usuario;
    private String _contraseña;
    private String _tipo;

    public clsUsuariosistema() {
    }

    public clsUsuariosistema(int _idusuariosistema, String _usuario, String _contraseña, String _tipo) {
        this._idusuariosistema = _idusuariosistema;
        this._usuario = _usuario;
        this._contraseña = _contraseña;
        this._tipo = _tipo;
    }

    public String getTipo() {
        return _tipo;
    }

    public void setTipo(String _tipo) {
        this._tipo = _tipo;
    }

    public int getIdusuariosistema() {
        return _idusuariosistema;
    }

    public void setIdusuariosistema(int _idusuariosistema) {
        this._idusuariosistema = _idusuariosistema;
    }

    public String getUsuario() {
        return _usuario;
    }

    public void setUsuario(String _usuario) {
        this._usuario = _usuario;
    }

    public String getContraseña() {
        return _contraseña;
    }

    public void setContraseña(String _contraseña) {
        this._contraseña = _contraseña;
    }

    @Override
    public String toString() {
        return "usuariosistema{" + "_idusuariosistema=" + _idusuariosistema + ", _usuario=" + _usuario + ", _contrase\u00f1a=" + _contraseña + ", _tipo=" + _tipo + '}';
    }
    
}

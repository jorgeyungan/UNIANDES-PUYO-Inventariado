
package ec.org.uniandes.entidades;

public class clsUsuario {
    private int _id_usuario;
    private String _cedula;
    private String _nombre;
    private String _apellido;
    private String _cargo;
    private String _telefono;
    private String _tipo;
    private String _usuario;
    private String _contraseña;

    public clsUsuario() {
    }

    public clsUsuario(int _id_usuario, String _cedula, String _nombre, String _apellido, String _cargo, String _telefono, String _tipo, String _usuario, String _contraseña) {
        this._id_usuario = _id_usuario;
        this._cedula = _cedula;
        this._nombre = _nombre;
        this._apellido = _apellido;
        this._cargo = _cargo;
        this._telefono = _telefono;
        this._tipo = _tipo;
        this._usuario = _usuario;
        this._contraseña = _contraseña;
    }

    public String getContraseña() {
        return _contraseña;
    }

    public void setContraseña(String _contraseña) {
        this._contraseña = _contraseña;
    }

    public String getUsuario() {
        return _usuario;
    }

    public void setUsuario(String _usuario) {
        this._usuario = _usuario;
    }

    public int getId_usuario() {
        return _id_usuario;
    }

    public void setId_usuario(int _id_usuario) {
        this._id_usuario = _id_usuario;
    }

    public String getCedula() {
        return _cedula;
    }

    public void setCedula(String _cedula) {
        this._cedula = _cedula;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String getApellido() {
        return _apellido;
    }

    public void setApellido(String _apellido) {
        this._apellido = _apellido;
    }

    public String getCargo() {
        return _cargo;
    }

    public void setCargo(String _cargo) {
        this._cargo = _cargo;
    }

    public String getTelefono() {
        return _telefono;
    }

    public void setTelefono(String _telefono) {
        this._telefono = _telefono;
    }

    public String getTipo() {
        return _tipo;
    }

    public void setTipo(String _tipo) {
        this._tipo = _tipo;
    }

    @Override
    public String toString() {
        return "clsUsuario{" + "_id_usuario=" + _id_usuario + ", _cedula=" + _cedula + ", _nombre=" + _nombre + ", _apellido=" + _apellido + ", _cargo=" + _cargo + ", _telefono=" + _telefono + ", _tipo=" + _tipo + ", _usuario=" + _usuario + ", _contrase\u00f1a=" + _contraseña + '}';
    }
    

}

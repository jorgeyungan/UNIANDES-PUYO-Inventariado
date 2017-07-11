
package ec.org.uniandes.entidades;

public class clsCategoria {
    private int _idcategoria;
    private String _nombre;
    private String _descripcion;

    public clsCategoria() {
    }

    public clsCategoria(int _idcategoria, String _nombre, String _descripcion) {
        this._idcategoria = _idcategoria;
        this._nombre = _nombre;
        this._descripcion = _descripcion;
    }

    public String getDescripcion() {
        return _descripcion;
    }

    public void setDescripcion(String _descripcion) {
        this._descripcion = _descripcion;
    }

    public int getIdcategoria() {
        return _idcategoria;
    }

    public void setIdcategoria(int _idcategoria) {
        this._idcategoria = _idcategoria;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    @Override
    public String toString() {
        return "clsCategoria{" + "_idcategoria=" + _idcategoria + ", _nombre=" + _nombre + ", _descripcion=" + _descripcion + '}';
    }
    
}

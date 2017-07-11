
package ec.org.uniandes.entidades;


public class clsTargetasinternas {
    private int _idtarjeta;
    private clsEquipo _idequipo;
    private String _serie;
    private String _nombre;
    private String _modelo;
    private String _descripcion;
    private String _estado;
    private String _fecha_compra;

    public clsTargetasinternas() {
    }

    public clsTargetasinternas(int _idtarjeta, clsEquipo _idequipo, String _serie, String _nombre, String _modelo, String _descripcion, String _estado, String _fecha_compra) {
        this._idtarjeta = _idtarjeta;
        this._idequipo = _idequipo;
        this._serie = _serie;
        this._nombre = _nombre;
        this._modelo = _modelo;
        this._descripcion = _descripcion;
        this._estado = _estado;
        this._fecha_compra = _fecha_compra;
    }

    public String getModelo() {
        return _modelo;
    }

    public void setModelo(String _modelo) {
        this._modelo = _modelo;
    }

    public int getIdtarjeta() {
        return _idtarjeta;
    }

    public void setIdtarjeta(int _idtarjeta) {
        this._idtarjeta = _idtarjeta;
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

    public String getDescripcion() {
        return _descripcion;
    }

    public void setDescripcion(String _descripcion) {
        this._descripcion = _descripcion;
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
    
}

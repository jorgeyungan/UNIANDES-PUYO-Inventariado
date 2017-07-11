
package ec.org.uniandes.entidades;

public class clsDetequipoimpresora {
    private int _iddetalle;
    private String _detalle;
    private clsEquipo _idequipo;
    private clsImpresora _idimpresora;

    public clsDetequipoimpresora() {
    }

    public clsDetequipoimpresora(int _iddetalle, String _detalle, clsEquipo _idequipo, clsImpresora _idimpresora) {
        this._iddetalle = _iddetalle;
        this._detalle = _detalle;
        this._idequipo = _idequipo;
        this._idimpresora = _idimpresora;
    }

    public int getIddetalle() {
        return _iddetalle;
    }

    public void setIddetalle(int _iddetalle) {
        this._iddetalle = _iddetalle;
    }

    public String getDetalle() {
        return _detalle;
    }

    public void setDetalle(String _detalle) {
        this._detalle = _detalle;
    }

    public clsEquipo getIdequipo() {
        return _idequipo;
    }

    public void setIdequipo(clsEquipo _idequipo) {
        this._idequipo = _idequipo;
    }

    public clsImpresora getIdimpresora() {
        return _idimpresora;
    }

    public void setIdimpresora(clsImpresora _idimpresora) {
        this._idimpresora = _idimpresora;
    }

    @Override
    public String toString() {
        return "clsDetequipoimpresora{" + "_iddetalle=" + _iddetalle + ", _detalle=" + _detalle + ", _idequipo=" + _idequipo + ", _idimpresora=" + _idimpresora + '}';
    }
    
}

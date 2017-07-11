
package ec.org.uniandes.entidades;

import java.sql.Date;

public class clsEquipo {
    private int _idequipo;
    private clsUbicacion _idubicacion;
    private String _codigo;
    private String _marca;
    private String _tipo;
    private String _procesador;
    private String _motherboard;
    private String _año_fabrica;
    private String _disco_duro;
    private String _ram;
    private String _vida_util;
    private String _card_rw;
    private String _acceso_internet;
    private String _unidad_optica;
    private String _estado;    
    private String _fecha_compra;
    private int _numero_puertos;
    private String _tipo_puertos;
    private String _administrable;

    public clsEquipo() {
    }

    public clsEquipo(int _idequipo, clsUbicacion _idubicacion, String _codigo, String _marca, String _tipo, String _procesador, String _motherboard, String _año_fabrica, String _disco_duro, String _ram, String _vida_util, String _card_rw, String _acceso_internet, String _unidad_optica, String _estado, String _fecha_compra, int _numero_puertos, String _tipo_puertos, String _administrable) {
        this._idequipo = _idequipo;
        this._idubicacion = _idubicacion;
        this._codigo = _codigo;
        this._marca = _marca;
        this._tipo = _tipo;
        this._procesador = _procesador;
        this._motherboard = _motherboard;
        this._año_fabrica = _año_fabrica;
        this._disco_duro = _disco_duro;
        this._ram = _ram;
        this._vida_util = _vida_util;
        this._card_rw = _card_rw;
        this._acceso_internet = _acceso_internet;
        this._unidad_optica = _unidad_optica;
        this._estado = _estado;
        this._fecha_compra = _fecha_compra;
        this._numero_puertos = _numero_puertos;
        this._tipo_puertos = _tipo_puertos;
        this._administrable = _administrable;
    }

    public int getIdequipo() {
        return _idequipo;
    }

    public void setIdequipo(int _idequipo) {
        this._idequipo = _idequipo;
    }

    public clsUbicacion getIdubicacion() {
        return _idubicacion;
    }

    public void setIdubicacion(clsUbicacion _idubicacion) {
        this._idubicacion = _idubicacion;
    }

    public String getCodigo() {
        return _codigo;
    }

    public void setCodigo(String _codigo) {
        this._codigo = _codigo;
    }

    public String getMarca() {
        return _marca;
    }

    public void setMarca(String _marca) {
        this._marca = _marca;
    }

    public String getTipo() {
        return _tipo;
    }

    public void setTipo(String _tipo) {
        this._tipo = _tipo;
    }

    public String getProcesador() {
        return _procesador;
    }

    public void setProcesador(String _procesador) {
        this._procesador = _procesador;
    }

    public String getMotherboard() {
        return _motherboard;
    }

    public void setMotherboard(String _motherboard) {
        this._motherboard = _motherboard;
    }

    public String getAño_fabrica() {
        return _año_fabrica;
    }

    public void setAño_fabrica(String _año_fabrica) {
        this._año_fabrica = _año_fabrica;
    }

    public String getDisco_duro() {
        return _disco_duro;
    }

    public void setDisco_duro(String _disco_duro) {
        this._disco_duro = _disco_duro;
    }

    public String getRam() {
        return _ram;
    }

    public void setRam(String _ram) {
        this._ram = _ram;
    }

    public String getVida_util() {
        return _vida_util;
    }

    public void setVida_util(String _vida_util) {
        this._vida_util = _vida_util;
    }

    public String getCard_rw() {
        return _card_rw;
    }

    public void setCard_rw(String _card_rw) {
        this._card_rw = _card_rw;
    }

    public String getAcceso_internet() {
        return _acceso_internet;
    }

    public void setAcceso_internet(String _acceso_internet) {
        this._acceso_internet = _acceso_internet;
    }

    public String getUnidad_optica() {
        return _unidad_optica;
    }

    public void setUnidad_optica(String _unidad_optica) {
        this._unidad_optica = _unidad_optica;
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

    public int getNumero_puertos() {
        return _numero_puertos;
    }

    public void setNumero_puertos(int _numero_puertos) {
        this._numero_puertos = _numero_puertos;
    }

    public String getTipo_puertos() {
        return _tipo_puertos;
    }

    public void setTipo_puertos(String _tipo_puertos) {
        this._tipo_puertos = _tipo_puertos;
    }

    public String getAdministrable() {
        return _administrable;
    }

    public void setAdministrable(String _administrable) {
        this._administrable = _administrable;
    }

    @Override
    public String toString() {
        return "clsEquipo{" + "_idequipo=" + _idequipo + ", _idubicacion=" + _idubicacion + ", _codigo=" + _codigo + ", _marca=" + _marca + ", _tipo=" + _tipo + ", _procesador=" + _procesador + ", _motherboard=" + _motherboard + ", _a\u00f1o_fabrica=" + _año_fabrica + ", _disco_duro=" + _disco_duro + ", _ram=" + _ram + ", _vida_util=" + _vida_util + ", _card_rw=" + _card_rw + ", _acceso_internet=" + _acceso_internet + ", _unidad_optica=" + _unidad_optica + ", _estado=" + _estado + ", _fecha_compra=" + _fecha_compra + ", _numero_puertos=" + _numero_puertos + ", _tipo_puertos=" + _tipo_puertos + ", _administrable=" + _administrable + '}';
    }
    
}

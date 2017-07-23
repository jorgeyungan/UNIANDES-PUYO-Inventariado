package ec.org.uniandes.funciones;

import ec.org.uniandes.accesodatos.AccesoDatos;
import ec.org.uniandes.accesodatos.ConjuntoResultado;
import ec.org.uniandes.accesodatos.Parametro;
import ec.org.uniandes.entidades.clsImpresora;
import java.util.ArrayList;

public class crudImpresora {

    public static boolean save(clsImpresora impresora) {
        boolean resultado = false;
        String sql = "INSERT INTO public.equipo(codigo,modelo,marca,nombre,fecha_compra,"
                + "fecha_fabrica,estado,tipo,dependencia,detalle)"
                + " VALUES(?,?,?,?,?,?,?,?,?,?)";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, impresora.getCodigo()));
        lstPar.add(new Parametro(2, impresora.getModelo()));
        lstPar.add(new Parametro(3, impresora.getMarca()));
        lstPar.add(new Parametro(4, impresora.getNombre()));
        lstPar.add(new Parametro(5, impresora.getFecha_compra()));
        lstPar.add(new Parametro(6, impresora.getFecha_fabrica()));
        lstPar.add(new Parametro(7, impresora.getEstado()));
        lstPar.add(new Parametro(8, impresora.getTipo()));
        lstPar.add(new Parametro(9, impresora.getDependencia()));
        lstPar.add(new Parametro(10, impresora.getDetalle()));
        try {
            resultado = AccesoDatos.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }

    public static boolean delete(clsImpresora impresora) {
        boolean res = false;
        String sql = "DELETE FROM public.equipo WHERE idequipo=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, impresora.getIdequipo()));
        try {
            res = AccesoDatos.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return res;
    }

    public static boolean update(clsImpresora impresora) {
        boolean res = false;
        String sql = "UPDATE public.equipo "
                + "SET codigo=?,modelo=?,marca=?,nombre=?,fecha_compra=?,"
                + "fecha_fabrica=?,estado=?,tipo=?,dependencia=?,detalle=? "
                + "WHERE idequipo=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, impresora.getCodigo()));
        lstPar.add(new Parametro(2, impresora.getModelo()));
        lstPar.add(new Parametro(3, impresora.getMarca()));
        lstPar.add(new Parametro(4, impresora.getNombre()));
        lstPar.add(new Parametro(5, impresora.getFecha_compra()));
        lstPar.add(new Parametro(6, impresora.getFecha_fabrica()));
        lstPar.add(new Parametro(7, impresora.getEstado()));
        lstPar.add(new Parametro(8, impresora.getTipo()));
        lstPar.add(new Parametro(9, impresora.getDependencia()));
        lstPar.add(new Parametro(10, impresora.getDetalle()));
        lstPar.add(new Parametro(11, impresora.getIdequipo()));
        try {
            res = AccesoDatos.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return res;
    }

    public static ArrayList<clsImpresora> findbyAll() {
        ArrayList<clsImpresora> listado = new ArrayList<>();
        String sql = "SELECT idequipo,codigo,modelo,marca,nombre,estado,tipo,"
                + "detalle,fecha_fabrica,fecha_compra,dependencia"
                + " FROM public.equipo"
                + " WHERE nombre='impresora'";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsImpresora impresora = null;
            while (cres.next()) {
                impresora = new clsImpresora();
                impresora.setIdequipo(cres.getInt("idequipo"));
                impresora.setCodigo(cres.getString("codigo"));
                impresora.setModelo(cres.getString("modelo"));
                impresora.setMarca(cres.getString("marca"));
                impresora.setNombre(cres.getString("nombre"));
                impresora.setFecha_compra(cres.getString("fecha_compra"));
                impresora.setFecha_fabrica(cres.getString("fecha_fabrica"));
                impresora.setEstado(cres.getString("estado"));
                impresora.setTipo(cres.getString("tipo"));
                impresora.setDetalle(cres.getString("detalle"));
                impresora.setDependencia(cres.getString("dependencia"));
                listado.add((impresora));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listado;
    }

    public static clsImpresora findbyId(clsImpresora impresora) {
        clsImpresora imp = null;
        String sql = "SELECT idequipo,codigo,modelo,marca,nombre,fecha_compra,"
                + "fecha_fabrica,estado,tipo,dependencia,detalle "
                + "FROM public.equipo WHERE idequipo=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, impresora.getIdequipo()));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                imp = new clsImpresora();
                imp.setIdequipo(cres.getInt("idequipo"));
                imp.setCodigo(cres.getString("codigo"));
                imp.setModelo(cres.getString("modelo"));
                imp.setMarca(cres.getString("marca"));
                imp.setNombre(cres.getString("nombre"));
                imp.setFecha_compra(cres.getString("fecha_compra"));
                imp.setFecha_fabrica(cres.getString("fecha_fabrica"));
                imp.setEstado(cres.getString("estado"));
                imp.setTipo(cres.getString("tipo"));
                imp.setDetalle(cres.getString("detalle"));
                imp.setDependencia(cres.getString("dependencia"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return imp;
    }

    public static clsImpresora findbyId(int impresora) {
        clsImpresora imp = null;
        String sql = "SELECT idequipo,codigo,modelo,marca,nombre,fecha_compra,"
                + "fecha_fabrica,estado,tipo,dependencia,detalle "
                + "FROM public.equipo WHERE idequipo=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, impresora));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                imp = new clsImpresora();
                imp.setIdequipo(cres.getInt("idequipo"));
                imp.setCodigo(cres.getString("codigo"));
                imp.setModelo(cres.getString("modelo"));
                imp.setMarca(cres.getString("marca"));
                imp.setNombre(cres.getString("nombre"));
                imp.setFecha_compra(cres.getString("fecha_compra"));
                imp.setFecha_fabrica(cres.getString("fecha_fabrica"));
                imp.setEstado(cres.getString("estado"));
                imp.setTipo(cres.getString("tipo"));
                imp.setDetalle(cres.getString("detalle"));
                imp.setDependencia(cres.getString("dependencia"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return imp;
    }
}

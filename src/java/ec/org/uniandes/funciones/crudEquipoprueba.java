package ec.org.uniandes.funciones;

import ec.org.uniandes.accesodatos.AccesoDatos;
import ec.org.uniandes.accesodatos.ConjuntoResultado;
import ec.org.uniandes.accesodatos.Parametro;
import ec.org.uniandes.entidades.clsEquipo;
import ec.org.uniandes.entidades.clsEquipoprueba;
import java.util.ArrayList;

public class crudEquipoprueba {

//    static clsCliente findbyId(String string) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    public static boolean save(clsEquipo pc) {
//        boolean resultado = false;
//        String sql = "INSERT INTO public.equipo(codigo,modelo,marca,nombre,fecha_compra,"
//                + "fecha_fabrica,estado,disco_duro,procesador,dependencia,detalle)"
//                + " VALUES(?,?,?,?,?,?,?,?,?,?,?)";
//        ArrayList<Parametro> lstPar = new ArrayList<>();
//        lstPar.add(new Parametro(1, pc.getCodigo()));
//        lstPar.add(new Parametro(2, pc.getModelo()));
//        lstPar.add(new Parametro(3, pc.getMarca()));
//        lstPar.add(new Parametro(4, pc.getNombre()));
//        lstPar.add(new Parametro(5, pc.getFecha_compra()));
//        lstPar.add(new Parametro(6, pc.getFecha_fabrica()));
//        lstPar.add(new Parametro(7, pc.getEstado()));
//        lstPar.add(new Parametro(8, pc.getDisco_duro()));
//        lstPar.add(new Parametro(9, pc.getProcesador()));
//        lstPar.add(new Parametro(10, pc.getDependencia()));
//        lstPar.add(new Parametro(11, pc.getDetalle()));
//        try {
//            resultado = AccesoDatos.ejecutaComando(sql, lstPar);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        return resultado;
//    }
//
//    public static boolean delete(clsEquipo pc) {
//        boolean res = false;
//        String sql = "DELETE FROM public.equipo WHERE idequipo=?";
//        ArrayList<Parametro> lstPar = new ArrayList<>();
//        lstPar.add(new Parametro(1, pc.getIdequipo()));
//        try {
//            res = AccesoDatos.ejecutaComando(sql, lstPar);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        return res;
//    }
//
//    public static boolean update(clsEquipo pc) {
//        boolean res = false;
//        String sql = "UPDATE public.equipo "
//                + "SET codigo=?,modelo=?,marca=?,nombre=?,fecha_compra=?,"
//                + "fecha_fabrica=?,estado=?,disco_duro=?,procesador=?,dependencia=?,detalle=? "
//                + "WHERE idequipo=?";
//        ArrayList<Parametro> lstPar = new ArrayList<>();
//        lstPar.add(new Parametro(1, pc.getCodigo()));
//        lstPar.add(new Parametro(2, pc.getModelo()));
//        lstPar.add(new Parametro(3, pc.getMarca()));
//        lstPar.add(new Parametro(4, pc.getNombre()));
//        lstPar.add(new Parametro(5, pc.getFecha_compra()));
//        lstPar.add(new Parametro(6, pc.getFecha_fabrica()));
//        lstPar.add(new Parametro(7, pc.getEstado()));
//        lstPar.add(new Parametro(8, pc.getDisco_duro()));
//        lstPar.add(new Parametro(9, pc.getProcesador()));
//        lstPar.add(new Parametro(10, pc.getDependencia()));
//        lstPar.add(new Parametro(11, pc.getDetalle()));
//        lstPar.add(new Parametro(12, pc.getIdequipo()));
//        try {
//            res = AccesoDatos.ejecutaComando(sql, lstPar);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        return res;
//    }

    public static ArrayList<clsEquipoprueba> findbyAll() {
        ArrayList<clsEquipoprueba> listado = new ArrayList<>();
        String sql = "SELECT idquipo,codigo,modelo,marca "
                + "FROM public.equipo";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsEquipoprueba pcs = null;
            while (cres.next()) {
                pcs = new clsEquipoprueba();
                pcs.setIdequipo(cres.getInt("idequipo"));
                pcs.setCodigo(cres.getString("codigo"));
                pcs.setModelo(cres.getString("modelo"));
                pcs.setMarca(cres.getString("marca"));
                listado.add((pcs));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listado;
    }
//
//    public static clsEquipo findbyId(clsEquipo equipo) {
//        clsEquipo pcs = null;
//        String sql = "SELECT idequipo,codigo,modelo,marca,nombre,fecha_compra,"
//                + "fecha_fabrica,estado,disco_duro,procesador,dependencia,detalle "
//                + "FROM public.equipo WHERE idequipo=?";
//        ArrayList<Parametro> lstPar = new ArrayList<>();
//        lstPar.add(new Parametro(1, equipo.getIdequipo()));
//        try {
//            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
//            while (cres.next()) {
//                pcs = new clsEquipo();
//                pcs.setIdequipo(cres.getInt("idequipo"));
//                pcs.setCodigo(cres.getString("codigo"));
//                pcs.setModelo(cres.getString("modelo"));
//                pcs.setMarca(cres.getString("marca"));
//                pcs.setNombre(cres.getString("nombre"));
//                pcs.setFecha_compra(cres.getString("fecha_compra"));
//                pcs.setFecha_fabrica(cres.getString("fecha_fabrica"));
//                pcs.setEstado(cres.getString("estado"));
//                pcs.setDisco_duro(cres.getString("disco_duro"));
//                pcs.setProcesador(cres.getString("procesador"));
//                pcs.setDetalle(cres.getString("detalle"));
//                pcs.setDependencia(cres.getString("dependencia"));
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        return pcs;
//    }
//
//    public static clsEquipo findbyId(int equipo) {
//        clsEquipo pcs = null;
//        String sql = "SELECT idequipo,codigo,modelo,marca,nombre,fecha_compra,"
//                + "fecha_fabrica,estado,disco_duro,procesador,dependencia,detalle "
//                + "FROM public.equipo WHERE idequipo=?";
//        ArrayList<Parametro> lstPar = new ArrayList<>();
//        lstPar.add(new Parametro(1, equipo));
//        try {
//            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
//            while (cres.next()) {
//                pcs = new clsEquipo();
//                pcs.setIdequipo(cres.getInt("idequipo"));
//                pcs.setCodigo(cres.getString("codigo"));
//                pcs.setModelo(cres.getString("modelo"));
//                pcs.setMarca(cres.getString("marca"));
//                pcs.setNombre(cres.getString("nombre"));
//                pcs.setFecha_compra(cres.getString("fecha_compra"));
//                pcs.setFecha_fabrica(cres.getString("fecha_fabrica"));
//                pcs.setEstado(cres.getString("estado"));
//                pcs.setDisco_duro(cres.getString("disco_duro"));
//                pcs.setProcesador(cres.getString("procesador"));
//                pcs.setDetalle(cres.getString("detalle"));
//                pcs.setDependencia(cres.getString("dependencia"));
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        return pcs;
//    }
}

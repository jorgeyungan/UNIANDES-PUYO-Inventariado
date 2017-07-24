package ec.org.uniandes.funciones;

import ec.org.uniandes.accesodatos.AccesoDatos;
import ec.org.uniandes.accesodatos.ConjuntoResultado;
import ec.org.uniandes.accesodatos.Parametro;
import ec.org.uniandes.entidades.clsEquipo;
import java.util.ArrayList;

public class crudEquipo {

//    static clsCliente findbyId(String string) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    public static boolean savepc(clsEquipo pc) {
        boolean resultado = false;
        String sql = "INSERT INTO public.equipo(codigo,modelo,marca,nombre,fecha_compra,"
                + "fecha_fabrica,estado,procesador,dependencia,detalle)"
                + " VALUES(?,?,?,?,?,?,?,?,?,?)";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, pc.getCodigo()));
        lstPar.add(new Parametro(2, pc.getModelo()));
        lstPar.add(new Parametro(3, pc.getMarca()));
        lstPar.add(new Parametro(4, pc.getNombre()));
        lstPar.add(new Parametro(5, pc.getFecha_compra()));
        lstPar.add(new Parametro(6, pc.getFecha_fabrica()));
        lstPar.add(new Parametro(7, pc.getEstado()));
        lstPar.add(new Parametro(8, pc.getProcesador()));
        lstPar.add(new Parametro(9, pc.getDependencia()));
        lstPar.add(new Parametro(10, pc.getDetalle()));
        try {
            resultado = AccesoDatos.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }
    public static boolean savecomplementos(clsEquipo complementos) {
        boolean resultado = false;
        String sql = "INSERT INTO public.equipo(codigo,modelo,marca,nombre,fecha_compra,"
                + "fecha_fabrica,estado,dependencia,detalle)"
                + " VALUES(?,?,?,?,?,?,?,?,?)";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, complementos.getCodigo()));
        lstPar.add(new Parametro(2, complementos.getModelo()));
        lstPar.add(new Parametro(3, complementos.getMarca()));
        lstPar.add(new Parametro(4, complementos.getNombre()));
        lstPar.add(new Parametro(5, complementos.getFecha_compra()));
        lstPar.add(new Parametro(6, complementos.getFecha_fabrica()));
        lstPar.add(new Parametro(7, complementos.getEstado()));
        lstPar.add(new Parametro(8, complementos.getDependencia()));
        lstPar.add(new Parametro(9, complementos.getDetalle()));
        try {
            resultado = AccesoDatos.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }
    public static boolean saveimpresora(clsEquipo impresora) {
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
    public static boolean saveinterno(clsEquipo interno) {
        boolean resultado = false;
        String sql = "INSERT INTO public.equipo(codigo,modelo,marca,nombre,fecha_compra,"
                + "fecha_fabrica,estado,dependencia,detalle,tamaño)"
                + " VALUES(?,?,?,?,?,?,?,?,?)";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, interno.getCodigo()));
        lstPar.add(new Parametro(2, interno.getModelo()));
        lstPar.add(new Parametro(3, interno.getMarca()));
        lstPar.add(new Parametro(4, interno.getNombre()));
        lstPar.add(new Parametro(5, interno.getFecha_compra()));
        lstPar.add(new Parametro(6, interno.getFecha_fabrica()));
        lstPar.add(new Parametro(7, interno.getEstado()));
        lstPar.add(new Parametro(8, interno.getDependencia()));
        lstPar.add(new Parametro(9, interno.getDetalle()));
        lstPar.add(new Parametro(10, interno.getTamaño()));
        try {
            resultado = AccesoDatos.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }
    
    public static boolean updatepc(clsEquipo pc) {
        boolean res = false;
        String sql = "UPDATE public.equipo "
                + "SET codigo=?,modelo=?,marca=?,nombre=?,fecha_compra=?,"
                + "fecha_fabrica=?,estado=?,procesador=?,dependencia=?,detalle=? "
                + "WHERE idequipo=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, pc.getCodigo()));
        lstPar.add(new Parametro(2, pc.getModelo()));
        lstPar.add(new Parametro(3, pc.getMarca()));
        lstPar.add(new Parametro(4, pc.getNombre()));
        lstPar.add(new Parametro(5, pc.getFecha_compra()));
        lstPar.add(new Parametro(6, pc.getFecha_fabrica()));
        lstPar.add(new Parametro(7, pc.getEstado()));
        lstPar.add(new Parametro(8, pc.getProcesador()));
        lstPar.add(new Parametro(9, pc.getDependencia()));
        lstPar.add(new Parametro(10, pc.getDetalle()));
        lstPar.add(new Parametro(11, pc.getIdequipo()));
        try {
            res = AccesoDatos.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return res;
    }
    public static boolean updatecomplementos(clsEquipo complementos) {
        boolean res = false;
        String sql = "UPDATE public.equipo "
                + "SET codigo=?,modelo=?,marca=?,nombre=?,fecha_compra=?,"
                + "fecha_fabrica=?,estado=?,dependencia=?,detalle=? "
                + "WHERE idequipo=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, complementos.getCodigo()));
        lstPar.add(new Parametro(2, complementos.getModelo()));
        lstPar.add(new Parametro(3, complementos.getMarca()));
        lstPar.add(new Parametro(4, complementos.getNombre()));
        lstPar.add(new Parametro(5, complementos.getFecha_compra()));
        lstPar.add(new Parametro(6, complementos.getFecha_fabrica()));
        lstPar.add(new Parametro(7, complementos.getEstado()));
        lstPar.add(new Parametro(8, complementos.getDependencia()));
        lstPar.add(new Parametro(9, complementos.getDetalle()));
        lstPar.add(new Parametro(10, complementos.getIdequipo()));
        try {
            res = AccesoDatos.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return res;
    }
    public static boolean updateimpresora(clsEquipo pc) {
        boolean res = false;
        String sql = "UPDATE public.equipo "
                + "SET codigo=?,modelo=?,marca=?,nombre=?,fecha_compra=?,"
                + "fecha_fabrica=?,estado=?,tipo=?,dependencia=?,detalle=? "
                + "WHERE idequipo=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, pc.getCodigo()));
        lstPar.add(new Parametro(2, pc.getModelo()));
        lstPar.add(new Parametro(3, pc.getMarca()));
        lstPar.add(new Parametro(4, pc.getNombre()));
        lstPar.add(new Parametro(5, pc.getFecha_compra()));
        lstPar.add(new Parametro(6, pc.getFecha_fabrica()));
        lstPar.add(new Parametro(7, pc.getEstado()));
        lstPar.add(new Parametro(8, pc.getTipo()));
        lstPar.add(new Parametro(9, pc.getDependencia()));
        lstPar.add(new Parametro(10, pc.getDetalle()));
        lstPar.add(new Parametro(11, pc.getIdequipo()));
        try {
            res = AccesoDatos.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return res;
    }
    public static boolean updateinterno(clsEquipo pc) {
        boolean res = false;
        String sql = "UPDATE public.equipo "
                + "SET codigo=?,modelo=?,marca=?,nombre=?,fecha_compra=?,"
                + "fecha_fabrica=?,estado=?,tamaño=?,dependencia=?,detalle=? "
                + "WHERE idequipo=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, pc.getCodigo()));
        lstPar.add(new Parametro(2, pc.getModelo()));
        lstPar.add(new Parametro(3, pc.getMarca()));
        lstPar.add(new Parametro(4, pc.getNombre()));
        lstPar.add(new Parametro(5, pc.getFecha_compra()));
        lstPar.add(new Parametro(6, pc.getFecha_fabrica()));
        lstPar.add(new Parametro(7, pc.getEstado()));
        lstPar.add(new Parametro(8, pc.getTamaño()));
        lstPar.add(new Parametro(9, pc.getDependencia()));
        lstPar.add(new Parametro(10, pc.getDetalle()));
        lstPar.add(new Parametro(11, pc.getIdequipo()));
        try {
            res = AccesoDatos.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return res;
    }
    
    public static boolean delete(clsEquipo equipo) {
        boolean res = false;
        String sql = "DELETE FROM public.equipo WHERE idequipo=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, equipo.getIdequipo()));
        try {
            res = AccesoDatos.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return res;
    }
    
    public static ArrayList<clsEquipo> findAllpc() {
        ArrayList<clsEquipo> listado = new ArrayList<>();
        String sql = "SELECT idequipo,codigo,modelo,marca,nombre,estado,procesador,"
                + "detalle,dependencia,fecha_compra,fecha_fabrica "
                + "FROM public.equipo "
                + "WHERE nombre = 'DESTOCK' OR nombre = 'LAPTOP'";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsEquipo pcs = null;
            while (cres.next()) {
                pcs = new clsEquipo();
                pcs.setIdequipo(cres.getInt("idequipo"));
                pcs.setCodigo(cres.getString("codigo"));
                pcs.setModelo(cres.getString("modelo"));
                pcs.setMarca(cres.getString("marca"));
                pcs.setNombre(cres.getString("nombre"));
                pcs.setFecha_compra(cres.getString("fecha_compra"));
                pcs.setFecha_fabrica(cres.getString("fecha_fabrica"));
                pcs.setEstado(cres.getString("estado"));
                pcs.setProcesador(cres.getString("procesador"));
                pcs.setDetalle(cres.getString("detalle"));
                pcs.setDependencia(cres.getString("dependencia"));
                listado.add((pcs));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listado;
    }
    public static ArrayList<clsEquipo> findAllcomplementos() {
        ArrayList<clsEquipo> listado = new ArrayList<>();
        String sql = "SELECT idequipo,codigo,modelo,marca,nombre,estado,detalle,"
                + "dependencia,fecha_compra,fecha_fabrica "
                + "FROM public.equipo "
                + "WHERE nombre = 'MONITOR' OR nombre = 'TECLADO' OR nombre = 'PARLANTES' "
                + "OR nombre = 'MOUSE' OR nombre = 'UPS' OR nombre = 'FUENTE DE PODER'";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsEquipo complementos = null;
            while (cres.next()) {
                complementos = new clsEquipo();
                complementos.setIdequipo(cres.getInt("idequipo"));
                complementos.setCodigo(cres.getString("codigo"));
                complementos.setModelo(cres.getString("modelo"));
                complementos.setMarca(cres.getString("marca"));
                complementos.setNombre(cres.getString("nombre"));
                complementos.setFecha_compra(cres.getString("fecha_compra"));
                complementos.setFecha_fabrica(cres.getString("fecha_fabrica"));
                complementos.setEstado(cres.getString("estado"));
                complementos.setDetalle(cres.getString("detalle"));
                complementos.setDependencia(cres.getString("dependencia"));
                listado.add((complementos));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listado;
    }
    public static ArrayList<clsEquipo> findAllimpresoras() {
        ArrayList<clsEquipo> listado = new ArrayList<>();
        String sql = "SELECT idequipo,codigo,modelo,marca,nombre,estado,detalle,"
                + "dependencia,fecha_compra,fecha_fabrica,tipo "
                + "FROM public.equipo "
                + "WHERE nombre = 'IMPRESORA'";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsEquipo impresoras = null;
            while (cres.next()) {
                impresoras = new clsEquipo();
                impresoras.setIdequipo(cres.getInt("idequipo"));
                impresoras.setCodigo(cres.getString("codigo"));
                impresoras.setModelo(cres.getString("modelo"));
                impresoras.setMarca(cres.getString("marca"));
                impresoras.setNombre(cres.getString("nombre"));
                impresoras.setFecha_compra(cres.getString("fecha_compra"));
                impresoras.setFecha_fabrica(cres.getString("fecha_fabrica"));
                impresoras.setEstado(cres.getString("estado"));
                impresoras.setDetalle(cres.getString("detalle"));
                impresoras.setDependencia(cres.getString("dependencia"));
                impresoras.setTipo(cres.getString("tipo"));
                listado.add((impresoras));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listado;
    }
    public static ArrayList<clsEquipo> findAllinterno() {
        ArrayList<clsEquipo> listado = new ArrayList<>();
        String sql = "SELECT idequipo,codigo,modelo,marca,nombre,estado,detalle,"
                + "dependencia,fecha_compra,fecha_fabrica,tamaño "
                + "FROM public.equipo "
                + "WHERE nombre = 'RAM' OR nombre='DISCO DURO'";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsEquipo impresoras = null;
            while (cres.next()) {
                impresoras = new clsEquipo();
                impresoras.setIdequipo(cres.getInt("idequipo"));
                impresoras.setCodigo(cres.getString("codigo"));
                impresoras.setModelo(cres.getString("modelo"));
                impresoras.setMarca(cres.getString("marca"));
                impresoras.setNombre(cres.getString("nombre"));
                impresoras.setFecha_compra(cres.getString("fecha_compra"));
                impresoras.setFecha_fabrica(cres.getString("fecha_fabrica"));
                impresoras.setEstado(cres.getString("estado"));
                impresoras.setDetalle(cres.getString("detalle"));
                impresoras.setDependencia(cres.getString("dependencia"));
                impresoras.setTamaño(cres.getString("tamaño"));
                listado.add((impresoras));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listado;
    }

    public static clsEquipo findbyId(clsEquipo equipo) {
        clsEquipo pcs = null;
        String sql = "SELECT idequipo "
                + "FROM public.equipo WHERE idequipo=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, equipo.getIdequipo()));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                pcs = new clsEquipo();
                pcs.setIdequipo(cres.getInt("idequipo"));
                
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return pcs;
    }

    public static clsEquipo findbyId(int equipo) {
        clsEquipo pcs = null;
        String sql = "SELECT idequipo "
                + "FROM public.equipo WHERE idequipo=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, equipo));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                pcs = new clsEquipo();
                pcs.setIdequipo(cres.getInt("idequipo"));
                
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return pcs;
    }
}

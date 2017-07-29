package ec.org.uniandes.funciones;

import ec.org.uniandes.accesodatos.AccesoDatos;
import ec.org.uniandes.accesodatos.ConjuntoResultado;
import ec.org.uniandes.accesodatos.Parametro;
import ec.org.uniandes.entidades.clsMantenimiento;
import java.util.ArrayList;



public class crudMantenimiento {

    public static boolean save(clsMantenimiento mantenimiento){
        boolean resultado = false;
        String sql = "INSERT INTO public.mantenimiento(fecha)"
                + " VALUES(?) RETURNING mantenimiento.idmantenimiento";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, mantenimiento.getFechamantenimiento()));
        try {
            resultado = AccesoDatos.ejecutaComando(sql, lstPar);
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsMantenimiento mante = null;
            
                mante = new clsMantenimiento();
                mante.setIdmantenimiento(cres.getInt("idmantenimiento"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }
    public static int saveman(clsMantenimiento mantenimiento){
        int a = 0;
        String sql = "INSERT INTO public.mantenimiento(fecha)"
                + " VALUES(?) RETURNING mantenimiento.idmantenimiento";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, mantenimiento.getFechamantenimiento()));
        try {
            a = AccesoDatos.ejecutaComandoReturn(sql, lstPar);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return a;
    }
    public static boolean delete(clsMantenimiento mantenimiento) {
        boolean res=false;
        String sql = "DELETE FROM public.mantenimiento WHERE idmantenimiento=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1,mantenimiento.getIdmantenimiento()));
        try {
            res= AccesoDatos.ejecutaComando(sql, lstPar);
            
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        return res;
    }

    public static boolean update(clsMantenimiento mantenimiento) {
        boolean res = false;
        String sql = "UPDATE public.mantenimiento " +
                "SET fecha=? " + 
                "WHERE idmantenimiento=?";
        ArrayList<Parametro> lstPar = new ArrayList<>(); 
        lstPar.add(new Parametro(1, mantenimiento.getFechamantenimiento()));
        lstPar.add(new Parametro(2, mantenimiento.getIdmantenimiento())); 
        try{
            res= AccesoDatos.ejecutaComando(sql, lstPar);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            }
        return res;
    }

    public static ArrayList<clsMantenimiento> findbyAll() {
        ArrayList<clsMantenimiento> listado = new ArrayList<>();
        String sql = "SELECT idmantenimiento,fecha,equipo.serie,equipo.marca"
                + "equipo.modelo,detallemantenimiento.reporte "+
                "FROM public.mantenimiento";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsMantenimiento mante = null;
            while (cres.next())
            {
                mante = new clsMantenimiento();
                mante.setIdmantenimiento(cres.getInt("idmantenimiento"));
                mante.setFechamantenimiento(cres.getString("fecha"));
                listado.add((mante));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listado;
    }

    public static clsMantenimiento findbyId(clsMantenimiento mantenimiento) {
        clsMantenimiento mante = null;
        String sql = "SELECT idmantenimiento,fecha "+
                "FROM public.mantenimiento WHERE idmantenimiento=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, mantenimiento.getIdmantenimiento()));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                mante = new clsMantenimiento();
                mante.setIdmantenimiento(cres.getInt("idmantenimiento"));
                mante.setFechamantenimiento(cres.getString("fecha"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return mante;
    }
    public static clsMantenimiento findbyId(int mantenimiento) {
        clsMantenimiento mante = null;
        String sql = "SELECT idmantenimiento,fecha "+
                "FROM public.mantenimiento WHERE idmantenimiento=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, mantenimiento));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                mante = new clsMantenimiento();
                mante.setIdmantenimiento(cres.getInt("idmantenimiento"));
                mante.setFechamantenimiento(cres.getString("fecha"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return mante;
    }
    
    
}

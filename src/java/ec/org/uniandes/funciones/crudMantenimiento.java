package ec.org.uniandes.funciones;

import ec.org.uniandes.accesodatos.AccesoDatos;
import ec.org.uniandes.accesodatos.ConjuntoResultado;
import ec.org.uniandes.accesodatos.Parametro;
import ec.org.uniandes.entidades.clsMantenimiento;
import java.util.ArrayList;



public class crudMantenimiento {

    public static boolean save(clsMantenimiento mantenimiento){
        boolean resultado = false;
        String sql = "INSERT INTO public.mantenimiento(fecha,reporte,idequipo,idusuario,estado)"
                + " VALUES (?,?,?,?,?)";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, mantenimiento.getFecha()));
        lstPar.add(new Parametro(2, mantenimiento.getReporte()));
        lstPar.add(new Parametro(3, mantenimiento.getIdequipo().getIdequipo()));
        lstPar.add(new Parametro(4, mantenimiento.getIdusuario().getId_usuario()));
        lstPar.add(new Parametro(5, mantenimiento.getEstado()));
        try {
            resultado = AccesoDatos.ejecutaComando(sql, lstPar);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
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
                "SET fecha=?,reporte=?,idequipo=?,idusuario=?,estado=? " + 
                "WHERE idmantenimiento=?";
        ArrayList<Parametro> lstPar = new ArrayList<>(); 
        lstPar.add(new Parametro(1, mantenimiento.getFecha()));
        lstPar.add(new Parametro(2, mantenimiento.getReporte()));
        lstPar.add(new Parametro(3, mantenimiento.getIdequipo().getIdequipo()));
        lstPar.add(new Parametro(4, mantenimiento.getIdusuario().getId_usuario()));
        lstPar.add(new Parametro(5, mantenimiento.getEstado()));
        lstPar.add(new Parametro(6, mantenimiento.getIdmantenimiento())); 
        
        try{
            res= AccesoDatos.ejecutaComando(sql, lstPar);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            }
        return res;
    }

    public static ArrayList<clsMantenimiento> findbycerrado() {
        ArrayList<clsMantenimiento> listado = new ArrayList<>();
        String sql = "SELECT idmantenimiento,fecha,reporte,idequipo,idusuario,estado "+
                "FROM public.mantenimiento WHERE estado='CERRADO'";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsMantenimiento mante = null;
            while (cres.next())
            {
                mante = new clsMantenimiento();
                mante.setIdmantenimiento(cres.getInt("idmantenimiento"));
                mante.setFecha(cres.getString("fecha"));
                mante.setReporte(cres.getString("reporte"));
                mante.setIdequipo(crudEquipo.findbyId(cres.getInt("idequipo")));
                mante.setIdusuario(crudUsuario.findbyId(cres.getInt("idusuario")));                           
                mante.setEstado(cres.getString("estado"));
                listado.add((mante));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listado;
    }
    public static ArrayList<clsMantenimiento> findbyabierto() {
        ArrayList<clsMantenimiento> listado = new ArrayList<>();
        String sql = "SELECT idmantenimiento,fecha,reporte,idequipo,idusuario,estado "+
                "FROM public.mantenimiento WHERE estado='ABIERTO'";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsMantenimiento mante = null;
            while (cres.next())
            {
                mante = new clsMantenimiento();
                mante.setIdmantenimiento(cres.getInt("idmantenimiento"));
                mante.setFecha(cres.getString("fecha"));
                mante.setReporte(cres.getString("reporte"));
                mante.setIdequipo(crudEquipo.findbyId(cres.getInt("idequipo")));
                mante.setIdusuario(crudUsuario.findbyId(cres.getInt("idusuario")));
                mante.setEstado(cres.getString("estado"));
                listado.add((mante));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listado;
    }

}

package ec.org.uniandes.funciones;

import ec.org.uniandes.accesodatos.AccesoDatos;
import ec.org.uniandes.accesodatos.ConjuntoResultado;
import ec.org.uniandes.accesodatos.Parametro;
import ec.org.uniandes.entidades.clsDetubicacionequipo;
import java.util.ArrayList;

public class crudDetubicacionequipo {

    public static boolean save(clsDetubicacionequipo sofequi) {
        boolean res = false;
        String sql = "INSERT INTO public.detalleequiubi(idequipo,idubicacion,fecha,estado)"
                + "values(?,?,?,?)";
        ArrayList<Parametro> lstpar = new ArrayList<>();
        lstpar.add(new Parametro(1, sofequi.getIdequipo().getIdequipo()));
        lstpar.add(new Parametro(2, sofequi.getIdubicacion().getIdubicacion()));
        lstpar.add(new Parametro(3, sofequi.getFecha()));
        lstpar.add(new Parametro(4, sofequi.getEstado()));
        try {
            res = AccesoDatos.ejecutaComando(sql, lstpar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return res;
    }

    private static boolean delete(clsDetubicacionequipo softequi) {
        boolean res = false;
        String sql = "DELETE FROM public.detalleequiubi WHERE iddetalle=?";
        ArrayList<Parametro> lstpar = new ArrayList<>();
        lstpar.add(new Parametro(1, softequi.getIddetalle()));
        try {
            res = AccesoDatos.ejecutaComando(sql, lstpar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return res;
    }

    private static boolean update(clsDetubicacionequipo softequi) {
        boolean res = false;
        String sql = "UPDATE public.detalleequiubi "
                + "SET idequipo=?,idubicacion=?,fecha=?,estado=? "
                + "WHERE iddetalle=?";
        ArrayList<Parametro> lstpar = new ArrayList<>();
        lstpar.add(new Parametro(1, softequi.getIdequipo()));
        lstpar.add(new Parametro(2, softequi.getIdubicacion()));
        lstpar.add(new Parametro(3, softequi.getIddetalle()));
        lstpar.add(new Parametro(4, softequi.getEstado()));
        lstpar.add(new Parametro(5, softequi.getFecha()));
        try {
            res = AccesoDatos.ejecutaComando(sql, lstpar);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return res;
    }

    public static ArrayList<clsDetubicacionequipo> findbyAll() {
        ArrayList<clsDetubicacionequipo> listado = new ArrayList<>();
        String sql = "SELECT iddetalle,idequipo,idubicacion,fecha,estado "
                + "FROM public.detalleequiubi";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsDetubicacionequipo softequi = null;
            while (cres.next()) {
                softequi = new clsDetubicacionequipo();
                softequi.setIddetalle(cres.getInt("iddetalle"));
                softequi.setIdequipo(crudEquipo.findbyId(cres.getInt("idequipo")));
                softequi.setIdubicacion(crudUbicacion.findbyId(cres.getInt("idubicacion")));
                softequi.setFecha(cres.getString("fecha"));
                softequi.setEstado(cres.getString("estado"));
                listado.add((softequi));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listado;
    }

    public static clsDetubicacionequipo findbyId(clsDetubicacionequipo dsoftequi) {
        clsDetubicacionequipo softequi = null;
        String sql = "SELECT iddetalle,idequipo,idubicacion,fecha,estado "
                + "FROM public.detalleequiubi WHERE iddetalle=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, dsoftequi.getIddetalle()));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                softequi = new clsDetubicacionequipo();
                softequi.setIddetalle(cres.getInt("iddetalle"));
                softequi.setIdequipo(crudEquipo.findbyId(cres.getInt("idequipo")));
                softequi.setIdubicacion(crudUbicacion.findbyId(cres.getInt("idubicacion")));
                softequi.setFecha(cres.getString("fecha"));
                softequi.setEstado(cres.getString("esatdo"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return softequi;
    }

    public static clsDetubicacionequipo findbyId(int dsoftequi) {
        clsDetubicacionequipo softequi = null;
        String sql = "SELECT iddetalle,idequipo,idubicacion,fecha,estado "
                + "FROM public.detalleequiubi WHERE iddetalle=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, dsoftequi));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                softequi = new clsDetubicacionequipo();
                softequi.setIddetalle(cres.getInt("iddetalle"));
                softequi.setIdequipo(crudEquipo.findbyId(cres.getInt("idequipo")));
                softequi.setIdubicacion(crudUbicacion.findbyId(cres.getInt("idubicacion")));
                softequi.setFecha(cres.getString("fecha"));
                softequi.setEstado(cres.getString("esatdo"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return softequi;
    }
}


package ec.org.uniandes.funciones;

import ec.org.uniandes.accesodatos.AccesoDatos;
import ec.org.uniandes.accesodatos.ConjuntoResultado;
import ec.org.uniandes.accesodatos.Parametro;
import ec.org.uniandes.entidades.clsDetubicacionusuario;
import java.util.ArrayList;

public class crudDetubicacionusuario {
    private static boolean save(clsDetubicacionusuario sofequi){
        boolean res=false;
        String sql = "INSERT INTO public.detalleequiubi(idusuario,idubicacion,fecha)"
                + "value(?,?,?)";
        ArrayList<Parametro> lstpar =new ArrayList<>();
        lstpar.add(new Parametro(1, sofequi.getIdusuario()));
        lstpar.add(new Parametro(2, sofequi.getIdubicacion()));
        lstpar.add(new Parametro(3, sofequi.getFecha()));
        try {
            res=AccesoDatos.ejecutaComando(sql, lstpar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return res;
    }
    private static boolean delete(clsDetubicacionusuario softequi){
        boolean res =false;
        String sql = "DELETE FROM public.detalleequiubi WHERE iddetalle=?";
        ArrayList<Parametro> lstpar=new ArrayList<>();
        lstpar.add(new Parametro(1, softequi.getIddetalle()));
        try {
            res=AccesoDatos.ejecutaComando(sql, lstpar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return res;
    }
    private static boolean update(clsDetubicacionusuario softequi){
        boolean res = false;
        String sql="UPDATE public.detalleequiubi "
                + "SET idusuario=?,idubicacion=?,fecha=? "
                + "WHERE iddetalle=?";
        ArrayList<Parametro> lstpar=new ArrayList<>();
        lstpar.add(new Parametro(1, softequi.getIdusuario()));
        lstpar.add(new Parametro(2, softequi.getIdubicacion()));
        lstpar.add(new Parametro(3, softequi.getIddetalle()));
        lstpar.add(new Parametro(4, softequi.getFecha()));
        try {
            res = AccesoDatos.ejecutaComando(sql, lstpar);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return res;
    }
    public static ArrayList<clsDetubicacionusuario> findbyAll() {
        ArrayList<clsDetubicacionusuario> listado = new ArrayList<>();
        String sql = "SELECT iddetalle,idusuario,idubicacion,fecha "
                + "FROM public.detalleequiubi";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsDetubicacionusuario softequi = null;
            while (cres.next())
            {
                softequi = new clsDetubicacionusuario();
                softequi.setIddetalle(cres.getInt("iddetalle"));
                softequi.setIdusuario(crudUsuario.findbyId(cres.getInt("idusuario")));
                softequi.setIdubicacion(crudUbicacion.findbyId(cres.getInt("idubicacion")));
                softequi.setFecha(cres.getString("fecha"));
               listado.add((softequi));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listado;
    }

    public static clsDetubicacionusuario findbyId(clsDetubicacionusuario dsoftequi) {
        clsDetubicacionusuario softequi = null;
        String sql = "SELECT iddetalle,idusuario,idubicacion,fecha "
                + "FROM public.detalleequiubi WHERE iddetalle=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, dsoftequi.getIddetalle()));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                softequi = new clsDetubicacionusuario();
                softequi.setIddetalle(cres.getInt("iddetalle"));
                softequi.setIdusuario(crudUsuario.findbyId(cres.getInt("idusuario")));
                softequi.setIdubicacion(crudUbicacion.findbyId(cres.getInt("idubicacion")));
                softequi.setFecha(cres.getString("fecha"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return softequi;
    }
    public static clsDetubicacionusuario findbyId(int dsoftequi) {
        clsDetubicacionusuario softequi = null;
        String sql = "SELECT iddetalle,idusuario,idubicacion,fecha "
                + "FROM public.detalleequiubi WHERE iddetalle=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, dsoftequi));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                softequi = new clsDetubicacionusuario();
                softequi.setIddetalle(cres.getInt("iddetalle"));
                softequi.setIdusuario(crudUsuario.findbyId(cres.getInt("idusuario")));
                softequi.setIdubicacion(crudUbicacion.findbyId(cres.getInt("idubicacion")));
                softequi.setFecha(cres.getString("fecha"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return softequi;
    }
}

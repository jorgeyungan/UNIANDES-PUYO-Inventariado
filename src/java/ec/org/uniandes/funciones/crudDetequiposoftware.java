
package ec.org.uniandes.funciones;

import ec.org.uniandes.accesodatos.AccesoDatos;
import ec.org.uniandes.accesodatos.ConjuntoResultado;
import ec.org.uniandes.accesodatos.Parametro;
import ec.org.uniandes.entidades.clsDetequiposoftware;
import java.util.ArrayList;


public class crudDetequiposoftware {
    private boolean save(clsDetequiposoftware sofequi){
        boolean res=false;
        String sql = "INSERT INTO public.detallesoftware(idequipo,idsoftware)"
                + "value(?,?)";
        ArrayList<Parametro> lstpar =new ArrayList<>();
        lstpar.add(new Parametro(1, sofequi.getIdequipo()));
        lstpar.add(new Parametro(2, sofequi.getIdsoftware()));
        try {
            res=AccesoDatos.ejecutaComando(sql, lstpar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return res;
    }
    private static boolean delete(clsDetequiposoftware softequi){
        boolean res =false;
        String sql = "DELETE FROM public.detallesoftware WHERE iddetalle=?";
        ArrayList<Parametro> lstpar=new ArrayList<>();
        lstpar.add(new Parametro(1, softequi.getIddetalle()));
        try {
            res=AccesoDatos.ejecutaComando(sql, lstpar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return res;
    }
    private static boolean update(clsDetequiposoftware softequi){
        boolean res = false;
        String sql="UPDATE public.detallesoftware "
                + "SET idequipo=?,idsoftware=?"
                + "WHERE iddetalle=?";
        ArrayList<Parametro> lstpar=new ArrayList<>();
        lstpar.add(new Parametro(1, softequi.getIdequipo()));
        lstpar.add(new Parametro(2, softequi.getIdsoftware()));
        lstpar.add(new Parametro(3, softequi.getIddetalle()));
        try {
            res = AccesoDatos.ejecutaComando(sql, lstpar);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return res;
    }
    public static ArrayList<clsDetequiposoftware> findbyAll() {
        ArrayList<clsDetequiposoftware> listado = new ArrayList<>();
        String sql = "SELECT iddetalle,idequipo,idsoftware "
                + "FROM public.detallesoftware";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsDetequiposoftware softequi = null;
            while (cres.next())
            {
                softequi = new clsDetequiposoftware();
                softequi.setIddetalle(cres.getInt("iddetalle"));
                softequi.setIdequipo(crudEquipo.findbyId(cres.getInt("idequipo")));
                softequi.setIdsoftware(crudSoftware.findbyId(cres.getInt("idsoftware")));
               listado.add((softequi));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listado;
    }

    public static clsDetequiposoftware findbyId(clsDetequiposoftware softequi) {
        clsDetequiposoftware detsoftequi = null;
        String sql = "SELECT iddetalle,idequipo,idsoftware "
                + "FROM public.detallesoftware WHERE iddetalle=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, softequi.getIddetalle()));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                detsoftequi = new clsDetequiposoftware();
                detsoftequi.setIddetalle(cres.getInt("iddetalle"));
                detsoftequi.setIdequipo(crudEquipo.findbyId(cres.getInt("idequipo")));
                detsoftequi.setIdsoftware(crudSoftware.findbyId(cres.getInt("idsoftware")));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return detsoftequi;
    }
    public static clsDetequiposoftware findbyId(int softequi) {
        clsDetequiposoftware detsoftequi = null;
        String sql = "SELECT iddetalle,idequipo,idsoftware "
                + "FROM public.detallesoftware WHERE iddetalle=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, softequi));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                detsoftequi = new clsDetequiposoftware();
                detsoftequi.setIddetalle(cres.getInt("iddetalle"));
                detsoftequi.setIdequipo(crudEquipo.findbyId(cres.getInt("idequipo")));
                detsoftequi.setIdsoftware(crudSoftware.findbyId(cres.getInt("idsoftware")));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return detsoftequi;
    }
}

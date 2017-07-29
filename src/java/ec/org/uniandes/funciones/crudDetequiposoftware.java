
package ec.org.uniandes.funciones;

import ec.org.uniandes.accesodatos.AccesoDatos;
import ec.org.uniandes.accesodatos.ConjuntoResultado;
import ec.org.uniandes.accesodatos.Parametro;
import ec.org.uniandes.entidades.clsDetequiposoftware;
import java.util.ArrayList;


public class crudDetequiposoftware {
    public static boolean save(clsDetequiposoftware sofequi){
        boolean res=false;
        String sql = "INSERT INTO public.detallesoftware(idequipo,idsoftware,fecha)"
                + "VALUES(?,?,?)";
        ArrayList<Parametro> lstpar =new ArrayList<>();
        lstpar.add(new Parametro(1, sofequi.getIdequipo().getIdequipo()));
        lstpar.add(new Parametro(2, sofequi.getIdsoftware().getIdsoftware()));
        lstpar.add(new Parametro(3, sofequi.getFecha()));
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
                + "SET idequipo=?,idsoftware=?,fecha=? "
                + "WHERE iddetalle=?";
        ArrayList<Parametro> lstpar=new ArrayList<>();
        lstpar.add(new Parametro(1, softequi.getIdequipo()));
        lstpar.add(new Parametro(2, softequi.getIdsoftware()));
        lstpar.add(new Parametro(3, softequi.getIddetalle()));
        lstpar.add(new Parametro(4, softequi.getFecha()));
        try {
            res = AccesoDatos.ejecutaComando(sql, lstpar);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return res;
    }
    public static ArrayList<clsDetequiposoftware> findbyAll() {
        ArrayList<clsDetequiposoftware> listado = new ArrayList<>();
        String sql = "SELECT iddetalle,idequipo,idsoftware,fecha "
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
                softequi.setFecha(cres.getString("fecha"));
               listado.add((softequi));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listado;
    }

    public static clsDetequiposoftware findbyId(clsDetequiposoftware dsoftequi) {
        clsDetequiposoftware softequi = null;
        String sql = "SELECT iddetalle,idequipo,idsoftware "
                + "FROM public.detallesoftware WHERE iddetalle=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, dsoftequi.getIddetalle()));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                softequi = new clsDetequiposoftware();
                softequi.setIddetalle(cres.getInt("iddetalle"));
                softequi.setIdequipo(crudEquipo.findbyId(cres.getInt("idequipo")));
                softequi.setIdsoftware(crudSoftware.findbyId(cres.getInt("idsoftware")));
                softequi.setFecha(cres.getString("fecha"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return softequi;
    }
    public static clsDetequiposoftware findbyId(int dsoftequi) {
        clsDetequiposoftware softequi = null;
        String sql = "SELECT iddetalle,idequipo,idsoftware "
                + "FROM public.detallesoftware WHERE iddetalle=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, dsoftequi));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                softequi = new clsDetequiposoftware();
                softequi.setIddetalle(cres.getInt("iddetalle"));
                softequi.setIdequipo(crudEquipo.findbyId(cres.getInt("idequipo")));
                softequi.setIdsoftware(crudSoftware.findbyId(cres.getInt("idsoftware")));
                softequi.setFecha(cres.getString("fecha"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return softequi;
    }
}

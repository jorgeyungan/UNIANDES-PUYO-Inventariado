
package ec.org.uniandes.funciones;

import ec.org.uniandes.accesodatos.AccesoDatos;
import ec.org.uniandes.accesodatos.ConjuntoResultado;
import ec.org.uniandes.accesodatos.Parametro;
import ec.org.uniandes.entidades.clsDetequipoimpresora;
import java.util.ArrayList;


public class crudDetequipoimpresora {
    private boolean save(clsDetequipoimpresora impequi){
        boolean res=false;
        String sql = "INSERT INTO public.detalleimpresora(idequipo,idimpresora,detalle)"
                + "value(?,?,?)";
        ArrayList<Parametro> lstpar =new ArrayList<>();
        lstpar.add(new Parametro(1, impequi.getIdequipo()));
        lstpar.add(new Parametro(2, impequi.getIdimpresora()));
        lstpar.add(new Parametro(3, impequi.getDetalle()));
        try {
            res=AccesoDatos.ejecutaComando(sql, lstpar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return res;
    }
    private static boolean delete(clsDetequipoimpresora impequi){
        boolean res =false;
        String sql = "DELETE FROM public.detalleimpresora WHERE iddetalle=?";
        ArrayList<Parametro> lstpar=new ArrayList<>();
        lstpar.add(new Parametro(1, impequi.getIddetalle()));
        try {
            res=AccesoDatos.ejecutaComando(sql, lstpar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return res;
    }
    private static boolean update(clsDetequipoimpresora impequi){
        boolean res = false;
        String sql="UPDATE public.detalleimpresora "
                + "SET idequipo=?,idimpresora=?,detalle=?"
                + "WHERE iddetalle=?";
        ArrayList<Parametro> lstpar=new ArrayList<>();
        lstpar.add(new Parametro(1, impequi.getIdequipo()));
        lstpar.add(new Parametro(2, impequi.getIdimpresora()));
        lstpar.add(new Parametro(3, impequi.getDetalle()));
        lstpar.add(new Parametro(4, impequi.getIddetalle()));
        try {
            res = AccesoDatos.ejecutaComando(sql, lstpar);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return res;
    }
    public static ArrayList<clsDetequipoimpresora> findbyAll() {
        ArrayList<clsDetequipoimpresora> listado = new ArrayList<>();
        String sql = "SELECT iddetalle,idequipo,idimpresora,detalle "
                + "FROM public.detalleimpresora";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsDetequipoimpresora detimpequi = null;
            while (cres.next())
            {
                detimpequi = new clsDetequipoimpresora();
                detimpequi.setIddetalle(cres.getInt("iddetalle"));
                detimpequi.setIdequipo(crudEquipo.findbyId(cres.getInt("idequipo")));
                detimpequi.setIdimpresora(crudImpresora.findbyId(cres.getInt("idimpresora")));
                detimpequi.setDetalle(cres.getString("detalle"));
                listado.add((detimpequi));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listado;
    }

    public static clsDetequipoimpresora findbyId(clsDetequipoimpresora impequi) {
        clsDetequipoimpresora detimpequi = null;
        String sql = "SELECT iddetalle,idequipo,idimpresora,detalle "
                + "FROM public.detalleimpresora WHERE iddetalle=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, impequi.getIddetalle()));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                detimpequi = new clsDetequipoimpresora();
                detimpequi.setIddetalle(cres.getInt("iddetalle"));
                detimpequi.setIdequipo(crudEquipo.findbyId(cres.getInt("idequipo")));
                detimpequi.setIdimpresora(crudImpresora.findbyId(cres.getInt("idimpresora")));
                detimpequi.setDetalle(cres.getString("detalle"));           
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return detimpequi;
    }
    public static clsDetequipoimpresora findbyId(int impequi) {
        clsDetequipoimpresora detimpequi = null;
        String sql = "SELECT iddetalle,idequipo,idimpresora,detalle "
                + "FROM public.detalleimpresora WHERE iddetalle=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, impequi));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                detimpequi = new clsDetequipoimpresora();
                detimpequi.setIddetalle(cres.getInt("iddetalle"));
                detimpequi.setIdequipo(crudEquipo.findbyId(cres.getInt("idequipo")));
                detimpequi.setIdimpresora(crudImpresora.findbyId(cres.getInt("idimpresora")));
                detimpequi.setDetalle(cres.getString("detalle"));           
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return detimpequi;
    }
}

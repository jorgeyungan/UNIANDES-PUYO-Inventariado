
package ec.org.uniandes.funciones;

import ec.org.uniandes.accesodatos.AccesoDatos;
import ec.org.uniandes.accesodatos.ConjuntoResultado;
import ec.org.uniandes.accesodatos.Parametro;
import ec.org.uniandes.entidades.clsDetequipomantenimiento;
import java.util.ArrayList;


public class crudDetequipomantenimiento {
    private boolean save(clsDetequipomantenimiento manequi){
        boolean res=false;
        String sql = "INSERT INTO public.detallemantenimiento(idequipo,idmanteminiento)"
                + "value(?,?)";
        ArrayList<Parametro> lstpar =new ArrayList<>();
        lstpar.add(new Parametro(1, manequi.getIdequipo()));
        lstpar.add(new Parametro(2, manequi.getIdmantenimiento()));
        try {
            res=AccesoDatos.ejecutaComando(sql, lstpar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return res;
    }
    private static boolean delete(clsDetequipomantenimiento manequi){
        boolean res =false;
        String sql = "DELETE FROM public.detallemantenimiento WHERE iddetalle=?";
        ArrayList<Parametro> lstpar=new ArrayList<>();
        lstpar.add(new Parametro(1, manequi.getIddetalle()));
        try {
            res=AccesoDatos.ejecutaComando(sql, lstpar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return res;
    }
    private static boolean update(clsDetequipomantenimiento manequi){
        boolean res = false;
        String sql="UPDATE public.detallemantenimiento "
                + "SET idequipo=?,idmantenimiento=?"
                + "WHERE iddetalle=?";
        ArrayList<Parametro> lstpar=new ArrayList<>();
        lstpar.add(new Parametro(1, manequi.getIdequipo()));
        lstpar.add(new Parametro(2, manequi.getIdmantenimiento()));
        lstpar.add(new Parametro(3, manequi.getIddetalle()));
        try {
            res = AccesoDatos.ejecutaComando(sql, lstpar);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return res;
    }
    public static ArrayList<clsDetequipomantenimiento> findbyAll() {
        ArrayList<clsDetequipomantenimiento> listado = new ArrayList<>();
        String sql = "SELECT iddetalle,idequipo,idmantenimiento "
                + "FROM public.detallemantenimeinto";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsDetequipomantenimiento manequi = null;
            while (cres.next())
            {
                manequi = new clsDetequipomantenimiento();
                manequi.setIddetalle(cres.getInt("iddetalle"));
                manequi.setIdequipo(crudEquipo.findbyId(cres.getInt("idequipo")));
                manequi.setIdmantenimiento(crudMantenimiento.findbyId(cres.getInt("idmantenimiento")));
                listado.add((manequi));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listado;
    }

    public static clsDetequipomantenimiento findbyId(clsDetequipomantenimiento manequi) {
        clsDetequipomantenimiento detmanequi = null;
        String sql = "SELECT iddetalle,idequipo,idmantenimiento "
                + "FROM public.detallemantenimeinto WHERE iddetalle=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, manequi.getIddetalle()));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                detmanequi = new clsDetequipomantenimiento();
                detmanequi.setIddetalle(cres.getInt("iddetalle"));
                detmanequi.setIdequipo(crudEquipo.findbyId(cres.getInt("idequipo")));
                detmanequi.setIdmantenimiento(crudMantenimiento.findbyId(cres.getInt("idmantenimeinto")));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return detmanequi;
    }
    public static clsDetequipomantenimiento findbyId(int manequi) {
        clsDetequipomantenimiento detmanequi = null;
        String sql = "SELECT iddetalle,idequipo,idmantenimiento "
                + "FROM public.detallemantenimeinto WHERE iddetalle=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, manequi));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                detmanequi = new clsDetequipomantenimiento();
                detmanequi.setIddetalle(cres.getInt("iddetalle"));
                detmanequi.setIdequipo(crudEquipo.findbyId(cres.getInt("idequipo")));
                detmanequi.setIdmantenimiento(crudMantenimiento.findbyId(cres.getInt("idmantenimeinto")));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return detmanequi;
    }
}

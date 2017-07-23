package ec.org.uniandes.funciones;

import ec.org.uniandes.accesodatos.AccesoDatos;
import ec.org.uniandes.accesodatos.ConjuntoResultado;
import ec.org.uniandes.accesodatos.Parametro;
import ec.org.uniandes.entidades.clsUbicacion;
import java.util.ArrayList;



public class crudUbicacion {

    public static boolean save(clsUbicacion ubicacion){
        boolean resultado = false;
        String sql = "INSERT INTO public.ubicacion(edificio,piso,carrera,sala,sector)"
                + " VALUES(?,?,?,?,?)";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, ubicacion.getEdificio()));
        lstPar.add(new Parametro(2, ubicacion.getPiso()));
        lstPar.add(new Parametro(3, ubicacion.getCarrera()));
        lstPar.add(new Parametro(4, ubicacion.getSala()));
        lstPar.add(new Parametro(5, ubicacion.getSector())); 
        try {
            resultado = AccesoDatos.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }
    
    public static boolean delete(clsUbicacion ubicacion) {
        boolean res=false;
        String sql = "DELETE FROM public.ubicacion WHERE idubicacion=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1,ubicacion.getIdubicacion()));
        try {
            res= AccesoDatos.ejecutaComando(sql, lstPar);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        return res;
    }

    public static boolean update(clsUbicacion ubicacion) {
        boolean res = false;
        String sql = "UPDATE public.ubicacion " +
                "SET edificio=?,piso=?,carrera=?,sala=?,sector=?" + 
                "WHERE idubicacion=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();        
        lstPar.add(new Parametro(1, ubicacion.getEdificio()));
        lstPar.add(new Parametro(2, ubicacion.getPiso()));
        lstPar.add(new Parametro(3, ubicacion.getCarrera()));
        lstPar.add(new Parametro(4, ubicacion.getSala()));
        lstPar.add(new Parametro(6, ubicacion.getSector())); 
        lstPar.add(new Parametro(7, ubicacion.getIdubicacion()));
        try{
            res= AccesoDatos.ejecutaComando(sql, lstPar);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            }
        return res;
    }

    public static ArrayList<clsUbicacion> findbyAll() {
        ArrayList<clsUbicacion> listado = new ArrayList<>();
        String sql = "SELECT idubicacion,edificio,piso,carrera,sala,sector "+
                " FROM public.ubicacion";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsUbicacion ubi = null;
            while (cres.next())
            {
                ubi = new clsUbicacion();
                ubi.setIdubicacion(cres.getInt("idubicacion"));
                ubi.setEdificio(cres.getString("edificio"));
                ubi.setPiso(cres.getString("piso"));
                ubi.setCarrera(cres.getString("carrera"));
                ubi.setSala(cres.getString("sala"));
                ubi.setSector(cres.getString("sector"));
                listado.add((ubi));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listado;
    }

    public static clsUbicacion findbyId(clsUbicacion ubicacion) {
        clsUbicacion ubi = null;
        String sql = "SELECT idubicacion,edificio,piso,carrera,sala,sector"+
                " FROM public.ubicacion WHERE idubicacion=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, ubicacion.getIdubicacion()));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                ubi = new clsUbicacion();
                ubi.setIdubicacion(cres.getInt("idubicacion"));
                ubi.setEdificio(cres.getString("edificio"));
                ubi.setPiso(cres.getString("piso"));
                ubi.setCarrera(cres.getString("carrera"));
                ubi.setSala(cres.getString("sala"));
                ubi.setSector(cres.getString("sector"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ubi;
    }
    public static clsUbicacion findbyId(int ubicacion) {
        clsUbicacion ubi = null;
        String sql = "SELECT idubicacion,edificio,piso,carrera,sala,sector"+
                " FROM public.ubicacion WHERE idubicacion=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, ubicacion));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                ubi = new clsUbicacion();
                ubi.setIdubicacion(cres.getInt("idubicacion"));
                ubi.setEdificio(cres.getString("edificio"));
                ubi.setPiso(cres.getString("piso"));
                ubi.setCarrera(cres.getString("carrera"));
                ubi.setSala(cres.getString("sala"));
                ubi.setSector(cres.getString("sector"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ubi;
    }
}
package ec.org.uniandes.funciones;

import ec.org.uniandes.accesodatos.AccesoDatos;
import ec.org.uniandes.accesodatos.ConjuntoResultado;
import ec.org.uniandes.accesodatos.Parametro;
import ec.org.uniandes.entidades.clsTargetasinternas;
import java.util.ArrayList;



public class crudTerjetasInternas {

    public static boolean save(clsTargetasinternas tarjetasinternas){
        boolean resultado = false;
        String sql = "INSERT INTO public.tarjetas_internas(idequipo,serie,nombre,descripcion,estado,fecha_compra)"
                + " VALUES(?,?,?,?,?,?)";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, tarjetasinternas.getIdequipo().getIdequipo()));
        lstPar.add(new Parametro(2, tarjetasinternas.getSerie()));
        lstPar.add(new Parametro(3, tarjetasinternas.getNombre()));
        lstPar.add(new Parametro(4, tarjetasinternas.getDescripcion()));
        lstPar.add(new Parametro(5, tarjetasinternas.getEstado()));
        lstPar.add(new Parametro(6, tarjetasinternas.getFecha_compra()));
        try {
            resultado = AccesoDatos.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }
    
    public static boolean delete(clsTargetasinternas tarjetasinternas) {
        boolean res=false;
        String sql = "DELETE FROM public.tarjetas_internas WHERE idtarjetas=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1,tarjetasinternas.getIdtarjeta()));
        try {
            res= AccesoDatos.ejecutaComando(sql, lstPar);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        return res;
    }

    public static boolean update(clsTargetasinternas tarjetasinternas) {
        boolean res = false;
        String sql = "UPDATE public.tarjetas_internas " +
                "SET idequipo=?,serie=?,nombre=?,desccripcion=?,estado=?,fecha_compra=?"+ 
                "WHERE idtarjetas=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();  
        lstPar.add(new Parametro(1, tarjetasinternas.getIdequipo()));
        lstPar.add(new Parametro(2, tarjetasinternas.getSerie()));
        lstPar.add(new Parametro(3, tarjetasinternas.getNombre()));
        lstPar.add(new Parametro(4, tarjetasinternas.getDescripcion()));
        lstPar.add(new Parametro(5, tarjetasinternas.getEstado()));
        lstPar.add(new Parametro(6, tarjetasinternas.getFecha_compra()));
        try{
            res= AccesoDatos.ejecutaComando(sql, lstPar);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            }
        return res;
    }

    public static ArrayList<clsTargetasinternas> findbyAll() {
        ArrayList<clsTargetasinternas> listado = new ArrayList<>();
        String sql = "SELECT idtarjetas,idequipo,serie,nombre,descripcion,estado,fecha_compra"+
                " FROM public.tarjetas_internas";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsTargetasinternas targetasinterna = null;
            while (cres.next())
            {
                targetasinterna = new clsTargetasinternas();
                targetasinterna.setIdtarjeta(cres.getInt("idtarjetas"));
                targetasinterna.setIdequipo(crudEquipo.findbyId(cres.getInt("idequipo")));
                targetasinterna.setSerie(cres.getString("serie"));
                targetasinterna.setNombre(cres.getString("nombre"));
                targetasinterna.setDescripcion(cres.getString("descripcion")); 
                targetasinterna.setEstado(cres.getString("estado"));
                targetasinterna.setFecha_compra(cres.getString("fecha_compra"));
                listado.add((targetasinterna));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listado;
    }

    public static clsTargetasinternas findbyId(clsTargetasinternas targetasinternas) {
        clsTargetasinternas targetasinterna = null;
        String sql = "SELECT idtarjetas,idequipo,serie,nombre,descripcion,estado,fecha_compra"+
                " FROM public.tarjetas_internas WHERE idtarjetas=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, targetasinternas.getIdtarjeta()));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                targetasinterna = new clsTargetasinternas();
                targetasinterna.setIdtarjeta(cres.getInt("idtarjetas"));
                targetasinterna.setIdequipo(crudEquipo.findbyId(cres.getInt("idequipo")));
                targetasinterna.setSerie(cres.getString("serie"));
                targetasinterna.setNombre(cres.getString("nombre"));
                targetasinterna.setDescripcion(cres.getString("descripcion")); 
                targetasinterna.setEstado(cres.getString("estado"));
                targetasinterna.setFecha_compra(cres.getString("fecha_compra"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return targetasinterna;
    }
    
    public static clsTargetasinternas findbyId(int targetasinternas) {
        clsTargetasinternas targetasinterna = null;
        String sql = "SELECT idtarjetas,idequipo,serie,nombre,descripcion,estado,fecha_compra"+
                " FROM public.tarjetas_internas WHERE idtarjetas=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, targetasinternas));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                targetasinterna = new clsTargetasinternas();
                targetasinterna.setIdtarjeta(cres.getInt("idtarjetas"));
                targetasinterna.setIdequipo(crudEquipo.findbyId(cres.getInt("idequipo")));
                targetasinterna.setSerie(cres.getString("serie"));
                targetasinterna.setNombre(cres.getString("nombre"));
                targetasinterna.setDescripcion(cres.getString("descripcion")); 
                targetasinterna.setEstado(cres.getString("estado"));
                targetasinterna.setFecha_compra(cres.getString("fecha_compra"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return targetasinterna;
    }
}

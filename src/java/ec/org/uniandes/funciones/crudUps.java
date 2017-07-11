package ec.org.uniandes.funciones;

import ec.org.uniandes.accesodatos.AccesoDatos;
import ec.org.uniandes.accesodatos.ConjuntoResultado;
import ec.org.uniandes.accesodatos.Parametro;
import ec.org.uniandes.entidades.clsUps;
import java.util.ArrayList;



public class crudUps {


    public static boolean save(clsUps ups){
        boolean resultado = false;
        String sql = "INSERT INTO public.ups(idequipo,serie,marca,modelo,estado,fecha_compra)"
                + " VALUES(?,?,?,?,?,?)";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, ups.getIdequipo().getIdequipo()));
        lstPar.add(new Parametro(2, ups.getSerie()));
        lstPar.add(new Parametro(3, ups.getMarca()));
        lstPar.add(new Parametro(4, ups.getModelo()));
        lstPar.add(new Parametro(5, ups.getEstado()));
        lstPar.add(new Parametro(6, ups.getFecha_compra()));
        try {
            resultado = AccesoDatos.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }
    
    public static boolean delete(clsUps ups) {
        boolean res=false;
        String sql = "DELETE FROM public.ups WHERE idups=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1,ups.getIdups()));
        try {
            res= AccesoDatos.ejecutaComando(sql, lstPar);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        return res;
    }

    public static boolean update(clsUps ups) {
        boolean res = false;
        String sql = "UPDATE public.pc " +
                "SET idequipo=?,serie=?,marca=?,modelo=?,estado=?,fecha_compra=?" + 
                "WHERE idups=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();  
        lstPar.add(new Parametro(1, ups.getIdequipo()));
        lstPar.add(new Parametro(2, ups.getSerie()));
        lstPar.add(new Parametro(3, ups.getMarca()));
        lstPar.add(new Parametro(4, ups.getModelo()));
        lstPar.add(new Parametro(5, ups.getEstado()));
        lstPar.add(new Parametro(6, ups.getFecha_compra()));
        lstPar.add(new Parametro(7, ups.getIdups()));
        try{
            res= AccesoDatos.ejecutaComando(sql, lstPar);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            }
        return res;
    }

    public static ArrayList<clsUps> findbyAll() {
        ArrayList<clsUps> listado = new ArrayList<>();
        String sql = "SELECT idups,idequipo,serie,marca,modelo,estado,fecha_compra"+
                " FROM public.ups";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsUps ups = null;
            while (cres.next())
            {
                ups = new clsUps();
                ups.setIdequipo(crudEquipo.findbyId(cres.getInt("idequipo")));
                ups.setSerie(cres.getString("serie"));
                ups.setMarca(cres.getString("marca"));
                ups.setModelo(cres.getString("modelo"));
                ups.setEstado(cres.getString("estado"));
                ups.setFecha_compra(cres.getString("fecha_compra"));
                ups.setIdups(cres.getInt("idups"));
                listado.add((ups));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listado;
    }

    public static clsUps findbyId(clsUps upss) {
        clsUps ups = null;
        String sql = "SELECT idups,idequipo,serie,marca,modelo,estado,fecha_compra"+
                " FROM public.ups WHERE idups=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, upss.getIdups()));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                ups = new clsUps();
                ups.setIdequipo(crudEquipo.findbyId(cres.getInt("idequipo")));
                ups.setSerie(cres.getString("serie"));
                ups.setMarca(cres.getString("marca"));
                ups.setModelo(cres.getString("modelo"));
                ups.setEstado(cres.getString("estado"));
                ups.setFecha_compra(cres.getString("fecha_compra"));
                ups.setIdups(cres.getInt("idups"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ups;
    }
    public static clsUps findbyId(int upss) {
        clsUps ups = null;
        String sql = "SELECT idups,idequipo,serie,marca,modelo,estado,fecha_compra"+
                " FROM public.ups WHERE idups=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, upss));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                ups = new clsUps();
                ups.setIdequipo(crudEquipo.findbyId(cres.getInt("idequipo")));
                ups.setSerie(cres.getString("serie"));
                ups.setMarca(cres.getString("marca"));
                ups.setModelo(cres.getString("modelo"));
                ups.setEstado(cres.getString("estado"));
                ups.setFecha_compra(cres.getString("fecha_compra"));
                ups.setIdups(cres.getInt("idups"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ups;
    }
}

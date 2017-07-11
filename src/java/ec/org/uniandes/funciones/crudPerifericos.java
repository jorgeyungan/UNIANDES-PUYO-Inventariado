package ec.org.uniandes.funciones;

import ec.org.uniandes.accesodatos.AccesoDatos;
import ec.org.uniandes.accesodatos.ConjuntoResultado;
import ec.org.uniandes.accesodatos.Parametro;
import ec.org.uniandes.entidades.clsPerifericos;
import java.util.ArrayList;



public class crudPerifericos {

    public static boolean save(clsPerifericos periferico){
        boolean resultado = false;
        String sql = "INSERT INTO public.perifericos(idequipo,serie,nombre,modelo,marca,estado,fecha_compra)"
                + " VALUES(?,?,?,?,?,?,?)";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, periferico.getIdequipo().getIdequipo()));
        lstPar.add(new Parametro(2, periferico.getSerie()));
        lstPar.add(new Parametro(3, periferico.getNombre()));
        lstPar.add(new Parametro(4, periferico.getModelo()));
        lstPar.add(new Parametro(5, periferico.getMarca()));
        lstPar.add(new Parametro(6, periferico.getEstado()));
        lstPar.add(new Parametro(7, periferico.getFechacompra()));
        try {
            resultado = AccesoDatos.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }
    
    public static boolean delete(clsPerifericos periderico) {
        boolean res=false;
        String sql = "DELETE FROM public.perifericos WHERE idperifericos=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1,periderico.getIdperifericos()));
        try {
            res= AccesoDatos.ejecutaComando(sql, lstPar);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        return res;
    }

    public static boolean update(clsPerifericos periferico) {
        boolean res = false;
        String sql = "UPDATE public.perifericos " +
                "SET serie=?,nombre=?,modelo=?,marca=?,estado=?,fecha_compra=?"+ 
                "WHERE idperifericos=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();  
//        lstPar.add(new Parametro(1, periferico.getIdequipo()));
        lstPar.add(new Parametro(2, periferico.getSerie()));
        lstPar.add(new Parametro(3, periferico.getNombre()));
        lstPar.add(new Parametro(4, periferico.getModelo()));
        lstPar.add(new Parametro(5, periferico.getMarca()));
        lstPar.add(new Parametro(6, periferico.getEstado()));
        lstPar.add(new Parametro(7, periferico.getFechacompra()));
        try{
            res= AccesoDatos.ejecutaComando(sql, lstPar);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            }
        return res;
    }

    public static ArrayList<clsPerifericos> findbyAll() {
        ArrayList<clsPerifericos> listado = new ArrayList<>();
        String sql = "SELECT idperifericos,idequipo,serie,nombre,modelo,marca,estado,fecha_compra"+
                " FROM public.perifericos";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsPerifericos periferico = null;
            while (cres.next())
            {
                periferico = new clsPerifericos();
                periferico.setIdperifericos(cres.getInt("idperifericos"));
                periferico.setIdequipo(crudEquipo.findbyId(cres.getInt("idequipo")));
                periferico.setSerie(cres.getString("serie"));
                periferico.setNombre(cres.getString("nombre"));
                periferico.setModelo(cres.getString("modelo"));                
                periferico.setMarca(cres.getString("marca"));
                periferico.setEstado(cres.getString("estado"));
                periferico.setFechacompra(cres.getString("fecha_compra"));
                listado.add((periferico));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listado;
    }

    public static clsPerifericos findbyId(clsPerifericos perifericos) {
        clsPerifericos periferico = null;
        String sql = "SELECT idperifericos,idequipo,serie,nombre,modelo,marca,estado,fecha_compra"+
                " FROM public.perifericos WHERE idperifericos=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, perifericos.getIdperifericos()));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                periferico = new clsPerifericos();
                periferico.setIdperifericos(cres.getInt("idperifericos"));
                periferico.setIdequipo(crudEquipo.findbyId(cres.getInt("idequipo")));
                periferico.setSerie(cres.getString("serie"));
                periferico.setNombre(cres.getString("nombre"));
                periferico.setModelo(cres.getString("modelo"));                
                periferico.setMarca(cres.getString("marca"));
                periferico.setEstado(cres.getString("estado"));
                periferico.setFechacompra(cres.getString("fecha_compra"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return periferico;
    }
    public static clsPerifericos findbyId(int perifericos) {
        clsPerifericos periferico = null;
        String sql = "SELECT idperifericos,idequipo,serie,nombre,modelo,marca,estado,fecha_compra"+
                " FROM public.perifericos WHERE idperifericos=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, perifericos));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                periferico = new clsPerifericos();
                periferico.setIdperifericos(cres.getInt("idperifericos"));
                periferico.setIdequipo(crudEquipo.findbyId(cres.getInt("idequipo")));
                periferico.setSerie(cres.getString("serie"));
                periferico.setNombre(cres.getString("nombre"));
                periferico.setModelo(cres.getString("modelo"));                
                periferico.setMarca(cres.getString("marca"));
                periferico.setEstado(cres.getString("estado"));
                periferico.setFechacompra(cres.getString("fecha_compra"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return periferico;
    }
}

package ec.org.uniandes.funciones;

import ec.org.uniandes.accesodatos.AccesoDatos;
import ec.org.uniandes.accesodatos.ConjuntoResultado;
import ec.org.uniandes.accesodatos.Parametro;
import ec.org.uniandes.entidades.clsImpresora;
import java.util.ArrayList;



public class crudImpresora {

    public static boolean save(clsImpresora impresora){
        boolean resultado = false;
        String sql = "INSERT INTO public.impresora(serie,marca,modelo,estado,tipo,fecha_compra)"
                + " VALUES(?,?,?,?,?,?)";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, impresora.getSerie()));
        lstPar.add(new Parametro(2, impresora.getMarca()));
        lstPar.add(new Parametro(3, impresora.getModelo()));
        lstPar.add(new Parametro(4, impresora.getEstado()));
        lstPar.add(new Parametro(5, impresora.getTipo()));
        lstPar.add(new Parametro(6, impresora.getFechacompra()));
        try {
            resultado = AccesoDatos.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }
    
    public static boolean delete(clsImpresora impresora) {
        boolean res=false;
        String sql = "DELETE FROM public.impresora WHERE idimpresora=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1,impresora.getIdimpresora()));
        try {
            res= AccesoDatos.ejecutaComando(sql, lstPar);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        return res;
    }

    public static boolean update(clsImpresora impresora) {
        boolean res = false;
        String sql = "UPDATE public.impresora " +
                "SET serie=?,marca=?,modelo=?,estado=?,tipo=?,fecha_compra=?"+ 
                " WHERE idimpresora=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();  
        lstPar.add(new Parametro(1, impresora.getSerie()));
        lstPar.add(new Parametro(2, impresora.getMarca()));
        lstPar.add(new Parametro(3, impresora.getModelo()));
        lstPar.add(new Parametro(4, impresora.getEstado()));
        lstPar.add(new Parametro(5, impresora.getTipo()));
        lstPar.add(new Parametro(6, impresora.getFechacompra()));
        try{
            res= AccesoDatos.ejecutaComando(sql, lstPar);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            }
        return res;
    }

    public static ArrayList<clsImpresora> findbyAll() {
        ArrayList<clsImpresora> listado = new ArrayList<>();
        String sql = "SELECT idimpresora,serie,marca,modelo,estado,tipo,fecha_compra "+
                "FROM public.impresora";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsImpresora impresora = null;
            while (cres.next())
            {
                impresora = new clsImpresora();
                impresora.setIdimpresora(cres.getInt("idimpresora"));
                impresora.setSerie(cres.getString("serie"));
                impresora.setMarca(cres.getString("marca"));
                impresora.setModelo(cres.getString("modelo"));
                impresora.setEstado(cres.getString("estado"));
                impresora.setTipo(cres.getString("tipo"));
                impresora.setFechacompra(cres.getString("fecha_compra"));
                listado.add((impresora));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listado;
    }

    public static clsImpresora findbyId(clsImpresora impresoras) {
        clsImpresora impresora = null;
        String sql = "SELECT idimpresora,serie,marca,modelo,estado,tipo,fecha_compra "+
                "FROM public.impresora WHERE idimpresora=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, impresoras.getIdimpresora()));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                impresora = new clsImpresora();
                impresora.setIdimpresora(cres.getInt("idimpresora"));
                impresora.setSerie(cres.getString("serie"));
                impresora.setMarca(cres.getString("marca"));
                impresora.setModelo(cres.getString("modelo"));
                impresora.setEstado(cres.getString("estado"));
                impresora.setTipo(cres.getString("tipo"));
                impresora.setFechacompra(cres.getString("fecha_compra"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return impresora;
    }
     public static clsImpresora findbyId(int impresoras) {
        clsImpresora impresora = null;
        String sql = "SELECT idimpresora,serie,marca,modelo,estado,tipo,fecha_compra "+
                "FROM public.impresora WHERE idimpresora=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, impresoras));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                impresora = new clsImpresora();
                impresora.setIdimpresora(cres.getInt("idimpresora"));
                impresora.setSerie(cres.getString("serie"));
                impresora.setMarca(cres.getString("marca"));
                impresora.setModelo(cres.getString("modelo"));
                impresora.setEstado(cres.getString("estado"));
                impresora.setTipo(cres.getString("tipo"));
                impresora.setFechacompra(cres.getString("fecha_compra"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return impresora;
    }
    
}

package ec.org.uniandes.funciones;

import ec.org.uniandes.accesodatos.AccesoDatos;
import ec.org.uniandes.accesodatos.ConjuntoResultado;
import ec.org.uniandes.accesodatos.Parametro;
import ec.org.uniandes.entidades.clsCategoria;
import java.util.ArrayList;



public class crudCategoria {

//    static clsCliente findbyId(String string) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    public static boolean save(clsCategoria categoria){
        boolean resultado = false;
        String sql = "INSERT INTO public.categoria(nombre,descripcion)"
                + " VALUES(?,?)";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, categoria.getNombre()));
        lstPar.add(new Parametro(2, categoria.getDescripcion()));
        try {
            resultado = AccesoDatos.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }
    
    public static boolean delete(clsCategoria categoria) {
        boolean res=false;
        String sql = "DELETE FROM public.categoria WHERE idcategoria=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1,categoria.getIdcategoria()));
        try {
            res= AccesoDatos.ejecutaComando(sql, lstPar);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        return res;
    }

    public static boolean update(clsCategoria categoria) {
        boolean res = false;
        String sql = "UPDATE public.categoria " +
                "SET nombre=?,descripcion=? " + 
                "WHERE idcategoria=?";
        ArrayList<Parametro> lstPar = new ArrayList<>(); 
        lstPar.add(new Parametro(1, categoria.getNombre()));
        lstPar.add(new Parametro(2, categoria.getDescripcion()));
        lstPar.add(new Parametro(3, categoria.getIdcategoria())); 
        try{
            res= AccesoDatos.ejecutaComando(sql, lstPar);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            }
        return res;
    }

    public static ArrayList<clsCategoria> findbyAll() {
        ArrayList<clsCategoria> listado = new ArrayList<>();
        String sql = "SELECT idcategoria,nombre,descripcion "+
                "FROM public.categoria";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsCategoria cate = null;
            while (cres.next())
            {
                cate = new clsCategoria();
                cate.setIdcategoria(cres.getInt("idcategoria"));
                cate.setNombre(cres.getString("nombre"));
                cate.setDescripcion(cres.getString("descripcion"));
                listado.add((cate));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listado;
    }

    public static clsCategoria findbyId(clsCategoria categoria) {
        clsCategoria cate = null;
        String sql = "SELECT idcategoria,nombre,descripcion "+
                "FROM public.categoria WHERE idcategoria=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, categoria.getIdcategoria()));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                cate = new clsCategoria();
                cate.setIdcategoria(cres.getInt("idcategoria"));
                cate.setNombre(cres.getString("nombre"));
                cate.setDescripcion(cres.getString("descripcion"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cate;
    }public static clsCategoria findbyId(int categoria) {
        clsCategoria cate = null;
        String sql = "SELECT idcategoria,nombre,descripcion "+
                "FROM public.categoria WHERE idcategoria=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, categoria));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                cate = new clsCategoria();
                cate.setIdcategoria(cres.getInt("idcategoria"));
                cate.setNombre(cres.getString("nombre"));
                cate.setDescripcion(cres.getString("descripcion"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cate;
    }
    
    
}

package ec.org.uniandes.funciones;

import ec.org.uniandes.accesodatos.AccesoDatos;
import ec.org.uniandes.accesodatos.ConjuntoResultado;
import ec.org.uniandes.accesodatos.Parametro;
import ec.org.uniandes.entidades.clsLogin;
import java.util.ArrayList;



public class crudUsuariosistema {

//    static clsCliente findbyId(String string) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    public static boolean save(clsLogin sistema){
        boolean resultado = false;
        String sql = "INSERT INTO public.usuariosistema(usuario,contraseña,tipo) VALUES(?,?,?)";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, sistema.getUsuario()));
        lstPar.add(new Parametro(2, sistema.getContraseña()));
        lstPar.add(new Parametro(3, sistema.getTipo()));
        try {
            resultado = AccesoDatos.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }
    
    public static boolean delete(clsLogin sistema) {
        boolean res=false;
        String sql = "DELETE FROM public.usuariosistema WHERE idusuariosistema=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1,sistema.getIdusuariosistema()));
        try {
            res= AccesoDatos.ejecutaComando(sql, lstPar);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        return res;
    }

    public static boolean update(clsLogin sistema) {
        boolean res = false;
        String sql = "UPDATE public.usuariosistema "
                + "SET usuario=?,contraseña=?,tipo=? "
                + "WHERE idusuariosistema=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();        
        lstPar.add(new Parametro(1, sistema.getUsuario()));
        lstPar.add(new Parametro(2, sistema.getContraseña()));
        lstPar.add(new Parametro(3, sistema.getTipo()));
        try{
            res= AccesoDatos.ejecutaComando(sql, lstPar);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            }
        return res;
    }

    public static ArrayList<clsLogin> findbyAll() {
        ArrayList<clsLogin> listado = new ArrayList<>();
        String sql = "SELECT idusuariosistema,usuario,contraseña,tipo "
                + "FROM public.usuariosistema";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsLogin usuario = null;
            while (cres.next())
            {
                usuario = new clsLogin();
                usuario.setIdusuariosistema(cres.getInt("idusuariosistema"));
                usuario.setUsuario(cres.getString("cedula"));
                usuario.setContraseña(cres.getString("nombre"));
                usuario.setTipo(cres.getString("tipo"));
                listado.add((usuario));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listado;
    }

    public static clsLogin findbyId(clsLogin sistema) {
        clsLogin usuario = null;
        String sql = "SELECT idusuariosistema,usuario,contraseña,tipo "
                + "FROM public.usuariosistema WHERE idusuariosistema=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, sistema.getIdusuariosistema()));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                usuario = new clsLogin();
                usuario.setIdusuariosistema(cres.getInt("idusuariosistema"));
                usuario.setUsuario(cres.getString("cedula"));
                usuario.setContraseña(cres.getString("nombre"));
                usuario.setTipo(cres.getString("tipo"));           
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return usuario;
    }
    
    public static clsLogin findbyId(int sistema) {
        clsLogin usuario = null;
        String sql = "SELECT idusuariosistema,usuario,contraseña,tipo "
                + "FROM public.usuariosistema WHERE idusuariosistema=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, sistema));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                usuario = new clsLogin();
                usuario.setIdusuariosistema(cres.getInt("idusuariosistema"));
                usuario.setUsuario(cres.getString("cedula"));
                usuario.setContraseña(cres.getString("nombre"));
                usuario.setTipo(cres.getString("tipo"));           
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return usuario;
    }
}

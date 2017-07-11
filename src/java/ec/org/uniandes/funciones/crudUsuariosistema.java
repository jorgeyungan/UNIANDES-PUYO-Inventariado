package ec.org.uniandes.funciones;

import ec.org.uniandes.accesodatos.AccesoDatos;
import ec.org.uniandes.accesodatos.ConjuntoResultado;
import ec.org.uniandes.accesodatos.Parametro;
import ec.org.uniandes.entidades.clsUsuariosistema;
import java.util.ArrayList;



public class crudUsuariosistema {

//    static clsCliente findbyId(String string) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    public static boolean save(clsUsuariosistema sistema){
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
    
    public static boolean delete(clsUsuariosistema sistema) {
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

    public static boolean update(clsUsuariosistema sistema) {
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

    public static ArrayList<clsUsuariosistema> findbyAll() {
        ArrayList<clsUsuariosistema> listado = new ArrayList<>();
        String sql = "SELECT idusuariosistema,usuario,contraseña,tipo "
                + "FROM public.usuariosistema";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsUsuariosistema usuario = null;
            while (cres.next())
            {
                usuario = new clsUsuariosistema();
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

    public static clsUsuariosistema findbyId(clsUsuariosistema sistema) {
        clsUsuariosistema usuario = null;
        String sql = "SELECT idusuariosistema,usuario,contraseña,tipo "
                + "FROM public.usuariosistema WHERE idusuariosistema=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, sistema.getIdusuariosistema()));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                usuario = new clsUsuariosistema();
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
    
    public static clsUsuariosistema findbyId(int sistema) {
        clsUsuariosistema usuario = null;
        String sql = "SELECT idusuariosistema,usuario,contraseña,tipo "
                + "FROM public.usuariosistema WHERE idusuariosistema=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, sistema));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                usuario = new clsUsuariosistema();
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

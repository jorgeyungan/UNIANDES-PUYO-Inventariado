package ec.org.uniandes.funciones;

import ec.org.uniandes.accesodatos.AccesoDatos;
import ec.org.uniandes.accesodatos.ConjuntoResultado;
import ec.org.uniandes.accesodatos.Parametro;
import ec.org.uniandes.entidades.clsUsuario;
import java.util.ArrayList;



public class crudUsuario {

//    static clsCliente findbyId(String string) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    public static boolean save(clsUsuario usuario){
        boolean resultado = false;
        String sql = "INSERT INTO public.usuario(cedula,nombre,apellido,cargo,telefono,tipo) VALUES(?,?,?,?,?,?)";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, usuario.getCedula()));
        lstPar.add(new Parametro(2, usuario.getNombre()));
        lstPar.add(new Parametro(3, usuario.getApellido()));
        lstPar.add(new Parametro(4, usuario.getCargo())); 
        lstPar.add(new Parametro(5, usuario.getTelefono()));
        lstPar.add(new Parametro(6, usuario.getTipo()));
        try {
            resultado = AccesoDatos.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }
    
    public static boolean delete(clsUsuario usuario) {
        boolean res=false;
        String sql = "DELETE FROM public.usuario WHERE id_usuario=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1,usuario.getId_usuario()));
        try {
            res= AccesoDatos.ejecutaComando(sql, lstPar);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        return res;
    }

    public static boolean update(clsUsuario usuario) {
        boolean res = false;
        String sql = "UPDATE public.usuario SET cedula=?,nombre=?,apellido=?,cargo=?,telefono=?,tipo=? WHERE id_usuario=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();        
        lstPar.add(new Parametro(1, usuario.getCedula()));
        lstPar.add(new Parametro(2, usuario.getNombre()));
        lstPar.add(new Parametro(3, usuario.getApellido()));
        lstPar.add(new Parametro(4, usuario.getCargo())); 
        lstPar.add(new Parametro(5, usuario.getTelefono()));
        lstPar.add(new Parametro(6, usuario.getTipo()));
        lstPar.add(new Parametro(7, usuario.getId_usuario()));
        try{
            res= AccesoDatos.ejecutaComando(sql, lstPar);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            }
        return res;
    }

    public static ArrayList<clsUsuario> findbyAll() {
        ArrayList<clsUsuario> listado = new ArrayList<>();
        String sql = "SELECT id_usuario,cedula,nombre,apellido,cargo,telefono,tipo "
                + "FROM public.usuario";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsUsuario usuario = null;
            while (cres.next())
            {
                usuario = new clsUsuario();
                usuario.setId_usuario(cres.getInt("id_usuario"));
                usuario.setCedula(cres.getString("cedula"));
                usuario.setNombre(cres.getString("nombre"));
                usuario.setApellido(cres.getString("apellido"));
                usuario.setCargo(cres.getString("cargo"));
                usuario.setTelefono(cres.getString("telefono"));
                usuario.setTipo(cres.getString("tipo"));
                listado.add((usuario));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listado;
    }

    public static clsUsuario findbyId(clsUsuario usu) {
        clsUsuario usuario = null;
        String sql = "SELECT id_usuario,cedula,nombre,apellido,cargo,telefono,tipo FROM public.usuario WHERE id_usuario=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, usu.getId_usuario()));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                usuario = new clsUsuario();
                usuario.setId_usuario(cres.getInt("id_usuario"));
                usuario.setCedula(cres.getString("cedula"));
                usuario.setNombre(cres.getString("nombre"));
                usuario.setApellido(cres.getString("apellido"));
                usuario.setCargo(cres.getString("cargo"));
                usuario.setTelefono(cres.getString("telefono"));
                usuario.setTipo(cres.getString("tipo"));           
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return usuario;
    }
    public static clsUsuario findbyId(int usu) {
        clsUsuario usuario = null;
        String sql = "SELECT id_usuario,cedula,nombre,apellido,cargo,telefono,tipo FROM public.usuario WHERE id_usuario=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, usu));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                usuario = new clsUsuario();
                usuario.setId_usuario(cres.getInt("id_usuario"));
                usuario.setCedula(cres.getString("cedula"));
                usuario.setNombre(cres.getString("nombre"));
                usuario.setApellido(cres.getString("apellido"));
                usuario.setCargo(cres.getString("cargo"));
                usuario.setTelefono(cres.getString("telefono"));
                usuario.setTipo(cres.getString("tipo"));           
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return usuario;
    }
    
}

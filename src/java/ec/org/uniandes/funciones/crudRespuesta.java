package ec.org.uniandes.funciones;


import ec.org.uniandes.accesodatos.AccesoDatos;
import ec.org.uniandes.accesodatos.Parametro;
import ec.org.uniandes.entidades.clsRespuesta;
import java.util.ArrayList;



public class crudRespuesta {

    public static boolean save(clsRespuesta mantenimiento){
        boolean resultado = false;
        String sql = "INSERT INTO public.respuesta(idmantenimiento,idusuario,fecha,informe)"
                + " VALUES (?,?,?,?)";
        ArrayList<Parametro> lstPar = new ArrayList<>();        
        lstPar.add(new Parametro(1, mantenimiento.getIdmantenimiento().getIdmantenimiento()));
        lstPar.add(new Parametro(2, mantenimiento.getIdusuario().getId_usuario()));
        lstPar.add(new Parametro(3, mantenimiento.getFecha()));
        lstPar.add(new Parametro(4, mantenimiento.getInforme()));
        try {
            resultado = AccesoDatos.ejecutaComando(sql, lstPar);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }
    
    public  boolean delete(clsRespuesta mantenimiento) {
        boolean res=false;
        String sql = "DELETE FROM public.mantenimiento WHERE idmantenimiento=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1,mantenimiento.getIdmantenimiento()));
        try {
            res= AccesoDatos.ejecutaComando(sql, lstPar);
            
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        return res;
    }

    public  boolean update(clsRespuesta mantenimiento) {
        boolean res = false;
        String sql = "UPDATE public.mantenimiento " +
                "SET idmantenimiento=?,idusuario=?,fecha=?,informe=?" + 
                "WHERE idrespuesta=?";
        ArrayList<Parametro> lstPar = new ArrayList<>(); 
        lstPar.add(new Parametro(1, mantenimiento.getIdmantenimiento().getIdmantenimiento()));
        lstPar.add(new Parametro(2, mantenimiento.getIdusuario().getId_usuario()));
        lstPar.add(new Parametro(3, mantenimiento.getFecha()));
        lstPar.add(new Parametro(4, mantenimiento.getInforme()));
        lstPar.add(new Parametro(5, mantenimiento.getIdrespuesta())); 
        
        try{
            res= AccesoDatos.ejecutaComando(sql, lstPar);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            }
        return res;
    }
}

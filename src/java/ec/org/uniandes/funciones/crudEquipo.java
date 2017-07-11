package ec.org.uniandes.funciones;

import ec.org.uniandes.accesodatos.AccesoDatos;
import ec.org.uniandes.accesodatos.ConjuntoResultado;
import ec.org.uniandes.accesodatos.Parametro;
import ec.org.uniandes.entidades.clsEquipo;
import java.util.ArrayList;



public class crudEquipo {

//    static clsCliente findbyId(String string) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    public static boolean save(clsEquipo pc){
        boolean resultado = false;
        String sql = "INSERT INTO public.equipo(idubicacion,codigo,marca,tipo,procesador,motherboard,"
                + "año_fabrica,disco_duro,ram,vida_util,card_rw,acceso_internet,unidad_optica,"
                + "estado,fecha_compra,numero_puertos,tipo_puertos,administrable)"
                + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, pc.getIdubicacion().getIdubicacion()));
        lstPar.add(new Parametro(2, pc.getCodigo()));
        lstPar.add(new Parametro(3, pc.getMarca()));
        lstPar.add(new Parametro(4, pc.getTipo()));
        lstPar.add(new Parametro(5, pc.getProcesador()));
        lstPar.add(new Parametro(6, pc.getMotherboard()));
        lstPar.add(new Parametro(7, pc.getAño_fabrica()));
        lstPar.add(new Parametro(8, pc.getDisco_duro()));
        lstPar.add(new Parametro(9, pc.getRam()));
        lstPar.add(new Parametro(10, pc.getVida_util()));
        lstPar.add(new Parametro(11, pc.getCard_rw()));
        lstPar.add(new Parametro(12, pc.getAcceso_internet()));
        lstPar.add(new Parametro(13, pc.getUnidad_optica()));
        lstPar.add(new Parametro(14, pc.getEstado()));
        lstPar.add(new Parametro(15, pc.getFecha_compra()));
        lstPar.add(new Parametro(16, pc.getNumero_puertos()));
        lstPar.add(new Parametro(17, pc.getTipo_puertos()));
        lstPar.add(new Parametro(18, pc.getAdministrable()));
        try {
            resultado = AccesoDatos.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }
    
    public static boolean delete(clsEquipo pc) {
        boolean res=false;
        String sql = "DELETE FROM public.equipo WHERE idequipo=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1,pc.getIdequipo()));
        try {
            res= AccesoDatos.ejecutaComando(sql, lstPar);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        return res;
    }

    public static boolean update(clsEquipo pc) {
        boolean res = false;
        String sql = "UPDATE public.equipo " +
                "SET idubicacion,codigo=?,marca=?,tipo=?,procesador=?,motherboard=?,"
                + "año_fabrica=?,disco_duro=?,ram=?,vida_util=?,card_rw=?,acceso_internet=?,unidad_optica=?,"
                + "estado=?,fecha_compra=?,numero_puertos=?,tipo_puertos=?,administrable=?"
                + "WHERE idequipo=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();        
        
        lstPar.add(new Parametro(1, pc.getIdubicacion()));
        lstPar.add(new Parametro(2, pc.getCodigo()));
        lstPar.add(new Parametro(3, pc.getMarca()));
        lstPar.add(new Parametro(4, pc.getTipo()));
        lstPar.add(new Parametro(5, pc.getProcesador()));
        lstPar.add(new Parametro(6, pc.getMotherboard()));
        lstPar.add(new Parametro(7, pc.getAño_fabrica()));
        lstPar.add(new Parametro(8, pc.getDisco_duro()));
        lstPar.add(new Parametro(9, pc.getRam()));
        lstPar.add(new Parametro(10, pc.getVida_util()));
        lstPar.add(new Parametro(11, pc.getCard_rw()));
        lstPar.add(new Parametro(12, pc.getAcceso_internet()));
        lstPar.add(new Parametro(13, pc.getUnidad_optica()));
        lstPar.add(new Parametro(14, pc.getEstado()));
        lstPar.add(new Parametro(15, pc.getFecha_compra()));
        lstPar.add(new Parametro(16, pc.getNumero_puertos()));
        lstPar.add(new Parametro(17, pc.getTipo_puertos()));
        lstPar.add(new Parametro(18, pc.getAdministrable()));
        lstPar.add(new Parametro(19, pc.getIdequipo()));
        try{
            res= AccesoDatos.ejecutaComando(sql, lstPar);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            }
        return res;
    }

    public static ArrayList<clsEquipo> findbyAll() {
        ArrayList<clsEquipo> listado = new ArrayList<>();
        String sql = "SELECT idequipo,idubicacion,codigo,marca,tipo,procesador,motherboard,"
                + "año_fabrica,disco_duro,ram,vida_util,card_rw,acceso_internet,unidad_optica,"
                + "estado,fecha_compra,numero_puertos,tipo_puertos,administrable "
                + "FROM public.equipo";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsEquipo pcs = null;
            while (cres.next())
            {
                pcs = new clsEquipo();
                pcs.setIdequipo(cres.getInt("idequipo"));
                pcs.setIdubicacion(crudUbicacion.findbyId(cres.getInt("idubicacion")));
                pcs.setCodigo(cres.getString("codigo"));
                pcs.setMarca(cres.getString("marca"));
                pcs.setTipo(cres.getString("tipo"));
                pcs.setProcesador(cres.getString("procesador"));
                pcs.setMotherboard(cres.getString("motherboard"));
                pcs.setAño_fabrica(cres.getString("año_fabrica"));
                pcs.setDisco_duro(cres.getString("disco_duro"));
                pcs.setRam(cres.getString("ram"));
                pcs.setVida_util(cres.getString("vida_util"));
                pcs.setCard_rw(cres.getString("card_rw"));
                pcs.setAcceso_internet(cres.getString("acceso_internet"));
                pcs.setUnidad_optica(cres.getString("unidad_optica"));
                pcs.setEstado(cres.getString("estado"));
                pcs.setFecha_compra(cres.getString("fecha_compra"));
                pcs.setNumero_puertos(cres.getInt("numero_puertos"));
                pcs.setTipo_puertos(cres.getString("tipo_puertos"));
                pcs.setAdministrable(cres.getString("administrable"));
                listado.add((pcs));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listado;
    }

    public static clsEquipo findbyId(clsEquipo equipo) {
        clsEquipo equipos = null;
        String sql = "SELECT idequipo,idubicacion,codigo,marca,tipo,procesador,motherboard,"
                + "año_fabrica,disco_duro,ram,vida_util,card_rw,acceso_internet,unidad_optica,"
                + "estado,fecha_compra,numero_puertos,tipo_puertos,administrable"
                + " FROM public.equipo WHERE idequipo=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, equipo.getIdequipo()));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                equipos = new clsEquipo();
                equipos.setIdequipo(cres.getInt("idequipo"));
                equipos.setIdubicacion(crudUbicacion.findbyId(cres.getInt("idubicacion")));
                equipos.setCodigo(cres.getString("codigo"));
                equipos.setMarca(cres.getString("marca"));
                equipos.setTipo(cres.getString("tipo"));
                equipos.setProcesador(cres.getString("procesador"));
                equipos.setMotherboard(cres.getString("motherboard"));
                equipos.setAño_fabrica(cres.getString("año_fabrica"));
                equipos.setDisco_duro(cres.getString("disco_duro"));
                equipos.setRam(cres.getString("ram"));
                equipos.setVida_util(cres.getString("vida_util"));
                equipos.setCard_rw(cres.getString("card_rw"));
                equipos.setAcceso_internet(cres.getString("acceso_internet"));
                equipos.setUnidad_optica(cres.getString("unidad_optica"));
                equipos.setEstado(cres.getString("estado"));
                equipos.setFecha_compra(cres.getString("fecha_compra"));
                equipos.setNumero_puertos(cres.getInt("numero_puertos"));
                equipos.setTipo_puertos(cres.getString("tipo_puertos"));
                equipos.setAdministrable(cres.getString("administrable"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return equipos;
    }
    
    public static clsEquipo findbyId(int equipo) {
        clsEquipo equipos = null;
        String sql = "SELECT idequipo,idubicacion,codigo,marca,tipo,procesador,motherboard,"
                + "año_fabrica,disco_duro,ram,vida_util,card_rw,acceso_internet,unidad_optica,"
                + "estado,fecha_compra,numero_puertos,tipo_puertos,administrable"
                + " FROM public.equipo WHERE idequipo=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, equipo));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                equipos = new clsEquipo();
                equipos.setIdequipo(cres.getInt("idequipo"));
                equipos.setIdubicacion(crudUbicacion.findbyId(cres.getInt("idubicacion")));
                equipos.setCodigo(cres.getString("codigo"));
                equipos.setMarca(cres.getString("marca"));
                equipos.setTipo(cres.getString("tipo"));
                equipos.setProcesador(cres.getString("procesador"));
                equipos.setMotherboard(cres.getString("motherboard"));
                equipos.setAño_fabrica(cres.getString("año_fabrica"));
                equipos.setDisco_duro(cres.getString("disco_duro"));
                equipos.setRam(cres.getString("ram"));
                equipos.setVida_util(cres.getString("vida_util"));
                equipos.setCard_rw(cres.getString("card_rw"));
                equipos.setAcceso_internet(cres.getString("acceso_internet"));
                equipos.setUnidad_optica(cres.getString("unidad_optica"));
                equipos.setEstado(cres.getString("estado"));
                equipos.setFecha_compra(cres.getString("fecha_compra"));
                equipos.setNumero_puertos(cres.getInt("numero_puertos"));
                equipos.setTipo_puertos(cres.getString("tipo_puertos"));
                equipos.setAdministrable(cres.getString("administrable"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return equipos;
    }
}

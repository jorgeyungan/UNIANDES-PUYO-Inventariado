package ec.org.uniandes.funciones;
//
//import ec.org.uniandes.accesodatos.AccesoDatos;
//import ec.org.uniandes.accesodatos.ConjuntoResultado;
//import ec.org.uniandes.accesodatos.Parametro;
//import ec.org.uniandes.entidades.clsSoftware;
//import java.util.ArrayList;
//
//
//
//public class crudSoftware {
//
//    public static boolean save(clsSoftware software){
//        boolean resultado = false;
//        String sql = "INSERT INTO public.software(nombre,compania,version,requisitos,licencia,fecha_compra,idcategoria)"
//                + " VALUES(?,?,?,?,?,?,?)";
//        ArrayList<Parametro> lstPar = new ArrayList<>();
//        lstPar.add(new Parametro(1, software.getIdcategoria()));
//        lstPar.add(new Parametro(2, software.getNombre()));        
//        lstPar.add(new Parametro(3, software.getCompania()));
//        lstPar.add(new Parametro(4, software.getVersion()));
//        lstPar.add(new Parametro(5, software.getRequisitos()));
//        lstPar.add(new Parametro(6, software.getLicencia()));
//        lstPar.add(new Parametro(7, software.getFecha_compra()));
//        try {
//            resultado = AccesoDatos.ejecutaComando(sql, lstPar);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        return resultado;
//    }
//    
//    public static boolean delete(clsSoftware software) {
//        boolean res=false;
//        String sql = "DELETE FROM public.software WHERE idsoftware=?";
//        ArrayList<Parametro> lstPar = new ArrayList<>();
//        lstPar.add(new Parametro(1,software.getIdsoftware()));
//        try {
//            res= AccesoDatos.ejecutaComando(sql, lstPar);
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        return res;
//    }
//
//    public static boolean update(clsSoftware software) {
//        boolean res = false;
//        String sql = "UPDATE public.software " +
//                "SET nombre=?,compania=?,version=?,requisitos=?,licencia=?,fecha_compra=?,idcategoria=?"+ 
//                "WHERE idsoftware=?";
//        ArrayList<Parametro> lstPar = new ArrayList<>();  
//        lstPar.add(new Parametro(1, software.getIdcategoria()));
//        lstPar.add(new Parametro(2, software.getNombre()));        
//        lstPar.add(new Parametro(3, software.getCompania()));
//        lstPar.add(new Parametro(4, software.getVersion()));
//        lstPar.add(new Parametro(5, software.getRequisitos()));
//        lstPar.add(new Parametro(6, software.getLicencia()));
//        lstPar.add(new Parametro(7, software.getFecha_compra()));;
//        try{
//            res= AccesoDatos.ejecutaComando(sql, lstPar);
//        }catch (Exception e) {
//            System.out.println(e.getMessage());
//            }
//        return res;
//    }
//
//    public static ArrayList<clsSoftware> findbyAll() {
//        ArrayList<clsSoftware> listado = new ArrayList<>();
//        String sql = "SELECT idsoftware,nombre,compania,version,requisitos,licencia,fecha_compra,idcategoria"+
//                " FROM public.software";
//        ArrayList<Parametro> lstPar = new ArrayList<>();
//        try {
//            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
//            clsSoftware software = null;
//            while (cres.next())
//            {
//                software = new clsSoftware();
//                software.setIdsoftware(cres.getInt("idsoftware"));
//                software.setNombre(cres.getString("nombre"));
//                software.setCompania(cres.getString("compania"));
//                software.setVersion(cres.getString("version"));                
//                software.setRequisitos(cres.getString("requisitos"));
//                software.setLicencia(cres.getString("licencia"));
//                software.setFecha_compra(cres.getString("fecha_compra"));
//                listado.add((software));
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        return listado;
//    }
//
//    public static clsSoftware findbyId(clsSoftware softwares) {
//        clsSoftware software = null;
//        String sql = "SELECT idsoftware,nombre,compania,version,requisitos,licencia,fecha_compra,idcategoria"+
//                " FROM public.perifericos WHERE idsoftware=?";
//        ArrayList<Parametro> lstPar = new ArrayList<>();
//        lstPar.add(new Parametro(1, softwares.getIdsoftware()));
//        try {
//            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
//            while (cres.next()) {
//                software = new clsSoftware();
//                software.setIdsoftware(cres.getInt("idsoftware"));
//                software.setNombre(cres.getString("nombre"));
//                software.setCompania(cres.getString("compania"));
//                software.setVersion(cres.getString("version"));                
//                software.setRequisitos(cres.getString("requisitos"));
//                software.setLicencia(cres.getString("licencia"));
//                software.setFecha_compra(cres.getString("fecha_compra"));
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        return software;
//    }
//    public static clsSoftware findbyId(int softwares) {
//        clsSoftware software = null;
//        String sql = "SELECT idsoftware,nombre,compania,version,requisitos,licencia,fecha_compra,idcategoria"+
//                " FROM public.perifericos WHERE idsoftware=?";
//        ArrayList<Parametro> lstPar = new ArrayList<>();
//        lstPar.add(new Parametro(1, softwares));
//        try {
//            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
//            while (cres.next()) {
//                software = new clsSoftware();
//                software.setIdsoftware(cres.getInt("idsoftware"));
//                software.setNombre(cres.getString("nombre"));
//                software.setCompania(cres.getString("compania"));
//                software.setVersion(cres.getString("version"));                
//                software.setRequisitos(cres.getString("requisitos"));
//                software.setLicencia(cres.getString("licencia"));
//                software.setFecha_compra(cres.getString("fecha_compra"));
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        return software;
//    }
//}

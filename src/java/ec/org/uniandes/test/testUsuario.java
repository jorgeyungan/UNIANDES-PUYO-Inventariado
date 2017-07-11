
package ec.org.uniandes.test;

import ec.org.uniandes.entidades.clsCategoria;
import ec.org.uniandes.entidades.clsEquipo;
import ec.org.uniandes.entidades.clsPerifericos;
import ec.org.uniandes.entidades.clsSoftware;
import ec.org.uniandes.entidades.clsTargetasinternas;
import ec.org.uniandes.entidades.clsUbicacion;
import ec.org.uniandes.entidades.clsUps;
import ec.org.uniandes.entidades.clsUsuario;
import ec.org.uniandes.funciones.crudCategoria;
import ec.org.uniandes.funciones.crudEquipo;
import ec.org.uniandes.funciones.crudPerifericos;
import ec.org.uniandes.funciones.crudSoftware;
import ec.org.uniandes.funciones.crudTerjetasInternas;
import ec.org.uniandes.funciones.crudUbicacion;
import ec.org.uniandes.funciones.crudUps;
import ec.org.uniandes.funciones.crudUsuario;
import java.util.ArrayList;

public class testUsuario {
    public static void main(String[] args) {
        clsUsuario usu=new clsUsuario(1, null, null, null, null, null, null);
        clsUbicacion ub=new clsUbicacion(6, "centro"   , "tercer", "sistemas", "lab3", "estudiantes", usu);
//        crudUbicacion ubic=new crudUbicacion();
//        clsEquipo usu=new clsEquipo(8, ub, "9888", "dsds", "sdsds", "dsasd", "sdsd", "sdas", "sdasd", "dsdds", "sdsd", "asdasd", "sadsd", "sdasd", "sdasd", "1996-12-4", 0, "sasdsa", "si");
//        crudEquipo ud=new crudEquipo();
//        ud.save(usu);
        System.out.println("Prueba de clases");
//            System.out.println("=============================================");
//            System.out.println("contenido de la clase propietario");
//            System.out.println(ub.toString());
//            System.out.println("=============================================");
//            System.out.println("=============================================");
//            System.out.println("INSERTANDO");
//            if (crudUbicacion.save(ub)) {
//                System.out.println("Guardado");
//            }else{
//                System.out.println("error!!!!");
//            }
            System.out.println("Comprobando si hay datos");
            System.out.println(crudUbicacion.findbyId(ub).toString());
////            System.out.println("=============================================");
////            System.out.println("=============================================");
//    //        System.out.println("Eliminando");    
//        if (ud.delete(usu)) {
//            System.out.println("eliminado");
//        }else{
//            System.out.println("no se ha podido eliminar");
//        }
        ArrayList<clsEquipo> ubi = new ArrayList<>();
    ubi = crudEquipo.findbyAll();
    System.out.print(ubi.toString());
    
    }
    
            
}

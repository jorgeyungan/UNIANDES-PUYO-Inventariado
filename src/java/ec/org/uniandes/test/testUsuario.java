
package ec.org.uniandes.test;

import ec.org.uniandes.entidades.clsEquipo;
import ec.org.uniandes.entidades.clsEquipo;
import ec.org.uniandes.entidades.clsSoftware;
import ec.org.uniandes.entidades.clsUbicacion;
import ec.org.uniandes.entidades.clsUsuario;
import ec.org.uniandes.funciones.crudEquipo;
import java.util.ArrayList;
//import ec.org.uniandes.funciones.crudSoftware;
//import ec.org.uniandes.funciones.crudUbicacion;
//import ec.org.uniandes.funciones.crudUsuario;
//import java.util.ArrayList;

public class testUsuario {
    public static void main(String[] args) {
//        clsUsuario usu=new clsUsuario(1, null, null, null, null, null, null);
//        clsUbicacion ub=new clsUbicacion(6, "centro"   , "tercer", "sistemas", "lab3", "estudiantes", "s");
//        crudUbicacion ubic=new crudUbicacion();
//        clsEquipo equi=new clsEquipo(1, "1201", "hp", "pavilion g4", "destock", "12/01/2009", "12/02/2010", "bueno", "500 gb", "core i3", "en uso","uso estudiantil");
//        clsImpresora impresora=new clsImpresora(2, "1201", "hp", "pavilion g4", "Impresora", "12/01/2009", "12/02/2010", "bueno", "Inyeccion", "en uso","uso docente");
//        
//        ud.save(usu);
//        System.out.println("Prueba de clases");
//            System.out.println("=============================================");
//            System.out.println("contenido de la clase propietario");
//            System.out.println(impresora.toString());
//            System.out.println("=============================================");
//            System.out.println("=============================================");
//            System.out.println("INSERTANDO");
//            if (crudImpresora.save(impresora)) {
//                System.out.println("Guardado");
//            }else{
//                System.out.println("error!!!!");
//            }
//            System.out.println("Comprobando si hay datos");
//            System.out.println(crudImpresora.findbyId(impresora).toString());
//            System.out.println("=============================================");
//            System.out.println("=============================================");
//            System.out.println("Eliminando");    
//        if (ud.delete(usu)) {
//            System.out.println("eliminado");
//        }else{
//            System.out.println("no se ha podido eliminar");
//        }
//        ArrayList<clsImpresora> ubi = new ArrayList<>();
//    ubi = crudImpresora.findbyAll();
//    System.out.print(ubi.toString());
//    ArrayList<clsEquipo> ubi = new ArrayList<>();
//    ubi = crudEquipo.findAllimpresoras();
//    System.out.print(ubi.toString());
//    }
    ArrayList<clsEquipo> PC = new ArrayList<>();
    PC = crudEquipo.findAllimpresoras();
    System.out.print(PC.toString());
    }
    
            
}

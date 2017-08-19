package ec.org.uniandes.test;

import ec.org.uniandes.entidades.clsDetequiposoftware;
import ec.org.uniandes.entidades.clsDetubicacionequipo;
import ec.org.uniandes.entidades.clsDetubicacionusuario;
import ec.org.uniandes.entidades.clsEquipo;
import ec.org.uniandes.entidades.clsEquipo;
import ec.org.uniandes.entidades.clsMantenimiento;
import ec.org.uniandes.entidades.clsRespuesta;
import ec.org.uniandes.entidades.clsSoftware;
import ec.org.uniandes.entidades.clsUbicacion;
import ec.org.uniandes.entidades.clsUsuario;
import ec.org.uniandes.funciones.crudDetequiposoftware;
import ec.org.uniandes.funciones.crudDetubicacionequipo;
import ec.org.uniandes.funciones.crudDetubicacionusuario;
import ec.org.uniandes.funciones.crudEquipo;
import ec.org.uniandes.funciones.crudMantenimiento;
import ec.org.uniandes.funciones.crudRespuesta;
import ec.org.uniandes.funciones.crudSoftware;
import ec.org.uniandes.funciones.crudUbicacion;
import ec.org.uniandes.funciones.crudUsuario;
import java.util.ArrayList;
//import ec.org.uniandes.funciones.crudSoftware;
//import ec.org.uniandes.funciones.crudUbicacion;
//import ec.org.uniandes.funciones.crudUsuario;
//import java.util.ArrayList;

public class testUsuario {

    public static void main(String[] args) {
        clsUsuario usu = new clsUsuario(9, null, null, null, null, null, null,null,null);
//        clsUbicacion ub = new clsUbicacion(1, null, null, null, null, null);
//        crudUbicacion ubic=new crudUbicacion();
//clsMantenimiento m=new clsMantenimiento(1, "2016/02/02");
//clsEquipo equi=new clsEquipo(17, null, null, null, null, null, null, null, 0, null, null, null, null, null);
////        clsImpresora impresora=new clsImpresora(2, "1201", "hp", "pavilion g4", "Impresora", "12/01/2009", "12/02/2010", "bueno", "Inyeccion", "en uso","uso docente");
//clsSoftware sof=new clsSoftware(1, null, null, null, null, null, null);
////clsDetequipomantenimiento n=new clsDetequipomantenimiento(0, equi, m, "no enciende");
////crudDetequipomantenimiento.save(n);
//clsDetequiposoftware det = new clsDetequiposoftware(0, equi, sof, "2016/07/27");
//        crudDetequiposoftware.save(det);

//crudMantenimiento.saveman(m);
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
//        ArrayList<clsRespuesta> PC = new ArrayList<>();
//        PC = crudRespuesta.findtoasignacion();
//        System.out.print(PC.toString());
        clsMantenimiento q=new clsMantenimiento(49, null, null, null, null, null);
        clsRespuesta resp= new clsRespuesta(0, q, usu, "2017/08/18", "reparado");
        crudRespuesta.save(resp);
    }
//    
//            
}

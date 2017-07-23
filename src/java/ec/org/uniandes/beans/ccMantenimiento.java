package ec.org.uniandes.beans;

//import ec.org.uniandes.entidades.clsMantenimiento;
//import ec.org.uniandes.funciones.crudMantenimiento;
//import java.util.List;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ViewScoped;
//
//@ManagedBean
//@ViewScoped
//public class ccMantenimiento {
//
//    private clsMantenimiento newmantenimiento;
//    private clsMantenimiento selectedmantenimiento;
//    private List<clsMantenimiento> lista;
//    public ccMantenimiento() {
//        newmantenimiento=new clsMantenimiento();
//        cargardatos();
//    }
//    private void cargardatos(){
//        lista=crudMantenimiento.findbyAll();
//    }
//    public void insertar(){
//        if (crudMantenimiento.save(newmantenimiento)) {
//            newmantenimiento=new clsMantenimiento();
//            cargardatos();
//        } else {
//        }
//    }
//    public void actualziar(){
//        if (crudMantenimiento.update(selectedmantenimiento)) {
//            newmantenimiento=new clsMantenimiento();
//            cargardatos();
//        } else {
//        }
//    }
//    public void eliminar(){
//        if (crudMantenimiento.delete(selectedmantenimiento)) {
//            newmantenimiento=new clsMantenimiento();
//            cargardatos();
//        } else {
//        }
//    }
//
//    public clsMantenimiento getNewmantenimiento() {
//        return newmantenimiento;
//    }
//
//    public void setNewmantenimiento(clsMantenimiento newmantenimiento) {
//        this.newmantenimiento = newmantenimiento;
//    }
//
//    public clsMantenimiento getSelectedmantenimiento() {
//        return selectedmantenimiento;
//    }
//
//    public void setSelectedmantenimiento(clsMantenimiento selectedmantenimiento) {
//        this.selectedmantenimiento = selectedmantenimiento;
//    }
//
//    public List<clsMantenimiento> getLista() {
//        return lista;
//    }
//
//    public void setLista(List<clsMantenimiento> lista) {
//        this.lista = lista;
//    }
    
//}

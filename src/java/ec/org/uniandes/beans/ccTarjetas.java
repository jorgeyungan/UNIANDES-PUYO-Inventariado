package ec.org.uniandes.beans;
//
//import ec.org.uniandes.entidades.clsEquipo;
//import ec.org.uniandes.entidades.clsTargetasinternas;
//import ec.org.uniandes.funciones.crudTerjetasInternas;
//import java.util.List;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;
//
//@ManagedBean
//@RequestScoped
//public class ccTarjetas {
//
//    private clsTargetasinternas newTarjeta;
//    private clsTargetasinternas selectedTarjeta;
//    private List<clsTargetasinternas> lista;
//    private clsEquipo selectecequipo; 
//    
//    public ccTarjetas() {
//        newTarjeta=new clsTargetasinternas();
//        cargarDatos();
//    }
//    private void cargarDatos(){
//        lista=crudTerjetasInternas.findbyAll();
//    }
//    public void insertar(){
//        newTarjeta.setIdequipo(selectecequipo);
//        if (crudTerjetasInternas.save(newTarjeta)) {
//            newTarjeta=new clsTargetasinternas();
//            cargarDatos();            
//        } else {
//        }
//    }
//    public void eliminar(){
//        if (crudTerjetasInternas.delete(selectedTarjeta)) {
//            newTarjeta=new clsTargetasinternas();
//            cargarDatos();
//        } else {
//        }
//    }
//    public void modificar(){
//        if (crudTerjetasInternas.update(selectedTarjeta)) {
//            newTarjeta=new clsTargetasinternas();
//            cargarDatos();
//        } else {
//        }
//    }
//
//    public clsTargetasinternas getNewTarjeta() {
//        return newTarjeta;
//    }
//
//    public void setNewTarjeta(clsTargetasinternas newTarjeta) {
//        this.newTarjeta = newTarjeta;
//    }
//
//    public clsTargetasinternas getSelectedTarjeta() {
//        return selectedTarjeta;
//    }
//
//    public void setSelectedTarjeta(clsTargetasinternas selectedTarjeta) {
//        this.selectedTarjeta = selectedTarjeta;
//    }
//
//    public List<clsTargetasinternas> getLista() {
//        return lista;
//    }
//
//    public void setLista(List<clsTargetasinternas> lista) {
//        this.lista = lista;
//    }
//
//    public clsEquipo getSelectecequipo() {
//        return selectecequipo;
//    }
//
//    public void setSelectecequipo(clsEquipo selectecequipo) {
//        this.selectecequipo = selectecequipo;
//    }
//    
//}


package ec.org.uniandes.beans;


import ec.org.uniandes.entidades.clsEquipo;
import ec.org.uniandes.entidades.clsEquipoprueba;
import ec.org.uniandes.funciones.crudEquipo;
import ec.org.uniandes.funciones.crudEquipoprueba;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ccEquipo {

    private clsEquipoprueba newEquipo;
    private clsEquipoprueba selectedEquipo;
    private List<clsEquipoprueba> lista;
    public ccEquipo(){
        newEquipo=new clsEquipoprueba();
        cargardatos();
    }
    private void cargardatos(){
        lista=crudEquipoprueba.findbyAll();
    }
//    public void insertar(){
//        if (crudEquipoprueba.save(newEquipo)) {
//            newEquipo=new clsEquipoprueba();
//            cargardatos();
//        } else {
//        }
//    }
//    public void eliminar(){
//        if (crudEquipoprueba.delete(newEquipo)) {
//            newEquipo=new clsEquipoprueba();
//            cargardatos();
//        } else {
//        }
//    }
//    public void actualizar(){
//        if (crudEquipoprueba.update(selectedEquipo)) {
//            newEquipo=new clsEquipoprueba();
//            cargardatos();
//        } else {
//        }
//    }

    public clsEquipoprueba getNewEquipo() {
        return newEquipo;
    }

    public void setNewEquipo(clsEquipoprueba newEquipo) {
        this.newEquipo = newEquipo;
    }

    public clsEquipoprueba getSelectedEquipo() {
        return selectedEquipo;
    }

    public void setSelectedEquipo(clsEquipoprueba selectedEquipo) {
        this.selectedEquipo = selectedEquipo;
    }

    public List<clsEquipoprueba> getLista() {
        return lista;
    }

    public void setLista(List<clsEquipoprueba> lista) {
        this.lista = lista;
    }
    
}


package ec.org.uniandes.beans;


import ec.org.uniandes.entidades.clsEquipo;
import ec.org.uniandes.funciones.crudEquipo;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ccEquipo {

    private clsEquipo newEquipo;
    private clsEquipo selectedEquipo;
    private List<clsEquipo> lista;
    
    public ccEquipo(){
        newEquipo=new clsEquipo();
        cargardatos();
    }
    
    private void cargardatos(){
        lista=crudEquipo.findAllpc();
    }
    public void insertar(){
        if (crudEquipo.savepc(newEquipo)) {
            newEquipo=new clsEquipo();
            cargardatos();
        } else {
        }
    }
    public void eliminar(){
        if (crudEquipo.delete(selectedEquipo)) {
            newEquipo=new clsEquipo();
            cargardatos();
        } else {
        }
    }
    public void actualizar(){
        if (crudEquipo.updatepc(selectedEquipo)) {
            newEquipo=new clsEquipo();
            cargardatos();
        } else {
        }
    }

    public clsEquipo getNewEquipo() {
        return newEquipo;
    }

    public void setNewEquipo(clsEquipo newEquipo) {
        this.newEquipo = newEquipo;
    }

    public clsEquipo getSelectedEquipo() {
        return selectedEquipo;
    }

    public void setSelectedEquipo(clsEquipo selectedEquipo) {
        this.selectedEquipo = selectedEquipo;
    }

    public List<clsEquipo> getLista() {
        return lista;
    }

    public void setLista(List<clsEquipo> lista) {
        this.lista = lista;
    }
    
}

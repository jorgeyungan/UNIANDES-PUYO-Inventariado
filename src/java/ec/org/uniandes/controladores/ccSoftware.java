
package ec.org.uniandes.controladores;

import ec.org.uniandes.entidades.clsSoftware;
import ec.org.uniandes.funciones.crudSoftware;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ccSoftware {
    private clsSoftware newSoftware;
    private clsSoftware selectedSoftware;
    private List<clsSoftware> lista;
    public ccSoftware() {
        newSoftware=new clsSoftware();
        cargarDatos();
    }
    private void cargarDatos(){
        lista=crudSoftware.findbyAll();
    }
    public void insertar(){
        if (crudSoftware.save(newSoftware)) {
            newSoftware=new clsSoftware();
            cargarDatos();            
        } else {
        }
    }
    public void eliminar(){
        if (crudSoftware.save(selectedSoftware)) {
            newSoftware=new clsSoftware();
            cargarDatos();            
        } else {
        }
    }
    public void actualizar(){
        if (crudSoftware.save(selectedSoftware)) {
            newSoftware=new clsSoftware();
            cargarDatos();            
        } else {
        }
    }

    public clsSoftware getNewSoftware() {
        return newSoftware;
    }

    public void setNewSoftware(clsSoftware newSoftware) {
        this.newSoftware = newSoftware;
    }

    public clsSoftware getSelectedSoftware() {
        return selectedSoftware;
    }

    public void setSelectedSoftware(clsSoftware selectedSoftware) {
        this.selectedSoftware = selectedSoftware;
    }

    public List<clsSoftware> getLista() {
        return lista;
    }

    public void setLista(List<clsSoftware> lista) {
        this.lista = lista;
    }
    
    
}

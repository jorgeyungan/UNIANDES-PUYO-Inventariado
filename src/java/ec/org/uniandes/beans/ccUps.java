
package ec.org.uniandes.beans;

import ec.org.uniandes.entidades.clsEquipo;
import ec.org.uniandes.entidades.clsUps;
import ec.org.uniandes.funciones.crudUps;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ccUps {
    
    private clsUps newUps;
    private clsUps selectedUps;
    private List<clsUps> lista;
    private clsEquipo selectedequipo;
    public ccUps() {
        newUps=new clsUps();
        cargarDatos();
    }
    private void cargarDatos(){
        lista=crudUps.findbyAll();
    }
    public void insertar(){
        newUps.setIdequipo(selectedequipo);
        if (crudUps.save(newUps)) {
            newUps = new clsUps();
            cargarDatos();
        } else {
        }
    }
    public void actualizar(){
        if (crudUps.update(selectedUps)) {
            newUps = new clsUps();
            cargarDatos();
        } else {
        }
    }
    public void eliminar(){
        if (crudUps.delete(selectedUps)) {
            newUps = new clsUps();
            cargarDatos();
        } else {
        }
    }

    public clsUps getNewUps() {
        return newUps;
    }

    public void setNewUps(clsUps newUps) {
        this.newUps = newUps;
    }

    public clsUps getSelectedUps() {
        return selectedUps;
    }

    public void setSelectedUps(clsUps selectedUps) {
        this.selectedUps = selectedUps;
    }

    public List<clsUps> getLista() {
        return lista;
    }

    public void setLista(List<clsUps> lista) {
        this.lista = lista;
    }

    public clsEquipo getSelectedequipo() {
        return selectedequipo;
    }

    public void setSelectedequipo(clsEquipo selectedequipo) {
        this.selectedequipo = selectedequipo;
    }
    
}

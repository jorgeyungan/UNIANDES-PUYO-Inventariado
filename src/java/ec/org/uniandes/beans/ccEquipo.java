
package ec.org.uniandes.beans;

import ec.org.uniandes.entidades.clsEquipo;
import ec.org.uniandes.entidades.clsUbicacion;
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
    private clsUbicacion selectedUbicacion;
    
    public ccEquipo() {
        newEquipo=new clsEquipo();
        cargarDatos();
    }
    private void cargarDatos(){
        lista=crudEquipo.findbyAll();
    }
    public void insertar(){
        newEquipo.setIdubicacion(selectedUbicacion);
        if (crudEquipo.save(newEquipo)) {
            newEquipo=new clsEquipo();
            cargarDatos();
        } else {
        }
    }
    public void eliminar() {
        if (crudEquipo.delete(selectedEquipo)) {
            newEquipo=new clsEquipo();
            cargarDatos();
        } else {
        }
    }
    public void actualizar(){
        if (crudEquipo.update(selectedEquipo)) {
            newEquipo=new clsEquipo();
            cargarDatos();
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

    public clsUbicacion getSelectedUbicacion() {
        return selectedUbicacion;
    }

    public void setSelectedUbicacion(clsUbicacion selectedUbicacion) {
        this.selectedUbicacion = selectedUbicacion;
    }
    
}

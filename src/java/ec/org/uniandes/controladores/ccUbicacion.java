
package ec.org.uniandes.controladores;

import ec.org.uniandes.entidades.clsUbicacion;
import ec.org.uniandes.funciones.crudUbicacion;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ccUbicacion {

    private clsUbicacion newubicacion;
    private clsUbicacion selectedubicacion;
    private List<clsUbicacion> lista;
    
    public ccUbicacion() {
        newubicacion=new clsUbicacion();
        cargardatos();
    }
    private void cargardatos(){
        lista = crudUbicacion.findbyAll();
    }
     public void insertar(){
         if (crudUbicacion.save(newubicacion)) {
             newubicacion=new clsUbicacion();
             cargardatos();
         } else {
         }
     }
     public void actualizar(){
         if (crudUbicacion.update(selectedubicacion)) {
             newubicacion=new clsUbicacion();
             cargardatos();
         } else {
         }
     }
     public void eliminar(){
         if (crudUbicacion.delete(selectedubicacion)) {
             newubicacion=new clsUbicacion();
             cargardatos();
         } else {
         }
     }

    public clsUbicacion getNewubicacion() {
        return newubicacion;
    }

    public void setNewubicacion(clsUbicacion newubicacion) {
        this.newubicacion = newubicacion;
    }

    public clsUbicacion getSelectedubicacion() {
        return selectedubicacion;
    }

    public void setSelectedubicacion(clsUbicacion selectedubicacion) {
        this.selectedubicacion = selectedubicacion;
    }

    public List<clsUbicacion> getLista() {
        return lista;
    }

    public void setLista(List<clsUbicacion> lista) {
        this.lista = lista;
    }  
}

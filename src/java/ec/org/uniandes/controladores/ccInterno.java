
package ec.org.uniandes.controladores;

import ec.org.uniandes.entidades.clsEquipo;
import ec.org.uniandes.funciones.crudEquipo;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ccInterno {

    private clsEquipo newinterno;
    private clsEquipo selectedinterno;
    private List<clsEquipo> lista;
    public ccInterno() {
        newinterno=new clsEquipo();
        cargardatos();
    }
    private void cargardatos(){
        lista=crudEquipo.findAllinterno();
    }
    public void insertar(){
        if (crudEquipo.saveinterno(newinterno)) {
            newinterno=new clsEquipo();
            cargardatos();
        } else {
        }
    }
    public void actualizar(){
        if (crudEquipo.updateinterno(selectedinterno)) {
            newinterno=new clsEquipo();
            cargardatos();
        } else {
        }
    }
    public void eliminar(){
        if (crudEquipo.delete(selectedinterno)) {
            newinterno=new clsEquipo();
            cargardatos();
        } else {
        }
    }

    public clsEquipo getNewinterno() {
        return newinterno;
    }

    public void setNewinterno(clsEquipo newinterno) {
        this.newinterno = newinterno;
    }

    public clsEquipo getSelectedinterno() {
        return selectedinterno;
    }

    public void setSelectedinterno(clsEquipo selectedinterno) {
        this.selectedinterno = selectedinterno;
    }

    public List<clsEquipo> getLista() {
        return lista;
    }

    public void setLista(List<clsEquipo> lista) {
        this.lista = lista;
    }
    
}

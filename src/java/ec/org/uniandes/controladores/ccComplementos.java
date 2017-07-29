
package ec.org.uniandes.controladores;

import ec.org.uniandes.entidades.clsEquipo;
import ec.org.uniandes.funciones.crudEquipo;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ccComplementos {

    private clsEquipo newcomplemento;
    private clsEquipo selectedcomplemento;
    private List<clsEquipo> lista;
    public ccComplementos() {
        newcomplemento=new clsEquipo();
        cargardatos();
    }
    private void cargardatos(){
        lista=crudEquipo.findAllcomplementos();
    }
    public void insertar(){
        if (crudEquipo.savecomplementos(newcomplemento)) {
            newcomplemento=new clsEquipo();
            cargardatos();
        } else {
        }
    }
    public void actualizar(){
        if (crudEquipo.updatecomplementos(selectedcomplemento)) {
            newcomplemento=new clsEquipo();
            cargardatos();
        } else {
        }
    }
    public void eliminar(){
        if (crudEquipo.delete(selectedcomplemento)) {
            newcomplemento=new clsEquipo();
            cargardatos();
        } else {
        }
    }

    public clsEquipo getNewcomplemento() {
        return newcomplemento;
    }

    public void setNewcomplemento(clsEquipo newcomplemento) {
        this.newcomplemento = newcomplemento;
    }

    public clsEquipo getSelectedcomplemento() {
        return selectedcomplemento;
    }

    public void setSelectedcomplemento(clsEquipo selectedcomplemento) {
        this.selectedcomplemento = selectedcomplemento;
    }

    public List<clsEquipo> getLista() {
        return lista;
    }

    public void setLista(List<clsEquipo> lista) {
        this.lista = lista;
    }
    
}

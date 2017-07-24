
package ec.org.uniandes.beans;

import ec.org.uniandes.entidades.clsEquipo;
import ec.org.uniandes.funciones.crudEquipo;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ccImpresora {
    private clsEquipo newimpresora;
    private clsEquipo selectedimpresora;
    private List<clsEquipo> lista;
    public ccImpresora() {
        newimpresora=new clsEquipo();
        cargardatos();
    }
    private void cargardatos(){
        lista=crudEquipo.findAllimpresoras();
    }
    public void insertar(){
        if (crudEquipo.saveimpresora(newimpresora)) {
            newimpresora=new clsEquipo();
            cargardatos();
        } else {
        }
    }
    public void eliminar(){
        if (crudEquipo.delete(selectedimpresora)) {
            newimpresora=new clsEquipo();
            cargardatos();
        } else {
        }
    }
    public void actualizar(){
        if (crudEquipo.updateimpresora(selectedimpresora)) {
            newimpresora=new clsEquipo();
            cargardatos();
        } else {
        }
    }

    public clsEquipo getNewimpresora() {
        return newimpresora;
    }

    public void setNewimpresora(clsEquipo newimpresora) {
        this.newimpresora = newimpresora;
    }

    public clsEquipo getSelectedimpresora() {
        return selectedimpresora;
    }

    public void setSelectedimpresora(clsEquipo selectedimpresora) {
        this.selectedimpresora = selectedimpresora;
    }

    public List<clsEquipo> getLista() {
        return lista;
    }

    public void setLista(List<clsEquipo> lista) {
        this.lista = lista;
    }
    
    
}

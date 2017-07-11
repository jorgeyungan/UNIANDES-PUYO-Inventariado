
package ec.org.uniandes.beans;

import ec.org.uniandes.entidades.clsCategoria;
import ec.org.uniandes.funciones.crudCategoria;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ccCategoria {

    private clsCategoria newcategoria;
    private clsCategoria selectedcategoria;
    private List<clsCategoria> lista;
    public ccCategoria() {
        newcategoria=new clsCategoria();
        cargardatos();
    }
    private void cargardatos(){
        lista=crudCategoria.findbyAll();
    }
    
    public void insertar(){
        if (crudCategoria.save(newcategoria)) {
            newcategoria=new clsCategoria();
            cargardatos();
        } else {
        }
    }
    public void actualizar(){
        if (crudCategoria.update(selectedcategoria)) {
            newcategoria=new clsCategoria();
            cargardatos();
        } else {
        }
    }
    public void eliminar(){
        if (crudCategoria.delete(selectedcategoria)) {
            newcategoria=new clsCategoria();
            cargardatos();
        } else {
        }
    }

    public clsCategoria getNewcategoria() {
        return newcategoria;
    }

    public void setNewcategoria(clsCategoria newcategoria) {
        this.newcategoria = newcategoria;
    }

    public clsCategoria getSelectedcategoria() {
        return selectedcategoria;
    }

    public void setSelectedcategoria(clsCategoria selectedcategoria) {
        this.selectedcategoria = selectedcategoria;
    }

    public List<clsCategoria> getLista() {
        return lista;
    }

    public void setLista(List<clsCategoria> lista) {
        this.lista = lista;
    }
    
}

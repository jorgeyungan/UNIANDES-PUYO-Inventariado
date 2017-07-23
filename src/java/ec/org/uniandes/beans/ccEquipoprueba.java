
package ec.org.uniandes.beans;

import ec.org.uniandes.entidades.clsEquipo;
import ec.org.uniandes.funciones.crudEquipoprueba;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped

public class ccEquipoprueba {
    private clsEquipo newequipo;
    private clsEquipo selectedequipo;
    private List<clsEquipo> lista;
    public ccEquipoprueba(){
        newequipo=new clsEquipo();
        cargardator();
    }
    private void cargardator(){
        lista=crudEquipoprueba.findbyAll();
    }

    public clsEquipo getNewequipo() {
        return newequipo;
    }

    public void setNewequipo(clsEquipo newequipo) {
        this.newequipo = newequipo;
    }

    public clsEquipo getSelectedequipo() {
        return selectedequipo;
    }

    public void setSelectedequipo(clsEquipo selectedequipo) {
        this.selectedequipo = selectedequipo;
    }

    public List<clsEquipo> getLista() {
        return lista;
    }

    public void setLista(List<clsEquipo> lista) {
        this.lista = lista;
    }
    
}

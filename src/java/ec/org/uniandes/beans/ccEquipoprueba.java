
package ec.org.uniandes.beans;

import ec.org.uniandes.entidades.clsEquipoprueba;
import ec.org.uniandes.funciones.crudEquipoprueba;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped

public class ccEquipoprueba {
    private clsEquipoprueba newequipo;
    private clsEquipoprueba selectedequipo;
    private List<clsEquipoprueba> lista;
    public ccEquipoprueba(){
        newequipo=new clsEquipoprueba();
        cargardator();
    }
    private void cargardator(){
        lista=crudEquipoprueba.findbyAll();
    }

    public clsEquipoprueba getNewequipo() {
        return newequipo;
    }

    public void setNewequipo(clsEquipoprueba newequipo) {
        this.newequipo = newequipo;
    }

    public clsEquipoprueba getSelectedequipo() {
        return selectedequipo;
    }

    public void setSelectedequipo(clsEquipoprueba selectedequipo) {
        this.selectedequipo = selectedequipo;
    }

    public List<clsEquipoprueba> getLista() {
        return lista;
    }

    public void setLista(List<clsEquipoprueba> lista) {
        this.lista = lista;
    }
    
}

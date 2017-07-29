package ec.org.uniandes.controladores;

import ec.org.uniandes.entidades.clsEquipo;
import ec.org.uniandes.funciones.crudEquipo;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ccEquipotodo {

    private List<clsEquipo> lista;

    public ccEquipotodo() {
        cargardatos();
    }

    private void cargardatos() {
        lista = crudEquipo.findAll();
    }

    public List<clsEquipo> getLista() {
        return lista;
    }

    public void setLista(List<clsEquipo> lista) {
        this.lista = lista;
    }

}

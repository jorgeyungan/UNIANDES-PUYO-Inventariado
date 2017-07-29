package ec.org.uniandes.controladores;

import ec.org.uniandes.entidades.clsDetequiposoftware;
import ec.org.uniandes.entidades.clsEquipo;
import ec.org.uniandes.entidades.clsSoftware;
import ec.org.uniandes.funciones.crudDetequiposoftware;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ccInstalacion {

    private clsDetequiposoftware newdetalle;
    private clsDetequiposoftware selecteddetalle;
    private List<clsDetequiposoftware> lista;
    private clsEquipo selectedequipo;
    private clsSoftware selectedsoftware;

    public ccInstalacion() {
        newdetalle = new clsDetequiposoftware();
        cargardatos();
    }

    private void cargardatos() {
        lista = crudDetequiposoftware.findbyAll();
    }

    public void insertar() {
        newdetalle.setIdequipo(selectedequipo);
        newdetalle.setIdsoftware(selectedsoftware);
        if (crudDetequiposoftware.save(newdetalle)) {
            newdetalle = new clsDetequiposoftware();
            cargardatos();
        } else {
        }
    }

    public clsDetequiposoftware getNewdetalle() {
        return newdetalle;
    }

    public void setNewdetalle(clsDetequiposoftware newdetalle) {
        this.newdetalle = newdetalle;
    }

    public clsDetequiposoftware getSelecteddetalle() {
        return selecteddetalle;
    }

    public void setSelecteddetalle(clsDetequiposoftware selecteddetalle) {
        this.selecteddetalle = selecteddetalle;
    }

    public List<clsDetequiposoftware> getLista() {
        return lista;
    }

    public void setLista(List<clsDetequiposoftware> lista) {
        this.lista = lista;
    }

    public clsEquipo getSelectedequipo() {
        return selectedequipo;
    }

    public void setSelectedequipo(clsEquipo selectedequipo) {
        this.selectedequipo = selectedequipo;
    }

    public clsSoftware getSelectedsoftware() {
        return selectedsoftware;
    }

    public void setSelectedsoftware(clsSoftware selectedsoftware) {
        this.selectedsoftware = selectedsoftware;
    }
    

}

package ec.org.uniandes.controladores;

import ec.org.uniandes.entidades.clsEquipo;
import ec.org.uniandes.entidades.clsMantenimiento;
import ec.org.uniandes.entidades.clsRespuesta;
import ec.org.uniandes.entidades.clsUsuario;
import ec.org.uniandes.funciones.crudMantenimiento;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ccAbierto {

    private clsMantenimiento newmantenimiento;
    private clsMantenimiento selectedmantnimiento;
    private List<clsMantenimiento> lista;
    private List<clsMantenimiento> lista1;
    private clsUsuario selectedusuario;
    private clsEquipo selectedequipo;

    public ccAbierto() {
        newmantenimiento = new clsMantenimiento();
        cargardatos();
    }

    private void cargardatos() {
        lista = crudMantenimiento.findbyabierto();
        lista1 = crudMantenimiento.findbycerrado();
    }

    public void insertar() {
        newmantenimiento.setIdusuario(selectedusuario);
        newmantenimiento.setIdequipo(selectedequipo);
        if (crudMantenimiento.save(newmantenimiento)) {
            newmantenimiento = new clsMantenimiento();
            cargardatos();
        } else {
        }
    }

    

    public clsMantenimiento getNewmantenimiento() {
        return newmantenimiento;
    }

    public void setNewmantenimiento(clsMantenimiento newmantenimiento) {
        this.newmantenimiento = newmantenimiento;
    }

    public clsMantenimiento getSelectedmantnimiento() {
        return selectedmantnimiento;
    }

    public void setSelectedmantnimiento(clsMantenimiento selectedmantnimiento) {
        this.selectedmantnimiento = selectedmantnimiento;
    }

    public List<clsMantenimiento> getLista() {
        return lista;
    }

    public void setLista(List<clsMantenimiento> lista) {
        this.lista = lista;
    }

    public clsEquipo getSelectedequipo() {
        return selectedequipo;
    }

    public void setSelectedequipo(clsEquipo selectedequipo) {
        this.selectedequipo = selectedequipo;
    }

    public List<clsMantenimiento> getLista1() {
        return lista1;
    }

    public void setLista1(List<clsMantenimiento> lista1) {
        this.lista1 = lista1;
    }

    public clsUsuario getSelectedusuario() {
        return selectedusuario;
    }

    public void setSelectedusuario(clsUsuario selectedusuario) {
        this.selectedusuario = selectedusuario;
    }

    
}

package ec.org.uniandes.controladores;

import ec.org.uniandes.entidades.clsDetubicacionusuario;
import ec.org.uniandes.entidades.clsUbicacion;
import ec.org.uniandes.entidades.clsUsuario;
import ec.org.uniandes.funciones.crudDetubicacionusuario;
import ec.org.uniandes.funciones.crudUbicacion;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ccAsignacion {

    private clsDetubicacionusuario newdetalle;
    private clsDetubicacionusuario selecteddetalle;
    private List<clsDetubicacionusuario> lista;
    private clsUsuario selectedusuario;
    private clsUbicacion selectedubicacion;
    private List<clsUbicacion> lista2;
    
    

    public ccAsignacion() {
        newdetalle = new clsDetubicacionusuario();
        cargardatos();
    }
    private void cargardatos() {
        lista = crudDetubicacionusuario.findbyAll();

    }
    private void cargardatos2() {
        lista2 = crudUbicacion.findtoasignacion();

    }

    public void insertar() {
        newdetalle.setIdusuario(selectedusuario);
        newdetalle.setIdubicacion(selectedubicacion);
        if (crudDetubicacionusuario.save(newdetalle)) {
            newdetalle = new clsDetubicacionusuario();
            cargardatos();
        } else {
        }
    }

    public clsDetubicacionusuario getNewdetalle() {
        return newdetalle;
    }

    public void setNewdetalle(clsDetubicacionusuario newdetalle) {
        this.newdetalle = newdetalle;
    }

    public clsDetubicacionusuario getSelecteddetalle() {
        return selecteddetalle;
    }

    public void setSelecteddetalle(clsDetubicacionusuario selecteddetalle) {
        this.selecteddetalle = selecteddetalle;
    }

    public List<clsDetubicacionusuario> getLista() {
        return lista;
    }

    public void setLista(List<clsDetubicacionusuario> lista) {
        this.lista = lista;
    }

    public clsUsuario getSelectedusuario() {
        return selectedusuario;
    }

    public void setSelectedusuario(clsUsuario selectedusuario) {
        this.selectedusuario = selectedusuario;
    }

    public clsUbicacion getSelectedubicacion() {
        return selectedubicacion;
    }

    public void setSelectedubicacion(clsUbicacion selectedubicacion) {
        this.selectedubicacion = selectedubicacion;
    }

    public List<clsUbicacion> getLista2() {
        return lista2;
    }

    public void setLista2(List<clsUbicacion> lista2) {
        this.lista2 = lista2;
    }

}

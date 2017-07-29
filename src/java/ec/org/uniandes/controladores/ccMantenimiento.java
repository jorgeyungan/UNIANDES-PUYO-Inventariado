package ec.org.uniandes.controladores;

import ec.org.uniandes.entidades.clsDetequipomantenimiento;
import ec.org.uniandes.entidades.clsEquipo;
import ec.org.uniandes.entidades.clsMantenimiento;
import ec.org.uniandes.funciones.crudDetequipomantenimiento;
import ec.org.uniandes.funciones.crudMantenimiento;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ccMantenimiento {
    
    private clsDetequipomantenimiento newdetalle;
    private clsDetequipomantenimiento selecteddetalle;
    private List<clsDetequipomantenimiento> lista;
    private clsMantenimiento newmantenimiento;
    private clsMantenimiento selectedmanteniminto;
    private clsEquipo selectedequipo;
    
    public ccMantenimiento() {
        newmantenimiento = new clsMantenimiento();
        newdetalle = new clsDetequipomantenimiento();
        cargardatos();
    }
    
    private void cargardatos() {
        lista = crudDetequipomantenimiento.findbyAll();
    }
    
    public void insertar() {
        int c=0;
        c = crudMantenimiento.saveman(newmantenimiento);
        newdetalle.setIdequipo(selectedequipo);
        newdetalle.setIdmantenimiento(newmantenimiento);
        if (crudDetequipomantenimiento.save(newdetalle)) {
            newmantenimiento = new clsMantenimiento();
            newdetalle = new clsDetequipomantenimiento();
            cargardatos();
        } else {
        }
    }
    
    public clsDetequipomantenimiento getNewdetalle() {
        return newdetalle;
    }
    
    public void setNewdetalle(clsDetequipomantenimiento newdetalle) {
        this.newdetalle = newdetalle;
    }
    
    public clsDetequipomantenimiento getSelecteddetalle() {
        return selecteddetalle;
    }
    
    public void setSelecteddetalle(clsDetequipomantenimiento selecteddetalle) {
        this.selecteddetalle = selecteddetalle;
    }
    
    public List<clsDetequipomantenimiento> getLista() {
        return lista;
    }
    
    public void setLista(List<clsDetequipomantenimiento> lista) {
        this.lista = lista;
    }
    
    public clsMantenimiento getNewmantenimiento() {
        return newmantenimiento;
    }
    
    public void setNewmantenimiento(clsMantenimiento newmantenimiento) {
        this.newmantenimiento = newmantenimiento;
    }
    
    public clsEquipo getSelectedequipo() {
        return selectedequipo;
    }
    
    public void setSelectedequipo(clsEquipo selectedequipo) {
        this.selectedequipo = selectedequipo;
    }
    
    public clsMantenimiento getSelectedmanteniminto() {
        return selectedmanteniminto;
    }
    
    public void setSelectedmanteniminto(clsMantenimiento selectedmanteniminto) {
        this.selectedmanteniminto = selectedmanteniminto;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.org.uniandes.controladores;

import ec.org.uniandes.entidades.clsDetubicacionequipo;
import ec.org.uniandes.entidades.clsEquipo;
import ec.org.uniandes.entidades.clsUbicacion;
import ec.org.uniandes.funciones.crudDetubicacionequipo;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ccUbiEqui {

    private clsDetubicacionequipo newdetalle;
    private clsDetubicacionequipo selecteddetalle;
    private List<clsDetubicacionequipo> lista;
    private clsEquipo selectedequipo;
    private clsUbicacion selectedUbicacion;
     public ccUbiEqui() {
         newdetalle=new clsDetubicacionequipo();
         cargardatos();
    }
    private void cargardatos(){
        lista =crudDetubicacionequipo.findbyAll();
    }
    public void insertar(){
        newdetalle.setIdequipo(selectedequipo);
        newdetalle.setIdubicacion(selectedUbicacion);
         if (crudDetubicacionequipo.save(newdetalle)) {
             newdetalle=new clsDetubicacionequipo();
             cargardatos();
         } else {
         }
     }

    public clsDetubicacionequipo getNewdetalle() {
        return newdetalle;
    }

    public void setNewdetalle(clsDetubicacionequipo newdetalle) {
        this.newdetalle = newdetalle;
    }

    public clsDetubicacionequipo getSelecteddetalle() {
        return selecteddetalle;
    }

    public void setSelecteddetalle(clsDetubicacionequipo selecteddetalle) {
        this.selecteddetalle = selecteddetalle;
    }

    public List<clsDetubicacionequipo> getLista() {
        return lista;
    }

    public void setLista(List<clsDetubicacionequipo> lista) {
        this.lista = lista;
    }

    public clsEquipo getSelectedequipo() {
        return selectedequipo;
    }

    public void setSelectedequipo(clsEquipo selectedequipo) {
        this.selectedequipo = selectedequipo;
    }

    public clsUbicacion getSelectedUbicacion() {
        return selectedUbicacion;
    }

    public void setSelectedUbicacion(clsUbicacion selectedUbicacion) {
        this.selectedUbicacion = selectedUbicacion;
    }
    
}

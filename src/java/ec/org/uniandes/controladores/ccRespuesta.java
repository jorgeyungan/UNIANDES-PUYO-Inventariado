/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.org.uniandes.controladores;

import ec.org.uniandes.entidades.clsMantenimiento;
import ec.org.uniandes.entidades.clsRespuesta;
import ec.org.uniandes.entidades.clsUsuario;
import ec.org.uniandes.funciones.crudMantenimiento;
import ec.org.uniandes.funciones.crudRespuesta;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ccRespuesta {

    private clsRespuesta newrespuesta;
    private clsRespuesta selectedRespuesta;
    private clsMantenimiento selectedman;
    private clsUsuario selectedusuario;
    
    public ccRespuesta() {
        newrespuesta=new clsRespuesta();
    }
    public void insertar(){
        newrespuesta.setIdmantenimiento(selectedman);
        newrespuesta.setIdusuario(selectedusuario);
        if (crudRespuesta.save(newrespuesta)) {
            newrespuesta = new clsRespuesta();
        } 
        selectedman.setEstado("CERRADO");
        if (crudMantenimiento.update(selectedman)) {
            newrespuesta = new clsRespuesta();
        } else {
        }
    }

    public clsRespuesta getNewrespuesta() {
        return newrespuesta;
    }

    public void setNewrespuesta(clsRespuesta newrespuesta) {
        this.newrespuesta = newrespuesta;
    }

    public clsRespuesta getSelectedRespuesta() {
        return selectedRespuesta;
    }

    public void setSelectedRespuesta(clsRespuesta selectedRespuesta) {
        this.selectedRespuesta = selectedRespuesta;
    }

    public clsMantenimiento getSelectedman() {
        return selectedman;
    }

    public void setSelectedman(clsMantenimiento selectedman) {
        this.selectedman = selectedman;
    }

    public clsUsuario getSelectedusuario() {
        return selectedusuario;
    }

    public void setSelectedusuario(clsUsuario selectedusuario) {
        this.selectedusuario = selectedusuario;
    }
}

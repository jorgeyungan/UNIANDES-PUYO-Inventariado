/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.org.uniandes.beans;

import ec.org.uniandes.entidades.clsEquipo;
import ec.org.uniandes.entidades.clsImpresora;
import ec.org.uniandes.funciones.crudEquipoprueba;
import ec.org.uniandes.funciones.crudImpresora;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ccImpresora {
    private clsEquipo newimpresora;
    private clsEquipo selectedimpresora;
    private List<clsEquipo> listar;
    private void cargardatos(){
        listar=crudEquipoprueba.findbyAll();
    }
    public ccImpresora(){
        newimpresora=new clsEquipo();
    }
//    public void insertar(){
//        if (crudEquipoprueba.save(newimpresora)) {
//            newimpresora=new clsEquipoprueba();
//            cargardatos();
//        } else {
//        }
//    }
//    public void eliminar(){
//        if (crudEquipoprueba.delete(selectedimpresora)) {
//            newimpresora=new clsEquipoprueba();
//            cargardatos();
//        } else {
//        }
//    }

    public clsEquipo getNewimpresora() {
        return newimpresora;
    }

    public void setNewimpresora(clsEquipo newimpresora) {
        this.newimpresora = newimpresora;
    }

    public clsEquipo getSelectedimpresora() {
        return selectedimpresora;
    }

    public void setSelectedimpresora(clsEquipo selectedimpresora) {
        this.selectedimpresora = selectedimpresora;
    }

    public List<clsEquipo> getListar() {
        return listar;
    }

    public void setListar(List<clsEquipo> listar) {
        this.listar = listar;
    }
    
}

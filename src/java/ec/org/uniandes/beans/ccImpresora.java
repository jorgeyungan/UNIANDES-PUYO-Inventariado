/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.org.uniandes.beans;

import ec.org.uniandes.entidades.clsEquipoprueba;
import ec.org.uniandes.entidades.clsImpresora;
import ec.org.uniandes.funciones.crudEquipoprueba;
import ec.org.uniandes.funciones.crudImpresora;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ccImpresora {
    private clsEquipoprueba newimpresora;
    private clsEquipoprueba selectedimpresora;
    private List<clsEquipoprueba> listar;
    private void cargardatos(){
        listar=crudEquipoprueba.findbyAll();
    }
    public ccImpresora(){
        newimpresora=new clsEquipoprueba();
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

    public clsEquipoprueba getNewimpresora() {
        return newimpresora;
    }

    public void setNewimpresora(clsEquipoprueba newimpresora) {
        this.newimpresora = newimpresora;
    }

    public clsEquipoprueba getSelectedimpresora() {
        return selectedimpresora;
    }

    public void setSelectedimpresora(clsEquipoprueba selectedimpresora) {
        this.selectedimpresora = selectedimpresora;
    }

    public List<clsEquipoprueba> getListar() {
        return listar;
    }

    public void setListar(List<clsEquipoprueba> listar) {
        this.listar = listar;
    }
    
}

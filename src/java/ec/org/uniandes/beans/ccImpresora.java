/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.org.uniandes.beans;

import ec.org.uniandes.entidades.clsImpresora;
import ec.org.uniandes.funciones.crudImpresora;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ccImpresora {
    private clsImpresora newimpresora;
    private clsImpresora selectedimpresora;
    private List<clsImpresora> lista;

    public ccImpresora() {
        newimpresora=new clsImpresora();
        cargardatos();
    }
    private void cargardatos(){
        lista=crudImpresora.findbyAll();
    }
    public void insertar(){
        if (crudImpresora.save(newimpresora)) {
            newimpresora=new clsImpresora();
            cargardatos();
        } else {
        }
    }
    public void actualizar(){
        if (crudImpresora.update(selectedimpresora)) {
            newimpresora=new clsImpresora();
            cargardatos();
        } else {
        }
    }
    public void eliminar(){
        if (crudImpresora.delete(selectedimpresora)) {
            newimpresora=new clsImpresora();
            cargardatos();
        } else {
        }
    }

    public clsImpresora getNewimpresora() {
        return newimpresora;
    }

    public void setNewimpresora(clsImpresora newimpresora) {
        this.newimpresora = newimpresora;
    }

    public clsImpresora getSelectedimpresora() {
        return selectedimpresora;
    }

    public void setSelectedimpresora(clsImpresora selectedimpresora) {
        this.selectedimpresora = selectedimpresora;
    }

    public List<clsImpresora> getLista() {
        return lista;
    }

    public void setLista(List<clsImpresora> lista) {
        this.lista = lista;
    }
    
}

package ec.org.uniandes.controladores;


import ec.org.uniandes.entidades.clsUsuario;
import ec.org.uniandes.funciones.crudUsuario;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean
@ViewScoped
public class ccUsuario {

    private clsUsuario newUsuario;
    private clsUsuario selectedUsuario;
    private List<clsUsuario> lista;
    private List<clsUsuario> lista1;
    private void cargardatos(){
        lista=crudUsuario.findbynotecnico();
        lista1=crudUsuario.findbytecnico();
    }
    
    public ccUsuario() {
        newUsuario = new clsUsuario();
        cargardatos();
    }
    public void insertar(){
        if (crudUsuario.save(newUsuario)) {//guarda el cliente
            newUsuario = new clsUsuario();//prepara el contructor de un posible nuevo cliente
            cargardatos();//refresca el datagrid con los cambios (aparrece el nuevo cliente)
            //mostrar un mensaje
        }
        else{
            //mostrar un mensaje de no guardado
        }
    }
    public void modificar(){
        if(crudUsuario.update(selectedUsuario)){
            newUsuario=new clsUsuario();
            cargardatos();
        }else{
            
        }
    }
    public void eliminar(){
        if (crudUsuario.delete(selectedUsuario)) {
            newUsuario=new clsUsuario();
            cargardatos();
        } else {
        }
    }
    

    public clsUsuario getNewUsuario() {
        return newUsuario;
    }

    public void setNewUsuario(clsUsuario newUsuario) {
        this.newUsuario = newUsuario;
    }

    public clsUsuario getSelectedUsuario() {
        return selectedUsuario;
    }

    public void setSelectedUsuario(clsUsuario selectedUsuario) {
        this.selectedUsuario = selectedUsuario;
    }

    public List<clsUsuario> getLista() {
        return lista;
    }

    public void setLista(List<clsUsuario> lista) {
        this.lista = lista;
    }

    public List<clsUsuario> getLista1() {
        return lista1;
    }

    public void setLista1(List<clsUsuario> lista1) {
        this.lista1 = lista1;
    }

}

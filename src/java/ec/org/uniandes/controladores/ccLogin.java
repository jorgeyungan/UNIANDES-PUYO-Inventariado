
package ec.org.uniandes.controladores;

import ec.org.uniandes.entidades.clsLogin;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ccLogin {

    clsLogin newlogo;
    clsLogin selectedlogin;
    List<clsLogin> lista;
    public ccLogin() {
    }
    private void cargardatos(){
        
    }
}

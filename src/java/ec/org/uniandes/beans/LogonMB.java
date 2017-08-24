/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.org.uniandes.beans;

import ec.org.uniandes.entidades.clsUsuario;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.omnifaces.util.Faces;
import org.omnifaces.util.Messages;
import org.primefaces.context.RequestContext;

@ManagedBean
@ViewScoped
public class LogonMB implements Serializable {

    private String email;

    private String password;
    private List<clsUsuario> usuario;

    private boolean remember;

//    public String login(ActionEvent event) {
//        RequestContext context = RequestContext.getCurrentInstance();
//        FacesMessage message = null;
//        boolean loggedIn = false;
//
//        if (email != null && email.equals("Telematica") && password != null && password.equals("1234567890")) {
//            loggedIn = true;
//            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", email);
//            
//
//        } else {
//            loggedIn = false;
//            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Invalid credentials");
//
//        }
//
//        FacesContext.getCurrentInstance().addMessage(null, message);
//        context.addCallbackParam("loggedIn", loggedIn);
//        
//    }

    public String doLogon() {
        if (email.equals("telematica")&&password.equals("1234567890")) {
            Faces.getFlash().setKeepMessages(true);
            Messages.addGlobalInfo("Logged in successfully!");
            return "index.xhtml?faces-redirect=true";
        } else {
            Faces.getFlash().setKeepMessages(true);
            Messages.addGlobalInfo("Lo siento, Intente de nuevo!");
        }
            return "login.xhtml?faces-redirect=true";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isRemember() {
        return remember;
    }

    public void setRemember(boolean remember) {
        this.remember = remember;
    }

    public List<clsUsuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(List<clsUsuario> usuario) {
        this.usuario = usuario;
    }

    

}

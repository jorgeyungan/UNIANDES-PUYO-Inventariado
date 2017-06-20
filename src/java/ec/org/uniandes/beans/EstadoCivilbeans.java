/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.org.uniandes.beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
 
@ManagedBean
public class EstadoCivilbeans {

    private String text;
    

    public EstadoCivilbeans() {
    }
    public List<String> completeText(String query) {
        List<String> results = new ArrayList<String>();
        for(int i = 0; i <=4; i++) {
            if(i==0){
                results.add("Soltero(a)");
            }
            if(i==1){
                results.add("Casado(a)");
            }
            if(i==2){
                results.add("Divorciado(a)");
            }
            if(i==3){
                results.add("Viudo(a)");
            }
            if(i==4){
                results.add("Unión Libre");
            }
        }
         
        return results;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    

    
    
}

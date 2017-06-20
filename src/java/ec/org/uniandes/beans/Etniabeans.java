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
public class Etniabeans {

    private String text;
    

    public Etniabeans() {
    }
    public List<String> completeText(String query) {
        List<String> results = new ArrayList<String>();
        for(int i = 0; i <=4; i++) {
            if(i==0){
                results.add("Afroecuatoria/Afrodescendiente");
            }
            if(i==1){
                results.add("Blanco");
            }
            if(i==2){
                results.add("Indígena");
            }
            if(i==3){
                results.add("Mestizo");
            }
            if(i==4){
                results.add("Montubio");
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

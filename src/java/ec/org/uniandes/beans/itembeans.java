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
public class itembeans {

    private String text;
    

    public itembeans() {
    }
    public List<String> completeText(String query) {
        List<String> results = new ArrayList<String>();
        for(int i = 0; i <=5; i++) {
            if(i==0){
                results.add("Bueno");
            }
            if(i==1){
                results.add("Regular");
            }
            if(i==2){
                results.add("Malo");
            }
            if(i==3){
                results.add("Bodega");
            }
            if(i==4){
                results.add("Dado de Baja");
            }
            if(i==5){
                results.add("Reparacion");
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

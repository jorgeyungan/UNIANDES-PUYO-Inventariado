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
public class tipobean {

    private String text;
    

    public tipobean() {
    }
    public List<String> completeText(String query) {
        List<String> results = new ArrayList<String>();
        for(int i = 0; i <=1; i++) {
            if(i==0){
                results.add("Masculino");
            }
            if(i==1){
                results.add("Femenino");
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

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
public class si_no {

    private String text;
    

    public si_no() {
    }
    public List<String> completeText(String query) {
        List<String> results = new ArrayList<String>();
        for(int i = 0; i <=1; i++) {
            if(i==0){
                results.add("Si");
            }
            if(i==1){
                results.add("No");
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

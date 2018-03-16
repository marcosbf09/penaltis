/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorpenaltis;

/**
 *
 * @author marcos
 */
public class Torcedor {
    
    public int apoiar(){
       int n = (int)(Math.random()*11); //0 ate 10
       
       return n;
         
    }
    
    public int xingar(){
        int p = (int)(Math.random()*11); //0 ate 10
        
        return p;
    }
    
    
}

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
public enum Ponto {

    ESQUERDACIMA(), ESQUERDABAIXO(), DIREITACIMA(), 
    DIREITABAIXO(), MEIOCIMA(), MEIOBAIXO();
    
    private Ponto(){
        
    }
    

    public boolean errar(){
        int n = (int)(Math.random()*2); //0 ou 1
        if(n==0){
            return false;
        }
        else{
            return true;
        }
       
    } 

}

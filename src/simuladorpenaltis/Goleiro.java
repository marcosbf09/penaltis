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
public class Goleiro extends Jogador{
    

    public Goleiro(String n, Time t, int q, int c) {
        super(n, t, q, c);
        
    }
    
    @Override
    public void defender(Ponto ponto){
        System.out.println("\nO goleiro defendeu na direção: "+ponto);
        
    }

    @Override
    public void chutar(Ponto q) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
}

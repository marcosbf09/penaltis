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
public class Batedor extends Jogador{
    
    private Ponto ponto;
    
    public Batedor(String n, Time t, int q, int c) {
        super(n, t, q, c);
        
    }
    
    @Override
    public void chutar(Ponto ponto){
        
        System.out.println("\nO batedor chutou para a direção: "+ponto);
        
    }

    @Override
    public void defender(Ponto s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorpenaltis;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author marcos
 */
public abstract class Jogador {
    
    protected String nome;
    protected Time time;
    protected Perfil perfil; 
    private Ponto ponto;
   
    
    
 
    
    public Jogador(String n, Time t, int q, int c){
        nome=n;
        time=t;
       
        this.setPerfil(new Perfil(q,c));
    }
    
    public void setPerfil(Perfil perf){
        this.perfil=perf;
    }
    
    public String getNome(){
        return nome;
    }
    
    public Time nomeTime(){
        return time;
    }
    
    public int getQualidadeJog(){
       return perfil.getQualidade(); 
    }
    
    public int getConfiancaJog(){
       return perfil.getConfianca(); 
    }
    
    Scanner entrada = new Scanner(System.in);
    
    public Ponto direcionar(int q){ //'int q' serve para definir se o jogador da vez é do time do usuario ou do time da maquina
        Ponto decisao = null;	
            if(q==1){
           
                int op=-1;
                
                while(op<0||op>5){
                    System.out.println("0 - ESQUERDA EM CIMA");
                    System.out.println("1 - ESQUERDA EM BAIXO");
                    System.out.println("2 - DIREITA EM CIMA");
                    System.out.println("3 - DIREITA EM BAIXO");
                    System.out.println("4 - MEIO EM CIMA");
                    System.out.println("5 - MEIO EM BAIXO");

                    op=entrada.nextInt();
                
                    if((op<0||op>5)){
                       System.out.println("\nDIREÇÃO INEXISTENTE! DIGITE NOVAMENTE! \n"); 
                    }
                
                }
                
                switch(op)
                    {
                        case 0: decisao = Ponto.ESQUERDACIMA; break;
                        case 1: decisao = Ponto.ESQUERDABAIXO; break;
                        case 2: decisao = Ponto.DIREITACIMA; break;
                        case 3: decisao = Ponto.DIREITABAIXO; break;
                        case 4: decisao = Ponto.MEIOCIMA; break;
                        case 5: decisao = Ponto.MEIOBAIXO; break;

                    }
                
            }   
        
            if(q==2){
                Random aleatorio = new Random();
                switch(aleatorio.nextInt(6))
                {
                    case 0: decisao = Ponto.ESQUERDACIMA; break;
                    case 1: decisao = Ponto.ESQUERDABAIXO; break;
                    case 2: decisao = Ponto.DIREITACIMA; break;
                    case 3: decisao = Ponto.DIREITABAIXO; break;
                    case 4: decisao = Ponto.MEIOCIMA; break;
                    case 5: decisao = Ponto.MEIOBAIXO; break;
                }
            }

	return decisao;
    }
    
    public void InfluenciaTorcida(int apoio, int vaia){
        int conf, quali;
        double result;
     
        conf=perfil.getConfianca()+apoio;  
        conf=conf-vaia;
        
        perfil.setConfianca(conf); //atualizando a confianca do jogador
        
        result=conf/10.0;
        
        quali=perfil.getQualidade();
        quali=(int)(quali*result);
        
        perfil.setQualidade(quali); //atualizando a qualidade do jogador
 
    }
   
    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
        
    public abstract void chutar(Ponto q);
    
    public abstract void defender(Ponto s);
      
    
      
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorpenaltis;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 *
 * @author marcos
 */
public class Torcida {
    
    private Time time;
    private Torcedor torcedor;
    private List <Torcedor> torcedores = new ArrayList<>();
    private String comemoracoes[] = null;
    private String lamentacoes[] = null;
    private String manifestacoesapoio[] = null;
    private String manifestacoescontraria[] = null;
    
    public Torcida(Time t){
        time=t;
        for(int i=0; i<50; i++){ //10 torcedores para cada time
            this.setTorcedor(new Torcedor()); //criando torcedores
            this.InsereTorcedorTorcida(torcedor); //inserindo na lista e criando a torcida
        }
        
        comemoracoes = new String[] {"NOSSO TIME É O MELHOR!!!", "É ISSO AIIIIII!!!",
                                    "UHUUUULLLL!!!!", "OLÉÉÉÉÉÉÉ!!!", "É TETRAAAAAA!!!"};
		
	lamentacoes = new String[] {"QUE DECEPÇÃO!!!",
				"EU VOU PASSAR MAL!!!",
				"ERA MELHOR TER FICADO EM CASA ASSISTINDO O FILME DO PELÉ!!!", "DEPOIS DESSA VOU COMPRAR UM CACHORRÃO!", 
                                "NAO TO CRENDO NO QUE EU TO VENDO!!!"};
        
        manifestacoesapoio = new String[] {"ESSE É O MESSI DO NOSSO TIME!", "VAI LÁ CAMPEÃO!", 
            "VOCÊ É O MELHOR!!!"
            
        };
        
        manifestacoescontraria = new String[] {
            "ESSE É PERNA DE PAU!", "VAI ERRAAAAAAR!!!", "SEU RUIM!!!"
        };
        
        
        
    }
    
    
    public void setTorcedor(Torcedor t){
        this.torcedor=t;
    }
    public void InsereTorcedorTorcida(Torcedor trc){
        torcedores.add(trc);
    }
    
    public int aplaudir(){
        int soma=0;
        int media;
        for(int i=0; i<50; i++){
            soma = soma + this.torcedores.get(i).apoiar();            
        }
       
        media = soma/50;
        return media;
    }
    
    public int vaiar(){
        int soma = 0;
        int media;
        for(int i=0; i<50; i++){
            soma = soma + this.torcedores.get(i).xingar();
        }
        
        media = soma/50;
        return media;
    }
    
    public void comemorar(){
        int opcao;
		Random aleatorio = new Random();
		
		opcao = aleatorio.nextInt(this.comemoracoes.length);
		System.out.println("A torcida do " + this.time.getNome() + " comemora: \"" + this.comemoracoes[opcao] + '"');
    }
    
    public void lamentar(){
        int opcao;
		Random aleatorio = new Random();
		
		opcao = aleatorio.nextInt(this.lamentacoes.length);
		System.out.println("A torcida do " + this.time.getNome() + " lamenta: \"" + this.lamentacoes[opcao] + '"');
    }
    
    public void manifestacaoapoio(){
        int opcao;
		Random aleatorio = new Random();
		
		opcao = aleatorio.nextInt(this.manifestacoesapoio.length);
		System.out.println("A torcida do " + this.time.getNome() + " apoia: \"" + this.manifestacoesapoio[opcao] + '"');
    }
    
    public void manifestacaocontraria(){
        int opcao;
		Random aleatorio = new Random();
		
		opcao = aleatorio.nextInt(this.manifestacoescontraria.length);
		System.out.println("A torcida do " + this.time.getNome() + " intimida: \"" + this.manifestacoescontraria[opcao] + '"');
    }
    
    public int printa(){
        return torcedores.size();
    }
   

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public List <Torcedor> getTorcedores() {
        return torcedores;
    }

    public void setTorcedores(List <Torcedor> torcedores) {
        this.torcedores = torcedores;
    }

    
}

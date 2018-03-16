/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorpenaltis;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author marcos
 */
public class Time {
    private String nome;
    private List <Jogador> jogadores = new ArrayList<>();
    private List <Jogador> equipe = new ArrayList<>();
    
    
    public Time(String n){
        nome=n;
        
    }
    
    public void InsereJogadorTime(Jogador j){
        jogadores.add(j);
    }
    
    public void InsereJogadorEquipe(Jogador j){
        equipe.add(j);
    }
    
    public String printaTimes(Time t){
        String mostra;
        mostra="\nTime "+t.nome+": ";
        for(int i=0; i<jogadores.size(); i++){
            mostra = mostra + "\n" + i + " - " + jogadores.get(i).getNome() + "\t  - Confiança: " + jogadores.get(i).getConfiancaJog() + "\t  - Qualidade: " + jogadores.get(i).getQualidadeJog();
        }
     
        return mostra;
    }
    
    
    
    public String printaEquipes(Time t){
        String mostra;
        
        mostra="\nEquipe do time "+t.nome+": ";
        for(int i=0; i<equipe.size(); i++){
            mostra = mostra + "\n" + equipe.get(i).getNome() + "\t        - Confiança: " + equipe.get(i).getConfiancaJog() + "\t     - Qualidade: " + equipe.get(i).getQualidadeJog();
        }
        mostra=mostra+"\n";
        return mostra;
    }
    
    public String printaBatedores(Time t){
        String mostra;
        mostra="\nTime "+t.nome+": ";
        for(int i=0; i<jogadores.size()-1; i++){
            mostra = mostra + "\n" + i + " - " + jogadores.get(i).getNome() + "\t      - Confiança: " + jogadores.get(i).getConfiancaJog() + "\t     - Qualidade: " + jogadores.get(i).getQualidadeJog();
        }
     
        return mostra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List <Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List <Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public List <Jogador> getEquipe() {
        return equipe;
    }

    public void setEquipe(List <Jogador> equipe) {
        this.equipe = equipe;
    }
    
    
}

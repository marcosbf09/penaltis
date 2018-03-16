/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorpenaltis;

import java.util.Scanner;



/**
 *
 * @author marcos
 */
public class SimuladorPenaltis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
     
        System.out.println("\t\t>>>> SIMULADOR DE PENALTIS <<<< \n");
        System.out.println("\t\t:: Partida dos times: CAMPO BELO X PORTO ALEGRE ::\n");
        System.out.println("\t\t Você fará parte do time: CAMPO BELO ");
        System.out.println("\t\t Time adversário: PORTO ALEGRE \n");
        
      
        Time time1 = new Time("CAMPO BELO");
        Time time2 = new Time("PORTO ALEGRE");
        
        Batedor j1 = new Batedor("FELIPE", time1, 10, 10); //incluindo qualidade e confianca
        Batedor j2 = new Batedor("PEDRO", time1, 9, 10);
        Batedor j3 = new Batedor("BERNARDO", time1, 10, 8);
        Batedor j4 = new Batedor("AFONSO", time1, 10, 9);
        Batedor j5 = new Batedor("ROBERTO", time1, 8, 10);
        Batedor j6 = new Batedor("ALEX", time1, 8, 7);
        Batedor j7 = new Batedor("CHICO", time1, 10, 8);
        Batedor j8 = new Batedor("RAUL", time1, 10, 9);
        Batedor j9 = new Batedor("BENTO", time1, 9, 10);
        Batedor j10 = new Batedor("MÁSSIMO", time1, 10, 9);
        Goleiro j11 = new Goleiro("MATEUS", time1, 9, 10);
        
        Batedor j12 = new Batedor("MICHAEL", time2, 10, 10);
        Batedor j13 = new Batedor("MATHEUS", time2, 9, 7);
        Batedor j14 = new Batedor("FABIO", time2, 10, 9);
        Batedor j15 = new Batedor("LUCAS", time2, 8, 9);
        Batedor j16 = new Batedor("RAFAEL", time2, 9, 8);
        Batedor j17 = new Batedor("THIAGO", time2, 9, 10);
        Batedor j18 = new Batedor("MARCELO", time2, 10, 7);
        Batedor j19 = new Batedor("JOÃO", time2, 8, 8);
        Batedor j20 = new Batedor("EDUARDO", time2, 8, 7);
        Batedor j21 = new Batedor("DOUGLAS", time2, 10, 8);
        Goleiro j22 = new Goleiro("DIOGO", time2, 9, 10);
        
        
        //inserindo jogadores nos times
        time1.InsereJogadorTime(j1);
        time1.InsereJogadorTime(j2);
        time1.InsereJogadorTime(j3);
        time1.InsereJogadorTime(j4);
        time1.InsereJogadorTime(j5);
        time1.InsereJogadorTime(j6);
        time1.InsereJogadorTime(j7);
        time1.InsereJogadorTime(j8);
        time1.InsereJogadorTime(j9);
        time1.InsereJogadorTime(j10);
        time1.InsereJogadorTime(j11);
        
        time2.InsereJogadorTime(j12);
        time2.InsereJogadorTime(j13);
        time2.InsereJogadorTime(j14);
        time2.InsereJogadorTime(j15);
        time2.InsereJogadorTime(j16);
        time2.InsereJogadorTime(j17);
        time2.InsereJogadorTime(j18);
        time2.InsereJogadorTime(j19);
        time2.InsereJogadorTime(j20);
        time2.InsereJogadorTime(j21);
        time2.InsereJogadorTime(j22);
        
        Torcida torcida1 = new Torcida(time1);
        Torcida torcida2 = new Torcida(time2);
       
        //inserindo os batedores e goleiro na equipe da máquina
        time2.InsereJogadorEquipe(j12);
        time2.InsereJogadorEquipe(j13);
        time2.InsereJogadorEquipe(j14);
        time2.InsereJogadorEquipe(j15);
        time2.InsereJogadorEquipe(j16);
        time2.InsereJogadorEquipe(j22);
        
        int op=-1;
        
        //opção para o usuário ver a lista de jogadores dos times
        while(op!=1||op!=2){
            System.out.println("Deseja ver a lista de jogadores de cada time?\n");
            System.out.println("1 - SIM\n2 - NAO");
            op = entrada.nextInt();
            if(op!=1&&op!=2){
                System.out.println("Opçao incorreta! Tente novamente \n");
            }
            
            if(op==1){
               System.out.println(time1.printaTimes(time1));
               System.out.println(time2.printaTimes(time2));
               System.out.println("\n");
               break;
            }
            if(op==2){
                System.out.println("A PARTIDA ESTÁ PARA COMEÇAR, PREPARE-SE! \n");
                break;
                        
            }
            
        }
        
        //escolha dos batedores do time do usuário
        int i=0;
        System.out.println("Escolha os batedores que irão cobrar os penaltis!\n");
        System.out.println(time1.printaBatedores(time1));
        System.out.println("\n");
        while(i!=5){
           System.out.println("Escolha o batedor (digite o numero): "); 
           op=entrada.nextInt();
           if(op==0){
              time1.InsereJogadorEquipe(j1);
              i++;
           }
           if(op==1){
              time1.InsereJogadorEquipe(j2);
              i++;
           }
           if(op==2){
              time1.InsereJogadorEquipe(j3);
              i++;
           }
           if(op==3){
              time1.InsereJogadorEquipe(j4);
              i++;
           }
           if(op==4){
              time1.InsereJogadorEquipe(j5);
              i++;
           }
           if(op==5){
              time1.InsereJogadorEquipe(j6);
              i++;
           }
           if(op==6){
              time1.InsereJogadorEquipe(j7);
              i++;
           }
           if(op==7){
              time1.InsereJogadorEquipe(j8);
              i++;
           }
           if(op==8){
              time1.InsereJogadorEquipe(j9);
              i++;
           }
           if(op==9){
              time1.InsereJogadorEquipe(j10);
              i++;
           }
           if(op<0||op>9){
              System.out.println("Opçao incorreta, digite novamente!\n"); 
           }
           
        }
        time1.InsereJogadorEquipe(j11); //inserindo o goleiro
        
        //imprimido as equipes
        System.out.println("\nE os batedores e goleiros de cada time serão: \n");
        System.out.println(time1.printaEquipes(time1));
        System.out.println(time2.printaEquipes(time2));
        System.out.println("\n");
       
        
        //gerando o apoio e as vaias das torcidas
        int apoio1, apoio2, vaiar1, vaiar2; 
        
        apoio1 = torcida1.aplaudir();
        vaiar1 = torcida1.vaiar();
        
        apoio2 = torcida2.aplaudir();
        vaiar2 = torcida2.vaiar();
        
        //inicio da partida
        
        int c=0, timecampeao=0, rodada=1; //a variavel c é o indice que será usado para os batedores, a variavel timecampeao é usada no while para o caso de empate
        //e a variavel rodada é usada apenas para printar em qual rodada a partida está
        int gols1=0, gols2=0; //contadores dos gols feitos na partida 
        int menu;
        
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
        System.out.println("A PARTIDA DE PENALTIS VAI COMEÇAR, A TORCIDA VAI A LOUCURA!!!\n");
        
        while(timecampeao==0){
        
            String nome;
            Ponto batedorponto, goleiroponto; //variaveis usadas para a escolha dos pontos
            int quali1, quali2; //variaveis usadas para comparação, em caso da escolha dos pontos ser igual para batedor e goleiro
            int conf, quali; //variaveis usadas para retornar confiança e qualidade dos jogadores
            
            
            
            System.out.println("\n>>>>>>>>>> RODADA: " +rodada+ " <<<<<<<<<<\n");
            System.out.println("É A VEZ DO TIME CAMPO BELO COBRAR O PENALTI!\n");
            
            System.out.println("Deseja ver a equipe de algum time? Se sim, digite 1 para sua equipe, 2 para ambas ou outro valor para continuar");
            menu=entrada.nextInt();
            if(menu==1){
              System.out.println(time1.printaEquipes(time1));  
            }else if(menu==2){
              System.out.println(time1.printaEquipes(time1));
              System.out.println(time2.printaEquipes(time2));   
            }
            else{
                System.out.println("");
            }
            

            nome=time2.getEquipe().get(5).getNome();
            System.out.println("O goleiro "+nome+" do time adversário vai para o gol!");
            System.out.println("A torcida do "+time1.getNome()+" começa a vaia-lo, porém a torcida do "+time2.getNome()+" está o apoiando");
            
            time2.getEquipe().get(5).InfluenciaTorcida(apoio2, vaiar1); //atualizando confiança e qualidade de acordo com as torcidas
            
            goleiroponto=time2.getEquipe().get(5).direcionar(2);
            
            
           
            //SUA COBRANÇA DE PENALTI
            
            
            nome=time1.getEquipe().get(c).getNome();
            System.out.println("\nO jogador "+nome+" do seu time vai para área e se prepara para chutar! \n");
            torcida1.manifestacaoapoio();
            torcida2.manifestacaocontraria();
            System.out.println("A torcida do "+time2.getNome()+" começa a vaia-lo, porém a torcida do "+time1.getNome()+" está o apoiando\n");
            
            
            time1.getEquipe().get(c).InfluenciaTorcida(apoio1, vaiar2);
            conf=time1.getEquipe().get(c).getConfiancaJog(); 
            quali=time1.getEquipe().get(c).getQualidadeJog();
            System.out.println("Deseja ver a confiança e qualidade atualizadas do seu batedor? Se sim, digite 1");
            menu=entrada.nextInt();
            if(menu==1){
                System.out.println("Sua confiança agora é de: "+conf+" e sua qualidade é de: "+quali);
            }
            else{
                System.out.println("");
            }
            System.out.println("\n>>> Escolha a direção do chute: ");
         
            //ESCOLHA DO PONTO DO CHUTE DO SEU BATEDOR
             
            batedorponto=time1.getEquipe().get(c).direcionar(1);
    
           
            boolean chute_erro = batedorponto.errar(); //retornando se o batedor errou ou nao
            boolean defesa_erro = goleiroponto.errar(); //retornando se o goleiro errou ou nao
            
            //pegando as qualidades de ambos (batedor e goleiro) para fazer as comparações necessárias
            quali1=time1.getEquipe().get(c).getQualidadeJog(); 
            quali2=time2.getEquipe().get(5).getQualidadeJog();
            
            time1.getEquipe().get(c).chutar(batedorponto);
            time2.getEquipe().get(5).defender(goleiroponto);
            
            
            //COMEÇANDO AS VERIFICAÇÕES
            
            if(goleiroponto==batedorponto && !chute_erro && !defesa_erro){ //jogaram para a mesma direcao e os 2 nao erraram
                if(quali1<quali2){
                   System.out.println("\nO GOLEIRO DEFENDEU!!!!!! \n"); 
                   torcida2.comemorar();
                   torcida1.lamentar();
                   System.out.println("..............................................................................."); 
                   System.out.println("\nPLACAR ATUAL: \nTIME CAMPO BELO: " + gols1 + " X TIME PORTO ALEGRE:  " + gols2 + "\n");
                   System.out.println("...............................................................................");
                   
                   
                   
                }else{
                   System.out.println("\nÉ GOOOOOOOOOOOOOOOOOOL!!!!!! o/ o/ o/\n"); 
                   torcida1.comemorar();
                   torcida2.lamentar();
                   gols1++;
                   System.out.println("...............................................................................");
                   System.out.println("\nPLACAR ATUAL: \nTIME CAMPO BELO: " + gols1 + " X TIME PORTO ALEGRE:  " + gols2 + "\n");
                   System.out.println("...............................................................................");
                   
                }
                
            }
            if(goleiroponto==batedorponto && !defesa_erro && chute_erro){ //chutaram para a mesma direçao, o goleiro acertou e o batedor errou
                System.out.println("\nO GOLEIRO DEFENDEU!!!!!! \n"); 
                torcida2.comemorar();
                torcida1.lamentar();
                System.out.println("..............................................................................."); 
                System.out.println("\nPLACAR ATUAL: \nTIME CAMPO BELO: " + gols1 + " X TIME PORTO ALEGRE:  " + gols2 + "\n");
                System.out.println("...............................................................................");
            }
            if(batedorponto==goleiroponto && defesa_erro && !chute_erro){ //escolheram a mesma direçao e o goleiro errou e o batedor acertou
                System.out.println("\nÉ GOOOOOOOOOOOOOOOOOOL!!!!!! o/ o/ o/\n"); 
                torcida1.comemorar();
                torcida2.lamentar();
                gols1++;
                System.out.println("...............................................................................");
                System.out.println("\nPLACAR ATUAL: \nTIME CAMPO BELO: " + gols1 + " X TIME PORTO ALEGRE:  " + gols2 + "\n");
                System.out.println("...............................................................................");
            }
            if(batedorponto==goleiroponto && defesa_erro && chute_erro){ //os dois erraram
                System.out.println("\nCHUTOU PRA FORAAAAAAAA!!!!!! \n"); 
                torcida2.comemorar();
                torcida1.lamentar();
                System.out.println("..............................................................................."); 
                System.out.println("\nPLACAR ATUAL: \nTIME CAMPO BELO: " + gols1 + " X TIME PORTO ALEGRE:  " + gols2 + "\n");
                System.out.println("...............................................................................");
            }
            
            if(batedorponto!=goleiroponto){
              if(!chute_erro){
                System.out.println("\nÉ GOOOOOOOOOOOOOOOOOOL!!!!!! o/ o/ o/\n"); 
                torcida1.comemorar();
                torcida2.lamentar();
                gols1++;
                System.out.println("...............................................................................");
                System.out.println("\nPLACAR ATUAL: \nTIME CAMPO BELO: " + gols1 + " X TIME PORTO ALEGRE:  " + gols2 + "\n");
                System.out.println("...............................................................................");  
              }
              else{
                System.out.println("\nCHUTOU PRA FORAAAAAAAA!!!!!! \n"); 
                torcida2.comemorar();
                torcida1.lamentar();
                System.out.println("..............................................................................."); 
                System.out.println("\nPLACAR ATUAL: \nTIME CAMPO BELO: " + gols1 + " X TIME PORTO ALEGRE:  " + gols2 + "\n");
                System.out.println("...............................................................................");  
              }
            }
            rodada++;
            
            
            System.out.println("\n>>>>>>>>>> RODADA: " +rodada+ " <<<<<<<<<<\n");
            System.out.println("É A VEZ DO TIME PORTO ALEGRE COBRAR O PENALTI!\n");
            
            System.out.println("Deseja ver os batedores de algum time? Se sim, digite 1 para sua equipe, 2 para ambos ou outro valor para continuar");
            menu=entrada.nextInt();
            if(menu==1){
              System.out.println(time1.printaEquipes(time1));
              
            }else if(menu==2){
              System.out.println(time1.printaEquipes(time1));
              System.out.println(time2.printaEquipes(time2));   
            }
            else{
                System.out.println("");
            }
        
            //SEU GOLEIRO SE PREPARA
            nome=time1.getEquipe().get(5).getNome();
            System.out.println("\nO goleiro "+nome+" do seu time vai para o gol!");
            System.out.println("A torcida do "+time2.getNome()+" começa a vaia-lo, porém a torcida do "+time1.getNome()+" está o apoiando\n");
            
  
            time1.getEquipe().get(5).InfluenciaTorcida(apoio2, vaiar1); 
            conf=time1.getEquipe().get(5).getConfiancaJog(); 
            quali=time1.getEquipe().get(5).getQualidadeJog(); 
            
            System.out.println("Deseja ver a confiança e qualidade atualizadas do seu goleiro? Se sim, digite 1");
            menu=entrada.nextInt();
            if(menu==1){
               System.out.println("Sua confiança agora é de: "+conf+" e sua qualidade é de: "+quali); 
            }
            else{
                System.out.println("");
            }
              

            //TIME ADVERSARIO VAI CHUTAR
            
            
            nome=time2.getEquipe().get(c).getNome();
            System.out.println("\nO jogador "+nome+" do time adversário vai para área e se prepara para chutar! ");
            torcida2.manifestacaoapoio();
            torcida1.manifestacaocontraria();
            System.out.println("\nA torcida do "+time1.getNome()+" começa a vaia-lo, porém a torcida do "+time2.getNome()+" está o apoiando\n");
            
            
            time2.getEquipe().get(c).InfluenciaTorcida(apoio2, vaiar1);
            
            //o ponto do chute do adversário é gerado aleatóriamente
            batedorponto=time2.getEquipe().get(c).direcionar(2);
            
            //seu goleiro vai defender
            System.out.println("\n>>>Escolha o ponto em que o goleiro vai fazer a defesa: \n");
            goleiroponto=time1.getEquipe().get(5).direcionar(1);
            
            
            //qualidades de ambos para serem usadas em comparações necessárias
            quali1=time1.getEquipe().get(5).getQualidadeJog();
            quali2=time2.getEquipe().get(c).getQualidadeJog();
            
            time2.getEquipe().get(c).chutar(batedorponto);
            time1.getEquipe().get(5).defender(goleiroponto);
           
            //COMEÇAM AS VERIFICAÇÕES 
            
            if(goleiroponto==batedorponto && !chute_erro && !defesa_erro){ //jogaram para a mesma direcao e os 2 nao erraram
                if(quali1<quali2){
                   System.out.println("\nO GOLEIRO DEFENDEU!!!!!! \n"); 
                   torcida1.comemorar();
                   torcida2.lamentar();
                   System.out.println("..............................................................................."); 
                   System.out.println("\nPLACAR ATUAL: \nTIME CAMPO BELO: " + gols1 + " X TIME PORTO ALEGRE:  " + gols2 + "\n");
                   System.out.println("...............................................................................");
                   
                }else{
                   System.out.println("\nÉ GOOOOOOOOOOOOOOOOOOL!!!!!! o/ o/ o/\n"); 
                   torcida2.comemorar();
                   torcida1.lamentar();
                   gols2++;
                   System.out.println("...............................................................................");
                   System.out.println("\nPLACAR ATUAL: \nTIME CAMPO BELO: " + gols1 + " X TIME PORTO ALEGRE:  " + gols2 + "\n");
                   System.out.println("...............................................................................");
                }
                
            }
            if(batedorponto==goleiroponto && !defesa_erro && chute_erro){ //chutaram para a mesma direçao, o goleiro acertou e o batedor errou
                System.out.println("\nO GOLEIRO DEFENDEU!!!!!! \n"); 
                torcida1.comemorar();
                torcida2.lamentar();
                System.out.println("..............................................................................."); 
                System.out.println("\nPLACAR ATUAL: \nTIME CAMPO BELO: " + gols1 + " X TIME PORTO ALEGRE:  " + gols2 + "\n");
                System.out.println("...............................................................................");
            }
            if(batedorponto==goleiroponto && defesa_erro && !chute_erro){ //escolheram a mesma direçao e o goleiro errou e o batedor acertou
                System.out.println("\nÉ GOOOOOOOOOOOOOOOOOOL!!!!!! o/ o/ o/\n"); 
                torcida2.comemorar();
                torcida1.lamentar();
                gols2++;
                System.out.println("...............................................................................");
                System.out.println("\nPLACAR ATUAL: \nTIME CAMPO BELO: " + gols1 + " X TIME PORTO ALEGRE:  " + gols2 + "\n");
                System.out.println("...............................................................................");
            }
            if(batedorponto==goleiroponto && defesa_erro && chute_erro){ //os dois erraram
                System.out.println("\nCHUTOU PRA FORAAAAAAAA!!!!!! \n"); 
                torcida1.comemorar();
                torcida2.lamentar();
                System.out.println("..............................................................................."); 
                System.out.println("\nPLACAR ATUAL: \nTIME CAMPO BELO: " + gols1 + " X TIME PORTO ALEGRE:  " + gols2 + "\n");
                System.out.println("...............................................................................");
            }
            
            if(batedorponto!=goleiroponto){
              if(!chute_erro){
                System.out.println("\nÉ GOOOOOOOOOOOOOOOOOOL!!!!!! o/ o/ o/\n"); 
                torcida2.comemorar();
                torcida1.lamentar();
                gols2++;
                System.out.println("...............................................................................");
                System.out.println("\nPLACAR ATUAL: \nTIME CAMPO BELO: " + gols1 + " X TIME PORTO ALEGRE:  " + gols2 + "\n");
                System.out.println("...............................................................................");  
              }
              else{
                System.out.println("\nCHUTOU PRA FORAAAAAAAA!!!!!! \n"); 
                torcida1.comemorar();
                torcida2.lamentar();
                System.out.println("..............................................................................."); 
                System.out.println("\nPLACAR ATUAL: \nTIME CAMPO BELO: " + gols1 + " X TIME PORTO ALEGRE:  " + gols2 + "\n");
                System.out.println("...............................................................................");  
              }
            }
            rodada++;
            
            c++;
            
            if(c==5){
                if(gols1>gols2){
                    timecampeao=1; 
                    System.out.println("\n\n////////////////////////////////////////////////////");
                    System.out.println("O TIME "+time1.getNome()+" É O GRANDE CAMPEÃO!!!! o/ o/ o/ ");
                    System.out.println("///////////////////////////////////////////////////////\n\n");
                    
                    System.out.println("\n\n\n FIM DE PARTIDA, ESSA VAI FICAR PARA A HISTÓRIA!\n\n\n");
                }
                else if(gols1<gols2){
                    timecampeao=2;
                    System.out.println("\n\n///////////////////////////////////////////////////");
                    System.out.println("O TIME "+time2.getNome()+" É O GRANDE CAMPEÃO!!!! o/ o/ o/ ");
                    System.out.println("///////////////////////////////////////////////////////\n\n");
                    
                    System.out.println("\n\n\n FIM DE PARTIDA, ESSA VAI FICAR PARA A HISTÓRIA!\n\n\n");
                    
                }else{
                    timecampeao=0; 
                    c=0;
                    System.out.println("\n\n//////////////////////////////////");
                    System.out.println("A PARTIDA AINDA NAO ESTÁ DECIDIDA!!! ");
                    System.out.println("//////////////////////////////////////\n\n");
                    
                }
                  
            }
            
        }
           
    }
    
}

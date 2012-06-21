package fases;
import modelo.Estrela;
import corallus.modelo.Tabuleiro;

public class Fase2 extends defaultFase {

    int qntd,bonus;
   
    @Override
    public void iniciar() {
        
        
        bordaPedra();
        for(int i=76;i<1427;i=i+50){
           addPedra(i);
        }
        for (int i=752;i<776;i++){
            addPedra(i);
        }
        for (int i=776;i<800;i++){
            addPedra(i);
        }
        
        novaComida();
        //  Retira as pedras nas posição informada//
        Tabuleiro.getInstance().getCasa(753).desocupar();
        Tabuleiro.getInstance().getCasa(1376).desocupar();
        Tabuleiro.getInstance().getCasa(797).desocupar();
        Tabuleiro.getInstance().getCasa(773).desocupar();
        Tabuleiro.getInstance().getCasa(779).desocupar();
        Tabuleiro.getInstance().getCasa(926).desocupar();
        Tabuleiro.getInstance().getCasa(626).desocupar();
        Tabuleiro.getInstance().getCasa(126).desocupar();
        Tabuleiro.getInstance().getCasa(776).desocupar();
        
        // cria uma estrela no centro 
        setItem(776, new Estrela());
        
       
    }

    @Override
    public String getTextoFase() {
        return "Coma a estrela para ganhar a fase.";
    }
    
  

    @Override
    public void comeu() {
        novaComida();
        addPontos(10);  
        addRabo();
        qntd++;
        bonus++;

        //  adiciona 5 rabos, aparece novo item de 40 pontos, desocupa uma pedra
        // para pegar aa estrela
      if (qntd == 5){      
            novoitem();
             
            addRabo();
            addRabo();
            addRabo();
            Tabuleiro.getInstance().getCasa(774).desocupar();
      }
      
      if(bonus==7){
         bonus(774);  
       
      }

      if (qntd == 10){      
            novoitem();
            addRabo();
            addRabo();
            addRabo();
            Tabuleiro.getInstance().getCasa(676).desocupar();
      }
      
      if(bonus==14){
         bonus(676);  
        
      }
      
      if (qntd == 15){      
            novoitem();
            addRabo();
            addRabo();
            addRabo();
            Tabuleiro.getInstance().getCasa(778).desocupar();
      }
      
      if(bonus==21){
         bonus(778);  
        
      }
            
      if (qntd == 20){      
            novoitem();
            addRabo();
            addRabo();
            addRabo();
            Tabuleiro.getInstance().getCasa(876).desocupar();
      }    
      if(bonus==28){
         bonus(876);  
       
      }
      
      
      if (qntd == 25){      
            novoitem();
            addRabo();
            addRabo();
            addRabo();
            Tabuleiro.getInstance().getCasa(775).desocupar();
      }
      if(bonus==35){
         bonus(775);  
        
      }
           
      
      if (qntd == 30){      
            novoitem();
            addRabo();
            addRabo();
            addRabo();
            Tabuleiro.getInstance().getCasa(726).desocupar();
      }
      
      if(bonus==42){
         bonus(726);  
        
      }
                 
      if (qntd == 35){      
            novoitem();
            addRabo();
            addRabo();
            addRabo();
            Tabuleiro.getInstance().getCasa(777).desocupar();
      }
      
      if(bonus==49){
         bonus(777);  
       
      }
      
            if (qntd == 40){      
            novoitem();
            addRabo();
            addRabo();
            addRabo();
            Tabuleiro.getInstance().getCasa(826).desocupar();
            bonus(826);
      }
            
      if(bonus==56){
         bonus(826);  
       
      }
        
        
    }
    
}

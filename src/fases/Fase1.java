package fases;

import modelo.Buraco;
import modelo.Porta;

public class Fase1 extends defaultFase {  
    int pontos;

    @Override
    public void iniciar() {
        
        pontos = 0;
        
        //já exibe comida
        novaComida(86);
        novaComida(358);
        novaComida(743);
        novaComida(873);
        novaComida(1216);
        
        //desenha as paredes
        linhaHorizontalPedra(1, 40);
        linhaHorizontalPedra(120, 30);
        linhaHorizontalPedra(253, 8);
        
        
        linhaHorizontalPedra(590, 6);
        linhaHorizontalPedra(842, 6);
        linhaHorizontalPedra(1111, 8);
        linhaHorizontalPedra(1201, 7);

        linhaHorizontalPedra(1470, 24);
   
          
        linhaVerticalPedra(110, 26);
       
        linhaVerticalPedra(597, 4);     
        linhaVerticalPedra(690, 4);
         linhaVerticalPedra(1121, 5);
       
        
        
        //crio uma caixa aberta
        
        caixaPedraAberta(621, 7, 7);
        
        
        //adicione os objetos porta e buraco
        setItem(1482, new Porta());
        setItem(725, new Buraco());
 

              
    }

    @Override
    public void comeu() {
        
        pontos += 20;
        
        if(pontos == 100) {
           // caixaPedra(876, 3);
            mudarFase();
            
        } else {
            addPontos(20);
            addRabo();
            aumentarVelocidade(2);
        }
        
        
    }   
    
    @Override
    public String getTextoFase() {
        return "Faça 100 pontos para passar de fase.";
    }
    
}

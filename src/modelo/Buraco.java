/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import corallus.modelo.Customizado;
import corallus.modelo.Fase;

/**
 *
 * @author Allan
 */public class Buraco extends Customizado {
    
     int pos;
    


    @Override
    public String getImagemPath() {
        return "resource/buraco.png";
    }
    
    
    
    @Override
    public void acao( Fase f) {
        
        f.moverPara(776, f.DIREITA);
    }
    
}

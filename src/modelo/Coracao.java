package modelo;

import corallus.modelo.Customizado;
import corallus.modelo.Fase;


public class Coracao extends Customizado {

    @Override
    public String getImagemPath() {
        return "resource/heart.png"; 
    }

    @Override
    public void acao(Fase f) {
        f.moverPara(647, f.DIREITA);
    }
    
}

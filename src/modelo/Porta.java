
package modelo;

import corallus.modelo.Customizado;
import corallus.modelo.Fase;

public class Porta extends Customizado {

    @Override
    public String getImagemPath() {
        return "resource/porta.png";
    }

    @Override
    public void acao(Fase f) {
       f.moverPara(725, f.ESQUERDA);
    }
    
}


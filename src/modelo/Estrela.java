
package modelo;

import corallus.modelo.Customizado;
import corallus.modelo.Fase;

public class Estrela extends Customizado {

    @Override
    public String getImagemPath() {
        return "resource/estrela.gif";
    }

    @Override
    public void acao(Fase f) {
       f.fim();
    }
    
}

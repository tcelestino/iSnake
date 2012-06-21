package fases;

import corallus.modelo.Bandeira;
import corallus.modelo.Comida;
import corallus.modelo.Fase;

public abstract class defaultFase extends Fase {

    @Override
    public abstract void iniciar();
    @Override
    public abstract void comeu();

    @Override
    public String getTituloFase() {
        return "iSnake 1.0";
    }
    
    
    public final void novaComida(int pos) {
        getTabuleiro().getCasa(pos).setItem(new Comida());
        getTabuleiro().addAlteracao(pos);

    }

    public final void novaComida() {
        novaComida(getPosDesocupada());

    }
    
    public final void bonus(int pos) {
        getTabuleiro().getCasa(pos).setItem(new Bandeira());
        getTabuleiro().addAlteracao(pos);

    }
    
    public final void novoitem(int pos) {
        getTabuleiro().getCasa(pos).setItem(new Bandeira());
        getTabuleiro().addAlteracao(pos);

    }  
    public final void novoitem() {
        novoitem(getPosDesocupada());

    }
    
}

package demo;
import corallus.Config;
import fases.Fase1;
import fases.Fase2;

public class App extends Config {

    public static void main(String[] args) {
        //SHOW_NUM = true;
        addFase(new Fase1());
        addFase(new Fase2());
        iniciar();
    }
}

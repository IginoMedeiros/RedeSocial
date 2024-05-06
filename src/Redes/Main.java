package Redes;

import java.io.IOException;

public class Main {
    public static void main(String[] args)throws IOException {
        RedeSocial OGrandePapagaio = new RedeSocial();
        Usuario daniel = new Usuario("Daniel");
        daniel.postar("Daniel", "java 10 é massa");
        daniel.Seguir("igino");
        Usuario caio = new Usuario("caio");
        caio.postar("caio", "Streams é a melhor novidade do java");
        caio.Seguir("daniel");
        daniel.VisualisarMural();
        caio.VisualisarMural();

    }
}
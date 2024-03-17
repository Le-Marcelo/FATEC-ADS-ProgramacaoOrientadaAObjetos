package view;

import model.Musica;
import model.Playlist;

public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.setNome("Musica1");
        musica1.setAutor("Autor1");
        musica1.setGravadora("Gravadora1");

        Musica musica2 = new Musica();
        musica2.setNome("Musica2");
        musica2.setAutor("Autor2");
        musica2.setGravadora("Gravadora2");

        Musica musica3 = new Musica();
        musica3.setNome("Musica3");
        musica3.setAutor("Autor3");
        musica3.setGravadora("Gravadora3");

        Playlist playlist = new Playlist();
        playlist.adicionarMusica(musica1);
        playlist.adicionarMusica(musica2);
        playlist.adicionarMusica(musica3);

        System.out.println("Músicas em ordem:");
        playlist.tocarMusicas();
        System.out.println("Músicas em ordem aleatória:");
        playlist.reproducaoAleatoria();
    }
}

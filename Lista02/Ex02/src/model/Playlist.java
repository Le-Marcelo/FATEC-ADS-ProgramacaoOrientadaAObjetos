package model;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Musica> listaMusicas = new ArrayList<>();
    private String dono;
    
    public Playlist() {
    }

    public List<Musica> getListaMusicas() {
        return listaMusicas;
    }

    public void setListaMusicas(List<Musica> listaMusicas) {
        this.listaMusicas = listaMusicas;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void adicionarMusica(Musica musica){
        listaMusicas.add(musica);
    }

    public void tocarMusicas(){
        for(int i = 0; i < listaMusicas.size(); i++){
            System.out.println(listaMusicas.get(i).getNome());
        }
    }

    public void reproducaoAleatoria(){
        for(int i = 0; i < listaMusicas.size(); i++){
            int numAleatorio = (int) (Math.random() * listaMusicas.size());
            System.out.println(listaMusicas.get(numAleatorio).getNome());
        }
    }
}

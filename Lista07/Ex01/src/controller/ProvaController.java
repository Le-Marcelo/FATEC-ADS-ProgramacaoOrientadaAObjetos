package controller;

import java.util.ArrayList;
import java.util.List;

import model.Prova;

public class ProvaController implements IListaController<Prova>{

    private List<Prova> lista;

    public ProvaController() {
        lista = new ArrayList<>();
    }

    @Override
    public void addElemento(Prova prova) {
        lista.add(prova);
    }

    @Override
    public Prova buscaElemento(int posicao) {
        return lista.get(posicao);
    }

    @Override
    public void limparLista() {
        lista.clear();
    }

    @Override
    public void removeElemento(Prova t) {
        lista.remove(t);
    }
    
    
}

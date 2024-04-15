package controller;

import java.util.ArrayList;
import java.util.List;

import model.Atividade;

public class AtividadeController implements IListaController<Atividade>{

    private List<Atividade> lista;

    public AtividadeController() {
        lista = new ArrayList<>();
    }

    @Override
    public void addElemento(Atividade atividade) {
        lista.add(atividade);
    }

    @Override
    public Atividade buscaElemento(int posicao) {
        return lista.get(posicao);
    }

    @Override
    public void limparLista() {
        lista.clear();
    }

    @Override
    public void removeElemento(Atividade atividade) {
        lista.remove(atividade);
    }
    
    
}

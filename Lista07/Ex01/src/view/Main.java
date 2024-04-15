package view;

import controller.AtividadeController;
import controller.ProvaController;
import model.Atividade;
import model.Prova;

public class Main {
    public static void main(String[] args) {
        ProvaController provaController = new ProvaController();
        AtividadeController atividadeController = new AtividadeController();

        //Criar Provas e inserir na lista
        for(int i = 0; i < 10; i++){
            Prova prova = new Prova();
            prova.setNumeroQuestoes(i + 5);
            prova.setMediaNotas((float) (Math.random() * 10));
            provaController.addElemento(prova);
        }

        //Criar Atividades e inserir na lista
        for(int i = 0; i < 10; i++){
            Atividade atividade = new Atividade();
            atividade.setAssunto("Atividade número " + (i + 1));
            atividade.setQuantidadePaginas(i + 3);
            atividadeController.addElemento(atividade);
        }

        //Buscar elementos dentro da lista e exibir
        System.out.println(provaController.buscaElemento(3).toString());
        System.out.println(atividadeController.buscaElemento(7).toString());

        //Limpar as listas
        provaController.limparLista();
        atividadeController.limparLista();

    }
}

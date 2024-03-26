package controller;

import model.Estudante;

public class EstudanteTecnicoController implements IEstudanteController{

    @Override
    public float percentualRendimento(Estudante est) {
        int qtdAprovacoes = Integer.parseInt(est.getQtdAprovacoes());
        return est.getMediaNotas() * qtdAprovacoes * 0.931f;
    }

    @Override
    public float percentualProgressao(Estudante est) {
        int qtdAprovacoes = Integer.parseInt(est.getQtdAprovacoes());
        return qtdAprovacoes / 3;
    }
    
}

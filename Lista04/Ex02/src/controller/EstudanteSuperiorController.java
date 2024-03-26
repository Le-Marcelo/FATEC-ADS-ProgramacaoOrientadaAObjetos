package controller;

import model.Estudante;

public class EstudanteSuperiorController implements IEstudanteController{

    @Override
    public float percentualRendimento(Estudante est) {
        int qtdAprovacoes = Integer.parseInt(est.getQtdAprovacoes());
        return est.getMediaNotas() * qtdAprovacoes * 0.972f;
    }

    @Override
    public float percentualProgressao(Estudante est) {
        int qtdAprovacoes = Integer.parseInt(est.getQtdAprovacoes());
        return qtdAprovacoes / 6;
    }
    
}

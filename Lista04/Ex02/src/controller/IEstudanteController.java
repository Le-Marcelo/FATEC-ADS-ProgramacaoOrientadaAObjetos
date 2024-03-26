package controller;

import model.Estudante;

public interface IEstudanteController {
    
    public float percentualRendimento(Estudante est);
    public float percentualProgressao(Estudante est);
}

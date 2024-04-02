package controller;

import model.Imovel;

public interface ICalculoStrategy {
    public float calcularImposto(Imovel imovel);
}

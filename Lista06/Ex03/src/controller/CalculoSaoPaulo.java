package controller;

import model.Imovel;

public class CalculoSaoPaulo implements ICalculoStrategy{

    @Override
    public float calcularImposto(Imovel imovel) {
        return imovel.getAreaTotal() * 10 + imovel.getNumComodos() * 2;
    }
    
}

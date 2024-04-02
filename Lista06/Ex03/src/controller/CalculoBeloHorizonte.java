package controller;

import model.Imovel;

public class CalculoBeloHorizonte implements ICalculoStrategy{

    @Override
    public float calcularImposto(Imovel imovel) {
        return imovel.getAreaTotal() * 7 + imovel.getNumQuartos() * 4;
    }
    
    
}

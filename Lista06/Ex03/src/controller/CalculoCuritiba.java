package controller;

import model.Imovel;

public class CalculoCuritiba implements ICalculoStrategy{

    @Override
    public float calcularImposto(Imovel imovel) {
        float imposto = imovel.getAreaTotal() * 5;
        if(imovel.getIdade() < 20){
            return imposto + imovel.getIdade() * 2;
        }else if(imovel.getIdade() <= 50){
            return imposto + imovel.getIdade() * 2.5f;
        }else{
            return imposto + imovel.getIdade() * 3;
        }
    }
}

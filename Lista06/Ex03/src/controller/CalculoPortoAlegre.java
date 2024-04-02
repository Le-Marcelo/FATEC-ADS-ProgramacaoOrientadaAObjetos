package controller;

import model.Imovel;

public class CalculoPortoAlegre implements ICalculoStrategy{

    @Override
    public float calcularImposto(Imovel imovel) {
        if(imovel.getAreaGaragem() > 0){
            return imovel.getAreaTotal() * 7.5f + imovel.getAreaGaragem() * 2.5f;
        }else{
            return imovel.getAreaTotal() * 8;
        }
    }
    
    
}

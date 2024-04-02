package view;

import controller.CalculoBeloHorizonte;
import controller.CalculoCuritiba;
import controller.CalculoPortoAlegre;
import controller.CalculoSaoPaulo;
import controller.ICalculoStrategy;
import model.Imovel;

public class Main {
    public static void main(String[] args) {
        Imovel imovel = new Imovel();
        imovel.setAreaTotal(50);
        imovel.setNumComodos(5);
        imovel.setNumQuartos(2);
        imovel.setAreaGaragem(10);
        imovel.setIdade(10);

        ICalculoStrategy calculo = new CalculoSaoPaulo();
        System.out.println("Imposto em São Paulo\nR$" + calculo.calcularImposto(imovel) +"\n");

        calculo = new CalculoBeloHorizonte();
        System.out.println("Imposto em Belo Horizonte\nR$" + calculo.calcularImposto(imovel) +"\n");

        calculo = new CalculoPortoAlegre();
        System.out.println("Imposto em Porto Alegre\nR$" + calculo.calcularImposto(imovel) +"\n");
        imovel.setAreaGaragem(0);
        System.out.println("Imposto em Porto Alegre\nR$" + calculo.calcularImposto(imovel) +"\n");  //Teste sem garagem

        calculo = new CalculoCuritiba();
        System.out.println("Imposto em Curitiba\nR$" + calculo.calcularImposto(imovel) +"\n");
        imovel.setIdade(20);
        System.out.println("Imposto em Curitiba\nR$" + calculo.calcularImposto(imovel) +"\n");  //Teste com pelo menos 20 anos
        imovel.setIdade(51);
        System.out.println("Imposto em Curitiba\nR$" + calculo.calcularImposto(imovel) +"\n");  //Teste com pelo menos 51 anos
    }
}

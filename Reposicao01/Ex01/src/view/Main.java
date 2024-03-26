package view;

import model.Ingresso;
import model.IngressoVIP;

public class Main {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso();
        ingresso.setCodigoIdentificador("1");
        ingresso.setValor(100);

        IngressoVIP ingressoVIP = new IngressoVIP();
        ingressoVIP.setCodigoIdentificador("2");
        ingressoVIP.setValor(100);
        ingressoVIP.setFuncao("Função");

        System.out.println(String.format("Dados do ingresso:\n"
                                        +"Codigo: %s\n"
                                        +"Valor: R$%.2f\n"
                                        +"Valor final: R$%.2f\n"
                                        , ingresso.getCodigoIdentificador(), ingresso.getValor(), ingresso.valorFinal(20)));

        System.out.println(String.format("Dados do ingresso VIP:\n"
                                        +"Codigo: %s\n"
                                        +"Valor: R$%.2f\n"
                                        +"Valor final: R$%.2f\n"
                                        +"Função: %s\n"
                                        , ingressoVIP.getCodigoIdentificador(), ingressoVIP.getValor(), ingressoVIP.valorFinal(20), ingressoVIP.getFuncao()));
    }
}

package view;

import controller.OperacaoController;

public class Teste {
    public static void main(String[] args) {
        OperacaoController operacaoController = new OperacaoController();

        try {
            System.out.println(operacaoController.operacaoValor(2));    //Retorna 4
            System.out.println(operacaoController.operacaoValor(3));    //Retorna 27
            System.out.println(operacaoController.operacaoValor(-1));   //Retorna exceção aritmética
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
    }
}

package view;

import model.Conta;

public class Teste {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setLimite(500);
        conta.deposita(1000);
        try {
            conta.saca(1501);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

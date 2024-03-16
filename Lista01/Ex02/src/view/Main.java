package view;

import model.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        
        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.realizaDeposito(300.0);
        contaBancaria.realizaSaque(150.0);
    }
}

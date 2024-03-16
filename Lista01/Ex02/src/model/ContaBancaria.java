package model;

public class ContaBancaria {
    
    public int numeroConta;
    public String nome;
    public Double saldo;

    public ContaBancaria(){
        numeroConta = 0;
        nome = "";
        saldo = 0.0;
    }

    public void realizaDeposito(Double valor){
        System.out.println(String.format("Saldo Anterior: R$%.2f", saldo));
        saldo += valor;
        System.out.println(String.format("Saldo Atual: R$%.2f", saldo));   
    }

    public void realizaSaque(Double valor){
        System.out.println(String.format("Saldo Anterior: R$%.2f", saldo));
        saldo -= valor;
        System.out.println(String.format("Saldo Atual: R$%.2f", saldo));   
    }
}

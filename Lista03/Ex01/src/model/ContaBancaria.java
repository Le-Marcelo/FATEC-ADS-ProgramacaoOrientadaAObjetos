package model;

public class ContaBancaria {

    private String cliente;
    private int num_conta;
    private float saldo;

    public ContaBancaria() {
        super();
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void sacar(float valor){
        if(valor > saldo){
            System.err.println("Saldo indisponível.");
        }else{
            saldo -= valor;
            System.out.println(String.format("Valor de R$%.2f sacado!\n"
                                            +"Saldo de R$%.2f restante.", valor, saldo));
        }
    }

    public void depositar(float valor){
        if(valor <= 0f){
            System.err.println("Valor digitado é menor ou igual a zero.");
        }else{
            saldo += valor;
            System.out.println(String.format("Valor de R$%.2f depositado!\n"
                                            +"Saldo atual de R$%.2f.", valor, saldo));
        }
    }
}

package model;

public class Conta {
    private int agencia;
    private int codigo;
    private float saldo;
    private float limite;

    public Conta(){
        agencia = 0;
        codigo = 0;
        saldo = 0f;
        limite = 0f;
    }

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

    public int getAgencia(){
        return agencia;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public float getSaldo(){
        return saldo;
    }

    public void setLimite(float limite){
        this.limite = limite;
    }

    public float getLimite(){
        return limite;
    }

    public void deposita(float valor){
        saldo += valor;
    }

    public void saca(float valor) throws ArithmeticException{
        if(valor > saldo + limite){
            throw new ArithmeticException("Valor maior que o limite disponivel.\n"
                                        +"O limite atual é de R$" + (saldo + limite));
        }
        saldo -= valor;
    }
}

package model;

public class ContaEspecial extends ContaBancaria{

    private float limite;

    public ContaEspecial() {
        super();
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(float valor){
        if(valor > getSaldo() + limite){
            System.err.println("Limite indisponível.");
        }else{
            setSaldo(getSaldo() - valor);;
            if(getSaldo() > 0){
                System.out.println(String.format("Valor de R$%.2f sacado!\n"
                                                +"Saldo de R$%.2f restante.", valor, getSaldo()));
            }else{
                System.out.println(String.format("Valor de R$%.2f sacado!\n"
                                                +"Limite de R$%.2f restante.", valor, limite + getSaldo()));
            }
        }
    }
}

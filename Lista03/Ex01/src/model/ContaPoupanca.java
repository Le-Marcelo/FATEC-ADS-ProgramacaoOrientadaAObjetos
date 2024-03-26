package model;

public class ContaPoupanca extends ContaBancaria{
    
    private int diaDeRendimento;

    public ContaPoupanca() {
        super();
    }

    public int getDiaDeRendimento() {
        return diaDeRendimento;
    }

    public void setDiaDeRendimento(int diaDeRendimento) {
        this.diaDeRendimento = diaDeRendimento;
    }
    
    public void calcularNovoSaldo(float taxaDeRendimento){
        float novoValor = getSaldo() + getSaldo() * taxaDeRendimento;
        setSaldo(novoValor);
    }
}

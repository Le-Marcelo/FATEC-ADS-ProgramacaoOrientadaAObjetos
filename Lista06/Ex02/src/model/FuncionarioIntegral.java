package model;

public class FuncionarioIntegral extends Funcionario{
    private int bancoDeHoras;

    public FuncionarioIntegral(){
        bancoDeHoras = 0;
    }

    public int getBancoDeHoras() {
        return bancoDeHoras;
    }

    public void setBancoDeHoras(int bancoDeHoras) {
        this.bancoDeHoras = bancoDeHoras;
    }

    
}

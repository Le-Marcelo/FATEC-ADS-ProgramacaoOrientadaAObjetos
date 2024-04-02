package model;

public class FuncionarioParcial extends Funcionario{
    private String horaDeEntrada;
    private String horaDeSaida;

    public FuncionarioParcial(){
        horaDeEntrada = "";
        horaDeSaida = "";
    }

    public String getHoraDeEntrada() {
        return horaDeEntrada;
    }

    public void setHoraDeEntrada(String horaDeEntrada) {
        this.horaDeEntrada = horaDeEntrada;
    }

    public String getHoraDeSaida() {
        return horaDeSaida;
    }

    public void setHoraDeSaida(String horaDeSaida) {
        this.horaDeSaida = horaDeSaida;
    }

    
}

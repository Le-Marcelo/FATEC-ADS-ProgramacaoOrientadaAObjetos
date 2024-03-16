package model;

public class Funcionario {
    
    private String nome;
    private Double salario;
    private String cargo;

    public Funcionario(){
        nome = "";
        salario = 0.0;
        cargo = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalarioLiquido(Double descontos, Double beneficios){
        Double salarioLiquido = 0.0;
        salarioLiquido = getSalario() - descontos + beneficios;

        if(salarioLiquido < 1412.0){
            return 1412.0;
        }else{
            return salarioLiquido;
        }
    }
}

package model;

public class ProfessorTitular extends Professor{
    
    private int anosInstituicao;
    private double salario;

    public ProfessorTitular(){
        super();
    }

    public int getAnosInstituicao() {
        return anosInstituicao;
    }

    public void setAnosInstituicao(int anosInstituicao) {
        this.anosInstituicao = anosInstituicao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcSalario() {
        int incremento = anosInstituicao / 5;
        return salario * (1 + 0.05 * incremento);
    }
}

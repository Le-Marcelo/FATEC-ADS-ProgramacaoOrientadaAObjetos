package model;

public class Professor {
    
    private String nome;
    private String matricula;
    private int idade;

    public Professor(){
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double calcSalario(){
        //Método que será feito a sobrescrita em classes especializadas
        return 0;
    }
}

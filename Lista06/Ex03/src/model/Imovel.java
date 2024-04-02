package model;

public class Imovel {
    private float areaTotal;
    private int numComodos;
    private int numQuartos;
    private float areaGaragem;
    private int idade;

    public Imovel(){
        super();
    }

    public float getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(float areaTotal) {
        this.areaTotal = areaTotal;
    }

    public int getNumComodos() {
        return numComodos;
    }

    public void setNumComodos(int numComodos) {
        this.numComodos = numComodos;
    }

    public int getNumQuartos() {
        return numQuartos;
    }

    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }

    public float getAreaGaragem() {
        return areaGaragem;
    }

    public void setAreaGaragem(float areaGaragem) {
        this.areaGaragem = areaGaragem;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Imovel [areaTotal=" + areaTotal + ", numComodos=" + numComodos + ", numQuartos=" + numQuartos
                + ", areaGaragem=" + areaGaragem + ", idade=" + idade + "]";
    }

    
}

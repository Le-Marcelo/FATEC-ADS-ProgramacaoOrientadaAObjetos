package model;

public class Animal {
    
    private String nome;
    private float comprimento;
    private int numeroDePatas;
    private String cor;
    private String ambiente;
    private float velocidade;

    public Animal() {
        numeroDePatas = 4;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public void dados(){
        System.out.println(String.format("Animal: %s\n"
                                        +"Comprimento: %.2f cm\n"
                                        +"Patas: %d\n"
                                        +"Cor: %s\n"
                                        +"Ambiente: %s\n"
                                        +"Velocidade %.2f m/s"
                                        , nome, comprimento, numeroDePatas, cor, ambiente, velocidade));
    }   
}

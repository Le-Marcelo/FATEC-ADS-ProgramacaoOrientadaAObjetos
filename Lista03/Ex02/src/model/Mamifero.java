package model;

public class Mamifero extends Animal{
    
    private String alimento;

    public Mamifero() {
        setNumeroDePatas(4);
        setAmbiente("Terra");
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public void dados(){
        System.out.println(String.format("Animal: %s\n"
                                        +"Comprimento: %.2f cm\n"
                                        +"Patas: %d\n"
                                        +"Cor: %s\n"
                                        +"Ambiente: %s\n"
                                        +"Velocidade %.2f m/s\n"
                                        +"Alimento: %s"
                                        , getNome(), getComprimento(), getNumeroDePatas(), getCor(), getAmbiente(), getVelocidade(), alimento));
    }
}

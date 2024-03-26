package model;

public class Peixe extends Animal{
    
    private String caracteristica;
    
    public Peixe() {
        setNumeroDePatas(0);
        setAmbiente("Mar");
        setCor("Cinzenta");
        caracteristica =  "Barbatanas e cauda";
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public void dados(){
        System.out.println(String.format("Animal: %s\n"
                                        +"Comprimento: %.2f cm\n"
                                        +"Patas: %d\n"
                                        +"Cor: %s\n"
                                        +"Ambiente: %s\n"
                                        +"Velocidade %.2f m/s\n"
                                        +"Caracteristica: %s"
                                        , getNome(), getComprimento(), getNumeroDePatas(), getCor(), getAmbiente(), getVelocidade(), caracteristica));
    }
}

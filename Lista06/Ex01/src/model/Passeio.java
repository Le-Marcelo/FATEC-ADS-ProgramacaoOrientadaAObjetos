package model;

public final class Passeio extends Veiculo{
    private int qtdPassageiros;

    public Passeio(){
        qtdPassageiros = 0;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public final void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }
    
    @Override
    //A velocidade dos veículos de passeio se dá em metros/hora (1 km/h = 1000 m/h)
    public float calcVel(float velocMax) {
        return velocMax * 1000;
    }
}

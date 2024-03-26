package model;

public class Trapezio extends Quadrilatero{
    private float baseMenor;

    public Trapezio(){
        super();
    }

    public float getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(float baseMenor) {
        this.baseMenor = baseMenor;
    }

    @Override
    public float calcPerimetro() {
        return getBase() + baseMenor + getAltura() * 2;
    }

    @Override
    public float calcArea() {
       return ((getBase() + baseMenor) * getAltura()) / 2;
    }

}

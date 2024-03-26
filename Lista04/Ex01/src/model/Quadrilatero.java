package model;

public abstract class Quadrilatero {
    private float base;
    private float altura;

    public Quadrilatero(){
        super();
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calcPerimetro(){
        return (base + altura) * 2;
    }

    public abstract float calcArea();
}

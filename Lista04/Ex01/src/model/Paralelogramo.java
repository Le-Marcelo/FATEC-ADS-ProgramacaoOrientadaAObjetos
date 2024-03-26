package model;

public class Paralelogramo extends Quadrilatero{
    public Paralelogramo(){
        super();
    }

    @Override
    public float calcArea() {
        return getBase() * getAltura();
   }
    
}

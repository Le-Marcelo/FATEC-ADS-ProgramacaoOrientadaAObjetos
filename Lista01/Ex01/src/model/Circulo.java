package model;

public class Circulo {
    
    public Double raio;

    public Circulo(Double _raio) {
        raio = _raio;
    }

    public Double getPerimetro(){
        Double perimetro = 0.0;
        perimetro = 2 * 3.14 * raio;
        return perimetro;
    }

    public Double getArea(){
        Double area = 0.0;
        area = 3.14 * Math.pow(raio, 2);
        return area;
    }
}

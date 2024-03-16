package view;

import model.Circulo;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3.0);

        System.out.println("Área do círculo: " + circulo.getArea());
        System.out.println("Perímetro do círculo: " + circulo.getPerimetro());
    }
}

package view;

import model.Paralelogramo;
import model.Trapezio;

public class Main {
    public static void main(String[] args) {
        Paralelogramo paralelogramo = new Paralelogramo();
        paralelogramo.setAltura(2);
        paralelogramo.setBase(4);

        Trapezio trapezio = new Trapezio();
        trapezio.setAltura(2);
        trapezio.setBase(4);
        trapezio.setBaseMenor(2);

        System.out.println(String.format("Paralelogramo:\n"
                                        +"Altura: %.2fcm\n"
                                        +"Base: %.2fcm\n"
                                        +"Área: %.2fcm\n"
                                        +"Perimetro: %.2fcm\n"
                                        , paralelogramo.getAltura(), paralelogramo.getBase(), paralelogramo.calcArea(), paralelogramo.calcPerimetro()));

        System.out.println(String.format("Trapézio:\n"
                                        +"Altura: %.2fcm\n"
                                        +"Base maior: %.2fcm\n"
                                        +"Base menor: %.2fcm\n"
                                        +"Área: %.2fcm\n"
                                        +"Perimetro: %.2fcm\n"
                                        , trapezio.getAltura(), trapezio.getBase(), trapezio.getBaseMenor(), trapezio.calcArea(), trapezio.calcPerimetro()));
    }
}

package view;

import model.Carga;
import model.Motor;
import model.Passeio;

public class Teste {
    public static void main(String[] args) {
        Motor motorGenerico = new Motor();
        motorGenerico.setPotencia(6);
        motorGenerico.setQtdPist(8);

        Passeio passeio1 = new Passeio();
        passeio1.setPlaca("Placa");
        passeio1.setMarca("Marca");
        passeio1.setModelo("Modelo");
        passeio1.setCor("Cor");
        passeio1.setVelocMax(120f);
        passeio1.setQtdRodas(4);
        passeio1.setMotor(motorGenerico);
        passeio1.setQtdPassageiros(4);

        Passeio passeio2 = new Passeio();
        passeio2.setPlaca("Placa");
        passeio2.setMarca("Marca");
        passeio2.setModelo("Modelo");
        passeio2.setCor("Cor");
        passeio2.setVelocMax(140f);
        passeio2.setQtdRodas(4);
        passeio2.setMotor(motorGenerico);
        passeio2.setQtdPassageiros(4);

        Carga carga1 = new Carga();
        carga1.setPlaca("Placa");
        carga1.setMarca("Marca");
        carga1.setModelo("Modelo");
        carga1.setCor("Cor");
        carga1.setVelocMax(120f);
        carga1.setQtdRodas(4);
        carga1.setCargaMax(500);
        carga1.setTara(4);
        carga1.setMotor(motorGenerico);

        Carga carga2 = new Carga();
        carga2.setPlaca("Placa");
        carga2.setMarca("Marca");
        carga2.setModelo("Modelo");
        carga2.setCor("Cor");
        carga2.setVelocMax(140f);
        carga2.setQtdRodas(4);
        carga2.setCargaMax(500);
        carga2.setTara(4);
        carga2.setMotor(motorGenerico);

        System.out.println(passeio1.calcVel(passeio1.getVelocMax()));
        System.out.println(passeio2.calcVel(passeio2.getVelocMax()));
        System.out.println(carga1.calcVel(carga1.getVelocMax()));
        System.out.println(carga2.calcVel(carga2.getVelocMax()));
    }
}

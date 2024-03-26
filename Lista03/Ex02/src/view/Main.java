package view;

import java.util.ArrayList;
import java.util.List;

import model.Animal;
import model.Mamifero;
import model.Peixe;

public class Main {
    public static void main(String[] args) {
        Animal camelo = new Animal();
        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        //Patas foram omitidas pois o padrao sao 4
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(2);

        Peixe tubarao = new Peixe();
        tubarao.setNome("Tubarão");
        tubarao.setComprimento(300);
        //Patas foram omitidas pois o padrao sao 0
        //Cor foi omitida pois o padrao e "Cinzanta"
        //Ambiente foi omitido pois o padrao e "Mar"
        tubarao.setVelocidade(1.5f);
        //Caracteristica omitida pois o padrao e "Barbatanas e cauda"

        Mamifero urso = new Mamifero();
        urso.setNome("Urso-do-Canadá");
        urso.setComprimento(180);
        //Patas foram omitidas pois o padrao sao 4
        urso.setCor("Vermelho");
        //Ambiente foi omitido pois o padrao e "Terra"
        urso.setVelocidade(0.5f);
        urso.setAlimento("Mel");

        List<Animal> jardimZoologico = new ArrayList<>();
        jardimZoologico.add(camelo);
        jardimZoologico.add(tubarao);
        jardimZoologico.add(urso);

        System.out.println("Zoo:\n"
                        +  "------------------------------");
        for (Animal animal : jardimZoologico) {
            animal.dados();
            System.out.println("------------------------------");
        }
    }
}

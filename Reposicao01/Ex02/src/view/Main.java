package view;

import model.ProfessorHorista;
import model.ProfessorTitular;

public class Main {
    public static void main(String[] args) {
        ProfessorTitular professorTitular = new ProfessorTitular();
        professorTitular.setNome("Professor Titular");
        professorTitular.setMatricula("001");
        professorTitular.setIdade(45);
        professorTitular.setAnosInstituicao(7);
        professorTitular.setSalario(3000);

        ProfessorHorista professorHorista = new ProfessorHorista();
        professorHorista.setNome("Professor Horista");
        professorHorista.setMatricula("002");
        professorHorista.setIdade(25);
        professorHorista.setHorasAula(5);
        professorHorista.setValorHoraAula(50);

        System.out.println(String.format("Dados do Professor:\n"
                                        +"Nome: %s\n"
                                        +"Matricula: %s\n"
                                        +"Idade: %d\n"
                                        +"Anos de Instituição: %d\n"
                                        +"Salário Base: R$%.2f\n"
                                        +"Salário final: R$%.2f\n"
                                        , professorTitular.getNome(), professorTitular.getMatricula(), professorTitular.getIdade(), professorTitular.getAnosInstituicao()
                                        , professorTitular.getSalario(), professorTitular.calcSalario()));

        System.out.println(String.format("Dados do Professor:\n"
                                        +"Nome: %s\n"
                                        +"Matricula: %s\n"
                                        +"Idade: %d\n"
                                        +"Horas aula: %d\n"
                                        +"Valor por hora: R$%.2f\n"
                                        +"Salário final: R$%.2f\n"
                                        , professorHorista.getNome(), professorHorista.getMatricula(), professorHorista.getIdade(), professorHorista.getHorasAula()
                                        , professorHorista.getValorHoraAula(), professorHorista.calcSalario()));
    }
}

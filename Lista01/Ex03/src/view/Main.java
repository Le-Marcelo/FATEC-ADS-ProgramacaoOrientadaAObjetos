package view;

import model.Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Nome");
        funcionario.setCargo("Cargo");
        funcionario.setSalario(2000.0);

        Double salarioMaior = funcionario.getSalarioLiquido(200.0, 500.0);
        Double salarioMenor = funcionario.getSalarioLiquido(700.0, 50.0);

        System.out.println(String.format("Salário acima do mínimo: R$%.2f", salarioMaior));
        System.out.println(String.format("Salário abaixo do mínimo: R$%.2f", salarioMenor));

    }
}

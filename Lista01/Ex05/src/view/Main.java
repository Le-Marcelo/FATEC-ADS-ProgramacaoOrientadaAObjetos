package view;

import model.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        //Tentativa com idade inválida
        try {
            pessoa.setDataNascimento(3, 6, 1800);
        } catch (Exception e) {
            System.err.println(e);
        }

        //Tentativa com sucesso
        try {
            pessoa.setDataNascimento(3, 6, 2002);
            int idade = pessoa.getIdade();
            System.out.println(String.format("Essa pessoa tem %d anos.", idade));
        } catch (Exception e) {
            System.err.println(e);
        }

    }
}

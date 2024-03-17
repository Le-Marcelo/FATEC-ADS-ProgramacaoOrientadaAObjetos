package view;

import model.AgendaTelefonica;
import model.Contato;

public class Main {
    public static void main(String[] args) {
        Contato contato1 = new Contato();
        contato1.setEmail("a@a.com.br");
        contato1.setNome("nome1");
        contato1.setTelefone("1111-1111");

        Contato contato2 = new Contato();
        contato2.setEmail("b@b.com.br");
        contato2.setNome("nome2");
        contato2.setTelefone("2222-2222");

        AgendaTelefonica agenda = new AgendaTelefonica();
        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);

        try {
            agenda.removerContato(contato1);
            agenda.buscarContato("nome2");
            agenda.buscarContato("nome1");
        } catch (Exception e) {
            System.err.println(e);
        }

    }
}

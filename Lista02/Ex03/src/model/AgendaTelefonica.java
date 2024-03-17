package model;

import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica {
    private List<Contato> listaContatos = new ArrayList<>();

    public AgendaTelefonica() {
    }

    public List<Contato> getListaContatos() {
        return listaContatos;
    }

    public void setListaContatos(List<Contato> listaContatos) {
        this.listaContatos = listaContatos;
    }

    public void adicionarContato(Contato contato){
        listaContatos.add(contato);
    }

    public void removerContato(Contato contato)throws Exception{
        if(!estaNaLista(contato)){
            throw new Exception("Não está na lista");
        }

        for (Contato i : listaContatos) {
            if(i.equals(contato)){
                listaContatos.remove(i);
                System.out.println("Contato removido.");
                break;
            }
        }
    }

    public void buscarContato(String nome) throws Exception{
        if(!estaNaLista(nome)){
            throw new Exception("Não está na lista");
        }
        
        for (Contato i : listaContatos){
            if(i.getNome().equals(nome)){
                System.out.println(i.getNome());
                System.out.println(i.getEmail());
                System.out.println(i.getTelefone());
            }
        }
    }

    private boolean estaNaLista(String nome){
        for (Contato i : listaContatos){
            if(i.getNome().equals(nome)){
                return true;
            }
        }

        return false;
    }

    private boolean estaNaLista(Contato contato){
        for (Contato i : listaContatos){
            if(i.equals(contato)){
                return true;
            }
        }

        return false;
    }
}

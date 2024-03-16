package model;

import java.time.LocalDate;

public class Pessoa {
    
    private String nome;
    private LocalDate dataNascimento;
    private String profissao;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getDataNascimento(){
        return dataNascimento;
    }
    public void setDataNascimento(int dia, int mes, int ano) throws Exception {
        LocalDate hoje = LocalDate.now();
        if(ano > hoje.getYear() || hoje.getYear() - ano > 150){
            throw new Exception("Ano inválido");
        }
        dataNascimento = LocalDate.of(ano, mes, dia);
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getIdade(){
        LocalDate hoje = LocalDate.now();
        int idade = hoje.getYear() - getDataNascimento().getYear();
        if(getDataNascimento().getDayOfYear() > hoje.getDayOfYear()){
            idade--;
        }
        return idade;
    }
}

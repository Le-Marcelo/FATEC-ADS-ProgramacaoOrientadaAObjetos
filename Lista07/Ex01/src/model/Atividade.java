package model;

public class Atividade {
    private String assunto;
    private int quantidadePaginas;

    public Atividade() {
        super();
    }

    public String getAssunto() {
        return assunto;
    }
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }
    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    @Override
    public String toString() {
        return "Assunto: " + assunto + "\nQuantidade de páginas: " + quantidadePaginas;
    }    
}

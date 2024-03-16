package model;

public class Produto {
    
    private String nome;
    private float preco;
    private int qtdEstoque;

    public Produto(){
        nome = "";
        preco = 0f;
        qtdEstoque = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) throws Exception{
        if(preco <= 0f){
            throw new Exception("O preço não pode ser menor ou igual a zero.");
        }
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) throws Exception{
        if(qtdEstoque < 0){
            throw new Exception("Quantidade de estoque não pode ser negativa.");
        }
        this.qtdEstoque = qtdEstoque;
    }

    public boolean verificaProdutoDisponivel(String nome){
        if (nome.equals(this.nome) && getQtdEstoque() > 0) {
            return true;
        }else{
            return false;
        }
    }

    public float totalValorEstoque(){
        float valorTotal = 0f;
        valorTotal = getQtdEstoque() * getPreco();
        return valorTotal;
    }
}

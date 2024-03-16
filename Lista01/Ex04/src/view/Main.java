package view;

import model.Produto;

public class Main {
    public static void main(String[] args) {
        
        //Tentativa com erro de preco
        try {
            Produto produto = new Produto();
            produto.setPreco(0f);
        } catch (Exception e) {
            System.err.println(e);
        }

        //Tentativa com erro de estoque
        try {
            Produto produto = new Produto();
            produto.setQtdEstoque(-1);
        } catch (Exception e) {
            System.err.println(e);
        }

        //Tentativa com sucesso
        try {
            Produto produto = new Produto();
            produto.setNome("Nome");
            produto.setPreco(10f);
            produto.setQtdEstoque(100);

            boolean estaEmEstoque;
            float valorDeEstoque;
            String nomeProcurado = "nomeErrado";

            estaEmEstoque = produto.verificaProdutoDisponivel(nomeProcurado);
            System.out.println(String.format("Produto %s em estoque?: %b", nomeProcurado, estaEmEstoque));

            estaEmEstoque = produto.verificaProdutoDisponivel("Nome");
            System.out.println(String.format("Produto Nome em estoque?: %b", estaEmEstoque));
            
            valorDeEstoque = produto.totalValorEstoque();
            System.out.println(String.format("O produto %s tem o valor total de R$%.2f em estoque.", "Nome", valorDeEstoque));

            
        } catch (Exception e) {
            System.err.println(e);
        }
        
    }
}

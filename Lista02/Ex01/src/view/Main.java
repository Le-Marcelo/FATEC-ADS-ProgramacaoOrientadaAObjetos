package view;

import model.ItemPedido;
import model.Pedido;
import model.Produto;

public class Main {
    public static void main(String[] args) {
        Produto carrinho = new Produto();
        carrinho.setCodigo(1);
        carrinho.setDescricao("É um carrinho");
        carrinho.setValor(10.0);

        Produto bola = new Produto();
        bola.setCodigo(2);
        bola.setDescricao("É uma bola");
        bola.setValor(25.0);

        Pedido pedido = new Pedido();
        pedido.setNumeroNota(100);

        ItemPedido item1 = new ItemPedido();
        item1.setProduto(bola);
        item1.setQuantidade(4);
    
        pedido.adicionaItem(item1);
        System.out.println(pedido.getValorTotal());

        ItemPedido item2 = new ItemPedido();
        item2.setProduto(carrinho);
        item2.setQuantidade(3);

        pedido.adicionaItem(item2);
        System.out.println(pedido.getValorTotal());
    }
}

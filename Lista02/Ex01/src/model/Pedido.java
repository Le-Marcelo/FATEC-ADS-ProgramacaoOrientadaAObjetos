package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroNota;
    private Double valorTotal;
    private List<ItemPedido> listaItemPedido = new ArrayList<ItemPedido>();

    public Pedido() {
        
    }

    public int getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(int numeroNota) {
        this.numeroNota = numeroNota;
    }

    public Double getValorTotal() {
        Double valorParcial = 0.0;
        for(int i = 0; i < listaItemPedido.size(); i++){
            ItemPedido item = listaItemPedido.get(i);
            valorParcial += item.getQuantidade() * item.getProduto().getValor();
        }
        valorTotal = valorParcial;
        return valorTotal;
    }

    public void adicionaItem(ItemPedido item){
        listaItemPedido.add(item);
    }

}

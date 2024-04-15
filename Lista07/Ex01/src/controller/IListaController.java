package controller;

public interface IListaController<T> {
    public void addElemento(T t);
    public void removeElemento(T t);
    public T buscaElemento(int posicao);
    public void limparLista();
}

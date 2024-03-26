package model;

public class Ingresso {
    
    private String codigoIdentificador;
    private float valor;

    public Ingresso(){
        super();
    }

    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(String codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float valorFinal(float valorDaTaxa){
        return valor + valorDaTaxa;
    }
}

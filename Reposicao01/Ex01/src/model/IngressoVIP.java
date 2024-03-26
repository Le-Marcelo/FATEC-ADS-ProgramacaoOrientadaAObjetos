package model;

public class IngressoVIP extends Ingresso{
    
    private String funcao;

    public IngressoVIP(){
        super();
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public float valorFinal(float valorDaTaxa) {
        float valorProvisorio = super.valorFinal(valorDaTaxa);
        return valorProvisorio * 1.18f;
    }
}

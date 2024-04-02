package model;

public class FuncionarioTemporario extends Funcionario{
    private int diaFimContrato;
    private int mesFimContrato;
    private int anoFimContrato;

    public FuncionarioTemporario(){
        diaFimContrato = 1;
        mesFimContrato = 1;
        anoFimContrato = 0;
    }

    public int getDiaFimContrato() {
        return diaFimContrato;
    }

    public void setDiaFimContrato(int diaFimContrato) {
        this.diaFimContrato = diaFimContrato;
    }

    public int getMesFimContrato() {
        return mesFimContrato;
    }

    public void setMesFimContrato(int mesFimContrato) {
        this.mesFimContrato = mesFimContrato;
    }

    public int getAnoFimContrato() {
        return anoFimContrato;
    }

    public void setAnoFimContrato(int anoFimContrato) {
        this.anoFimContrato = anoFimContrato;
    }

    
}

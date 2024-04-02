package controller;

import javax.swing.JOptionPane;

import model.FuncionarioTemporario;

public class FuncionarioTemporarioController implements IFuncionarioController{

    @Override
    public FuncionarioTemporario contratar() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do funcionário a ser contratado:"));
        String nome = JOptionPane.showInputDialog("Digite o nome do funcionário a ser contratado:");
        float salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário do funcionário a ser contratado:"));
        int diaFimContrato = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do fim do contrato do funcionário a ser contratado:"));
        int mesFimContrato = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês do fim do contrato do funcionário a ser contratado:"));
        int anoFimContrato = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do fim do contrato do funcionário a ser contratado:"));

        FuncionarioTemporario funcionario = new FuncionarioTemporario();
        funcionario.setId(id);
        funcionario.setNome(nome);
        funcionario.setSalario(salario);
        funcionario.setDiaFimContrato(diaFimContrato);
        funcionario.setMesFimContrato(mesFimContrato);
        funcionario.setAnoFimContrato(anoFimContrato);

        return funcionario;
    }

}

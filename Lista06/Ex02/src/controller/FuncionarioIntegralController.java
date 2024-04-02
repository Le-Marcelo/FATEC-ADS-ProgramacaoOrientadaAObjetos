package controller;

import javax.swing.JOptionPane;

import model.FuncionarioIntegral;

public class FuncionarioIntegralController implements IFuncionarioController{

    @Override
    public FuncionarioIntegral contratar() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do funcionário a ser contratado:"));
        String nome = JOptionPane.showInputDialog("Digite o nome do funcionário a ser contratado:");
        float salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário do funcionário a ser contratado:"));

        FuncionarioIntegral funcionario = new FuncionarioIntegral();
        funcionario.setId(id);
        funcionario.setNome(nome);
        funcionario.setSalario(salario);

        return funcionario;
    }

}

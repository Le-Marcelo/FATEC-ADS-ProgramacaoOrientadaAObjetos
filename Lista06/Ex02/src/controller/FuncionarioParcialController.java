package controller;

import javax.swing.JOptionPane;

import model.FuncionarioParcial;

public class FuncionarioParcialController implements IFuncionarioController{

    @Override
    public FuncionarioParcial contratar() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do funcionário a ser contratado:"));
        String nome = JOptionPane.showInputDialog("Digite o nome do funcionário a ser contratado:");
        float salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário do funcionário a ser contratado:"));
        String horaDeEntrada = JOptionPane.showInputDialog("Digite a hora de entrada do funcionário a ser contratado:");
        String horaDeSaida = JOptionPane.showInputDialog("Digite a hora de saída do funcionário a ser contratado:");

        FuncionarioParcial funcionario = new FuncionarioParcial();
        funcionario.setId(id);
        funcionario.setNome(nome);
        funcionario.setSalario(salario);
        funcionario.setHoraDeEntrada(horaDeEntrada);
        funcionario.setHoraDeSaida(horaDeSaida);

        return funcionario;
    }

}

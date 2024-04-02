package view;

import controller.FuncionarioIntegralController;
import controller.FuncionarioParcialController;
import controller.FuncionarioTemporarioController;
import model.FuncionarioIntegral;
import model.FuncionarioParcial;
import model.FuncionarioTemporario;

public class Main {
    public static void main(String[] args) {
        FuncionarioIntegralController funcionarioIntegralController = new FuncionarioIntegralController();
        FuncionarioIntegral funcionarioIntegral = funcionarioIntegralController.contratar();

        System.out.println(String.format("Funcionário contratado:\n"
                                        +"ID: %d\n"
                                        +"Nome: %s\n"
                                        +"Salário: R$%.2f\n"
                                        +"Banco de horas: %d\n"
                                        , funcionarioIntegral.getId(), funcionarioIntegral.getNome()
                                        , funcionarioIntegral.getSalario(), funcionarioIntegral.getBancoDeHoras()));

        FuncionarioParcialController funcionarioParcialController = new FuncionarioParcialController();
        FuncionarioParcial funcionarioParcial = funcionarioParcialController.contratar();

        System.out.println(String.format("Funcionário contratado:\n"
                                        +"ID: %d\n"
                                        +"Nome: %s\n"
                                        +"Salário: R$%.2f\n"
                                        +"Horário de entrada: %s\n"
                                        +"Horário de saída: %s\n"
                                        , funcionarioParcial.getId(), funcionarioParcial.getNome(), funcionarioParcial.getSalario()
                                        , funcionarioParcial.getHoraDeEntrada(), funcionarioParcial.getHoraDeSaida()));

        FuncionarioTemporarioController funcionarioTemporarioController = new FuncionarioTemporarioController();
        FuncionarioTemporario funcionarioTemporario = funcionarioTemporarioController.contratar();
                                                                
        System.out.println(String.format("Funcionário contratado:\n"
                                        +"ID: %d\n"
                                        +"Nome: %s\n"
                                        +"Salário: R$%.2f\n"
                                        +"Dia do fim do contrato: %d\n"
                                        +"Mês do fim do contrato: %d\n"
                                        +"Ano do fim do contrato: %d\n"
                                        , funcionarioTemporario.getId(), funcionarioTemporario.getNome(), funcionarioTemporario.getSalario()
                                        , funcionarioTemporario.getDiaFimContrato(), funcionarioTemporario.getMesFimContrato(), funcionarioTemporario.getAnoFimContrato()));
                                                                                                                  
    }
}

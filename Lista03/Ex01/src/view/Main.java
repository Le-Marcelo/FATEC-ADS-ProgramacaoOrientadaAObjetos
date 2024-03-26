package view;

import model.ContaEspecial;
import model.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca clientePoupanca = new ContaPoupanca();
        ContaEspecial clienteEspecial = new ContaEspecial();

        //Incluir dados relativos a(s) conta(s) de um cliente de Conta Poupança e Conta Especial
        clientePoupanca.setCliente("Cliente Poupança");
        clientePoupanca.setNum_conta(1);
        clientePoupanca.setSaldo(1000);
        clientePoupanca.setDiaDeRendimento(15);

        clienteEspecial.setCliente("Cliente Especial");
        clienteEspecial.setNum_conta(2);
        clienteEspecial.setSaldo(500);
        clienteEspecial.setLimite(1000);

        //Sacar um determinado valor da(s) sua(s) conta(s)
        clientePoupanca.sacar(300);
        clienteEspecial.sacar(300);
        

        //Sacar um valor superior ao saldo
        clientePoupanca.sacar(800); //Saldo indisponível
        clienteEspecial.sacar(800);

        //Sacar um valor dentro do limite da conta especial e acima do limite
        clienteEspecial.sacar(200);
        clienteEspecial.sacar(300); //Limite indisponível

        //Depositar um determinado valor na(s) sua(s) conta(s)
        clientePoupanca.depositar(2000);
        clienteEspecial.depositar(2000);

        //Mostrar o novo saldo do cliente, a partir da taxa de rendimento, daqueles que possuem conta poupança
        clientePoupanca.calcularNovoSaldo(0.14f);
        System.out.println(String.format("Saldo da conta de R$%.2f.", clientePoupanca.getSaldo()));

        //Mostrar os dados da(s) conta(s) de um cliente
        System.out.println(String.format("Nome: %s\n"
                                        +"Numero da conta: %d\n"
                                        +"Saldo: R$%.2f\n"
                                        +"Dia do rendimento: %d"
                                        , clientePoupanca.getCliente(), clientePoupanca.getNum_conta(), clientePoupanca.getSaldo(), clientePoupanca.getDiaDeRendimento()));

        System.out.println(String.format("Nome: %s\n"
                                        +"Numero da conta: %d\n"
                                        +"Saldo: R$%.2f\n"
                                        +"Limite: R$%.2f"
                                        , clienteEspecial.getCliente(), clienteEspecial.getNum_conta(), clienteEspecial.getSaldo(), clienteEspecial.getLimite()));
    }
}

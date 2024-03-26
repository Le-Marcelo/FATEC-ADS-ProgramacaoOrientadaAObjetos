import controller.EstudanteSuperiorController;
import controller.EstudanteTecnicoController;
import model.EstudanteSuperior;
import model.EstudanteTecnico;

public class Main {
    public static void main(String[] args) {
        EstudanteSuperior estudanteSuperior = new EstudanteSuperior();
        estudanteSuperior.setRa("001");
        estudanteSuperior.setNome("Aluno A");
        estudanteSuperior.setEmail("a@a.com");
        estudanteSuperior.setMediaNotas(7);
        estudanteSuperior.setQtdAprovacoes("8");
        estudanteSuperior.setInstituicaoSegundoGrau("Escola A");
        estudanteSuperior.setAnoConclusaoSegundoGrau(2019);

        EstudanteTecnico estudanteTecnico = new EstudanteTecnico();
        estudanteTecnico.setRa("002");
        estudanteTecnico.setNome("Aluno B");
        estudanteTecnico.setEmail("b@b.com");
        estudanteTecnico.setMediaNotas(8);
        estudanteTecnico.setQtdAprovacoes("6");

        EstudanteSuperiorController estudanteSuperiorController = new EstudanteSuperiorController();
        EstudanteTecnicoController estudanteTecnicoController = new EstudanteTecnicoController();

        System.out.println(String.format("Estudante Superior:\n"
                                        +"RA: %s\n"
                                        +"Nome: %s\n"
                                        +"E-mail: %s\n"
                                        +"Média de notas: %.1f\n"
                                        +"Quantidade de aprovações: %s\n"
                                        +"Insituição de Segundo Grau: %s\n"
                                        +"Ano de conclusão de Segundo grau: %s\n"
                                        +"Percentual de Rendimento: %.1f%%\n"
                                        +"Percentual de Conclusão: %.1f%%\n"
                                        , estudanteSuperior.getRa(), estudanteSuperior.getNome(), estudanteSuperior.getEmail()
                                        , estudanteSuperior.getMediaNotas(), estudanteSuperior.getQtdAprovacoes(), estudanteSuperior.getInstituicaoSegundoGrau()
                                        , estudanteSuperior.getAnoConclusaoSegundoGrau(), estudanteSuperiorController.percentualRendimento(estudanteSuperior)
                                        , estudanteSuperiorController.percentualProgressao(estudanteSuperior)));

        System.out.println(String.format("Estudante Técnico:\n"
                                        +"RA: %s\n"
                                        +"Nome: %s\n"
                                        +"E-mail: %s\n"
                                        +"Média de notas: %.1f\n"
                                        +"Quantidade de aprovações: %s\n"
                                        +"Percentual de Rendimento: %.1f%%\n"
                                        +"Percentual de Conclusão: %.1f%%\n"
                                        , estudanteTecnico.getRa(), estudanteTecnico.getNome(), estudanteTecnico.getEmail()
                                        , estudanteTecnico.getMediaNotas(), estudanteTecnico.getQtdAprovacoes(),estudanteTecnicoController.percentualRendimento(estudanteTecnico)
                                        , estudanteTecnicoController.percentualProgressao(estudanteTecnico)));
    }
}

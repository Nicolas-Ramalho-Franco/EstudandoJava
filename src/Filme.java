public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacao;
    int duracaoEmMinutos;

    void exibiFichaTecnica() {
        System.out.println("Nome do filme :" + nome);
        System.out.println( "Ano de lançamento :" + anoDeLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacao ++;
    }

    double pegaMedia() {
    return somaDasAvaliacoes / totalDeAvaliacao ;
    }

}
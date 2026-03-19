public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.nome = "Meu malvado favorito";
        meuFilme.anoDeLancamento = 2019;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibiFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        System.out.println("Soma das avaliações:" + meuFilme.somaDasAvaliacoes);
        System.out.println("Total de avaliação:"+meuFilme.totalDeAvaliacao);
        System.out.println("media das avaliações :" + meuFilme.pegaMedia());
    }
}

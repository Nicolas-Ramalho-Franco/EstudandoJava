import br.com.alura.screenmatch.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome ("Meu malvado favorito");
        meuFilme.setAnoDeLancamento(2019);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibiFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        System.out.println("Total de avaliação:"+ meuFilme.getTotalDeAvaliacao());//colocar o get no final
        System.out.println("media das avaliações :" + meuFilme.pegaMedia());
    }
}
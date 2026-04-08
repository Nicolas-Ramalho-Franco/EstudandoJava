import br.com.alura.screenmatch.Filme;
import br.com.alura.screenmatch.Serie;

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

        Serie lost = new Serie();
        lost.setNome ("Lost");
        lost.setAnoDeLancamento(2020);
        lost.setDuracaoEmMinutos(100);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração da :"+ lost.getDuracaoEmMinutos()+" Minutos.");

    }
}
package principal;

import br.com.alura.screenmatch.Episodio;
import br.com.alura.screenmatch.Filme;
import br.com.alura.screenmatch.Serie;
import br.com.alura.screenmatch.Titulo;
import srcrenmatc.calcular.CalculadoraDeTempo;
import srcrenmatc.calcular.FiltroRecomendacao;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //Get - pega
        //Set - manda
        Filme meuFilme = new Filme("Meu malvado favorito",2019);

        //meuFilme.setNome ("Meu malvado favorito");
        //meuFilme.setAnoDeLancamento(2019);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibiFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        System.out.println("Total de avaliação:"+ meuFilme.getTotalDeAvaliacao());//colocar o get no final
        System.out.println("media das avaliações :" + meuFilme.pegaMedia());

        Serie lost = new Serie("lost",2020);
        //lost.setNome ("Lost");
        //lost.setAnoDeLancamento(2020); foi criado 1 construtor e passando 2 parametros  nele
        lost.setDuracaoEmMinutos(100);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração da :"+ lost.getDuracaoEmMinutos()+" Minutos.");

        Filme outroFilme = new Filme("Avatar",2000);
        //outroFilme.setNome ("Avatar");
        //outroFilme.setAnoDeLancamento(2000);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculador = new CalculadoraDeTempo();
        calculador.inclui(meuFilme);
        calculador.inclui(outroFilme);
        calculador.inclui(lost);
        System.out.println("Tempo da :"+ calculador.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmedonicolas =new Filme("Milly",2020);
        filmedonicolas.setDuracaoEmMinutos(200);
        //filmedonicolas.setNome("Milly"); tirei essa linha pq fiz um metodo construtor
        //filmedonicolas.setAnoDeLancamento(2020);
        filmedonicolas.avalia(10);

        ArrayList<Filme> listadefilmes = new ArrayList<>();//Array em java
        listadefilmes.add(filmedonicolas);
        listadefilmes.add(meuFilme);
        listadefilmes.add(outroFilme);

        System.out.println("Tamalho da lista :"+ listadefilmes.size());
        System.out.println("Primeiro filme :"+listadefilmes.get(0).getNome());
        System.out.println(listadefilmes);


    }
}
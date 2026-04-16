import br.com.alura.screenmatch.Filme;
import br.com.alura.screenmatch.Serie;
import br.com.alura.screenmatch.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Meu malvado favorito",2019);
        meuFilme.avalia(10);
        var filmedonicolas =new Filme("Milly",2020);
        filmedonicolas.avalia(6);
        Filme outroFilme = new Filme("Avatar",2000);
        outroFilme.avalia(10);
        Serie lost = new Serie("lost",2020);


        //Filme f1 = filmedonicolas;
        //f1.avalia(10);

        List<Titulo> lista = new ArrayList<>();//Array em java
        lista.add(filmedonicolas);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        //lista.add(f1);

        for (Titulo item : lista){//isso mostra os elementos de uma lista de forma mais ordenada
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() >2){
                System.out.println("Classificação :" + filme.getClassificacao());
            }
        }

        List<String> buscarPorArtista = new ArrayList<>();
        buscarPorArtista.add("Ana");
        buscarPorArtista.add("Maria");
        buscarPorArtista.add("Paulo");
        buscarPorArtista.add("Nicolas");

        System.out.println("Buscando por artista:"+buscarPorArtista);
        Collections.sort(buscarPorArtista);

        System.out.println("Depois da ordenação:"+buscarPorArtista);//Ordena por ordem alfabetica apenas lista que saibam se comparar um com outro
        System.out.println("Lista de titulos ordenados:");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenados por ano de lancamento:");
        System.out.println(lista);
    }
}

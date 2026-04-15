import br.com.alura.screenmatch.Filme;
import br.com.alura.screenmatch.Serie;
import br.com.alura.screenmatch.Titulo;

import java.util.ArrayList;

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


        ArrayList<Titulo> lista = new ArrayList<>();//Array em java
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
    }
}

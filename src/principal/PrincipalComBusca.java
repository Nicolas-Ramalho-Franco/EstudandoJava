package principal;

import br.com.alura.screenmatch.Titulo;
import br.com.alura.screenmatch.TituloOmdb;
import br.com.alura.screenmatch.execao.ErroDeConversaoDeAnoException;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
     static void main() throws IOException, InterruptedException {
         Scanner leitura = new Scanner(System.in);
         String busca = " ";
         List<Titulo> titulos = new ArrayList<>();
         Gson gson = new GsonBuilder()
          .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                 .setPrettyPrinting()
                 .create();
         while(!busca.equalsIgnoreCase("sair")){

             System.out.println("Digite um filme para busca: ");
             busca = leitura.nextLine();
             //List<String> favoritos = new ArrayList<>();

             if (busca.equalsIgnoreCase("sair")){
                 break;
             }

             String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=d89e1620";
             try {
                 HttpClient client = HttpClient.newHttpClient();
                 HttpRequest request = HttpRequest.newBuilder()
                         .uri(URI.create(endereco))
                         .build();
                 HttpResponse<String> response = client
                         .send(request, HttpResponse.BodyHandlers.ofString());

                 String json = response.body();
                 System.out.println(json);

                 TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                 System.out.println(meuTituloOmdb);
                 Titulo meuTitulo = new Titulo(meuTituloOmdb);
                 System.out.println("Titulo já convertido");
                 System.out.println(meuTitulo);
                 System.out.println(meuTituloOmdb.title());// exibindo o nome da variavel desejada

                titulos.add(meuTitulo);
             } catch (NumberFormatException e) {
                 System.out.println("Aconteceu um erro: ");
                 System.out.println(e.getMessage());
             } catch (IllegalArgumentException e) {
                 System.out.println("Algum erro de argumento na busca, verifique o endereço");
             } catch (ErroDeConversaoDeAnoException e) {
                 System.out.println(e.getMessage());
             } catch (NullPointerException e) {
                 System.out.println("Houve um erro na pesquisa do seu filme");
             }
         }
         System.out.println(titulos);

         FileWriter escrita = new FileWriter("filmes.json");
         escrita.write(gson.toJson(titulos));
         System.out.println("O programa finalizou corretamente!");
         escrita.close();
     }

    //  System.out.println("Deseja adicionar aos favoritos? Sim/nao");
    //  var fav = leitura.nextLine();
    //  if (fav.equals("Sim")) {
    //      Collections.addAll(favoritos, meuTituloOmdb.title(),meuTituloOmdb.year());
    // }

    // FileWriter escrita = new FileWriter("filme.txt");//fazer um arquivo txt em java
    //escrita.write(meuTitulo.toString());
    //escrita.close();
}
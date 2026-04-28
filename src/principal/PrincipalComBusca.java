package principal;

import br.com.alura.screenmatch.Titulo;
import br.com.alura.screenmatch.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
     static void main() throws IOException, InterruptedException {
         Scanner sc = new Scanner(System.in);
         System.out.println("Digite o nome do filme:");
         var busca = sc.nextLine();

         String endereco = "http://www.omdbapi.com/?t=" +  busca + "&apikey=d89e1620"; // esta aqui

         HttpClient client = HttpClient.newHttpClient();
         HttpRequest request = HttpRequest.newBuilder()
                 .uri(URI.create(endereco)) // aqui estou pegando oq o cliente vai digitar e estou colocando o nome como endereco
                 .build();

         HttpResponse<String> response = client
                 .send(request, HttpResponse.BodyHandlers.ofString());
         System.out.println(response.body());
         String json = response.body();
         System.out.println(json);

         Gson gson = new GsonBuilder()
                 .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)// isso e para deixar ele com o padrao q eu quero
                 .create();

         TituloOmdb meutituloOmdb = gson.fromJson(json, TituloOmdb.class);
         System.out.println(meutituloOmdb);
         Titulo meutitulo = new Titulo(meutituloOmdb);
         System.out.println("Titulo ja convertido");
         System.out.println(meutitulo);
     }
}
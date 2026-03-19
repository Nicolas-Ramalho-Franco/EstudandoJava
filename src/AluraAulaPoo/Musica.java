package AluraAulaPoo;

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numAvaliacao;

    void exibirFichaTecnica(){
        System.out.println("Ficha Tecnica");
        System.out.println("Titulo:"+titulo);
        System.out.println("Artista:"+artista);
        System.out.println("Ano de lancamento:"+anoDeLancamento);
        }

    void avaliar(double nota){
        avaliacao += nota;
        numAvaliacao ++;
    }
    double calcularMedia(){
        return avaliacao/numAvaliacao;
    }

}

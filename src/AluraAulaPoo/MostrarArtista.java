package AluraAulaPoo;

public class MostrarArtista {
    public static void main(String[] args) {
        Musica musico = new Musica();

        musico.titulo = "Winter";
        musico.anoDeLancamento = 1900;
        musico.artista ="Beetoven";

        musico.exibirFichaTecnica();
        musico.avaliar(9);
        musico.avaliar(6);
        musico.avaliar(5);
        System.out.println(musico.calcularMedia());
        System.out.println(musico.numAvaliacao);
    }
}

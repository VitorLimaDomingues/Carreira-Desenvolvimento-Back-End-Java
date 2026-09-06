package Desafios;

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numeroDeAvaliacoes;

    void exibirFichaTecnica() {
        System.out.println("Título da música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Avaliação: " + avaliacao);
        System.out.println("numero de avaliacoes: " + numeroDeAvaliacoes);
    }

    void avalia(double nota) {
        avaliacao += nota;
        numeroDeAvaliacoes++;
    }

    double media() {
        return avaliacao / numeroDeAvaliacoes;
    }
}

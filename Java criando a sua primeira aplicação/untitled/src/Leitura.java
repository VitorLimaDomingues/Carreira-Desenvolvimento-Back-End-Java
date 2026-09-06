import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        // Input pro Filme
        System.out.print("Digite seu filme favorito: ");
        String filme = leitura.nextLine();

        // Input pro lançamento
        System.out.print("Qual o ano de lançamento: ");
        int ano = leitura.nextInt();

        // Input pra avaliação
        System.out.print("Diga sua avaliação para o filme: ");
        double avaliacao = leitura.nextDouble();

        // Mostra na tela o resultado
        System.out.println(filme);
        System.out.println(ano);
        System.out.println(avaliacao);
    }
}

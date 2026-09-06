import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.print("Diga sua avaliação para o filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            } else if (mediaAvaliacao == 0 && totalDeNotas == 0) {
                System.out.println("Valor igual a 0");
            }
        }

        System.out.println("Média de avaliações: " + mediaAvaliacao / totalDeNotas);
    }
}

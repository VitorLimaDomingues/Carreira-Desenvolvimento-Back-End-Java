//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Esse é o Screen Match"));
    System.out.println("Filme: Top Gun: Maverick");

    int anoDeLancamento = 2022;
    boolean incluidoNoPlano = true;
    double notaDoFilme = 8.1;
    // Média calculada pelas 3 notas da Jack, Paulo e Suelem
    double media = (9.8 + 6.3 + 8.0) / 3;
    System.out.println(media);
    String sinopse;
    sinopse = """
            Filme Top Gun
            Filme de aventura com galã dos anos 80
            Muito bom!
            Ano de lançamento
            """ + anoDeLancamento;

    System.out.println(sinopse);

    int classificacao = (int) (media / 2);
    System.out.println(classificacao);


}
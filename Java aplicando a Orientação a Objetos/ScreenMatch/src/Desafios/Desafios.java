package Desafios;

public class Desafios {
    public static void main(String[] args) {
        // 1. Crie uma classe Pessoa com um método que exibe "Olá, mundo! no console.
        Pessoa frase = new Pessoa();
        frase.exibirMensagem();

        System.out.println(); // Quebra Linha

        // 2. Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.
        Calculadora calcular = new Calculadora();
        int numero = 5;
        System.out.println("O número requisitado foi: " + numero + " e o dobro dele é: " + calcular.operacao(5));

        System.out.println(); // Quebra Linha

        // 3. Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir
        // a ficha técnica, avaliar a música e calcular a média de avaliações.
        Musica musica = new Musica();
        musica.titulo = "Clavar la Espada";
        musica.artista = "Shiro SAGISU";
        musica.anoDeLancamento = 2008;
        musica.avalia(5);
        musica.avalia(7);
        musica.avalia(10);
        musica.exibirFichaTecnica();
        System.out.println("A média dessa música é: " + musica.media());

        System.out.println(); // Quebra Linha

        // 4. Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
        Carro carro = new Carro();
        carro.modelo = "Nissan sx240";
        carro.ano = 1994;
        carro.cor = "Vermelho";
        carro.exibirFichaTecnica();
        System.out.println("Este carro possui: " + carro.anoCarro() + " anos.");

        System.out.println(); // Quebra Linha

        // 5. Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações. Crie uma instância da classe Aluno,
        // Atribua valores aos seus atributos e utilize o método para exibir as informações.
        Aluno aluno = new Aluno();
        aluno.nome = "Vitor de Lima Domingues";
        aluno.idade = 21;
        aluno.exibirFichaTecnica();
    }
}

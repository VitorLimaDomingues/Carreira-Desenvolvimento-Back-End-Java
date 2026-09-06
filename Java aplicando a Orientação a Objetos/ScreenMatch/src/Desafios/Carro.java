package Desafios;

public class Carro {
    String modelo;
    int ano;
    int anoAtual = 2026;
    String cor;

    void exibirFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    int anoCarro() {
        return anoAtual - ano;
    }
}
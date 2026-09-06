package projetoFinal;

import java.util.Scanner;

public class ProjetoFinal {
    public static void main(String[] args) {
        // Projeto final do curso  "Java: criando a sua primeira aplicação"
        // Código feito por Vitor de Lima Domingues

        // declara scanner
        Scanner leitura = new Scanner(System.in);


        // Declaração de Variáveis
        String nome = "Vitor de Lima Domingues";
        String tipoConta = "Corrente";
        double saldoInicial = 2500.00;
        int escolha = 0;

        // Estrutura para mostrar na tela
        System.out.println("***************************************");
        System.out.print("Nome: " + nome);
        System.out.print("\nTipo da conta: " + tipoConta);
        System.out.print("\nSaldo inicial: R$ " + saldoInicial);
        System.out.println("\n***************************************");

        // Laço de loop while
        while (escolha != 4) {
            // Estrutura de operações
            System.out.println("\nOperações");
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- sair");


            // Coleta dado de opção
            System.out.print("Digite a opção desejada: ");
            // Lê o dado de opção
            escolha = leitura.nextInt();

            // Estrutura de condição
            if (escolha == 1) {
                System.out.println("O saldo atual é: " + "R$ " + saldoInicial);
            } else if (escolha == 2) {
                System.out.print("Qual valor está recebendo: ");
                // Lê o dado de recebimento
                double valorAdicional = leitura.nextDouble();
                // Incrementa o valor do saldo + o receber
                saldoInicial += valorAdicional;
                // Mostra na tela o resultado
                System.out.println("Valor de: " + "R$ " + valorAdicional + " adicionado." + " Seu saldo total é: " + " R$ " + saldoInicial);
            } else if (escolha == 3) {
                // print para mostrar informação na tela
                System.out.print("Quanto deseja transferir: ");
                // Lê o dado para transferir valor
                double transferirValor = leitura.nextDouble();
                // Estrutura de condição para caso a transferência seja maior que o saldo atual da conta
                if (transferirValor > saldoInicial) {
                    // print para mostrar que não foi possível realizar a transferência.
                    System.out.println("Não é possível realizar está transferência, pois o valor desejado: " + " R$ " + transferirValor + " é maior que seu saldo atual" + " R$ " + saldoInicial);
                } else {
                    // Subtrai o transferirValor com saldoInicial
                    saldoInicial -= transferirValor;
                    // print pra mostrar que o valor foi transferido.
                    System.out.println("Valor de: " + "R$ " + transferirValor + " transferido." + " Seu saldo total é: " + " R$ " + saldoInicial);
                }

            } else if (escolha > 4) {
                // Condição para caso o usuário forneça uma entrada não válida.
                System.out.println("Entrada inválida!");
            } else if (escolha == 4) {
                System.out.println("Obrigado por utilizar o sistema! Desligando...");
            }
        }

    }
}

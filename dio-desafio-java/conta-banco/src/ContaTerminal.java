// Definição da classe pública Carro

import java.util.Scanner;

public class ContaTerminal {
public static void main(String[] args) {
        // Cria uma usabilidade do scanner para as aplicaçôes a seguir 
        Scanner scanner = new Scanner(System.in);

        // Pede ao usuário para inserir seu nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();  // Lê a entrada do usuário como uma String
        System.out.print("Digite o numero de cartão: "); // pede para o usuario inserir o numero do cartão
        int numero = scanner.nextInt(); // funcionabilidade do codigo le o nome como um numero inteiro

         // Pede ao usuário para inserir sua agencia 
     System.out.print("Digite o numero da sua agencia : ");
        String agencia = scanner.next();  // Lê a entrada do usuário como uma String 
double saldo = 237.48;// armazena a informação do saldo final do usuario, foi ultilizado um double pra representar essa expressão
        // Exibe uma mensagem personalizada com as informações inseridas
        System.out.println("olá senhor " + nome + " obrigado por criar uma conta no nosso banco " );
        System.out.println( "seu numero de cartáo é " + numero );
        System.out.println(  "sua agencia é " + agencia );
        System.out.println( "e o saldo disponivel para saque é " + saldo);
        // Fecha o Scanner
        scanner.close();
    }



}



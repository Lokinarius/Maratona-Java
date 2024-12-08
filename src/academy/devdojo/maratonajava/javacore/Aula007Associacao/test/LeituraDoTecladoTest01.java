package academy.devdojo.maratonajava.javacore.Aula007Associacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        // Abre o Scanner
        Scanner entrada = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine(); // Lê a linha inteira
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt(); // Lê o número inteiro
        entrada.nextLine(); // Consome a nova linha restante
        System.out.print("Digite sua altura: ");
        double altura = entrada.nextDouble(); // Lê o número decimal
        entrada.nextLine(); // Consome a nova linha restante
        System.out.print("Digite seu sexo (M/F): ");
        char sexo = entrada.next().charAt(0); // Lê o primeiro caractere

        // Saída de dados
        System.out.println("----------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Sexo: " + sexo);

        // Fecha o Scanner
        entrada.close();
    }
}

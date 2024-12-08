package academy.devdojo.maratonajava.javacore.Aula002Metodos.teste;

import academy.devdojo.maratonajava.javacore.Aula002Metodos.dominio.Calculadora;
import java.util.Scanner;
public class CalculadoraTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Aberto o  Scanner
        Calculadora cal = new Calculadora();

        // Primeiro número
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        // Operação
        System.out.println("Escolha a operação: ");
        System.out.println("[1] Soma");
        System.out.println("[2] Subtração");
        System.out.println("[3] Multiplicação");
        System.out.println("[4] Divisão");
        int operacao = scanner.nextInt();

        // Segundo número
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Realiza a operação
        switch (operacao){
            case 1:
                System.out.println("Resultado: " + cal.somar((int) num1, (int) num2));
                break;
            case 2:
                System.out.println("Resultado: " + cal.subtrair(num1, num2));
                break;
            case 3:
                System.out.println("Resultado: " + cal.multiplicar((int) num1,(int) num2));
                break;
            case 4:
                try {
                    System.out.println("Resultado: " + cal.dividir(num1, num2));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Operação inválida!");
                return;
        }
        scanner.close(); // Fechado o Scanner
    }
}

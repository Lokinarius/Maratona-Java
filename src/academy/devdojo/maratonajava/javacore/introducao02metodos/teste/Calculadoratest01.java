package academy.devdojo.maratonajava.javacore.introducao02metodos.teste;

import academy.devdojo.maratonajava.javacore.introducao02metodos.dominio.Calculadora;
import java.util.Scanner;
public class Calculadoratest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        Calculadora cal = new Calculadora();
        // Primeiro número
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        // Operação
        System.out.println("Escolha a operação: ");
        System.out.println("[1] Soma");
        System.out.println("[2] Subtração");
        System.out.println("[3] Multiplicação");
        System.out.println("[4] Divisão");
        int operacao = scanner.nextInt();
        // Segundo número
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        // Realiza a operação
        switch (operacao){
            case 1:
                System.out.println("Resultado: " + cal.somar(num1, num2));
                break;
            case 2:
                System.out.println("Resultado: " + cal.subtrair(num1, num2));
                break;
            case 3:
                System.out.println("Resultado: " + cal.multiplicar(num1, num2));
                break;
            case 4:
                System.out.println("Resultado: " + cal.dividir(num1, num2));

                break;
            default:
                System.out.println("Operação inválida!");
                return;
        }
    }
}

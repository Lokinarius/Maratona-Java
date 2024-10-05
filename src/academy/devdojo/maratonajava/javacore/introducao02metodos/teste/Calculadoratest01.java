package academy.devdojo.maratonajava.javacore.introducao02metodos.teste;

import academy.devdojo.maratonajava.javacore.introducao02metodos.dominio.Calculadora;
import java.util.Scanner;
public class Calculadoratest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        Calculadora cal = new Calculadora();
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        // Operações
        System.out.println("Soma: " + cal.somar(num1, num2));
        System.out.println("Subtração: " + cal.subtrair(num1, num2));
        System.out.println("Multiplicação: " + cal.multiplicar(num1, num2));
        System.out.println("Divisão: " + cal.dividir(num1, num2));

    }
}

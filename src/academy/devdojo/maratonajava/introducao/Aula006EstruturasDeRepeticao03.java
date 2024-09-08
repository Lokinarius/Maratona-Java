package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;
public class Aula006EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        //utilizando o break
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Digite um número: ");
            int number = scanner.nextInt();
            System.out.println("Você digitou: " + number);
            System.out.println("Deseja continuar? (s/n): ");
            String answer = scanner.next();
            if ("n".equalsIgnoreCase(answer)) {
                break;
            }
        }
    }
}

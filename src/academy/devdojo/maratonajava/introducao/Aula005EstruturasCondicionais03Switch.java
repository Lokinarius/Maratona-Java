package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;
public class Aula005EstruturasCondicionais03Switch {
    public static void main(String[] args) {
        /* SWITCH */
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.print("Digite um número de 1 a 7: ");
        int dayOfWeek = scanner.nextInt();
        switch (dayOfWeek) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
        }
    }
}

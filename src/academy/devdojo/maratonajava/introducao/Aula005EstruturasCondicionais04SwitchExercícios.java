package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;
public class Aula005EstruturasCondicionais04SwitchExercícios {
    public static void main(String[] args) {
        /* SWITCH EXERCÍCIOS */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int day = scanner.nextInt();
        String dayOfWeek;
        String weekend = "É final de semana";
        String weekday = "É dia de semana";


        switch (day) {
            case 1:
                dayOfWeek = "Domingo";
                break;
            case 2:
                dayOfWeek = "Segunda-Feira";
                break;
            case 3:
                dayOfWeek = "Terça-Feira";
                break;
            case 4:
                dayOfWeek = "Quarta-Feira";
                break;
            case 5:
                dayOfWeek = "Quinta-Feira";
                break;
            case 6:
                dayOfWeek = "Sexta-Feira";
                break;
            case 7:
                dayOfWeek = "Sábado";
                break;
            default:
                dayOfWeek = "Dia inválido";
                System.out.println("Dia inválido");
                scanner.close();
                return;
        }
        System.out.println(dayOfWeek);
        if (day == 1 || day == 7) {
            System.out.println(weekend);
        } else {
            System.out.println(weekday);
        }

        scanner.close();
    }
}

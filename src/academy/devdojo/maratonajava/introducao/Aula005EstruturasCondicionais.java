package academy.devdojo.maratonajava.introducao;

public class Aula005EstruturasCondicionais {
    public static void main(String[] args) {
        /* ESTRUTURAS CONDICIONAIS */
        int age = 18;
        boolean isAdult = age >= 18;

        if (isAdult) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        int number = 5;
        if (number % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }
}

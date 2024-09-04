package academy.devdojo.maratonajava.introducao;

public class Aula005EstruturasCondicionais {
    public static void main(String[] args) {
        /* ESTRUTURAS CONDICIONAIS */
        int age = 18;

        if (age <= 12) {
            System.out.println("Você é uma criança.");
        } else if (age > 12 && age < 18) {
            System.out.println("Você é adolescente.");
        } else if (age >= 18 && age <= 60){
            System.out.println("Você é adulto.");
        }else{
            System.out.println("Você é idoso.");
        }

        int number = 5;
        if (number % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }
}

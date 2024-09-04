package academy.devdojo.maratonajava.introducao;
import java.util.Scanner; // import scanner to read user input
public class Aula005EstruturasCondicionais01 {
    public static void main(String[] args) {
        /* ESTRUTURAS CONDICIONAIS */
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.print("Digite sua idade: ");
        int age = scanner.nextInt();
        String idade;

        if (age <= 12) {
            idade = "Você é uma criança.";
        } else if (age < 18) {
            idade = "Você é adolescente.";
        } else if (age <= 60){
            idade = "Você é adulto.";
        }else{
            idade = "Você é idoso.";
        }
        System.out.println(idade);
    }
}

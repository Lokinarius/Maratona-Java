package academy.devdojo.maratonajava.introducao;

public class Aula005EstruturasCondicionais01 {
    public static void main(String[] args) {
        /* ESTRUTURAS CONDICIONAIS */
        int age = 18;
        String idade;

        if (age <= 12) {
            idade = "Você é uma criança.";
        } else if (age > 12 && age < 18) {
            idade = "Você é adolescente.";
        } else if (age >= 18 && age <= 60){
            idade = "Você é adulto.";
        }else{
            idade = "Você é idoso.";
        }
        System.out.println(idade);
    }
}

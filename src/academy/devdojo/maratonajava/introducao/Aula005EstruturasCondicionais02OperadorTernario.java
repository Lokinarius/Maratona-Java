package academy.devdojo.maratonajava.introducao;

public class Aula005EstruturasCondicionais02OperadorTernario {
    public static void main(String[] args) {
        /* OPERADOR TERNÁRIO */
        // (Condição)? Valor caso verdadeiro : Valor caso falso
        int age = 18;
        String message = (age <= 12)? "Você é uma criança." : (age > 12 && age < 18)? "Você é adolescente." : "Você é adulto.";
        System.out.println(message);
    }
}

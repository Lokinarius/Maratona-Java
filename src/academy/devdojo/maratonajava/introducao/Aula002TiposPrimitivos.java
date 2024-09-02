package academy.devdojo.maratonajava.introducao;

public class Aula002TiposPrimitivos {
    public static void main(String[] args) {
        /* TIPOS PRIMITIVOS */
        // int, double, float, char, byte, shot, long, boolean
        int age = 30;
        double wage = 1000.50D;
        float price = 10.5F;
        char letter = 'A';
        byte octet = 127;
        short curto = 32767;
        long longe = 9223372036854775807L;
        boolean verdadeiro = true;
        boolean falso = false;

        System.out.println("Idade: " + age);
        System.out.println("Salário: " + wage);
        System.out.println("Preço: " + price);
        System.out.println("Letra: " + letter);
        System.out.println("Octeto: " + octet);
        System.out.println("Curto: " + curto);
        System.out.println("Longo: " + longe);
        System.out.println("Verdadeiro: " + verdadeiro);
        System.out.println("Falso: " + falso);

        /* STRINGS EM JAVA SÃO UMA CLASSE */
        // Sempre começam com letra maiúscula
        // Podem conter caracteres especiais, espaço, letras minúsculas e números
        // Não podem começar ou terminar com um número
        // Não podem conter espaço em branco em sequência
        // Podem ser concatenados usando o operador "+"
        String name = "William S. R. Galvão";
        String job = "Desenvolvedor";
        String address = "Rua 123, 1234-5678";

        System.out.println("Nome: " + name);
        System.out.println("Profissão: " + job);
        System.out.println("Endereço: " + address);



    }
}

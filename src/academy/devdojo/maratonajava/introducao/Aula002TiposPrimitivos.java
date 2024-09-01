package academy.devdojo.maratonajava.introducao;

public class Aula002TiposPrimitivos {
    public static void main(String[] args) {
        /* TIPOS PRIMITIVOS */
        // int, double, float, char, byte, shot, long, boolean
        int age = 30;
        double wage = 1000.50;
        float price = 10.5f;
        char letter = 'A';
        byte octet = 127;
        short curto = 32767;
        long longe = 9223372036854775807L;
        boolean verdadeiro = true;

        System.out.println("Idade: " + age);
        System.out.println("Salário: " + wage);
        System.out.println("Preço: " + price);
        System.out.println("Letra: " + letter);
        System.out.println("Octeto: " + octet);
        System.out.println("Curto: " + curto);
        System.out.println("Longo: " + longe);
        System.out.println("Verdadeiro: " + verdadeiro);
    }
}

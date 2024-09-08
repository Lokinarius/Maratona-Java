package academy.devdojo.maratonajava.introducao;

public class Aula006EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        /* ESTRUTURA DE REPETIÇÃO FOR */
        System.out.println("Iteração de 1 a 10: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }
        System.out.println("\n");
        System.out.println("Iteração de 10 a 1: ");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("\n");
        /* ESTRUTURA DE REPETIÇÃO WHILE */
        int j = 0;
        System.out.println("Iteração de 1 a 10: ");
        while (j < 10) {
            System.out.println(j + 1);
            j++;
        }
        System.out.println("\n");
        /* ESTRUTURA DE REPETIÇÃO DO-WHILE */
        int k = 0;
        System.out.println("Iteração de 1 a 10 :");
        do {
            System.out.println(k + 1);
            k++;
        } while (k < 10);
        System.out.println("\n");
    }
}

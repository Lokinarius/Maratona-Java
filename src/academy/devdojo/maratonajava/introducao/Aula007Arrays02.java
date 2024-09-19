package academy.devdojo.maratonajava.introducao;

public class Aula007Arrays02 {
    public static void main(String[] args) {
        // ARRAYS
        String[] nomes = {"Alice", "Dorathy", "Victor"};

        // Acessando um elemento pelo índice
        System.out.println("Nome no índice 1: " + nomes[1]);

        // Alterando um elemento pelo índice
        nomes[2] = "Soulstice";

        // Adicionando um novo elemento ao array
        nomes[3] = "Eve";

        //iteração de arrays
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome no índice " + i + ": " + nomes[i]);
        }

    }
}

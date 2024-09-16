package academy.devdojo.maratonajava.introducao;

public class Aula007Arrays01 {
    public static void main(String[] args) {
        // ARRAYS
        int[] numeros = {1, 2, 3, 4, 5};

        // Acessando um elemento pelo índice
        System.out.println("Elemento no índice 2: " + numeros[2]);

        // Alterando um elemento pelo índice
        numeros[2] = 100;
        System.out.println("Novo valor do elemento no índice 2: " + numeros[2]);

        // Adicionando um novo elemento ao final do array
        numeros[5] = 6;
        System.out.println("Novo valor do último elemento: " + numeros[5]);

        // Remover um elemento do array
        numeros[5] = 0; // Limpando o valor do último elemento
        System.out.println("Novo valor do último elemento: " + numeros[5] );

        int [] idades = new int[3];
        idades[0] = 29;
        idades[1] = 32;
        idades[2] = 27;
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}

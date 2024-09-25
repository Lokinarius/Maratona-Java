package academy.devdojo.maratonajava.introducao;

public class Aula008ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // ARRAYS MULTIDIMENSIONAIS
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Acessando um elemento pelo índice
        System.out.println("Elemento na posição (1, 2): " + matriz[1][2]);

        // Matriz com laço de repetição
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

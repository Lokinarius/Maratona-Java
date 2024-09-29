package academy.devdojo.maratonajava.introducao;

public class Aula008ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][];

        matriz[0] = new int[3];
        matriz[1] = new int[6];
        matriz[2] = new int[9];

        for(int[] base: matriz){
            System.out.println("\n------");
            for(int num: base){
                System.out.print(num + " ");
            }
        }
    }
}

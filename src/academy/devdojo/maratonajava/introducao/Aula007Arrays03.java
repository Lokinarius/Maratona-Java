package academy.devdojo.maratonajava.introducao;

public class Aula007Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[8];
        int[] numeros2 = {0,1,2,3,4,5,6,7};

        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros2[i]);
        }

        // forEach loop
        for (int num: numeros2){
            System.out.println(num);
        }
    }
}

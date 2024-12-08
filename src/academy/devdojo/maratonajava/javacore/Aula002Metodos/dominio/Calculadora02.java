package academy.devdojo.maratonajava.javacore.Aula002Metodos.dominio;

public class Calculadora02 {
    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println("Soma dos números: " + soma);
    }

    public void somaVarArgs(int...numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println("Soma dos números: " + soma);
    }
}

package academy.devdojo.maratonajava.javacore.Aula017Strings.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = " Naruto ";
        String numeros = "012345";
        System.out.println(nome.charAt(0)); //Retorna o char na posição indicada, N
        System.out.println(nome.length()); //Retorna o tamanho da String
        System.out.println(nome.replace("N","B")); // Muda os chars
        System.out.println(nome.toLowerCase()); //Tudo em minúsculo
        System.out.println(nome.toUpperCase()); // Tudo no maísculo
        System.out.println(numeros.length());
        System.out.println(numeros.substring(1,3));
        System.out.println(nome.trim()); //remove valores em branco
    }
}

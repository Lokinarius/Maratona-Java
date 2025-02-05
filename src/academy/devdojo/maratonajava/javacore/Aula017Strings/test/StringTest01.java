package academy.devdojo.maratonajava.javacore.Aula017Strings.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "William"; // String constant pool
        String nome2 = "William";
        nome.concat(" Galvão");
        // String são imutáveis
        System.out.println(nome == nome2); // Comparando as strings
        String nome3 = new String("William"); // Variável de referencia, Objeto do tipo string
        System.out.println( nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}

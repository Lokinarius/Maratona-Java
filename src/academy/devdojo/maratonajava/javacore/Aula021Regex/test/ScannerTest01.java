package academy.devdojo.maratonajava.javacore.Aula021Regex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Naruto, Sasuske, Sakura";
        String[] nomes = texto.split(",\\s");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }
    }
}

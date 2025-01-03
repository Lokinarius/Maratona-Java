package academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.test;

import academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9",3000);

        Tomate tomate = new Tomate("Brasileiro",25);
        tomate.setDataValidade("11/03/2025");

        CalculadoraImposto.calcularImposto(tomate);
    }
}

package academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.test;

import academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.domain.Produto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Rizen 9",3000);

        System.out.println(produto.getName());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());


    }
}

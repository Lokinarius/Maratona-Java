package academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.test;

import academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.domain.Televisao;
import academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC1017",7000);
        Tomate tomate = new Tomate("Tomate cereja",12);
        Televisao tv = new Televisao("LG TV",1200);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("---------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}

package academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.test;

import academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC1017",7000);
        Tomate tomate = new Tomate("Tomate cereja",12);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("---------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}

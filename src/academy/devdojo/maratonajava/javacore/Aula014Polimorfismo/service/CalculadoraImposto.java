package academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.service;

import academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatorio de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Imposto do Computador: " +computador.getName());
        System.out.println("Valor: "+computador.getValor());
    }

    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatorio de imposto do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Imposto do Tomate: " +tomate.getName());
        System.out.println("Valor: "+tomate.getValor());
    }
}

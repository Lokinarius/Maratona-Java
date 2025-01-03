package academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.service;

import academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.domain.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+ produto.getName());
        System.out.println("Preço: "+produto.getValor());
        System.out.println("Imposto a ser pago: "+imposto);

        if(produto instanceof Tomate){
            Tomate tomate =(Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }

    }
}

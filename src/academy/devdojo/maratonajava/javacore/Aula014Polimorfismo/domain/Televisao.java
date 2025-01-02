package academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.domain;

import static academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.domain.Computador.IMPOSTO;

public class Televisao extends Produto{
    public Televisao(String name, double valor) {
        super(name, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto da Televisão");
        return this.valor * IMPOSTO;
    }
}

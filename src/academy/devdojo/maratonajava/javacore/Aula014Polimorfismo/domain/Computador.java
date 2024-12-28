package academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.domain;

public class Computador extends Produto{
    //[CONSTANTE]
    public static final double IMPOSTO = 0.45;

    //[CONSTRUTOR]
    public Computador(String name, double valor) {
        super(name, valor);
    }

    //[OVERRIDE]
    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto do computador");
        return this.valor * IMPOSTO;
    }
}

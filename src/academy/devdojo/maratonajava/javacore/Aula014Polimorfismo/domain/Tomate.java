package academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.domain;

public class Tomate extends Produto{
    //[CONSTANTE]
    public static final double IMPOSTO = 0.27;

    //[CONSTRUTOR]
    public Tomate(String name, double valor) {
        super(name, valor);
    }

    //[OVERRIDE]
    @Override
    public double calcularImposto() {
        return this.valor = IMPOSTO;
    }
}

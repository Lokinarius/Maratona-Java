package academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.domain;

public abstract class Produto implements Taxavel {
    //[ATRIBUTOS]
    protected String name;
    protected double valor;

    //[CONSTRUTOR]
    public Produto(String name, double valor) {
        this.name = name;
        this.valor = valor;
    }

    //[GETTERS E SETTERS]
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public double getValor() {return valor;}
    public void setValor(double valor) {this.valor = valor;}
}

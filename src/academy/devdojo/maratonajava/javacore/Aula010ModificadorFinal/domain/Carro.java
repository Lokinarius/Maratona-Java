package academy.devdojo.maratonajava.javacore.Aula010ModificadorFinal.domain;

public class Carro {
    //[ATRIBUTOS]
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    // Constantes não podem ter o valor alterado
    // Constantes geralmente são acompanhadas do metod estatico
    // Constantes são descritas em Uppercase e separadas por underline caso tenham mais de uma palavra
    public static final Comprador COMPRADOR = new Comprador();


    //[GETTER E SETTERS]
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
}

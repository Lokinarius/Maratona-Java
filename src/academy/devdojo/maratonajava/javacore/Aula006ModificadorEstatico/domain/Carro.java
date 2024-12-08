package academy.devdojo.maratonajava.javacore.Aula006ModificadorEstatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    // [CONSTRUTOR]
    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // [METODO IMPRIME]
    public void imprime(){
        System.out.println("===================");
        System.out.println("Nome: "+this.nome);
        System.out.println("Velocidade Máxima: "+this.velocidadeMaxima);
        System.out.println("Velocidade Limite: "+this.velocidadeLimite);
    }

    // [GETTERS AND SETTERS]
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        // Não pode se usar o "this" dentro do static void
        // this.velocidadeLimite = velocidadeLimite;
        Carro.velocidadeLimite = velocidadeLimite;

    }
}



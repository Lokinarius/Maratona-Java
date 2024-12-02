package academy.devdojo.maratonajava.javacore.introducao07associacao.domain;

public class Time {
    // Atributos
    private String nome;
    private Jogador[] jogadores;

    // Construtor
    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    // Metodo imprime
    public void imprime(){
        System.out.println(this.nome);
        if(jogadores == null) return;
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNome());
        }
    }

    // Getters and Setters
    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

package academy.devdojo.maratonajava.javacore.introducao07associacao.domain;

public class Jogador {
    private String nome;
    private Time time;

    // Metodo que imprime o nome do jogador
    public void imprime(){
        System.out.println("Nome: " + this.nome);
        if(time != null){
            System.out.println(time.getNome());
        }
    }

    // Construtor
    public Jogador(String nome) {
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Time getTime() {
        return time;
    }
    public void setTime(Time time) {
        this.time = time;
    }
}

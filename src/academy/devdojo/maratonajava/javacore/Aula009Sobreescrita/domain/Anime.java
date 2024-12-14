package academy.devdojo.maratonajava.javacore.Aula009Sobreescrita.domain;

public class Anime {
    //[ATRIBUTOS]
    private String nome;

    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }

    //[CONSTRUTOR]
    public Anime(String nome) {
        this.nome = nome;
    }

    //[GETTERS E SETTERS]
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
}

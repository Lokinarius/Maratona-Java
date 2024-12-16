package academy.devdojo.maratonajava.javacore.Aula010ModificadorFinal.domain;

public class Comprador {
    //[ATRIBUTOS]
    private String nome;

    //[TO STRING]
    @Override
    public String toString() {
        return "Comprador{" +
                "nome='" + nome + '\'' +
                '}';
    }

    //[GETTERS E SETTERS]
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
}

package academy.devdojo.maratonajava.javacore.introducao07associacao.domain;

public class Professor {
    private String nome;
    private String materia;
    private Seminario[] seminarios;

    // Construtor
    public Professor(String nome) {
        this.nome = nome;
    }
     // Construtor sobrecarregado
    public Professor(String nome, String materia, Seminario[] seminarios) {
        this.nome = nome;
        this.materia = materia;
        this.seminarios = seminarios;
    }

    // Getters and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
}

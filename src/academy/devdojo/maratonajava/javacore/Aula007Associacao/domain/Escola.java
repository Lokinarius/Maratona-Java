package academy.devdojo.maratonajava.javacore.Aula007Associacao.domain;

public class Escola {
    private String nome;
    private Professor[] professores;

    // Construtor
    public Escola(String nome){
        this.nome = nome;
    }

    //Construtor sobrecarregado
    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    // Metodo imprime
    public void imprime() {
        System.out.println("Nome da Escola: " + this.nome);
        if(professores != null) return;
        for (Professor professor : professores) {
            System.out.println(professor.getNome());
        }

    }



    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}

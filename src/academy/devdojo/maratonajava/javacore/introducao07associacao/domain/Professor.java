package academy.devdojo.maratonajava.javacore.introducao07associacao.domain;

public class Professor {
    // Atributos
    private String nome;
    private String materia;
    private Seminario[] seminarios;

    // Construtor
    public Professor(String nome) {
        this.nome = nome;
    }
    public String materia(){
        return materia;
    }

     // Construtores sobrecarregados
     public Professor(String nome, String materia) {
         this.nome = nome;
         this.materia = materia;
     }
    public Professor(String nome, String materia, Seminario[] seminarios) {
        this.nome = nome;
        this.materia = materia;
        this.seminarios = seminarios;
     }

    // Metodo imprime
    public void imprime(){
        System.out.println("---------------");
        System.out.println("Professor: "+this.nome);
        if(this.seminarios == null) return;
        System.out.println("## Seminários cadastrados ##");
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            System.out.println("## Alunos ##");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: "+aluno.getNome());
                System.out.println("Idade: "+aluno.getIdade());
            }

        }

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

    public void setSeminarios(Seminario[] seminariosDisponiveis) {
    }
}

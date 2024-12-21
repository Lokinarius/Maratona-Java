package academy.devdojo.maratonajava.javacore.Aula012ClassesAbstratas.domain;

public class Gerente extends Funcionario {
    // [ATRIBUTOS]
    // [CONSTRUTOR]
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    // [GETTERS E SETTERS]
}

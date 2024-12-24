package academy.devdojo.maratonajava.javacore.Aula012ClassesAbstratas.domain;

public class Gerente extends Funcionario {
    // [ATRIBUTOS]
    // [CONSTRUTOR]
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus(){
        this.salario = this.salario + this.salario * 0.2;
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

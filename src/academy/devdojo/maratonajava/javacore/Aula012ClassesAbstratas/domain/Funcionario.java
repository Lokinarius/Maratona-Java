package academy.devdojo.maratonajava.javacore.Aula012ClassesAbstratas.domain;

public abstract class Funcionario {
    // [ATRIBUTOS]
    protected String nome;
    protected double salario;

    // [CONSTRUTOR]
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    // [METODOS]
    public void calculaBonus(){
        this.salario = salario + salario * 0.1;
    }

    // [TO STRING]


    // [GETTERS E SETTERS]
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public double getSalario() {return salario;}
    public void setSalario(double salario) {this.salario = salario;}
}

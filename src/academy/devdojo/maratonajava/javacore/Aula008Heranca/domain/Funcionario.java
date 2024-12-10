package academy.devdojo.maratonajava.javacore.Aula008Heranca.domain;

public class Funcionario extends Pessoa{
    // atributos
    private double salario;

    // Sobreescrita da classe pessoa
    // public void imprime(){
        // o metodo do pai é copiado sem necessidade de preencher dados
    // }

    // Metodo imprime sobreescrito com atributos proprios do objeto
    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    // Gettters e Setters
    public double getSalario() {return salario;}
    public void setSalario(double salario) {this.salario = salario;}
}

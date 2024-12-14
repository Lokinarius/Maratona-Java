package academy.devdojo.maratonajava.javacore.Aula008Heranca.domain;

public class Funcionario extends Pessoa{
    // atributos
    private double salario;

    static{
        System.out.println("Dentro do bloco de inicialização estático de funcionário");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionário 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionário 2");
    }

    //[CONSTRUTOR]
    public Funcionario(String nome) {
        super(nome);
        this.salario = salario;
        System.out.println("Dentro do construtor de funcionário");
    }


    // Sobreescrita da classe pessoa
    // public void imprime(){
        // o metodo do pai é copiado sem necessidade de preencher dados
    // }

    // Metodo imprime sobreescrito com atributos proprios do objeto
    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorio(){
        System.out.println("Eu "+this.getNome()+" recebi "+this.salario);
    }

    // Gettters e Setters
    public double getSalario() {return salario;}
    public void setSalario(double salario) {this.salario = salario;}
}

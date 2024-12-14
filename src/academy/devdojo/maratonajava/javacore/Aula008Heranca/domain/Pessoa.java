package academy.devdojo.maratonajava.javacore.Aula008Heranca.domain;

public class Pessoa {
    // Atributos
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static{
        System.out.println("Dentro do bloco de inicialização estático de pessoa");
    }
    {
        System.out.println("Dentro do bloco de inicialização de pessoa 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de pessoa 2");
    }

    // Construtor
    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
    }

    // Metodo
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() +" "+this.endereco.getCep());
    }

    // Getters e setters
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getCpf() {return cpf;}
    public void setCpf(String cpf) {this.cpf = cpf;}

    public void setEndereco(Endereco endereco) {
    }
}

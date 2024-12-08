package academy.devdojo.maratonajava.javacore.Aula002Metodos.dominio;

public class Funcionario {
    // Atributos
    private String nome;
    private int idade;
    private double[] salario = new double[3];
    private double media;

    // Métodos
    public void mediaSalarial(){
        this.media = (salario[0] + salario[1] + salario[2]) / 3;
    }
    public void imprime(){
        System.out.println("----------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        System.out.println("Média Salarial: " + this.media);

    }

    // [GETTERS AND SETTERS]

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }
}



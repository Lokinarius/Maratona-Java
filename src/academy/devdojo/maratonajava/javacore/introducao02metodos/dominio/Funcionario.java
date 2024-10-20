package academy.devdojo.maratonajava.javacore.introducao02metodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario = new double[3];
    public double media;

    public void mediaSalarial(){
        this.media = (salario[0] + salario[1] + salario[2]) / 3;
    }

    public void imprime(){
        System.out.println("----------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        System.out.println("Média Salarial: " + this.media);

    }
}



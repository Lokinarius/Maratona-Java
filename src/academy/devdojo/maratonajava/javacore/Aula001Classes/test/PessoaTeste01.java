package academy.devdojo.maratonajava.javacore.Aula001Classes.test;
import academy.devdojo.maratonajava.javacore.Aula001Classes.dominio.Pessoa;
public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa sayajin = new Pessoa();
        sayajin.nome = "Goku";
        sayajin.idade = 46;
        sayajin.sexo = 'M';
        System.out.println("Nome: " + sayajin.nome);
        System.out.println("Idade: " + sayajin.idade);
        System.out.println("Sexo: " + sayajin.sexo);
    }
}

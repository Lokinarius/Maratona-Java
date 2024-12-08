package academy.devdojo.maratonajava.javacore.Aula002Metodos.teste;

import academy.devdojo.maratonajava.javacore.Aula002Metodos.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa();
        pessoa01.setNome("Jiraya");
        pessoa01.idade = 64;
        pessoa01.setSexo('M');
        pessoa01.imprime();
    }
}

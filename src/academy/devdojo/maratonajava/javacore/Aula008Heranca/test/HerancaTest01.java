package academy.devdojo.maratonajava.javacore.Aula008Heranca.test;

import academy.devdojo.maratonajava.javacore.Aula008Heranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.Aula008Heranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Aula008Heranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Beco dos gatos");
        endereco.setCep("012353-765");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Tomoyo");
        pessoa.setCpf("92837452467");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Denji");
        funcionario.setCpf("00000000000");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(9847);
        funcionario.imprime();
    }
}

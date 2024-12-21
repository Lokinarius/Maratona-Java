package academy.devdojo.maratonajava.javacore.Aula012ClassesAbstratas.test;

import academy.devdojo.maratonajava.javacore.Aula012ClassesAbstratas.domain.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Aula012ClassesAbstratas.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Aula012ClassesAbstratas.domain.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        // [OBJETOS]
        Gerente gerente = new Gerente("Tsunade", 70000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Kakashi",5000);

        // [SAIDA DE DADOS]
        System.out.println(desenvolvedor);
        System.out.println(gerente);
    }
}

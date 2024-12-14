package academy.devdojo.maratonajava.javacore.Aula008Heranca.test;

import academy.devdojo.maratonajava.javacore.Aula008Heranca.domain.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar a classe pai
    // 1 - Bloco de inicialização estático da sub classe é executado quando a JVM carregar a classe filha
    // 2 - Alocado espaço em memória pro objeto da classe pai
    // 3 - Cada atributo de classe é criado e inicializado com valores default ou o quer que for passado da classe pai
    // 4 - Bloco de inicialização da surper classe é executado na ordem que aparece
    // 5 - Construtor da superclasse é executado
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Power");
    }
}

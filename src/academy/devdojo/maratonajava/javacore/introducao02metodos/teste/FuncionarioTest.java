package academy.devdojo.maratonajava.javacore.introducao02metodos.teste;

import academy.devdojo.maratonajava.javacore.introducao02metodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        //Criação e inicialização dos objetos de funcionário
        Funcionario funcionario01 = new Funcionario();
        Funcionario funcionario02 = new Funcionario();
        Funcionario funcionario03 = new Funcionario();

        funcionario01.setNome("Rei");
        funcionario01.setIdade(17);
        funcionario01.setSalario(new double[]{1600.0,1700.0,2000,0});

        funcionario02.setNome("Asuka");
        funcionario02.setIdade(17);
        funcionario02.setSalario(new double[]{1500.0,1800.0,2100.0});

        funcionario03.setNome("Shinji");
        funcionario03.setIdade(17);
        funcionario03.setSalario(new double[]{1800.0,1900.0,2200.0});

        // Saída
        funcionario01.mediaSalarial();
        funcionario01.imprime();

        funcionario02.mediaSalarial();
        funcionario02.imprime();

        funcionario03.mediaSalarial();
        funcionario03.imprime();
    }


}

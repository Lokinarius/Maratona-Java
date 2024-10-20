package academy.devdojo.maratonajava.javacore.introducao02metodos.teste;

import academy.devdojo.maratonajava.javacore.introducao02metodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        Funcionario funcionario02 = new Funcionario();
        Funcionario funcionario03 = new Funcionario();

        funcionario01.nome = "Rei";
        funcionario01.idade = 17;
        funcionario01.salario[0] = 1500.0;
        funcionario01.salario[1] = 1800.0;
        funcionario01.salario[2] = 2000.0;

        funcionario02.nome = "Asuka";
        funcionario02.idade = 18;
        funcionario02.salario[0] = 1700.0;
        funcionario02.salario[1] = 1900.0;
        funcionario02.salario[2] = 2100.0;

        funcionario03.nome = "Shinji";
        funcionario03.idade = 19;
        funcionario03.salario[0] = 1600.0;
        funcionario03.salario[1] = 1850.0;
        funcionario03.salario[2] = 2050.0;

        //Saída
        funcionario01.mediaSalarial();
        funcionario01.imprime();

        funcionario02.mediaSalarial();
        funcionario02.imprime();

        funcionario03.mediaSalarial();
        funcionario03.imprime();
    }


}

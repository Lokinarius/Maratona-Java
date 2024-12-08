package academy.devdojo.maratonajava.javacore.Aula002Metodos.teste;

import academy.devdojo.maratonajava.javacore.Aula002Metodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        Estudante estudante03 = new Estudante();

        estudante01.nome = "Naruto";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        estudante03.nome = "Sasuke";
        estudante03.idade = 17;
        estudante03.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();
        estudante03.imprime();

    }
}

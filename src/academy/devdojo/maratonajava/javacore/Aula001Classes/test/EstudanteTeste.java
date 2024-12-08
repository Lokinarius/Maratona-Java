package academy.devdojo.maratonajava.javacore.Aula001Classes.test;

import academy.devdojo.maratonajava.javacore.Aula001Classes.dominio.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        System.out.println(estudante.idade);
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
    }
}

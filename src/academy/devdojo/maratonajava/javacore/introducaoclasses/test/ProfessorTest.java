package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Carvalho";
        professor.materia = "Biologia";
        professor.idade = 46;
        professor.sexo = 'M';

        System.out.println("\nNome: " + professor.nome + "\nidade: " + professor.idade + "\nMateria: " + professor.materia);
    }
}

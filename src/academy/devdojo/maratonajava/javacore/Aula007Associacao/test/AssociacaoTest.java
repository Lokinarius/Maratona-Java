package academy.devdojo.maratonajava.javacore.Aula007Associacao.test;

import academy.devdojo.maratonajava.javacore.Aula007Associacao.domain.Aluno;
import academy.devdojo.maratonajava.javacore.Aula007Associacao.domain.Local;
import academy.devdojo.maratonajava.javacore.Aula007Associacao.domain.Professor;
import academy.devdojo.maratonajava.javacore.Aula007Associacao.domain.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        // Objetos
        Local local = new Local("Konoha");
        Aluno aluno = new Aluno("Naruto",15);
        Professor professor = new Professor("Kakashi","Jutsus");
        Seminario seminario = new Seminario("Aprendendo os elementos do chakra");
        // Associações
        Aluno[] alunosParaSeminario = {aluno};
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);
        // Impressão do código
        professor.imprime();
    }
}

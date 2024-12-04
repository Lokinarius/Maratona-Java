package academy.devdojo.maratonajava.javacore.introducao07associacao.test;

import academy.devdojo.maratonajava.javacore.introducao07associacao.domain.Aluno;
import academy.devdojo.maratonajava.javacore.introducao07associacao.domain.Local;
import academy.devdojo.maratonajava.javacore.introducao07associacao.domain.Professor;
import academy.devdojo.maratonajava.javacore.introducao07associacao.domain.Seminario;

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

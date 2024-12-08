package academy.devdojo.maratonajava.javacore.Aula007Associacao.test;

import academy.devdojo.maratonajava.javacore.Aula007Associacao.domain.Escola;
import academy.devdojo.maratonajava.javacore.Aula007Associacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Onizuka");
        Professor professor02 = new Professor("Kakashi");
        Professor[] professores = {professor01, professor02};
        Escola escola01 = new Escola("Gyodan", professores);
    }
}

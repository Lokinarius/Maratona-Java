package academy.devdojo.maratonajava.javacore.introducao07associacao.test;

import academy.devdojo.maratonajava.javacore.introducao07associacao.domain.Escola;
import academy.devdojo.maratonajava.javacore.introducao07associacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Onizuka");
        Professor professor02 = new Professor("Kakashi");
        Professor[] professores = {professor01, professor02};
        Escola escola01 = new Escola("Gyodan", professores);
    }
}

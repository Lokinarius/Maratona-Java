package academy.devdojo.maratonajava.javacore.Aula007Associacao.test;

import academy.devdojo.maratonajava.javacore.Aula007Associacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.Aula007Associacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time1 = new Time("Seleção Brasileira");
        jogador1.setTime(time1);
        jogador1.imprime();
    }
}

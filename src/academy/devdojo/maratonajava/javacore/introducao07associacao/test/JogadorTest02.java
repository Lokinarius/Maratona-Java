package academy.devdojo.maratonajava.javacore.introducao07associacao.test;

import academy.devdojo.maratonajava.javacore.introducao07associacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.introducao07associacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time1 = new Time("Seleção Brasileira");
        jogador1.setTime(time1);
        jogador1.imprime();
    }
}

package academy.devdojo.maratonajava.javacore.introducao07associacao.test;

import academy.devdojo.maratonajava.javacore.introducao07associacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.introducao07associacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ronaldo");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        for (Jogador jogador : jogadores) {
            System.out.println("Nome: " + jogador.getNome());
            System.out.println("Time: " + jogador.getTime().getNome());
            System.out.println();
        }
    }
}

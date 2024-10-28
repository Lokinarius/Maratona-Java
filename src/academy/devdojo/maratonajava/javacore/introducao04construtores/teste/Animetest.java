package academy.devdojo.maratonajava.javacore.introducao04construtores.teste;

import academy.devdojo.maratonajava.javacore.introducao04construtores.domain.Anime;

public class Animetest {
    public static void main(String[] args) {
        Anime anime = new Anime("Soul Eater");
        anime.init("Soul Eater","TV",48, "Shounen");
        anime.imprime();
    }
}

package academy.devdojo.maratonajava.javacore.Aula003Sobrecarga.teste;

// [IMPORTS]
import academy.devdojo.maratonajava.javacore.Aula003Sobrecarga.dominio.Anime;
public class AnimeTeste {
    public static void main(String[] args) {
        // [OBJETOS]
        Anime animeFAB = new Anime();
        animeFAB.init("FullMetal Alchemist Brotherhood","TV",48, "Shounen");
        animeFAB.imprime();
    }
}

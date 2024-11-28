package academy.devdojo.maratonajava.javacore.introducao06modificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0 - Bloco de inicialização é executado quando a JVM carregar a classe
    // 1 - alocado espaço em memória pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o quer que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - construtor é executado
    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++){
            episodios[i] = i + 1;
        }
    }
    // metodos staticos não acessam
    public Anime() {
        System.out.println("Construtor padrão chamado");
    }

    public Anime(String nome) {
        for(int episodio: Anime.episodios){
            System.out.println("Episódio: " + episodio);
        }
    }
}

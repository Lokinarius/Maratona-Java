package academy.devdojo.maratonajava.javacore.Aula005BlocosDeInicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;
    // 1 - alocado espaço em memória pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o quer que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - construtor é executado
    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++){
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        for(int episodio: this.episodios){
            System.out.println("Episódio: " + episodio);
        }
    }
}

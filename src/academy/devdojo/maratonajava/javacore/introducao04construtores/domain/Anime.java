package academy.devdojo.maratonajava.javacore.introducao04construtores.domain;

public class Anime {
    // [ATRIBUTOS]
    private String nome;
    private int episodios;
    private String genero;

    // [CONSTRUTOR]
    public Anime(String nome, int episodios, String genero){
        // Inicializa os atributos com os valores passados como parâmetros
        this();// Construtor sobrecarregado
        this.nome = nome;
        this.episodios = episodios;
        this.genero = genero;
        this.imprime();
    }

    // [SOBRECARGA]
    // Sobrecarga do construtor com Sout
    public Anime(){
        System.out.println("----------------");
        System.out.println("Informações do anime: ");
        System.out.println("----------------");
    }

    // [METODOS]
    // Imprime
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    // [GETTERS AND SETTERS]
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getEpisodios() {
        return episodios;
    }
    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}

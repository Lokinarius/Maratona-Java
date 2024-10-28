package academy.devdojo.maratonajava.javacore.introducao04construtores.domain;

public class Anime {
    // [ATRIBUTOS]
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    // [CONSTRUTOR]
    public Anime(String nome){
        // O construtor inicializa objetos, garantindo valores iniciais e configurações essenciais.
        System.out.println("----------------");
        System.out.println("Informações do anime: ");
    }

    // [METODOS]
    // Metodos init() separam lógica de inicialização,
    // centraliza código, facilita testes, evita duplicação e melhora a manutenção.
    public void init(String nome, String tipo, int episodios, String genero) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    // Imprime
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
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
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
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

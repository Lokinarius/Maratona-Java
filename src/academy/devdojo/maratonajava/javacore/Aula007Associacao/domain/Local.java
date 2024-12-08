package academy.devdojo.maratonajava.javacore.Aula007Associacao.domain;

public class Local {
    private String endereco;

    // Construtor
    public Local(String endereco) {
        this.endereco = endereco;
    }

    // Getters e Setters
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

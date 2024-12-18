package academy.devdojo.maratonajava.javacore.Aula011Enumeracao.domain;

public class Cliente {
    // Atributos
    private String nome;
    private TipoCliente tipoCliente;

    // To string
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoCliente=" + tipoCliente.getVALOR() +
                '}';
    }

    // Construtor
    public Cliente(String nome, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    // Getters e Setters
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public TipoCliente getTipoCliente() {return tipoCliente;}
    public void setTipoCliente(TipoCliente tipoCliente) {this.tipoCliente = tipoCliente;}
}

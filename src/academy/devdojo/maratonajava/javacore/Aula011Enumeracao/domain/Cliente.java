package academy.devdojo.maratonajava.javacore.Aula011Enumeracao.domain;

public class Cliente {
    // Atributos
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    // Enumeração
    // também é possível criar uma enumeração dentro de uma classe
    public enum TipoPagamento{
        DEBITO, CREDITO
    }


    // To string
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoCliente=" + tipoCliente.getVALOR() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }

    // Construtor
    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    // Getters e Setters
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public TipoCliente getTipoCliente() {return tipoCliente;}
    public void setTipoCliente(TipoCliente tipoCliente) {this.tipoCliente = tipoCliente;}

    public TipoPagamento getTipoPagamento() {return tipoPagamento;}
    public void setTipoPagamento(TipoPagamento tipoPagamento) {this.tipoPagamento = tipoPagamento;}
}

package academy.devdojo.maratonajava.javacore.introducao02metodos.dominio;

public class Pessoa {
    private String nome;
    public int idade;
    private char sexo;

    public void imprime(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + getSexo());
    }

    // [GETTERS AND SETTERS]
    // Nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    // Sexo
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        if(sexo != 'm' && sexo != 'f'){
            throw new IllegalArgumentException("Sexo deve ser'm' ou 'f'");
        }
        this.sexo = sexo;
    }
}

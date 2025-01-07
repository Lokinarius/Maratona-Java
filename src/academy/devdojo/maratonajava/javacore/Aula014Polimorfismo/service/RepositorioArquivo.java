package academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.service;

import academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando o arquivo");
    }
}

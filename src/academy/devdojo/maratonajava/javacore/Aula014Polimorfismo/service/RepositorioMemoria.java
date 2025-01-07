package academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.service;

import academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}

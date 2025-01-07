package academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.service;

import academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.repositorio.Repositorio;

public class RepositorioBandoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvaldo no Banco de dados");
    }
}

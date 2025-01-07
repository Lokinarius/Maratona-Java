package academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.test;

import academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.service.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.service.RepositorioBandoDeDados;
import academy.devdojo.maratonajava.javacore.Aula014Polimorfismo.service.RepositorioMemoria;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorioBDD = new RepositorioBandoDeDados();
        Repositorio repositorioMMR = new RepositorioMemoria();
        Repositorio repositorioAQV = new RepositorioArquivo();

        repositorioBDD.salvar();
        repositorioAQV.salvar();
        repositorioMMR.salvar();

    }
}

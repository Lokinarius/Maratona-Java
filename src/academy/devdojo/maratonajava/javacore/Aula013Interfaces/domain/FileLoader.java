package academy.devdojo.maratonajava.javacore.Aula013Interfaces.domain;

public class FileLoader implements DataLoader, DataRemover {

    // [IMPLEMENTAÇÃO DA INTERFACE]
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Deletando dados de um arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões do banco de um arquivo");
    }
}

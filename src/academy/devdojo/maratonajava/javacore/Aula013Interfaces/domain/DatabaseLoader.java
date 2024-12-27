package academy.devdojo.maratonajava.javacore.Aula013Interfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {


    // [IMPLEMENTAÇÃO DA INTERFACE]
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Deletando dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões do banco de dados");
    }
}

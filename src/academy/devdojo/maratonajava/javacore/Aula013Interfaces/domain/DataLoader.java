package academy.devdojo.maratonajava.javacore.Aula013Interfaces.domain;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    void load();
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retriveMaxDataSize(){
        System.out.println("Dentro do RMDS da interface ");
    }
}

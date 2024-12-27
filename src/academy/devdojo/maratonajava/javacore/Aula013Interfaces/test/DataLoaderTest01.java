package academy.devdojo.maratonajava.javacore.Aula013Interfaces.test;

import academy.devdojo.maratonajava.javacore.Aula013Interfaces.domain.DataLoader;
import academy.devdojo.maratonajava.javacore.Aula013Interfaces.domain.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Aula013Interfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retriveMaxDataSize();

    }
}

package academy.devdojo.maratonajava.javacore.Aula022IO.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


// File
// FileWriter
// FileReader
// BufferedWriter
// BufferedReader
public class FileWriteTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file)) {
            fw.write("Vou me churrascar");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

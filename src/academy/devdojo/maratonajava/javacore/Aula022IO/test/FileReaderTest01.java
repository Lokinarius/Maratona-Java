package academy.devdojo.maratonajava.javacore.Aula022IO.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileReader fr = new FileReader(file)){
            char[] in = new char[1];
            fr.read(in);
            for (char c : in){
                System.out.println(c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

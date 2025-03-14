package academy.devdojo.maratonajava.javacore.Aula022IO.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr)){
            String Linha;
            while((Linha = br.readLine()) != null){
                System.out.println(Linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

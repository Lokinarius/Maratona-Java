package academy.devdojo.maratonajava.javacore.Aula022IO.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw)){
            bw.write("Me ajuda!");
            bw.newLine();
            bw.flush();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}

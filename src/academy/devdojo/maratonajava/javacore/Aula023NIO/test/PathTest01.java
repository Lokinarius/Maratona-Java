package academy.devdojo.maratonajava.javacore.Aula023NIO.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("file.txt");
        System.out.println(p1.getFileName());
    }
}

package academy.devdojo.maratonajava.javacore.Aula023NIO.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) {
        Path path = Paths.get("pasta2/novo_path.txt");

        try {
            BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println("É um diretório? " + basicFileAttributes.isDirectory());
            System.out.println("É um arquivo regular? " + basicFileAttributes.isRegularFile());
            System.out.println("É um link simbólico? " + basicFileAttributes.isSymbolicLink());
            System.out.println("Tamanho do arquivo: " + basicFileAttributes.size() + " bytes");
            System.out.println("Criado em: " + basicFileAttributes.creationTime());
            System.out.println("Último acesso: " + basicFileAttributes.lastAccessTime());
            System.out.println("Última modificação: " + basicFileAttributes.lastModifiedTime());
        } catch (IOException e) {
            System.out.println("Erro ao ler os atributos do arquivo: " + e.getMessage());
        }
    }
}

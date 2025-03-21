package academy.devdojo.maratonajava.javacore.Aula023NIO.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        // Criar diretório "pasta"
        Path pastaPath = Paths.get("pasta");
        if (Files.notExists(pastaPath)) {
            Files.createDirectory(pastaPath);
            System.out.println("Diretório criado: " + pastaPath.toAbsolutePath());
        }

        // Criar subdiretório "pasta/subpasta"
        Path subPastaPath = Paths.get("pasta/subpasta");
        if (Files.notExists(subPastaPath)) {
            Files.createDirectories(subPastaPath);
            System.out.println("Subdiretório criado: " + subPastaPath.toAbsolutePath());
        }

        // Criar arquivo "file.txt" dentro de "pasta/subpasta"
        Path filePath = subPastaPath.resolve("file.txt");
        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
            System.out.println("Arquivo criado: " + filePath.toAbsolutePath());
        }

        // Renomear "file.txt" para "file_renamed.txt"
        Path target = filePath.getParent().resolve("file_renamed.txt");
        if (Files.notExists(target)) {
            Files.copy(filePath, target);
            System.out.println("Arquivo copiado para: " + target.toAbsolutePath());
        } else {
            System.out.println("Arquivo de destino já existe: " + target.toAbsolutePath());
        }
    }
}
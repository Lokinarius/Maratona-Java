package academy.devdojo.maratonajava.javacore.Aula015Exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException{
        File file = new File("arquivo\\teste.txt");
        try{
            boolean criado = file.createNewFile();
            System.out.println("Arquivo criado"+criado);
        }catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }
}

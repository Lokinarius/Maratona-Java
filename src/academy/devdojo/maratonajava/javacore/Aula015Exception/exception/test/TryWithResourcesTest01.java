package academy.devdojo.maratonajava.javacore.Aula015Exception.exception.test;

import academy.devdojo.maratonajava.javacore.Aula015Exception.exception.domain.Leitor1;
import academy.devdojo.maratonajava.javacore.Aula015Exception.exception.domain.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {

    }

    // INSTÂNCIA
    public static void lerArquivo1(){
        Reader reader = null;
        try{
            reader = new BufferedReader(new FileReader("teste.txt"));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally{
            try{
                if(reader != null){
                    reader.close();
                }
            }catch (IOException exception){
                exception.printStackTrace();
            }
        }
    }

    // INSTÂNCIA SIMPLIFICADA
    public static void lerArquivo2(){
        try(Reader reader = new BufferedReader(new FileReader("teste.txt"))){

        }catch(IOException e){

        }
    }

    //
    public static void lerArquivo3(){
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){

        }catch (IOException e){

        }
    }
}

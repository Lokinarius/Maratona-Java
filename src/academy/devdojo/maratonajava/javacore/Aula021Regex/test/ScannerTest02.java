package academy.devdojo.maratonajava.javacore.Aula021Regex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Naruto, Sasuske, Sakura";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");
        while(scanner.hasNext()){
            if(scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println(("int "+i));
            }else if(scanner.hasNextBoolean()){
                boolean b = scanner.nextBoolean();
            }else{
                System.out.println(scanner.next());
            }
        }

    }
}

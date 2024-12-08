package academy.devdojo.maratonajava.javacore.Aula007Associacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Previsão do futuro");
        System.out.println("Digite sua pergunta e responderei Sim ou não");
        String pergunta = input.nextLine();
        System.out.println("Você perguntou: " + pergunta);
        if(pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        }else{
            System.out.println("NÃO");
        }
    }
}

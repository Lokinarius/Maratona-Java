package academy.devdojo.maratonajava.javacore.Aula015Exception.exception.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMeExceptionTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o seu nome: ");
            String nome = scanner.nextLine();
            if(nome.trim().isEmpty()){
                throw new IllegalArgumentException("O nome não pode estar vazio");
            }

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
            if (idade < 0){
                throw new IllegalArgumentException("A idade não pode ser negativa.");
            }

            scanner.nextLine();

            System.out.println("digite seu email: ");
            String email = scanner.nextLine();
            if (!email.contains("@") || !email.contains(".")){
                throw new IllegalArgumentException("Email invalido. Certifique-se de incluir '@' e '.'");
            }
            System.out.println("\nCadastro Realizado com sucesso: ");
            System.out.println("Nome: "+nome);
            System.out.println("Idade: "+idade);
            System.out.println("Email: "+email);

        }catch (InputMismatchException e){
            System.out.println("ERRO: Entrada inválida");
        }catch (IllegalArgumentException e){
            System.out.println("ERRO: "+e.getMessage());
        }catch (Exception e){
            System.out.println("ERRO: Erro inesperado");
        }finally {
            scanner.close();
        }
    }
}

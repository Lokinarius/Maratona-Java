package academy.devdojo.maratonajava.javacore.Aula015Exception.exception.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMeExceptionTest02 {
    // Classe de exceção personalizada para erro de validação de entrada(Unchecked)
    // Esta exceção é usada para erros comuns de entrada do usuário, como nome vazio ou idade negativa
    static class SafeUserInputException extends IllegalArgumentException {
        public SafeUserInputException(String message){
            super(message);
        }
    }

    // Classe de exceção personalizada para erros de formato de CEP (Checked)
    // Esta exceção é usada para garantir que o CEP fornecido esteja no formato correto.
    static class InvalidCepException extends Exception{
        public InvalidCepException(String message){
            super(message);
        }
    }

    public class AboutMe {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try{
                System.out.println("Digite seu nome: ");
                String nome = scanner.nextLine();
                if (nome.trim().isEmpty()){
                    throw new SafeUserInputException("O nome não pode estar vazio.");
                }
                scanner.nextLine();

                System.out.println("Digite sua idade: ");
                int idade = scanner.nextInt();
                if(idade < 0 ){
                    throw new SafeUserInputException("A idade não pode ser negativa.");
                }

                System.out.println("Digite seu email: ");
                String email = scanner.nextLine();
                if(!email.contains("@") || !email.contains(".")){
                    throw new SafeUserInputException("Email inválido");
                }

                System.out.println("Digite seu CEP");
                String cep = scanner.nextLine();
                validarCep(cep);

                System.out.println("\nDados cadastrados com sucesso:");
                System.out.println("Nome: "+nome);
                System.out.println("Idade: "+idade);
                System.out.println("Email: "+email);
                System.out.println("CEP: "+cep);

            }catch(InputMismatchException e){
                System.out.println("ERRO: Entrada inválida.");
            }catch (SafeUserInputException e){
                System.out.println("ERRO de validação: "+e.getMessage());
            }catch (InvalidCepException e){
                System.out.println("ERRO no CEP: "+e.getMessage());
            }catch (IllegalArgumentException e){
                System.out.println("ERRO: "+e.getMessage());
            }catch(Exception e){
                System.out.println("ERRO inesperado: "+e.getMessage());
            }finally {
                scanner.close();
            }

                }
            }

    // Metodo para validadr CEP que lança uma exceção Checked
    public static void validarCep(String cep) throws InvalidCepException {
        if (!cep.matches("\\d{5}-?\\{3}")) {
            throw new InvalidCepException("CEP inválido.");
        }
    }
}

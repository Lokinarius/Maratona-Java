
package academy.devdojo.maratonajava.javacore.Aula015Exception.runtime.test;

import java.util.Scanner;
import java.util.regex.Pattern;

// Classe usuário
class User {
    private String name;
    private String email;
    private int age;

    public User(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Usuário cadastrado:" +
                "\nNome: " + name +
                "\nEmail: " + email +
                "\nIdade: " + age;
    }
}

// Classes de exceção personalizadas
class InvalidNameException extends RuntimeException {
    public InvalidNameException(String message) {
        super(message);
    }
}

class InvalidEmailException extends RuntimeException {
    public InvalidEmailException(String message) {
        super(message);
    }
}

class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Classe de serviço para validação e registro do usuário
class UserService {
    // Método para registrar o usuário
    public static User registerUser(String name, String email, int age) {
        validateUser(name, email, age);
        return new User(name, email, age);
    }

    // Método para validar o usuário
    private static void validateUser(String name, String email, int age) {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidNameException("ERRO: O nome não pode estar vazio.");
        }
        if (!isValidEmail(email)) {
            throw new InvalidEmailException("ERRO: Email inválido.");
        }
        if (age < 0) {
            throw new InvalidAgeException("ERRO: Coloque uma idade válida.");
        }
    }

    // Método para validar o formato do email
    private static boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return Pattern.matches(emailRegex, email);
    }
}

// Classe principal para rodar o programa e permitir entrada de dados via Scanner
public class RuntimeExceptionTest05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite seu nome: ");
            String name = scanner.nextLine();

            System.out.print("Digite seu email: ");
            String email = scanner.nextLine();

            System.out.print("Digite sua idade: ");
            int age = scanner.nextInt();

            User user = UserService.registerUser(name, email, age);
            System.out.println("\n" + user);

        } catch (RuntimeException e) {
            System.err.println("Erro ao cadastrar usuário: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
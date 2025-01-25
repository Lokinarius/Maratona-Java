package academy.devdojo.maratonajava.javacore.Aula015Exception.exception.test;

import academy.devdojo.maratonajava.javacore.Aula015Exception.exception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try{
            logar();
        }catch(LoginInvalidoException e){
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "Vegeta";
        String senhaDB = "Principessj";
        System.out.println("Usuário: ");
        String usuarioDigitado = scanner.nextLine();
        System.out.println("Senha: ");
        String senhaDigitada = scanner.nextLine();
        if (!usernameDB.equals(usernameDB) || !senhaDigitada.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuário ou senha invalidos");
        }
        System.out.println("Usuário logado");
    }
}

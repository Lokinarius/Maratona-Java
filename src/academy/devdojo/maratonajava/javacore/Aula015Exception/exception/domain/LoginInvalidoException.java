package academy.devdojo.maratonajava.javacore.Aula015Exception.exception.domain;

public class LoginInvalidoException extends Exception{
    public LoginInvalidoException(){
        super("Login invalido");
    }

    public LoginInvalidoException(String message){
        super(message);
    }
}

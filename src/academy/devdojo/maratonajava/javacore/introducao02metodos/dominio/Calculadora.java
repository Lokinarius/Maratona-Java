package academy.devdojo.maratonajava.javacore.introducao02metodos.dominio;

public class Calculadora {
    //[SOMA]
    public int somar(int a, int b) {
        return a + b;
    }
    //[SUBTRAÇÃO]
    public double subtrair(double a, double b) {
        return a - b;
    }
    //[MULTIPLICAÇÃO]
    public int multiplicar(int a, int b) {
        return a * b;
    }
    //[DIVISÃO]
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Não é permitido dividir por 0");
        }
        return a / b;
    }
}

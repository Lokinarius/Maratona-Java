package academy.devdojo.maratonajava.javacore.introducao02metodos.teste;


import academy.devdojo.maratonajava.javacore.introducao02metodos.dominio.Calculadora02;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora02 cal = new Calculadora02();
        int[] numeros ={0,1,2,3,4,5,6,7,8,9};
        cal.somaArray(numeros);
        cal.somaVarArgs();
    }

}

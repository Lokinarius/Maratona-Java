package academy.devdojo.maratonajava.introducao;

public class Aula004Operadores {
    public static void main(String[] args) {
        /* OPERADORES */
        // Aritméticos: +, -, *, /, %
        // Relacionais: >, <, >=, <=, ==,!=
        // Lógicos: && (AND), || (OR),! (NOT)
        int a = 10;
        int b = 5;
        boolean c = true;
        boolean d = false;

        System.out.println(" Operadores Aritméticos");
        System.out.println("Adição: 10 + 5 = " + (a + b)); // 15
        System.out.println("Subtração: 10 - 5 = " + (a - b)); // 5
        System.out.println("Multiplicação: 10 * 5 = " + (a * b)); // 50
        System.out.println("Divisão: 10 / 5 = " + (a / b)); // 2
        System.out.println("Resto da divisão: 10 % 5 = " + (a % b)); // 0
        System.out.println("\n");

        System.out.println("Operadores Relacionais");
        System.out.println("Maior que: 10 > 5 = " + (a > b)); // true
        System.out.println("Menor que: 10 < 5 = " + (a < b)); // false
        System.out.println("Maior ou igual: 10 >= 5 = " + (a >= b)); // true
        System.out.println("Menor ou igual: 10 <= 5 = " + (a <= b)); // false
        System.out.println("Igual: 10 == 5 = " + (a == b)); // false
        System.out.println("Diferente: 10 != 5 = " + (a!= b)); // true
        System.out.println("\n");

        System.out.println("Operadores Lógicos");
        // AND
        System.out.println("AND / E");
        System.out.println("verdadeiro e verdadeiro = " + (c && c)); // true, porque true AND true is true
        System.out.println("verdadeiro e falso = " + (c && d)); // true, porque true AND true is true
        //OR
        System.out.println("OR / OU");
        System.out.println("verdadeiro ou verdadeiro = " + (c || c)); // true, porque true OR true is true
        System.out.println("verdadeiro ou falso = " + (c || d)); // true, porque true OR true is true
        // NOT
        System.out.println("NOT / NEGADO");
        System.out.println("NOT true = " + (!c)); // false, porque NOT true is false
        System.out.println("NOT false = " + (!d)); // true, porque NOT false is true

    }
}

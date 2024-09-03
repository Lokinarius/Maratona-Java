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
        System.out.println("10 + 5 = " + (a + b)); // 15
        System.out.println("10 - 5 = " + (a - b)); // 5
        System.out.println("10 * 5 = " + (a * b)); // 50
        System.out.println("10 / 5 = " + (a / b)); // 2
        System.out.println("10 % 5 = " + (a % b)); // 0
        System.out.println("\n");

        System.out.println("Operadores Relacionais");
        System.out.println("10 > 5 = " + (a > b)); // true
        System.out.println("10 < 5 = " + (a < b)); // false
        System.out.println("10 >= 5 = " + (a >= b)); // true
        System.out.println("10 <= 5 = " + (a <= b)); // false
        System.out.println("10 == 5 = " + (a == b)); // false
        System.out.println("10 != 5 = " + (a!= b)); // true
        System.out.println("\n");

        System.out.println("Operadores Lógicos");
        // AND
        System.out.println("true e true = " + (c && c)); // true, porque true AND true is true
        System.out.println("true e false = " + (c && d)); // true, porque true AND true is true
        //OR
        System.out.println("true ou true = " + (c || c)); // true, porque true OR true is true
        System.out.println("true ou false = " + (c || d)); // true, porque true OR true is true
        // NOT
        System.out.println("NOT true = " + (!c)); // false, porque NOT true is false
        System.out.println("NOT false = " + (!d)); // true, porque NOT false is true

    }
}

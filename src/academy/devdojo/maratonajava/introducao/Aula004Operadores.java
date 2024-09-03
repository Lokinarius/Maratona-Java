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

        System.out.println(a + b); // 15
        System.out.println(a - b); // 5
        System.out.println(a * b); // 50
        System.out.println(a / b); // 2
        System.out.println(a % b); // 0

        System.out.println(a > b); // true
        System.out.println(a < b); // false
        System.out.println(a >= b); // true
        System.out.println(a <= b); // false
        System.out.println(a == b); // false
        System.out.println(a != b); // true

        // Lógicos
        System.out.println(c && d); // false, porque true AND false is false
        System.out.println(c || d); // true, porque true OR false is true
        System.out.println(!c);     // false, porque NOT true is false
        System.out.println(!d);     // true, porque NOT false is true
    }
}

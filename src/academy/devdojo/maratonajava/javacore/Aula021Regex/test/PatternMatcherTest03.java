package academy.devdojo.maratonajava.javacore.Aula021Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = tudo o que não for digito
        // \s = espaços em branco \t \n \f \r
        // \S = Todos os caracters excluindo os brancos
        // \w = a-Z A-Z, digitos, _
        // \W = Tudo que não for incluso na \w
        // []
        String regex = "0[xX][0-9]";
        // String texto = 'abaaba
        String texto = "ababa";
        String texto2 = "12 0x 0x 0xFFABC 0x109 0x10";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: "+texto2);
        System.out.println("Indice: 01234567890");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");
        while(matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group()+"\n");
        }
        int numeroHex = 0x59F86A;
        System.out.println(numeroHex);
    }
}

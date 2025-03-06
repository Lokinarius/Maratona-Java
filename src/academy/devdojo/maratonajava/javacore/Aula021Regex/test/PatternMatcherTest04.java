package academy.devdojo.maratonajava.javacore.Aula021Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = tudo o que não for digito
        // \s = espaços em branco \t \n \f \r
        // \S = Todos os caracters excluindo os brancos
        // \w = a-Z A-Z, digitos, _
        // \W = Tudo que não for incluso na \w
        // []
        // ? Zero ou uma
        // * zero ou mais
        // + uma ou mais
        //{,} de " " até " "
        // |
        // $
        String regex = "0[xX]([0-9a-fA-F])+\\s";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: "+texto);
        System.out.println("Indice: 01234567890");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");
        while(matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}

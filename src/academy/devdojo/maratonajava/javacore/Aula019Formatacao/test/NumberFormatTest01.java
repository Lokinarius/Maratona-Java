package academy.devdojo.maratonajava.javacore.Aula019Formatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localePT = new Locale("pt","BR");
        Locale LocaleJP = Locale.JAPAN;
        Locale LocaleIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance();
        nfa[2] = NumberFormat.getInstance();
        nfa[3] = NumberFormat.getInstance();

        double valor = 10_000.2130;
        for(NumberFormat numberFormat : nfa){
            System.out.println(numberFormat.format(valor));
        }
    }
}

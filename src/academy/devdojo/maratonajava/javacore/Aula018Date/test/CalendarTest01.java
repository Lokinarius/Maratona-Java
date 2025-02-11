package academy.devdojo.maratonajava.javacore.Aula018Date.test;

import java.util.Calendar;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        if(calendario.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println(calendario.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendario.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendario.get(Calendar.DAY_OF_WEEK_IN_MONTH));
    }
}

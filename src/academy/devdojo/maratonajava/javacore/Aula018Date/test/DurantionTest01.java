package academy.devdojo.maratonajava.javacore.Aula018Date.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurantionTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now();
        LocalTime timeNow = LocalTime.now();
        LocalTime timeNinus7Hours = LocalTime.now().minusHours(7);
        Duration d1 = Duration.between(now,nowAfterTwoYears);
        System.out.println(d1);
    }
}

package academy.devdojo.maratonajava.javacore.Aula018Date.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());
        System.out.println(now.getNano());
        System.out.println(Instant.ofEpochSecond(3));
    }
}

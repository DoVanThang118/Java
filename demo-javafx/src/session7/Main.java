package session7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);
        LocalDate d1 = d.plusDays(5);
        System.out.println(d1);
        LocalDate d2 = d.plusYears(5);
        System.out.println(d2);

        LocalDate d3 = d.minusDays(5);
        System.out.println(d3);
        LocalDate d4 = d.minusYears(5);
        System.out.println(d4);

        LocalDate date = LocalDate.of(2022,10,15);
        LocalDate date1 = date.plusYears(1);

        LocalDate y = LocalDate.parse("2022-10-09");
        System.out.println(y);

        long b = ChronoUnit.DAYS.between(date,date1);
        System.out.println(b);

        LocalDateTime l = LocalDateTime.now();

        LocalDateTime l1 = l.plusHours(1);
        LocalDateTime l2 = LocalDateTime.of(2022,10,6,18,30,8);
        LocalDateTime l3 = LocalDateTime.parse("2022-10-06T18:30:20");
        System.out.println(l);
        System.out.println(l3);
    }
}

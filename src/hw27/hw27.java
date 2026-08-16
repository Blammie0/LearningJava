package hw27;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class hw27 {

    private static final DateTimeFormatter f1 =
            DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! HH:mm");

    private static final DateTimeFormatter f2 =
            DateTimeFormatter.ofPattern("HH:mm, dd/MMM/yy");

    public void smena(LocalDateTime dt1, LocalDateTime dt2, Period prd, Duration dur) {
        LocalDateTime cur = dt1;

        while (cur.isBefore(dt2)) {
            System.out.println("работаем с: " + cur.format(f1));
            cur = cur.plus(prd);
            System.out.println("до: " + cur.format(f1));
            System.out.println("отдыхаем с: " + cur.format(f2));
            cur = cur.plus(dur);
            System.out.println("до: " + cur.format(f2));
        }
    }

    public static void main(String[] arr) {
        hw27 bob = new hw27();

        LocalDateTime t1 = LocalDateTime.of(2016, 1, 1, 9, 0);
        LocalDateTime t2 = LocalDateTime.of(2016, 1, 15, 18, 0);

        Period p = Period.ofDays(1);
        Duration d = Duration.ofHours(12);

        bob.smena(t1, t2, p, d);
    }
}
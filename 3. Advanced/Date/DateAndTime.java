package Date;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {
        //Local Date
        LocalDate date = LocalDate.now();
        System.out.println(date);

        //Local Time
        LocalTime time = LocalTime.now();
        System.out.println(time);

        //Local Date Time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Before formatting: " + dateTime);
        System.out.println("After formatting: " + dateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));

        //Period
        LocalDate now = LocalDate.now();
        LocalDate then = LocalDate.of(2005,2,21);
        Period period = Period.between(now, then);
        System.out.println(period);

    }
}

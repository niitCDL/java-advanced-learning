package top.advanced.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        LocalDate date = LocalDate.of(2023, 3,20);
        LocalTime time = LocalTime.of(14, 15, 10);
        LocalDateTime dateTime1 = LocalDateTime.of(date, time);
        LocalDateTime dateTime2 = LocalDateTime.of(2023, 3, 21, 14, 14);
        System.out.println("\n" + date);
        System.out.println(time);
        System.out.println(dateTime1);
        System.out.println(dateTime2);
    }
}

class TestDateTimeFormatter{
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = localDateTime.format(formatter);
        System.out.println(format);
        LocalDateTime dateTime = LocalDateTime.parse("2023-12-13 14:05:52",formatter);
        System.out.println(dateTime);
    }
}

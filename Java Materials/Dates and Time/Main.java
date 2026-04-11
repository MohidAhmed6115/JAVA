
import java.time.LocalTime;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        // LocalDate date = LocalDate.now();
        // LocalTime time = LocalTime.now();
        // LocalDateTime datetime = LocalDateTime.now();
        // Instant instant = Instant.now();

        // System.out.println("Date     : " + date);
        // System.out.println("Time     : " + time);
        // System.out.println("Date/Time: " + datetime);
        // System.out.println("UTC Time : " + instant);
        // DateTimeFormatter formatter =   DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        // String newDateTime = datetime.format(formatter);
        // System.out.println("Date/Time: " + newDateTime);
        // LocalDateTime datetime = LocalDateTime.of(2025, 12, 25, 12, 00);
        // System.out.println("Date/Time: " + datetime);
        // Date methods
        LocalDate date1 = LocalDate.of(2025, 12, 25);
        LocalDate date2 = LocalDate.of(2026, 12, 25);

        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is earlier than " + date2);
        } 
        else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is later than " + date2);
        }
        else if (date1.isEqual(date2)) {
            System.out.println(date1 + " is same as " + date2);
        }
    }
}

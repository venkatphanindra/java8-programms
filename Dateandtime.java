import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Dateandtime {
    public static void main(String[] args) {
        // LocalDate example
        LocalDate date = LocalDate.now(); // Current date
        System.out.println("Today's date: " + date);

        // LocalTime example
        LocalTime time = LocalTime.now(); // Current time
        System.out.println("Current time: " + time);

        // LocalDateTime example
        LocalDateTime dateTime = LocalDateTime.now(); // Current date and time
        System.out.println("Current date and time: " + dateTime);
    }
}
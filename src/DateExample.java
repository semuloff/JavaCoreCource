import java.time.Month;
import java.util.Date;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class DateExample {
    public static void main(String[] args) {
        /** This class is deprecated and not supported. **/
        Date dateOne = new Date();
        Date dateTwo = new Date();

        System.out.println("Number of milliseconds from 1970 to today: " + dateOne.getTime());
        System.out.println("Number of days from 1970 to today: " + dateOne.getTime() / (1000 * 60 * 60 * 24));

        // Set the time parameters.
        dateOne.setYear(2003);
        dateOne.setMonth(6);
        dateOne.setDate(3);
        dateOne.setHours(17);
        dateOne.setMinutes(30);
        dateOne.setSeconds(11);

        System.out.println("After: " + dateOne.after(dateTwo));
        System.out.println("Before: " + dateOne.before(dateTwo));

        System.out.println("Year: " + dateOne.getYear());
        System.out.println("Month: " + dateOne.getMonth());
        System.out.println("Day: " + dateOne.getDate());
        System.out.println("Hour: " + dateOne.getHours());
        System.out.println("Minutes: " + dateOne.getMinutes());
        System.out.println("Seconds: " + dateOne.getSeconds());
        System.out.println("Full date: " + dateOne + "\n");

        /** We can use these classes or other. **/
        LocalDate localDateSet = LocalDate.of(2003, Month.JULY, 3);
        LocalDate localDateNow = LocalDate.now();

        System.out.println("Current era: " + localDateNow.getEra());
        System.out.println("Day of month: " + localDateNow.getDayOfMonth());
        System.out.println("Lenghts of month: " + localDateNow.lengthOfMonth());
        System.out.println("Is equal: " + localDateNow.isEqual(localDateSet));
        System.out.println("Set date: " + localDateSet + "\n");

        LocalDateTime localDateTimeNow = LocalDateTime.now();
        LocalDateTime localDateTimeSet = LocalDateTime.of(2003, Month.JULY, 3, 17, 30, 34);

        System.out.println("Date now: " + localDateTimeNow.toLocalDate());
        System.out.println("Time now: " + localDateTimeNow.toLocalTime());
        System.out.println("Data & time now: " + localDateTimeNow + "\n");

        LocalTime localTimeNow = LocalTime.now();
        LocalTime localTimeSet = LocalTime.of(12, 34, 45);

        System.out.println("Current time: " + localTimeNow);
        System.out.println("Current hour: " + localTimeNow.getHour());
    }
}

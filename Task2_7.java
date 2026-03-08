import java.util.*;
import java.time.*;

public class Task2_7 {

    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        String dayOfWeek = findDay(month, day, year);
        System.out.println(dayOfWeek);
        sc.close();
    }
}
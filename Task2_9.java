import java.util.*;
import java.time.*;
import java.time.format.*;
import java.util.stream.*;

class Event {
    String name;
    LocalDate date;

    Event(String name, String dateStr) {
        this.name = name;
        this.date = LocalDate.parse(dateStr, DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }
}

public class Task2_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        List<Event> events = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(" ");
            String name = parts[0];
            String dateStr = parts[1];
            events.add(new Event(name, dateStr));
        }

        int monthFilter = sc.nextInt();

        List<Event> sortedEvents = events.stream()
                .sorted(Comparator.comparing(Event::getDate))
                .collect(Collectors.toList());

        String sortedNames = sortedEvents.stream()
                .map(Event::getName)
                .collect(Collectors.joining(" "));
        System.out.println(sortedNames);

        Event earliest = sortedEvents.get(0);
        System.out.println(earliest.getName());

        Event latest = sortedEvents.get(sortedEvents.size() - 1);
        System.out.println(latest.getName());

        String monthEvents = sortedEvents.stream()
                .filter(e -> e.getDate().getMonthValue() == monthFilter)
                .map(Event::getName)
                .collect(Collectors.joining(" "));
        System.out.println(monthEvents);
        sc.close();
    }
}
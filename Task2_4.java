import java.util.*;
import java.util.stream.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static boolean isOlderThan(Person p, int ageLimit) {
        return p.age > ageLimit;
    }

    public String toUpperCaseName() {
        return this.name.toUpperCase();
    }

    public String getName() {
        return this.name;
    }
}

public class Task2_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            persons.add(new Person(name, age));
        }

        int ageLimit = sc.nextInt();

        String sortedNames = persons.stream()
                .sorted(Comparator.comparing(Person::getName))
                .map(Person::getName)
                .collect(Collectors.joining(" "));
        System.out.println(sortedNames);

        String filteredNames = persons.stream()
                .filter(p -> Person.isOlderThan(p, ageLimit))
                .map(Person::getName)
                .collect(Collectors.joining(" "));
        System.out.println(filteredNames);

        String upperCaseNames = persons.stream()
                .map(Person::toUpperCaseName)
                .collect(Collectors.joining(" "));
        System.out.println(upperCaseNames);
        sc.close();
    }
}
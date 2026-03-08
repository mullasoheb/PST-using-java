import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;

class Students
{
    String name;
    int marks;

    Students(String name, int marks)
    {
        this.name = name;
        this.marks = marks;
    }
    public String getName()
    {
        return name;
    }
    public int getMarks()
    {
        return marks;
    }
}
public class Task3_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        List<Students> students = new ArrayList<>();
        System.out.println("Enter no of students : ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++)
        {
            String name = sc.next();
            int marks = sc.nextInt();
            students.add(new Students(name,marks));
        }
        System .out.println("Enter limit of students to show : ");
        int k = sc.nextInt();

        List<String> result =
            students.stream()
            .sorted(
                Comparator
                .comparingInt(Students::getMarks).reversed()
                .thenComparing(Students::getName)
            )
            .limit(k)
            .map(Students::getName)
            .collect(Collectors.toList());

            result.forEach(name -> System.out.print(name + "   "));

        sc.close();
    }
}
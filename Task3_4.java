import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class Task3_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());  // IMPORTANT

        List<Student> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(" ");
            int id = Integer.parseInt(parts[0]);
            String name = parts[1];
            double cgpa = Double.parseDouble(parts[2]);

            list.add(new Student(id, name, cgpa));
        }

        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {

                if (Double.compare(s2.getCgpa(), s1.getCgpa()) != 0) {
                    return Double.compare(s2.getCgpa(), s1.getCgpa());
                }

                if (!s1.getFname().equals(s2.getFname())) {
                    return s1.getFname().compareTo(s2.getFname());
                }

                return s1.getId() - s2.getId();
            }
        });

        for (Student s : list) {
            System.out.println(s.getFname());
        }

        sc.close();
    }
}
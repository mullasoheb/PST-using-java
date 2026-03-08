interface checkFibonacci
{
    long find(int num);
}

public class Task1_8
{
    public static void main(String args[])
    {
        int n = 9;

        checkFibonacci obj = (num) -> {
            long a = 0, b = 1, c = 0;

            if (num == 1)
                return 0;

            if (num == 2)
                return 1;

            for (int i = 3; i <= num; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        };

        System.out.println(obj.find(n));
    }
}
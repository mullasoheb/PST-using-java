import java.util.Scanner;

public class Task2_6
{
    public static int numberCount(int input1)
    {
        int count = 0;
        while(input1 > 0)
        {
            count++;
            input1 /= 10;
        }
        return count;
    }
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number :");
    int num = sc.nextInt();
    System.out.println("Count is : " + numberCount(num));
    sc.close();
    }
}
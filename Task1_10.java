import java.util.*;
public class Task1_10
{
    public static int lastDigitSum(int input1, int input2)
    {
        if(input1 < 0)
        {
            input1 = -input1;
        }
        if(input2 < 0)
        {
            input2 = -input2;
        }
        int digit1 = input1 % 10;
        int digit2 = input2 % 10;
        return digit1 + digit2;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();
        int result = lastDigitSum(num1,num2);
        System.out.println(result);
    }
}
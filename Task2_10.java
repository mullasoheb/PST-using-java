import java.util.Scanner;

public class Task2_10 
{
    public static int cyclicSum(int input1)
    {
        String num = String.valueOf(input1);
        int totalSum = 0;
        for(int i = 0; i < num.length(); i++)
        {
            int sum = 0;
            for(int j = i; j < num.length(); j++)
            {
                sum = sum + num.charAt(j) - '0';
            }
            totalSum = totalSum + sum;
        }
        return totalSum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        System.out.println("cyclic sum is : " + cyclicSum(number));
        sc.close();
    }
}
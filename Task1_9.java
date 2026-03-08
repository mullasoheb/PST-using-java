import java.util.Scanner;
public class Task1_9
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        int orginal = number;
        int reverse = 0;
        
        while(number > 0)
        {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
            
        }
        if(orginal == reverse)
        {
            System.out.println("Its palindrome number");
        }
        else
        {
            System.out.println("Its not palindrome");
        }
    }
}
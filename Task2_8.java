import java.util.Scanner;

public class Task2_8
{
    public static int hillClimbWeight(int input1, int input2, int input3)
    {
        int totalWeight = 0;
        int currentWeight = input2;
        for(int level = 1; level <= input1; level++)
        {
            totalWeight = totalWeight + (currentWeight * level);
            currentWeight = currentWeight + input3;
        }
        return totalWeight;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number :");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd number : ");
        int num3 = sc.nextInt();
        System.out.println("Total weight of hill is : " + hillClimbWeight(num1, num2, num3));
        sc.close();
    }    
}
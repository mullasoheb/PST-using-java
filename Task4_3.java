import java.util.*;
public class Task4_3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        int alice = 0;
        int bob = 0;

        for(int i = 0; i < arr1.length; i++)
        {
            arr1[i] = sc.nextInt();
        }
        for(int j = 0; j < arr2.length; j++)
        {
            arr2[j] = sc.nextInt();
        }
        for(int i = 0; i < 3; i++)
        {
            if(arr1[i] > arr2[i])
            {
                alice++;
            }
            else if(arr1[i] < arr2[i])
            {
                bob++;
            }
        }
        System.out.println(alice + " " + bob);
        sc.close();
    }
}
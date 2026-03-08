import java.util.Scanner;

public class Task4_1
{
    public static boolean isStringAlike(String s)
    {
        String vowels = "aeiouAEIOU";
        int mid = s.length() /2;
        int countA = 0;
        int countB = 0;

        for(int i = 0; i < mid; i++)
        {
            if(vowels.indexOf(s.charAt(i)) != -1)
            {
                countA++;
            }
        }
        for(int j = mid; j < s.length(); j++)
        {
            if(vowels.indexOf(s.charAt(j)) != -1)
            {
                countB++;
            }
        }
        return countA == countB;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String xyz = sc.nextLine();
        System.out.println(isStringAlike(xyz));
        sc.close();
    }
}
import java.util.*;
public class Task4_4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[n];
        boolean f = false;
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
            if(map.containsKey(arr[i]))
            {
                f=true;
            }
            else
            {
                map.put(arr[i],0);
            }
        }
        System.out.println(f);
        sc.close();
    }
}
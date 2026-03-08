import java.util.*;
public class Task5_1
{
    public static int maxSubArray(int[] nums)
    {
        int result = nums[0];
        int total_sum = nums[0];

        for(int n = 1; n < nums.length; n++)
        {
            if(total_sum < 0)
            {
                total_sum = 0;
            }
            total_sum += nums[n];
            result = Math.max(result, total_sum);
        }
        return result;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int arr[] = new int[c];
        for(int i = 0; i < c; i++)
        {
            arr[i] = sc.nextInt();
        } 
        System.out.println(maxSubArray(arr));
        sc.close();
    }
}
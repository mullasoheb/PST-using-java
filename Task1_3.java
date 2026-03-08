public class Task1_3
{
    public static void main(String args[])
    {
        int[] nums = {1,3,5,7,9,11,13,15,17};
        int target = 111;

        int result = BSearch(nums, target);
        if(result != -1)
        {
            System.out.println("Element found at index : " + result);
        }
        else
        {
            System.out.println("ELement not found");
        }
    }

public static int BSearch(int nums[], int target)
{
    int left = 0;
    int right = nums.length-1;
    while(left <= right)
    {
        int mid = (left + right) /2;
        if(nums[mid] == target)
        {
            return mid;
        } 
        else if (target < nums[mid]) 
        {
            right = mid -1;
        }
        else
        {
            left = mid + 1;
        }
    }
    return -1;
}
}
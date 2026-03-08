
import java.util.*;
class Task4_6 {
    public static void moveZeroes(int[] nums) {
        int low =0;
        for(int i =0; i<nums.length; i++){
            if(nums[i] != 0){
                swap(nums, low, i);
                low++;
            }
        }
    }

    private static void swap(int[] n, int i, int j){
        int temp = n[i];
        n[i] = n[j];
        n[j] = temp;
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] nums = new int[n];
    	
    	for(int i =0; i<n; i++) {
    		nums[i] = sc.nextInt();
    	}
    	
    	moveZeroes(nums);
    	
    	for(int i = 0; i<n; i++) {
    		System.out.println(nums[i] + " ");
    	}
    }
}

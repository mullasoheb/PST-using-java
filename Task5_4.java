
import java.util.*;

public class Task5_4 {

    public static int maxSubarraySumCircular(int[] A) {
        int total = 0;
        int maxSum = A[0];
        int curMax = 0;
        int minSum = A[0];
        int curMin = 0;

        for (int a : A) {
            curMax = Math.max(curMax + a, a);
            maxSum = Math.max(maxSum, curMax);

            curMin = Math.min(curMin + a, a);
            minSum = Math.min(minSum, curMin);

            total += a;
        }

        if (maxSum > 0) {
            return Math.max(maxSum, total - minSum);
        } else {
            return maxSum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = maxSubarraySumCircular(arr);
        System.out.println(result);

        sc.close();
    }
}

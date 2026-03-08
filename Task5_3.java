import java.util.*;

public class Task5_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int maxSubArray = kadane(arr);
            int maxSubSequence = maxSubsequence(arr);

            System.out.println(maxSubArray + " " + maxSubSequence);
        }
        sc.close();
    }

    static int kadane(int[] arr) {
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    static int maxSubsequence(int[] arr) {
        int sum = 0;
        int max = arr[0];

        for (int x : arr) {
            if (x > 0) sum += x;
            max = Math.max(max, x);
        }

        return (sum > 0) ? sum : max;
    }
}
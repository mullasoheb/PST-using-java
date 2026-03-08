import java.util.*;

public class Task2_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter five positive integers separated by space:");
        long[] numbers = new long[5];

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextLong();
        }

        findMinMaxSum(numbers);
        sc.close();
    }

    static void findMinMaxSum(long[] arr) {
        long totalSum = 0;
        long min = arr[0];
        long max = arr[0];

        for (long num : arr) {
            totalSum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }

        long minSum = totalSum - max;
        long maxSum = totalSum - min;

        System.out.println(minSum + " " + maxSum);
    }
}
import java.util.*;

public class Task5_2 {

    public static int birthday(int[] arr, int d, int m) {
        int count = 0;

        for (int i = 0; i <= arr.length - m; i++) {
            int sum = 0;
            for (int j = i; j < i + m; j++) {
                sum += arr[j];
            }
            if (sum == d) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int d = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(birthday(arr, d, m));
        sc.close();
    }
}
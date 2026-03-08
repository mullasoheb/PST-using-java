import java.util.Arrays;

public class Task1_5 {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        Arrays.sort(arr);

        if (k > 0 && k <= arr.length) {
            System.out.println("Kth smallest element: " + arr[k - 1]);
        } else {
            System.out.println("Invalid value of K");
        }
    }
}
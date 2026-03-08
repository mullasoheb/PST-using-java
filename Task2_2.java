import java.util.Scanner;

interface PerformOperation {
    boolean check(int n);
}

public class Task2_2 {

    static PerformOperation isOdd() {
        return n -> n % 2 != 0;
    }

    static PerformOperation isPrime() {
        return n -> {
            if (n <= 1) return false;
            for (int i = 2; i < n; i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        };
    }

    static PerformOperation isPalindrome() {
        return n -> {
            int rev = 0, temp = n;
            while (temp > 0) {
                rev = rev * 10 + temp % 10;
                temp /= 10;
            }
            return rev == n;
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); 

        for (int i = 0; i < T; i++) {
            int choice = sc.nextInt();
            int num = sc.nextInt();

            if (choice == 1) {
                System.out.println(isOdd().check(num) ? "ODD" : "EVEN");
            } 
            else if (choice == 2) {
                System.out.println(isPrime().check(num) ? "PRIME" : "COMPOSITE");
            } 
            else if (choice == 3) {
                System.out.println(isPalindrome().check(num) ? "PALINDROME" : "NOT PALINDROME");
            }
        }
        sc.close();
    }
}
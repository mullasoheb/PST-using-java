import java.util.*;

public class Main {

    public static int digitSum(int number, String option) {
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;   // get last digit

            if (option.equalsIgnoreCase("even")) {
                if (digit % 2 == 0) {
                    sum += digit;
                }
            } else { // option == "odd"
                if (digit % 2 != 0) {
                    sum += digit;
                }
            }

            number = number / 10; // remove last digit
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input may come like: 108,even
        String input = sc.nextLine();
        String[] parts = input.split(",");

        int number = Integer.parseInt(parts[0].trim());
        String option = parts[1].trim();

        int result = digitSum(number, option);
        System.out.println(result);

        sc.close();
    }
}
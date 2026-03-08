interface checkDigit
{
    boolean check(int digit);
}

public class Task1_7
{
    public static void main(String args[])
    {
        int number = 12345;
        int oddSum = 0;
        int evenSum = 0;

        checkDigit obj = (digit) -> (digit % 2 == 0);

        while (number > 0)
        {
            int digit = number % 10;

            if (obj.check(digit))
                evenSum = evenSum + digit;
            else
                oddSum = oddSum + digit;

            number = number / 10;
        }

        System.out.println("Even Sum = " + evenSum);
        System.out.println("Odd Sum = " + oddSum);
    }
}
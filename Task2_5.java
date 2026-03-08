public class Task2_5 {

    public static int isPalindrome(String input) {

        input = input.toLowerCase();

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return 1;  
            }
            left++;
            right--;
        }

        return 2;  
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));    
        System.out.println(isPalindrome("MAdam"));     
        System.out.println(isPalindrome("hello"));   
    }
}
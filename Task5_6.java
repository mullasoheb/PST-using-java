
import java.util.*;
public class Task5_6
 {
    public static int lengthOfLongestSubString(String s) 
        {
            HashSet<Character> set = new HashSet<>();
            int maxLen = 0;
            for(int left = 0, right = 0; right < s.length();right++)
            {
                while(set.contains(s.charAt(right)))
                {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(right));
                maxLen = Math.max(maxLen , right - left +1);
            }
            return maxLen;
        }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lengthOfLongestSubString(s));
        sc.close();
    }
}

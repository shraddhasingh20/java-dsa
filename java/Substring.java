import java.util.*;

public class Substring {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            while (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start++));
            }
            set.add(s.charAt(end));
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Substring obj = new Substring();

        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println(obj.lengthOfLongestSubstring(s1));
        System.out.println(obj.lengthOfLongestSubstring(s2)); 
        System.out.println(obj.lengthOfLongestSubstring(s3)); 
    }
}
package ooo3LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {

    }

    private static int getLength(String str) {
        char[] chars = str.toCharArray();
        int result = 0;
        Set<Character> set = new HashSet<>();
        int i = 0, j = 0;
        while (i < chars.length && j < chars.length) {
            if (!set.contains(chars[j])) {
                set.add(chars[j]);
                result = Math.max(result, j - i);
                j++;
            }else {
                set.remove(chars[i]);
                i++;
            }
        }
        return result;
    }
}

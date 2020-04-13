package easy;

/**
 * @author sucre
 * @date 2019-07-18
 * @time 19:28
 * @description https://leetcode-cn.com/problems/implement-strstr/
 */
public class ImplementStr {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack, needle));

    }

    public static int strStr(String haystack, String needle) {
        if (needle == null) {
            return 0;
        }

        String s1 = haystack;
        String s2 = needle;

        int i = 0, j = 0;
        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == s2.length()) {
            return i - j;
        } else {
            return -1;
        }
    }
}


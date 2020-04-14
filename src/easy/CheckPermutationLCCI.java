package easy;

/**
 * @author sucre
 * @date 2020-04-14
 * @time 10:26
 * @description https://leetcode-cn.com/problems/check-permutation-lcci/
 */
public class CheckPermutationLCCI {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        int[] s1_count = new int[26];
        int[] s2_count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            s1_count[ch1 - 'a'] += 1;
            s2_count[ch2 - 'a'] += 1;
        }
        for (int i = 0; i < 26; i++) {
            if (s1_count[i] != s2_count[i])
                return false;
        }
        return true;
    }
}

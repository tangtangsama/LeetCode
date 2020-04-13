package medium;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 18:37
 * @description https://leetcode-cn.com/problems/construct-k-palindrome-strings/
 */

public class ConstructKPalindromeStrings {
    public boolean canConstruct(String s, int k) {
        if(s.length() < k) return false;

        int[] count = new int[26];
        for(char ch : s.toCharArray()){
            count[ch - 'a'] += 1;
        }
        int countOdd = 0;
        for(int i : count){
            if(i%2!=0)
                countOdd++;
        }
        return (countOdd <= k);
    }
}

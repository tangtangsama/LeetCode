package easy;

/**
 * @author sucre
 * @date 2020-04-14
 * @time 10:30
 * @description https://leetcode-cn.com/problems/longest-palindrome/
 */
public class LongestPalindrome {
    /**
     1. 统计字符串中每个字母出现的位置，由于包括大小写字母，定义长度为58的数组储存，其中有一部分数据为空。
     2. 遍历计数数组count，对于偶数直接累加到结果中，对于奇数将不超过其的最大偶数累加到结果中。
     3. 使用oddFlag记录是否有奇数个数，如果有，结果加一，表示回文串中最多可以存在一个奇数个数的字母，其余奇数个数的字母取最大偶数个。
     **/
    public int longestPalindrome(String s) {
        int[] count = new int[58];
        for(char ch : s.toCharArray()){
            count[ch - 'A'] += 1;
        }
        int maxLength = 0;
        int oddFlag = 0;
        for(int i : count){
            if(i%2==0)
                maxLength += i;
            else{
                maxLength += (i-1);
                oddFlag = 1;
            }
        }
        if(oddFlag == 1)
            return maxLength+1;
        else
            return maxLength;
    }
}

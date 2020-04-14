package easy;

/**
 * @author sucre
 * @date 2020-04-14
 * @time 10:29
 * @description https://leetcode-cn.com/problems/find-numbers-with-even-number-of-digits/
 */
public class FindNumbersWithEvenNumberOfDigits {
    /**
     技巧：使用字符串转换来统计数字的位数！！！
     **/
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(String.valueOf(num).length()%2 == 0)
                count += 1;
        }
        return count;
    }
}

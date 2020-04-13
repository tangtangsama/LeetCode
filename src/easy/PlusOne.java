package easy;

/**
 * @author sucre
 * @date 2019-07-22
 * @time 17:02
 * @description https://leetcode-cn.com/problems/plus-one/
 */
public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        plusOne(digits);
    }

    public static int[]plusOne(int[] digits) {
        for(int i =digits.length-1;i>=0;i--)
        {
            digits[i]++;
            digits[i] = digits[i]%10;
            if(digits[i]!=0) {
                return digits;
            }
        }
        digits = new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
}

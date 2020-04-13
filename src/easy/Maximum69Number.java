package easy;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 11:39
 * @description https://leetcode-cn.com/problems/maximum-69-number/
 */
public class Maximum69Number {
    public int maximum69Number (int num) {
        String s =  String.valueOf(num);
        s = s.replaceFirst("6", "9");
        return Integer.valueOf(s);
    }
}

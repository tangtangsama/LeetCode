package easyGo;

/**
 * @author sucre
 * @date 2019-07-19
 * @time 10:49
 * @description https://leetcode-cn.com/problems/roman-to-integer/
 */
public class RomanToInteger {
    public static void main(String[] args) {
        String s = "IV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int sum = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'M') {
                sum += 1000;
            }
            if (chars[i] == 'D') {
                sum += 500;
            }
            if (chars[i] == 'C') {
                if ((i+1) < chars.length&&chars[i + 1] == 'D') {
                    sum += 400;
                    i += 1;
                }
                else if ((i+1) < chars.length&&chars[i + 1] == 'M') {
                    sum += 900;
                    i += 1;
                }else {
                    sum+=100;
                }
            }
            if (chars[i] == 'L') {
                sum += 50;
            }
            if (chars[i] == 'X') {
                if ((i+1) < chars.length&&chars[i + 1] == 'L') {
                    sum += 40;
                    i += 1;
                }
                else if ((i+1) < chars.length&&chars[i + 1] == 'C') {
                    sum += 90;
                    i += 1;
                }else {
                    sum+=10;
                }
            }
            if (chars[i] == 'V') {
                sum += 5;
            }
            if (chars[i] == 'I') {
                if ((i+1) < chars.length&&chars[i + 1] == 'V') {
                    sum += 4;
                    i += 1;
                }
                else if ((i+1) < chars.length&&chars[i + 1] == 'X') {
                    sum += 9;
                    i += 1;
                }else {
                    sum+=1;
                }
            }
        }
        return sum;
    }
}

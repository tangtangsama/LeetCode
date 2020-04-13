package medium;

/**
 * @author sucre
 * @date 2019-07-18
 * @time 19:18
 * @description https://leetcode-cn.com/problems/powx-n/submissions/
 */
public class Pow {
    public double myPow(double x, int n) {
        if (n < 0) {
            return calculate(1 / x, -n);
        }
        return calculate(x, n);
    }

    private double calculate(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        double d = calculate(x, n >>> 1);
        if (n % 2 == 0) {
            return d * d;
        }
        return d * d * x;
    }

}

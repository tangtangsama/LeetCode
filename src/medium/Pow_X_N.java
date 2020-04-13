package medium;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 18:57
 * @description https://leetcode-cn.com/problems/powx-n/
 */
public class Pow_X_N {
    public double myPow(double x, int n) {
        if (n < 0) return calculate(1 / x, -n);
        return calculate(x, n);
    }

    private double calculate(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        double d = calculate(x, n >>> 1);
        if (n % 2 == 0) return d * d;
        return d * d * x;
    }
}

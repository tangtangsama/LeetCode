package medium;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 18:26
 * @description https://leetcode-cn.com/problems/angle-between-hands-of-a-clock/
 */
public class AngleBetweenHandsOfClock {
    public double angleClock(int hour, int minutes) {
        double a = Math.abs(5.5 * minutes - 30 * hour);
        if (a > 180) {
            return 360 - a;
        }
        return a;
    }
}

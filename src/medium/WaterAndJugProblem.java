package medium;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 18:54
 * @description https://leetcode-cn.com/problems/water-and-jug-problem/
 */
public class WaterAndJugProblem {
    /*
    分析题目意思可以知道，每次操作，对于水的总量都只会发生x，y的变化，
    即问题转换为判断ax+by=z?是否成立
    */
    public boolean canMeasureWater(int x, int y, int z) {
        if (x + y < z)
            return false;
        if (x == 0 || y == 0)
            return (z == 0 || x + y == z);
        return (z % gcd(x, y) == 0);
    }
    public int gcd(int a,int b) {
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
}

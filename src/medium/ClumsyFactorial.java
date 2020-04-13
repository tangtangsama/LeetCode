package medium;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 18:30
 * @description https://leetcode-cn.com/problems/clumsy-factorial/
 */
public class ClumsyFactorial {
    public int clumsy(int N) {
        int num[] = {1, 2, 2, -1};
        return N>4?N+num[N%4]:(N>2?N+3:N);
    }
}

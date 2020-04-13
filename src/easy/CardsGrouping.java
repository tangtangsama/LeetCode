package easy;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 11:35
 * @description https://leetcode-cn.com/problems/x-of-a-kind-in-a-deck-of-cards/
 */
public class CardsGrouping {
    public boolean hasGroupsSizeX(int[] deck) {
        /*
            根据题目要求，选取的X应当为每种牌数量的最大公约数
        */
        int[] counter = new int[10000];
        for (int num: deck) {
            counter[num]++;
        }
        // 迭代求多个数的最大公约数
        int x = 0;
        for(int cnt: counter) {
            if (cnt > 0) {
                x = gcd(x, cnt);
                if (x == 1) { // 如果某步中gcd是1，直接返回false
                    return false;
                }
            }
        }
        return x >= 2;
    }

    // 辗转相除法
    private int gcd (int a, int b) {
        return b == 0? a: gcd(b, a % b);
    }

}

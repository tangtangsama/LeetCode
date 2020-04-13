package medium;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 18:33
 * @description https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/
 */
public class RobotMovePosition {
    int ans = 0;

    public int movingCount(int m, int n, int k) {
        int[][] visited = new int[m][n];//设置标志数组显示当前位置是否被访问，默认0为未访问
        count(visited, 0, 0, m, n, k);
        return ans;
    }

    public void count(int[][] visited, int i, int j, int m, int n, int k) {
        if (i >= 0 && i < m && j >= 0 && j < n && visited[i][j] != 1 && checkSum(i, j, k)) {//判断当前点是否满足条件
            ans++;
            visited[i][j] = 1;
            count(visited, i - 1, j, m, n, k);
            count(visited, i + 1, j, m, n, k);
            count(visited, i, j - 1, m, n, k);
            count(visited, i, j + 1, m, n, k);
        }
    }

    public boolean checkSum(int i, int j, int k) {
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i /= 10;
        }
        while (j > 0) {
            sum += j % 10;
            j /= 10;
        }
        return sum <= k;
    }
}

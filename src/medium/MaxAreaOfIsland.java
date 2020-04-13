package medium;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 18:55
 * @description https://leetcode-cn.com/problems/max-area-of-island/
 */
public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, dfs(i, j, grid));
                }
            }
        }
        return maxArea;
    }
    //深度优先遍历，计算当前节点的可连通数，即包含当前节点的最大岛屿面积。
    //如果当前下标越界或者当前元素是水，直接返回0，
    //否则，将当前元素置零，count计数加1，并递归计算其上下左右其他点的连通性
    private int dfs(int i, int j, int[][] grid) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == 0) {
            return 0;
        }
        grid[i][j] = 0;
        int count = 1;
        count += dfs(i + 1, j, grid);
        count += dfs(i - 1, j, grid);
        count += dfs(i, j + 1, grid);
        count += dfs(i, j - 1, grid);
        return count;
    }
}

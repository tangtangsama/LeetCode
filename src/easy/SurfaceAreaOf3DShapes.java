package easy;

/**
 * @author sucre
 * @date 2020-04-14
 * @time 09:55
 * @description https://leetcode-cn.com/problems/surface-area-of-3d-shapes/
 */
public class SurfaceAreaOf3DShapes {
    public int surfaceArea(int[][] grid) {
        /*
            考虑每一个柱体，即二维数组的每一个元素count，代表当前位置为高度为count的柱体。
            该柱体表面积为上下底面以及四个侧面，即4*count+2，故count>0时，area增加该柱体表面积。
            然后需要考虑柱体与其前面柱体的重合部分，重合部分为相邻柱体高度的最小值的两倍。
        */
        int area = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                int count = grid[i][j];
                if (count > 0) {
                    area += count * 4 + 2;
                    if (i > 0) {
                        area -= Math.min(grid[i - 1][j], count) * 2;
                    }
                    if (j > 0) {
                        area -= Math.min(grid[i][j - 1], count) * 2;
                    }
                }
            }
        }
        return area;
    }
}

package easy;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 11:25
 * @description https://leetcode-cn.com/problems/check-if-it-is-a-straight-line/
 */
public class Check_If_It_Is_a_Straight_Line {
    public boolean checkStraightLine(int[][] coordinates) {
        int x1 =coordinates[1][0]-coordinates[0][0];
        int y1 =coordinates[1][1]-coordinates[0][1];
        for (int i = 2; i < coordinates.length; i++) {
            int x2 =coordinates[i][0]-coordinates[0][0];
            int y2 =coordinates[i][1]-coordinates[0][1];
            if (x1 * y2 != x2 * y1) {
                return false;
            }
        }
        return true;
    }
}

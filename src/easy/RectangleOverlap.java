package easy;

/**
 * @author sucre
 * @date 2020-04-14
 * @time 10:31
 * @description https://leetcode-cn.com/problems/rectangle-overlap/
 */
public class RectangleOverlap {
    /**
     考虑不重叠的情况
     当rec1的完全位于rec2的上下左右侧时（可以包括边重叠），矩形不重叠
     以上方为例，当rec1左下角的纵坐标rec1[1]大于等于rec2右上角的纵坐标rec2[3]时，两者不重叠
     **/
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return (!(rec1[1]>=rec2[3] || rec1[3]<=rec2[1] || rec1[2]<=rec2[0] || rec1[0]>=rec2[2]));
    }
}

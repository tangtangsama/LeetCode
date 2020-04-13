package hard;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 19:02
 * @description https://leetcode-cn.com/problems/trapping-rain-water/
 */
public class TrappingRainWater {
    //当前位置积水的数量，等于其左边最高墙和右边最高墙的高度中的最小值减去当前位置的高度
    public int trap(int[] height) {
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];
        int sum = 0;

        //从第二个位置开始找到其左边最高的位置
        for(int i=1; i<height.length; i++){
            maxLeft[i] = Math.max(height[i-1],maxLeft[i-1]);
        }
        //从倒数第二个位置开始找到其右边最高的位置
        for(int i=height.length-2; i>=0; i--){
            maxRight[i] = Math.max(height[i+1],maxRight[i+1]);
        }
        for(int i=1; i<height.length-1; i++){
            int min = Math.min(maxLeft[i],maxRight[i]);
            if(min > height[i]){
                sum += min-height[i];
            }
        }
        return sum;
    }
}

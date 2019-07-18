package easyGo;

/**
 * @author sucre
 * @date 2019-07-18
 * @time 19:12
 * @description https://leetcode-cn.com/problems/two-sum/
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}

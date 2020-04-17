package medium;

/**
 * @author sucre
 * @date 2020-04-17
 * @time 09:02
 * @description https://leetcode-cn.com/problems/jump-game/
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        int n = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] >= n) {
                n = 1;
            } else {
                n++;
            }
            if (i == 0 && n > 1) {
                return false;
            }
        }
        return true;
    }
}

package easy;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 11:22
 * @description https://leetcode-cn.com/problems/magic-index-lcci/
 */
public class MagicIndexLCCI {
    public int findMagicIndex(int[] nums) {
        int index = -1;
        for(int i=0; i<nums.length; i++){
            if(i == nums[i]){
                index = i;
                break;
            }
        }
        return index;
    }
}

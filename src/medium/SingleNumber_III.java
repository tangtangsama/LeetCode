package medium;

import java.util.Arrays;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 18:34
 * @description https://leetcode-cn.com/problems/single-number-iii/
 */
public class SingleNumber_III {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i==0){
                if(nums[i+1]>nums[i])
                    ans[0] = nums[i];
            }else if(i==nums.length-1){
                if(nums[i-1]<nums[i])
                    ans[1] = nums[i];
            }else{
                if(nums[i-1]<nums[i]&&nums[i]<nums[i+1]){
                    if(ans[0]==0)
                        ans[0] = nums[i];
                    else
                        ans[1] = nums[i];
                }
            }
        }
        return ans;
    }
}

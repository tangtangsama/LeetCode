package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 11:29
 * @description https://leetcode-cn.com/problems/minimum-subsequence-in-non-increasing-order/
 */
public class MinimumSubsequenceInNon_IncreasingOrder {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        if(nums.length == 1){
            ans.add(nums[0]);
            return ans;
        }
        if(nums.length == 2){
            if(nums[0] == nums[1]){
                ans.add(nums[0]);
                ans.add(nums[1]);
            }else{
                ans.add(Math.max(nums[0],nums[1]));
            }

            return ans;
        }

        // int[] nums = {4,3,10,9,8};
        Arrays.sort(nums);
        int sum1=0,sum2=0;
        int i = 0;
        for(i=nums.length-1; i>0; i--){
            sum1 += nums[i];
            // System.out.print(sum1);
            for(int j = i-1; j>=0; j--){
                sum2 += nums[j];

            }
            // System.out.println(sum2);
            if(sum1 > sum2){
                for(int t=nums.length-1; t>=i; t--){
                    ans.add(nums[t]);
                }
                break;
            }else
                sum2 = 0;
        }

        return ans;
    }
}

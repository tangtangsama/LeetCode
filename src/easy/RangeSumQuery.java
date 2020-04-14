package easy;

/**
 * @author sucre
 * @date 2020-04-14
 * @time 09:56
 * @description https://leetcode-cn.com/problems/range-sum-query-immutable/
 */
public class RangeSumQuery {
    class NumArray {
        /*
            动态规划的思想
            假设sum[i]用于存储前i个数的和,不包括第i个数
            则状态转移方程为sumRange(i,j)=sum[j+1]-sum[i]
        */
        private int[] sum;
        public NumArray(int[] nums) {
            sum = new int[nums.length+1];
            sum[0] = 0;
            for(int i=0; i<nums.length; i++){
                sum[i+1] = sum[i] + nums[i];
            }
        }
        public int sumRange(int i, int j) {
            return sum[j+1]-sum[i];
        }
    }
}

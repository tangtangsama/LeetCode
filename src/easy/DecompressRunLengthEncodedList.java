package easy;

/**
 * @author sucre
 * @date 2020-04-14
 * @time 10:46
 * @description https://leetcode-cn.com/problems/decompress-run-length-encoded-list/
 */
public class DecompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
        int ansLength = 0;
        for (int i = 0; i < nums.length - 1; i += 2) {//统计结果数组的长度
            ansLength += nums[i];
        }
        int[] ans = new int[ansLength];
        int t = 0;
        for (int i = 1; i < nums.length; i += 2) {
            for (int j = 1; j <= nums[i - 1]; j++) {
                ans[t] = nums[i];
                t++;
            }
        }
        return ans;
    }
}

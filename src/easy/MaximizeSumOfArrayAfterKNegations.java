package easy;

import java.util.Arrays;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 11:17
 * @description https://leetcode-cn.com/problems/maximize-sum-of-array-after-k-negations/
 */
public class MaximizeSumOfArrayAfterKNegations {
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        int sum = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0 && K-- > 0)
                A[i] = -1 * A[i];
            sum += A[i];
            min = Math.min(min, A[i]);
        }
        if (K > 0 && K % 2 == 1)
            sum = sum - min + (-1 * min);
        return sum;
    }
}

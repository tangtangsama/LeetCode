package medium;

import java.util.Arrays;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 18:54
 * @description https://leetcode-cn.com/problems/minimum-increment-to-make-array-unique/
 */
public class MinimumIncrementToMakeArrayUnique {
    public int minIncrementForUnique(int[] A) {
        /*
            1. 对数组进行排序
            2. 分析排序后的数组：
                如果相邻两元素一样大，将做一次操作，并且后一个元素加一，例112237->122237->123237
                在做过操作后，可能存在前一个元素大于后一个元素的情况，此时次数增加两者差值并加一，后一个数变为前一个数加一，
                例123237->123437->123457
        */
        Arrays.sort(A);
        int count = 0;
        for(int i=1; i<A.length; i++){
            if(A[i-1] >= A[i]){
                count += A[i-1] - A[i] + 1;
                A[i] = A[i-1] + 1;
            }
        }
        return count;
    }
}

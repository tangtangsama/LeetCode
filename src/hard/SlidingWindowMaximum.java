package hard;

/**
 * @author sucre
 * @date 2019-07-23
 * @time 14:51
 * @description https://leetcode-cn.com/problems/sliding-window-maximum/
 */

/*
   双指针方法求解
    https://leetcode-cn.com/problems/sliding-window-maximum/solution/java-shuang-zhi-zhen-fa-by-qihang666/

 */
public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums={7,2,4};
        int k = 2;
        int[] result = maxSlidingWindow(nums,k);
        for (int n:result
             ) {
            System.out.print(n);
        }
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0 || k ==0) {
            return new int[]{};
        }
        if(k == 1) {
            return nums;
        }

        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        int i = 0,j = 0;    // 定义双指针，分别指向窗口的头和尾
        int[] result = new int[nums.length-k+1];

        for (; j<k; j++){   //先找第一个窗口中的最大值
            if(nums[j] >= max){
                max = nums[j];
                maxIndex = j;
            }
        }

        result[i++] = max;    //存入第一个窗口的最值


        for (; j<nums.length; j++,i++){ //窗口向后移动
            if(nums[j] >= max){  //右侧新元素比最大值还大，则该新元素为新窗口的最大值
                max = nums[j];
                max = nums[j];
                maxIndex = j;
                result[i] = max;
                continue;
            }
            if(maxIndex >= i){  //右侧新元素比当前最大值小，且最大值下标仍在窗口中，则最大值不变
                result[i] = max;
                continue;
            }
            if(maxIndex < i){   //右侧新元素比当前最大值小，且最大值下标不在窗口中，遍历窗口找最大值
                max = Integer.MIN_VALUE;
                for(int l = j; l>=i; l--){
                    if(nums[l] > max){
                        max = nums[l];
                        maxIndex = l;
                    }
                }
                result[i] = max;
            }
        }
        return result;
    }
}

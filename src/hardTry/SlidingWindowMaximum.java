package hardTry;

/**
 * @author sucre
 * @date 2019-07-23
 * @time 14:51
 * @description https://leetcode-cn.com/problems/sliding-window-maximum/
 */

/*
    ˫ָ�뷽�����
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
        if(nums.length == 0 || k ==0)
            return new int[]{};
        if(k == 1)
            return nums;

        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        int i = 0,j = 0;    // ����˫ָ�룬�ֱ�ָ�򴰿ڵ�ͷ��β
        int[] result = new int[nums.length-k+1];

        for (; j<k; j++){   //���ҵ�һ�������е����ֵ
            if(nums[j] >= max){
                max = nums[j];
                maxIndex = j;
            }
        }

        result[i++] = max;    //�����һ�����ڵ���ֵ


        for (; j<nums.length; j++,i++){ //��������ƶ�
            if(nums[j] >= max){  //�Ҳ���Ԫ�ر����ֵ���������Ԫ��Ϊ�´��ڵ����ֵ
                max = nums[j];
                maxIndex = j;
                result[i] = max;
                continue;
            }
            if(maxIndex >= i){  //�Ҳ���Ԫ�رȵ�ǰ���ֵС�������ֵ�±����ڴ����У������ֵ����
                result[i] = max;
                continue;
            }
            if(maxIndex < i){   //�Ҳ���Ԫ�رȵ�ǰ���ֵС�������ֵ�±겻�ڴ����У��������������ֵ
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

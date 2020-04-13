package easy;

import java.util.PriorityQueue;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 11:32
 * @description https://leetcode-cn.com/problems/kth-largest-element-in-a-stream/
 */
public class KthLargestElementInStream {
    class KthLargest {
        private PriorityQueue<Integer> minHeap;
        private int length; //记录小顶堆的大小

        public KthLargest(int k, int[] nums) {
            length = k;
            minHeap = new PriorityQueue<>(k);   //设置k大小的小顶堆
            for(int n : nums){
                add(n);  //调用该类的add方法，不能调用PriorityQueue的add方法，否则会自动扩容，堆的大小改变。
            }
        }

        public int add(int val) {
            if (minHeap.size() < length) {  //用于添加数据
                minHeap.add(val);
            } else if (val > minHeap.peek()) {  //如果当前堆顶数据小于新增数据，则堆顶数据不再是第k大的数，出堆并加入新元素进行重新排序
                minHeap.poll();
                minHeap.add(val);
            }
            return minHeap.peek();
        }
    }
}

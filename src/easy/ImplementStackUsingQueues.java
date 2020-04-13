package easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 11:31
 * @description https://leetcode-cn.com/problems/implement-stack-using-queues/
 */
public class ImplementStackUsingQueues {
    class MyStack {

        Queue<Integer> list;
        /** Initialize your data structure here. */
        public MyStack() {
            list = new LinkedList<>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            list.add(x);
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            for(int i=0; i<list.size()-1; i++){
                list.add(list.poll());
            }
            return list.poll();
        }

        /** Get the top element. */
        public int top() {
            for(int i=0; i<list.size()-1; i++){
                list.add(list.poll());
            }
            int e = list.poll();
            list.add(e);
            return e;
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return list.isEmpty();
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}

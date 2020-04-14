package easy;

/**
 * @author sucre
 * @date 2020-04-14
 * @time 10:28
 * @description https://leetcode-cn.com/problems/kth-node-from-end-of-list-lcci/
 */
public class KthNodeFromEndOfListLCCI {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    /*
       双指针技巧，一样双百。
       1. p，q都位于头节点，首先让q向后移动k次，此时p，q相距k。
       2. 同时将p，q后移，直到q到达链表尾，此时p刚好为倒数第k个节点。
   */
    public int kthToLast(ListNode head, int k) {
        ListNode p,q;
        p=q=head;
        for(int i=0; i<k; i++){
            q = q.next;
        }
        while(q != null){
            p = p.next;
            q = q.next;
        }
        return p.val;
    }
}

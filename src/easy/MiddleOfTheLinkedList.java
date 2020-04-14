package easy;

/**
 * @author sucre
 * @date 2020-04-14
 * @time 10:00
 * @description https://leetcode-cn.com/problems/middle-of-the-linked-list/
 */
public class MiddleOfTheLinkedList {
     class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    /*
       快慢指针技巧，快指针每次移动两个节点，慢指针每次移动一个节点，当快指针到结尾时慢指针刚好在中间。
   */
    public ListNode middleNode(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        while(p1 != null && p1.next != null){
            p1 = p1.next.next;
            p2 = p2.next;
        }
        return p2;
    }
}

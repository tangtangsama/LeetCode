package easy;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 11:36
 * @description https://leetcode-cn.com/problems/delete-middle-node-lcci/
 */
public class DeleteMiddleNodeLCCI {
    public class ListNode {
      int val;
      ListNode next;
     ListNode(int x) { val = x; }
  }
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

package easyGo;

/**
 * @author sucre
 * @date 2019-07-24
 * @time 14:02
 * @description https://leetcode-cn.com/problems/range-sum-of-bst/
 */
/*
    �ݹ���ֹ������
    ��ǰ�ڵ�Ϊ null ʱ���� 0
    ��ǰ�ڵ� X < L ʱ�򷵻�������֮��
    ��ǰ�ڵ� X > R ʱ�򷵻�������֮��
    ��ǰ�ڵ� X >= L �� X <= R ʱ�򷵻أ���ǰ�ڵ�ֵ + ������֮�� + ������֮��
 */

//  Definition for a binary tree node.

  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class RangeSumOfBST {
    public static void main(String[] args) {

    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root==null)
            return 0;
        if(root.val<L){
            return rangeSumBST(root.right,L,R);
        }
        if(root.val>R){
            return rangeSumBST(root.left,L,R);
        }
        else
            return root.val+rangeSumBST(root.left,L,R)+rangeSumBST(root.right,L,R);
    }
}

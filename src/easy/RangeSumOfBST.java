package easy;

/**
 * @author sucre
 * @date 2019-07-24
 * @time 14:02
 * @description https://leetcode-cn.com/problems/range-sum-of-bst/
 */
/*
    递归终止条件：
    当前节点为 null 时返回 0
    当前节点 X < L 时则返回右子树之和
    当前节点 X > R 时则返回左子树之和
    当前节点 X >= L 且 X <= R 时则返回：当前节点值 + 左子树之和 + 右子树之和
 */



public class RangeSumOfBST {
    //  Definition for a binary tree node.

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root==null) {
            return 0;
        }
        if(root.val<L){
            return rangeSumBST(root.right,L,R);
        }
        if(root.val>R){
            return rangeSumBST(root.left,L,R);
        }
        else {
            return root.val+rangeSumBST(root.left,L,R)+rangeSumBST(root.right,L,R);
        }
    }
}

package hard;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 19:01
 * @description https://leetcode-cn.com/problems/maximum-sum-bst-in-binary-tree/
 */
public class MaximumSumBSTInBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int maxSumBST(TreeNode root) {
        int[] res = {0};
        maxSumBST(res, root);
        return res[0];
    }

    private boolean isBST(TreeNode root, int min, int max) {
        if (root == null) {
            return true;
        }
        return min < root.val && root.val < max && isBST(root.left, min, root.val) && isBST(root.right, root.val, max);
    }

    private void maxSumBST(int[] res, TreeNode node) {
        // 这个节点是BST，直接求和了
        if (isBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
            // 是二叉搜索树，求节点和，节点和的最优解，肯定在子节点求和的过程中
            sumNodeValue(res, node);
            return;
        }
        // 不是BST，递归进入左右子树
        maxSumBST(res, node.left);
        maxSumBST(res, node.right);
    }

    private int sumNodeValue(int[] res, TreeNode node) {
        if (node == null) {
            return 0;
        }
        // 二叉搜索树节点和的最大值，一定在子节点中会出现
        int sum = node.val + sumNodeValue(res, node.left) + sumNodeValue(res, node.right);
        // 这里记录结果的最大值
        res[0] = Math.max(res[0], sum);
        return sum;
    }
}

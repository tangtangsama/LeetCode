package medium;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 18:49
 * @description https://leetcode-cn.com/problems/add-one-row-to-tree/
 */


public class AddOneRowToTree {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode addOneRow(TreeNode t, int v, int d) {
        if (d == 1) {
            TreeNode n = new TreeNode(v);
            n.left = t;
            return n;
        }
        insert(v, t, 1, d);
        return t;
    }

    public void insert(int val, TreeNode node, int depth, int n) {
        if (node == null)
            return;
        if (depth == n - 1) {
            TreeNode t = node.left;
            node.left = new TreeNode(val);
            node.left.left = t;
            t = node.right;
            node.right = new TreeNode(val);
            node.right.right = t;
        } else {
            insert(val, node.left, depth + 1, n);
            insert(val, node.right, depth + 1, n);
        }
    }
}

package easy;

/**
 * @author sucre
 * @date 2020-04-14
 * @time 09:59
 * @description https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 */
public class MaximumDepthOfBinaryTree {
    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        else{
            int ld = maxDepth(root.left);
            int rd = maxDepth(root.right);
            return Math.max(ld,rd) + 1;
        }
    }
}

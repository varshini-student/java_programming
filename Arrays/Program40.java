// diameter of binary tree
class Solution {

     int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return diameter;
    }

    public int depth(TreeNode node) {
        if (node == null)
            return 0;
        int lDepth = depth(node.left);
        int rDepth = depth(node.right);
        diameter = Math.max(diameter, lDepth + rDepth);
        return 1 + Math.max(lDepth, rDepth);
    }
}
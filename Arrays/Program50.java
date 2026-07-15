// Delete NOde in a Binary Search Tree
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        return delete(root, key);
    }
    public TreeNode delete(TreeNode root, int key) {
        if (root == null)
            return null;
        if (key < root.val) {
            root.left = delete(root.left, key);
        } else if (key > root.val) {
            root.right = delete(root.right, key);
        } else {
            if (root.left == null)
                return root.right;
            if (root.right == null)
                return root.left;
            TreeNode rep = minFind(root.right);
            root.val = rep.val;
            root.right = delete(root.right, rep.val);
        }
        return root;
    }
    public TreeNode minFind(TreeNode node) {
        while (node.left != null)
            node = node.left;
        return node;
    }
}
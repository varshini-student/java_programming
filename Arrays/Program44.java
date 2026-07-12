// binary inorder & postorder traversal
class Solution {

    private int postIndex;
    private HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        postIndex = postorder.length - 1;

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(postorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] postorder, int left, int right) {

        if (left > right)
            return null;

        int rootVal = postorder[postIndex--];

        TreeNode root = new TreeNode(rootVal);

        int index = map.get(rootVal);

        // Build right subtree first
        root.right = build(postorder, index + 1, right);

        // Then build left subtree
        root.left = build(postorder, left, index - 1);

        return root;
    }
}
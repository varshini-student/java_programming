// number of good leaf nodes
class Solution {
    private int result = 0;
    private List<Integer> dDive(TreeNode root, int distance) {
        if (root == null)
            return new ArrayList<>();
        if (root.left == null && root.right == null) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            return temp;
        }
        List<Integer> lLeft = dDive(root.left, distance);
        List<Integer> rRight = dDive(root.right, distance);
        for (int l : lLeft) {
            for (int r : rRight) {
                if (l + r <= distance) {
                    result++;
                }
            }
        }
        List<Integer> level = new ArrayList<>();
        for (int l : lLeft) {
            if (l + 1 <= distance)
                level.add(l + 1);
        }
        for (int r : rRight) {
            if (r + 1 <= distance)
                level.add(r + 1);
        }
        return level;
    }
    public int countPairs(TreeNode root, int distance) {
        dDive(root, distance);
        return result;
    }
}
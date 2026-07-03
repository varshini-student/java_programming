// Jump game
class Solution {

    public static boolean canJump(int[] arr) {
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i > maxLen) {
                return false;
            }
            maxLen = Math.max(maxLen, i + arr[i]);
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 1, 4};
        int[] arr2 = {3, 2, 1, 0, 4};

        System.out.println(canJump(arr1)); // true
        System.out.println(canJump(arr2)); // false
    }
}
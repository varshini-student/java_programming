// Container with most water
class Solution {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int mWater = 0;

        while (left < right) {
            int width = right - left;
            int h = Math.min(height[left], height[right]);

            mWater = Math.max(mWater, width * h);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return mWater;
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        Solution obj = new Solution();
        System.out.println(obj.maxArea(arr));
    }
}
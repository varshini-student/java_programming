// Find Minimum Rotated Sorted Array
public class Program13 {
    public static void main(int[] nums) {

        int start = 0, end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
    
    }
}

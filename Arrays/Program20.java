// Minimun time to complete trips
import java.util.*;

class Solution {

    public long minimumTime(int[] time, int totalTrips) {

        long start = 1;
        long end = (long) Arrays.stream(time).min().getAsInt() * totalTrips;
        long ans = 0;

        while (start <= end) {

            long mid = start + (end - start) / 2;

            if (canComplete(time, totalTrips, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static boolean canComplete(int[] arr, int trip, long mid) {

        long sum = 0;

        for (int each : arr) {
            sum += mid / each;

            if (sum >= trip)
                return true;
        }

        return false;
    }
}
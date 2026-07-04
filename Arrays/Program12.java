
import java.util.*;
import java.util.HashMap;
import java.util.Collections;

class Program12 {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int each : nums) {
            map.put(each, map.getOrDefault(each, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> tempList =
                new ArrayList<>(map.entrySet());

        tempList.sort(Map.Entry.comparingByValue());

        Collections.reverse(tempList);

        int[] result = new int[k];

        for (int index = 0; index < k; index++) {
            result[index] = tempList.get(index).getKey();
        }

        return result;
    }
} 


// Jewels and Stones
import java.util.HashSet;
import java.util.Set;

class Solution {

    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Set<Character> jewelSet = new HashSet<>();

        for (char c : jewels.toCharArray())
            jewelSet.add(c);

        for (char c : stones.toCharArray())
            if (jewelSet.contains(c))
                count++;

        return count;
    }

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";

        Solution obj = new Solution();
        System.out.println(obj.numJewelsInStones(jewels, stones));
    }
}
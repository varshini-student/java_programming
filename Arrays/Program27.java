class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {

        Set<String> dicts = new HashSet<>(wordDict);

        int size = s.length();

        boolean[] dp = new boolean[size + 1];
        dp[0] = true;

        for (int ind = 1; ind <= size; ind++) {

            for (int j = 0; j < ind; j++) {

                if (dp[j]) {

                    String sub = s.substring(j, ind);

                    if (dicts.contains(sub)) {
                        dp[ind] = true;
                        break;
                    }
                }
            }
        }

        return dp[size];
    }
}
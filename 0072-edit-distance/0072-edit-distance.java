class Solution {
    Integer[][] dp;
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        dp = new Integer[m][n];
        return helper(word1, word2, 0, 0);
    }
    public int helper(String word1, String word2, int idx1, int idx2){
        int m = word1.length();
        int n = word2.length();

        if(idx1>=m) return n - idx2;
        if(idx2>=n) return m - idx1;

        if(dp[idx1][idx2]!=null) return dp[idx1][idx2];

        if(word1.charAt(idx1) == word2.charAt(idx2)){
            return helper(word1, word2, idx1+1, idx2+1);
        }
        else{
            int insert =  helper(word1, word2, idx1, idx2+1);
            int delete = helper(word1, word2, idx1+1, idx2);
            int replace =  helper(word1, word2, idx1+1, idx2+1);
            return dp[idx1][idx2] = 1 + Math.min(replace,Math.min(delete,insert));
        }
    }
}
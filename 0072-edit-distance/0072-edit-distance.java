class Solution {
    Integer[][] dp;
    public int minDistance(String word1, String word2) {
        dp = new Integer[word1.length()+1][word2.length()+1];
        return helper(word1,word2,word1.length(),word2.length());
    }
    public int helper(String s1, String s2, int i, int j){
        if(i==0) return j;
        if(j==0) return i;
        if(dp[i][j] != null) return dp[i][j];
        if(s1.charAt(i-1)==s2.charAt(j-1)) return dp[i][j] = helper(s1,s2,i-1,j-1);

        else{
            int insert = 1+ helper(s1,s2,i,j-1);
            int delete = 1+ helper(s1,s2,i-1,j);
            int replace = 1+ helper(s1,s2,i-1,j-1);

            return dp[i][j] = Math.min(replace,Math.min(insert,delete));
        }
    }
}
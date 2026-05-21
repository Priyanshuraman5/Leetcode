class Solution {
    Integer[][] dp;
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        dp = new Integer[m][n];
        return helper(text1,text2,0,0);
    }
    public int helper(String text1, String text2, int idx1, int idx2){
        int m = text1.length();
        int n = text2.length();
        if(idx2==n ||idx1==m) return 0;
        if(dp[idx1][idx2]!=null) return dp[idx1][idx2];
        int skip = Math.max(helper(text1,text2,idx1+1,idx2),helper(text1,text2,idx1,idx2+1));

        int pick = 0;
        if(text1.charAt(idx1)==text2.charAt(idx2)){
            pick = 1+helper(text1,text2,idx1+1,idx2+1);
        }
        return dp[idx1][idx2] = Math.max(pick,skip);
    }
}
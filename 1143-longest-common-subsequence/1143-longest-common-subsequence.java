class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        int[][] dp = new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
        // return helper(text1,text2,0,0);
    }
    // public int helper(String text1, String text2, int i, int j){
    //     int m = text1.length();
    //     int n = text2.length();

    //     if(i>=m || j>=n) return 0;
        
    //     int pick = 0;
    //     int skip = 0;
    //     if(text1.charAt(i)==text2.charAt(j)){
    //         pick = 1 + helper(text1,text2,i+1,j+1);
    //     }
    //     else{
    //         int pick1 = helper(text1,text2,i+1,j);
    //         int pick2 = helper(text1,text2,i,j+1);
    //         skip = Math.max(pick1,pick2);
    //     }
    //     return Math.max(pick,skip);
    // } 
}
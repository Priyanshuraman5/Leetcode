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
    }
    // public int helper(String s1, String s2, int i, int j, int m, int n){
    //     if(i>=m) return 0;
    //     if(j>=n) return 0;
    //     int pick = 0;
    //     if(s1.charAt(i)==s2.charAt(j)){
    //         pick = 1 + helper(s1,s2,i+1,j+1,m,n);
    //     }
    //     else{
    //         pick = Math.max(helper(s1,s2,i+1,j,m,n),helper(s1,s2,i,j+1,m,n));
    //     }

    //     return pick;

    // }
}
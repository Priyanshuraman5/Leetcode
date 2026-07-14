class Solution {
    public int numDistinct(String s, String t) {
        int  m  =  s.length();
        int  n  =  t.length();
        int[][] dp = new int[m+1][n+1];
        for(int j=0;j<=m;j++){
            dp[j][0] = 1;
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[m][n];

        // return helper(s,t,0,0);

    }
    // public int helper(String s, String t,int i, int j){
    //     int  m  =  s.length();
    //     int  n  =  t.length();

    //     if(j==n) return 1;
    //     if(i==m) return 0;
        
    //     if(s.charAt(i)==t.charAt(j)){
    //         return helper(s, t, i+1, j+1) + helper(s, t, i+1, j);
    //     }
    //     else{
    //         return  helper(s, t, i+1,j);
    //     }

        
    // }
}
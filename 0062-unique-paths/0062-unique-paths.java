class Solution {
    Integer[][] dp;
    public int uniquePaths(int m, int n) {
        dp = new Integer[m][n];
        return helper(m,n,0,0);
    }
    public int helper(int m, int n, int i, int j){
        if(i>=m || j>=n) return 0;
        if(i==m-1 && j==n-1) return 1;
        if(dp[i][j]!=null) return dp[i][j];
        int pick1 = helper(m,n,i+1,j);
        int pick2 = helper(m,n,i,j+1);

        return dp[i][j] = pick1 + pick2;
    }
}
class Solution {
    Integer[] dp;
    public int climbStairs(int n) {
        dp = new Integer[n+1];
        return helper(n,0);
    }
    public int helper(int n,int idx){
        if(idx>n) return 0;
        if(idx==n) return 1;
        if(dp[idx]!=null) return dp[idx];
        int ways1 = helper(n,idx+1);
        int ways2 = helper(n,idx+2);

        return dp[idx] = ways1+ways2;
    }
}
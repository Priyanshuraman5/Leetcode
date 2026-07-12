class Solution {
    Integer[] dp;
    public int climbStairs(int n) {
        dp = new Integer[n];
        return helper(n,0);
    }
    public int helper(int n,int idx){
        if(idx>n) return 0;
        if(idx==n) return 1;
        if(dp[idx]!=null) return dp[idx];

        return dp[idx] = helper(n,idx+1) + helper(n,idx +2);
    }
}
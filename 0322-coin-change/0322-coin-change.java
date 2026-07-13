class Solution {
    Integer[][] dp;
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        dp = new Integer[n][amount+1];
        int ans = helper(coins,amount,0);
        return ans==Integer.MAX_VALUE ? -1:ans;
    }
    public int helper(int[]coins, int amount, int idx){
        int n = coins.length;
        if(amount==0){
            return 0;
        }
        if(idx==n) return Integer.MAX_VALUE;
        if(dp[idx][amount]!=null) return dp[idx][amount];
        int skip = helper(coins,amount,idx+1);
        int pick = Integer.MAX_VALUE;
        if(amount>=coins[idx]){
            int store =  helper(coins,amount-coins[idx],idx);
            if(store!=Integer.MAX_VALUE){
                pick = 1 + store;
            }
        }
        return dp[idx][amount] = Math.min(pick,skip);
    }
}
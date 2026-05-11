class Solution {
    Integer[][] dp;
    public int change(int amount, int[] coins) {
        int n = coins.length;
        dp = new Integer[n][amount+1];
        return helper(amount,coins,0); 
    }
    public int helper(int amount, int[] coins, int idx){

        if(amount == 0) return 1;
        if(idx>=coins.length) return 0;
        if(dp[idx][amount]!=null) return dp[idx][amount];
        int pick = 0;
        if(amount>=coins[idx]){
            pick = helper(amount-coins[idx],coins,idx)  ;
        }
        int skip = helper(amount,coins,idx+1);

        return dp[idx][amount] = pick + skip;
    }
}
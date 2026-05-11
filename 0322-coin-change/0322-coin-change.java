class Solution {
    Integer[][] dp;
    public int coinChange(int[] coins, int amount) {
        dp = new Integer[coins.length][amount+1];
       
        int ans = helper(coins,amount,0);
        if(ans>= 400000) return -1;
        return ans;
    }
    public int helper(int[] coins, int amount, int idx){
        if(amount==0) return 0;

        if(idx>=coins.length) return 400000;

        if(dp[idx][amount]!=null) return dp[idx][amount];
        int pick = Integer.MAX_VALUE;

        if(amount>=coins[idx]){
            pick = helper(coins,amount-coins[idx],idx) + 1;
        }
        int skip = helper(coins,amount,idx+1);

        return dp[idx][amount] = Math.min(pick,skip);
    }
}
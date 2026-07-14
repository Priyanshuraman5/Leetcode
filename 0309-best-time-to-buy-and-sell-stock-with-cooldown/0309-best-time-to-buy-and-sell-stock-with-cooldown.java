class Solution {
    Integer[][] dp;

    public int maxProfit(int[] prices) {
        int n = prices.length;
        dp = new Integer[n][3];
        return helper(prices,0,0);
    }
    public int helper(int[] prices, int idx, int buy){
        int n = prices.length;
        if(idx>=n) return 0;
        if(dp[idx][buy]!=null) return dp[idx][buy];
        int profit = 0;
        if(buy==0){
            profit = Math.max((0 + helper(prices,idx+1,0)),(helper(prices,idx+1,1)-prices[idx]));
        }
        else{
            profit = Math.max((0 + helper(prices,idx+1,1)),(helper(prices,idx+2,0)+prices[idx]));
        }
        return dp[idx][buy] = profit;
    }
}
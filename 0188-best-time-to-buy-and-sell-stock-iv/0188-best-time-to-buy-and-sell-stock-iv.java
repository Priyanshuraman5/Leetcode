class Solution {
    Integer[][][]dp;
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        dp = new Integer[n][k+1][3];
        return helper(k,prices,0,0);
    }
    public int helper(int k,int []prices, int idx, int buy){
        int n = prices.length;
        if(idx>=n || k==0) return 0;
        if(dp[idx][k][buy]!=null) return dp[idx][k][buy];
        int profit = 0;
        if(buy==0){
            profit = Math.max((0 + helper(k,prices,idx+1,0)),(helper(k,prices,idx+1,1)-prices[idx]));
        }
        else{
            profit = Math.max((0 + helper(k,prices,idx+1,1)),(helper(k-1,prices,idx+1,0)+prices[idx]));
        }
        return dp[idx][k][buy] = profit;
    }
}
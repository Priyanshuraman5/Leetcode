class Solution {
    Integer[][][]dp;
    public int maxProfit(int[] prices) {
        int n = prices.length;
        dp = new Integer[n][3][3];
        return helper(prices,0,0,2);
    }
    public int helper(int[]prices,int idx, int buy,int day){
        int n = prices.length;
        if(idx>=n || day==0) return 0;
        if(dp[idx][buy][day]!=null) return dp[idx][buy][day];
        int profit = 0;
        if(buy==0){
            profit = Math.max((0 + helper(prices,idx+1,0,day)),(helper(prices,idx+1,1,day)-prices[idx]));
        }
        else{
            profit = Math.max((0 + helper(prices,idx+1,1,day)),(helper(prices,idx+1,0,day-1)+prices[idx]));
        }
        return dp[idx][buy][day] = profit;
    }
}
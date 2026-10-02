class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int ans = -1;
        for(int i=1;i<n;i++){
            int store =  prices[i] - min;
            ans = Math.max(store,ans);
            min = Math.min(min,prices[i]);
        }
        if(ans==-1) return 0;
        return ans;
    }
}
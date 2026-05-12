class Solution {
    Integer [][]dp;
    public int lengthOfLIS(int[] nums) {
        dp = new Integer[nums.length][nums.length];
        return helper(nums,0,-1);
    }
    public int helper(int[] nums, int idx, int prev){
        int n = nums.length;
        if(idx>=n) return 0;
        if(dp[idx][prev+1] != null) return dp[idx][prev+1];
        int pick = 0;

        if(prev == -1 || nums[idx]>nums[prev] ){
            pick = 1 + helper(nums,idx+1,idx);
        }
        int skip = helper(nums,idx+1,prev);
        return dp[idx][prev+1] = Math.max(pick,skip);
    }
}

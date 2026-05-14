class Solution {
    Integer[][] dp;
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        dp = new Integer[n][n];
        return helper(nums,0,-1);
    }

    public int helper(int[] nums, int idx, int prev){
        if(idx==nums.length) return 0;
        if(dp[idx][prev+1]!=null) return dp[idx][prev+1];
        int pick = 0;
        if(prev==-1 || nums[idx]>nums[prev]){
            pick = 1 + helper(nums,idx+1,idx);
        }
        int skip = helper(nums, idx+1, prev);

        return dp[idx][prev+1] = Math.max(skip , pick);
    }
}
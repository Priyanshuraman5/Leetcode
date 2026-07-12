class Solution {
    Integer[] dp;
    public int rob(int[] nums) {
        dp = new Integer[nums.length];
        return Math.max(helper(nums,0),helper(nums,1));

    }

    public int helper(int[] nums,int idx){
        if(idx>=nums.length) return 0;
        if(dp[idx]!=null) return dp[idx];
        int pick = helper(nums,idx+2) + nums[idx];
        int skip = helper(nums,idx+1);
        return dp[idx] = Math.max(pick,skip);
    }
}
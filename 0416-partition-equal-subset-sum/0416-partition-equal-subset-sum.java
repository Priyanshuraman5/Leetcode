class Solution {
    public boolean canPartition(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        if(sum%2 != 0) return false;
        int x = sum/2;
        Boolean[][] dp = new Boolean[n][x+1];
        

        return helper(nums,x,0,dp);
    }
    public boolean helper(int[] nums, int target, int idx, Boolean[][] dp){
        if(target==0) return true;
        if(idx>=nums.length) return false;
        if(dp[idx][target]!=null) return dp[idx][target];
        boolean skip = helper(nums,target,idx+1,dp);
        boolean pick = false;
        if(target>=nums[idx]){
            pick = helper(nums,target-nums[idx],idx+1,dp);
        }
        return dp[idx][target] = skip || pick;

    }
}
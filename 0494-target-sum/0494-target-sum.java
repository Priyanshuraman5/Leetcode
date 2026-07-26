class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        return helper(nums,target,0);
    }
    public int helper(int[] nums, int target, int idx){
        if(idx==nums.length){
            if(target==0){
                return 1;
            }
            else return 0;
            
        }
        int plus = helper(nums,target+nums[idx],idx+1);
        int minus = helper(nums,target-nums[idx],idx+1);

        return plus + minus;
    }
}
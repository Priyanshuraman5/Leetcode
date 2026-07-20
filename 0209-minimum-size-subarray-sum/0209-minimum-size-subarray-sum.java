class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int j = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum += nums[i];
            while(sum>=target){
                minLen = Math.min(minLen,i-j+1);
                sum = sum - nums[j];
                j++;
                
            }
        }
        if(minLen>n) return 0;
        return minLen;
    }
}
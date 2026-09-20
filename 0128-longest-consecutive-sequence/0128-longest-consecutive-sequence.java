class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==1) return 1;
        if(n==0) return 0;
        Arrays.sort(nums);
        int count = 1;
        int max = 1;
        for(int i=1;i<n;i++){
            if(nums[i-1]+1==nums[i]) count++;
            else if(nums[i]==nums[i-1]) continue;
            else{
                count = 1;
            }
            max = Math.max(count,max);
        }

        return max;
    }
}
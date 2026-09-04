class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int max = nums[0];
        boolean flag = false;
        int x = -1;
        for(int i=0;i<n;i++){
            max = Math.max(nums[i],max);
            int min = nums[i];
            for(int j=i;j<n;j++){
                min = Math.min(min,nums[j]);
            }
            int ans = max - min;
            if(ans<=k){
                return i;
            }
            

        }
        return -1;
    }
}
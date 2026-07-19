class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int j = 0;
        int maxLen = 0;
        int count0 = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count0++;
                if(count0>k){
                    while(count0!=k){
                        if(nums[j]==0){
                            count0--;
                        }
                        j++;
                    }
                }
            }
            maxLen = Math.max(maxLen,i-j+1);
        }
        return maxLen;
        
    }
}
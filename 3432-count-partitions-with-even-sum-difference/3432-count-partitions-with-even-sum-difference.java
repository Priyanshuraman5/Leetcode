class Solution {
    public int countPartitions(int[] nums) {
        int count = 0;
        int n  = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        int sum = nums[0];
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1] + nums[i];
            sum += nums[i];
        }
        for(int i=0;i<n-1;i++){
            if((Math.abs(prefix[i]-(sum-prefix[i])))%2==0){
                count ++;
            }
        }
        return count;
    }
}
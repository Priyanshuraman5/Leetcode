class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int num = nums[i];
            int x = num;
            int sum = 0;

            while(x>0){
                int digit = x % 10;
                sum += digit;
                x = x/10;
            }
            if(sum==i){
                min = Math.min(min,sum);
            }
        }
        if(min==Integer.MAX_VALUE) return -1;
        return min;
    }

}
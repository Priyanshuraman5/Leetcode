class Solution {
    public int findMin(int[] nums) {
        int b = 0;
        int e = nums.length-1;
        while(b<e){
            int mid = b + (e-b)/2;
            if(nums[mid]>nums[e]){
                b = mid + 1;
            }
            else{
                e = mid ;
            }
        }
        return nums[b];
    }
}
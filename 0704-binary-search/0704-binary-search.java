class Solution {
    public int search(int[] nums, int target) {
        int end = nums.length;
        int st = 0;
        while(st<end){
            int mid = st + (end-st)/2;
            if(target==nums[mid]) return mid;
            else if(target<nums[mid]){
                end = mid;
            }
            else{
                st = mid + 1;
            }
        }
        return -1;
    }
}
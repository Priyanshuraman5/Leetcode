class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] nums = new int[n];
        for(int i=0;i<nums1.length;i++){
            nums[i] = nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            nums[i+nums1.length] = nums2[i];
        }
        Arrays.sort(nums);
        double ans = -1;
        if(n%2==0){
            ans = (double) (nums[n/2] + nums[(n/2-1)])/2; 
        }
        else{
            ans = (double) nums[n / 2];
        }
        return ans;
    }
}
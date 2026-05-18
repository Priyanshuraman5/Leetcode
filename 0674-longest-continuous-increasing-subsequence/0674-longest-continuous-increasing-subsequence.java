// class Solution {
//     public int findLengthOfLCIS(int[] nums) {
//         int n = nums.length;
//         int max = 1;
//         for(int i=0;i<n;i++){
//             int len = 0;
//             for(int j=i+1;j<n;j++){
//                 if(nums[j-1]<nums[j]){
//                     len = j-i+1;
//                 }
//                 else{
//                     break;
//                 }
//             }
//             max = Math.max(len,max);
//         }
//         return max;
//     }
// }

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        int num = nums[0];
        int len = 1;
        int max = 1;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                len++;
            }
            else{
                len = 1;
            }
            max = Math.max(max,len);

        }
        return max;
    }
}
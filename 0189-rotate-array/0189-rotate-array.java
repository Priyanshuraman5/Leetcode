class Solution {
    public void rotate(int[] nums, int k) {
        int n =  nums.length;
        k = k % n;
        if(n<k) return ;
        int[] arr  = new int[k];
    

        int j = 0;
        for(int i=n-k;i<n;i++){
            arr[j++] = nums[i];
        }
        
        for(int i=n-1;i>=k;i--){
            nums[i] = nums[i-k];
        }
        for(int i=0;i<k;i++){
            nums[i] = arr[i];
        }
    }
}
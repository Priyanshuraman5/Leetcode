class Solution {
    public int splitArray(int[] arr, int k) {
        // code here
        int n = arr.length;
        int sum = 0;
        int maxSum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            maxSum = Math.max(maxSum,arr[i]);
        }
        int low = maxSum;
        int high = sum;
        int ans = sum;
        while(low<=high){
            int mid = low + (high-low)/2;
            int partition = subArraySum(arr,mid);
            if(partition>k){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
        
    }
    
    public int subArraySum(int[] arr, int maxSum){
        
        int partition = 1;
        int sum = 0;
        for(int num:arr){
            if(sum + num <= maxSum){
                sum += num;
            }
            else{
                partition++;
                sum = num;
            }
        }
        return partition;
    }
}
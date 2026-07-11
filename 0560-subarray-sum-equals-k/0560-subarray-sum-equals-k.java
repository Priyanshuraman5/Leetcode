class Solution {
    public int subarraySum(int[] arr, int k) {
        // // Map<Integer,Integer> map = new HashMap<>();
        // int n = nums.length;
        // // for(int i=0;i<n;i++){
        // //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // // }
        // int count = 0;
        // for(int i=0;i<n;i++){
        //     int sum = 0;
        //     for(int j=i;j<n;j++){
        //         sum += nums[j];
        //         if(sum==k) count++;
        //     }
        // }
        // return count;
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        map.put(0,1);
        
        for(int i=0;i<n;i++){
            sum += arr[i];
            
            int delete = sum - k;
            
            if(map.containsKey(delete)){
                count  = count + map.get(delete);
            }
            
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
class Solution {
    // public int numSubarraysWithSum(int[] nums, int goal) {
        
    //     return helper(nums,goal) - helper(nums,goal-1);

    // }
    // public int helper(int[] nums,int goal){
    //     if(goal<0) return 0;
    //     int n = nums.length;
    //     int j = 0;
    //     int count = 0;
    //     int sum = 0;
    //     for(int i=0;i<n;i++){
    //         sum = sum + nums[i];
    //         while(sum>goal){
    //             sum -= nums[j];
    //             j++;
    //         }
    //         count += (i-j+1);
    //     }

    //     return count;

    // }
    public int numSubarraysWithSum(int[] nums, int goal){
        int n = nums.length;
        int sum = 0;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){

            sum += nums[i];
            
            if(map.containsKey(sum-goal)){
                count += map.get(sum-goal);
            }

            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
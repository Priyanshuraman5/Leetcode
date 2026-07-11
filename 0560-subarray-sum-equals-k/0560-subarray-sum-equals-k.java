class Solution {
    public int subarraySum(int[] nums, int k) {
        // Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        // for(int i=0;i<n;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        int count = 0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum += nums[j];
                if(sum==k) count++;
            }
        }
        return count;
    }
}
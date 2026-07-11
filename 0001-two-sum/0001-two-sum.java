class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int n= nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int x = target-nums[i];
            if(map.containsKey(x)){
                return new int[]{map.get(x),i};
            }
            map.put(nums[i],i);
        }
        
        return new int[]{};
    }
}
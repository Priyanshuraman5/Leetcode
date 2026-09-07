class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n = nums.length;
        int count = 0;
        if(n==0) return 0;
        Set<Integer> set = new HashSet<>();
        Set<Integer> ans = new HashSet<>();
        set.add(nums[0]);
        
        for(int i=1;i<n;i++){
            if(nums[i-1]==nums[i]){
                continue;
            }
            
            if(set.contains(nums[i])){
                ans.add(nums[i]);
            }
            
            set.add(nums[i]);
        }
        return set.size() - ans.size();
    }
}
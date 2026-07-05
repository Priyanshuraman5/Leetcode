class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer>curr = new ArrayList<>();
        helper(nums,ans,0,curr);
        return ans;
    }
    public void helper(int[]nums, List<List<Integer>>ans, int idx, List<Integer>curr){
        if(idx==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[idx]);
        helper(nums,ans,idx+1,curr);
        curr.remove(curr.size()-1);
        helper(nums,ans,idx+1,curr);
    }
}
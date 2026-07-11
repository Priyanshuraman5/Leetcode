class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int x = n/3;
        for(int i=0;i<n;i++){ 
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        map.forEach((key,value)->{
            if(map.get(key)>x){
                ans.add(key);
            }
        });
        return ans;

    }
}
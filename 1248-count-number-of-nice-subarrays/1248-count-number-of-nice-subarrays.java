class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                nums[i] = 0;
            }
            else{
                nums[i] = 1;
            }
        }
        int count = 0;
        int sum = 0;
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum  =  sum  +  nums[i];

            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }

            map.put(sum,map.getOrDefault(sum,0)+1);

        }
        return count;
    }
}
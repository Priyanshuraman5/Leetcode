class Solution {
    class pair{
        int row;
        int col;
        pair(int row,int col){
            this.row = row;
            this.col = col;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[k];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int n = map.size();

        int[][]arr = new int[n][2];
        int m = 0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            arr[m][0] = entry.getKey();
            arr[m][1] = entry.getValue();
            m++;
        }
        pair[] list = new pair[n];
        for(int i=0;i<n;i++){
            list[i] = new pair(arr[i][0],arr[i][1]);
        }
        Arrays.sort(list,(a,b)->b.col - a.col);
        for(int i=0;i<k;i++){
            ans[i] = list[i].row;
        }
        return ans;
        
    }
}
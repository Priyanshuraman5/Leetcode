class Solution {
    public int maxArea(int[] height) {
        int end = height.length-1;
        
        int start = 0;
        int max = 0;

        while(start<end){
            int diff = Math.abs(end - start);

            int min = Math.min(height[start],height[end]);

            int mul = diff * min;

            max = Math.max(max , mul);

            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;
            }


        }
        return max;
        
    }
}
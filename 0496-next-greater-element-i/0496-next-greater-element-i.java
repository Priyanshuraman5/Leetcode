class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nge = new int[nums1.length];
        Arrays.fill(nge,-1);
        for(int i=0;i<nums1.length;i++){
            int idx = -1;
            for(int j = 0; j < nums2.length; j++){
                if(nums2[j] == nums1[i]){
                    idx = j;
                    break;
                }
            }
            for(int j=idx+1;j<nums2.length;j++){
                if(nums1[i]<nums2[j]){
                    nge[i] = nums2[j];
                    break;
                }
                
            }
        }
        return nge;
    }
}
        
    

class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        Arrays.sort(nums1);
        int[] nums2 = new int[n];
        nums2[0] = nums1[0];
        for(int i=1;i<n;i++){
            if(nums2[i-1] % 2==0){
                if(nums1[i]%2!=0 || (nums1[i]-nums2[i-1])%2!=0){
                    return false;
                }
                else{
                    if(nums1[i]%2==0){
                        nums2[i] = nums1[i];
                    }
                    else{
                        nums2[i] = nums1[i] - nums2[i-1];
                        // if(nums2[i]<0){
                            // return false;
                        // }
                    }
                }
            }
            else{
                if(nums1[i]%2==0 && (nums1[i]-nums2[i-1])%2==0){
                    return false;
                }
                else{
                    if(nums1[i]%2!=0){
                        nums2[i] = nums1[i];
                    }
                    else{
                        nums2[i] = nums1[i] - nums2[i-1];
                        // if(nums2[i]<0){
                        //     return false;
                        // }
                    }
                }
            }
        }
        if(nums2[0]%2==0){
            for(int i=0;i<n;i++){
                if(nums2[i]%2!=0){
                    return false;
                }
            }
        }
        else{
            for(int i=0;i<n;i++){
                if(nums2[i]%2==0){
                    return false;
                }
            }
        }
        return true;
    }
}
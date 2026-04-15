// class Solution {
//     public int[] countBits(int n) {
//         int[] ans = new int[n+1];       
//         int j = 0;
//         for(int i=0;i<=n;i++){
//             int count = 0;
//             int  Binary = Integer.parseInt(Integer.toBinaryString(i));
//             while(Binary>0){
//                 int digit = Binary % 10;
//                 if(digit==1) count++;
//                 Binary /= 10;
//             }
//             ans[j++] = count;
//         }
//         return ans;
//     }
// }
class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];       
        int j = 0;
        for(int i=0;i<=n;i++){
            int count = 0;
            int num = i;
            while(num>0){
                if((num & 1) == 1) count++;
                num >>= 1;
            }
            ans[j++] = count;
        }
        return ans;
    }
}
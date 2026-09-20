class Solution {
    public int reverseDegree(String s) {
        int[] arr = new int[26];
        for(int i=0;i<26;i++){
            arr[i] = 26-i; 
        }
        int n = s.length();
        int i = 0;
        int sum = 0;
        while(i<n){
            char ch = s.charAt(i);
            sum += arr[ch - 'a']*(i+1);
            i++;
        }
        return sum;
    }
}
class Solution {
    public int characterReplacement(String s, int k) {
        int j = 0;
        int maxLen = 0;
        int n = s.length();
        int count = 0;
        int[] freq = new int[26];
        int maxFreq = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            freq[ch-'A']++;
            maxFreq = Math.max(maxFreq,freq[ch-'A']);
            while((i-j+1)-maxFreq>k){
                freq[s.charAt(j)-'A']--;
                j++;
                
            }
            maxLen = Math.max(i-j+1,maxLen);
        }
        return maxLen;
    }
}
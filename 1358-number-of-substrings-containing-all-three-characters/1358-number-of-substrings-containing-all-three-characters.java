class Solution {
    public int numberOfSubstrings(String s) {
        
        int n = s.length();
        // HashMap<Character,Integer> map = new HashMap<>();
        int j = 0;
        int[]freq = new int[3];
        int ans = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
            while(freq[0]>0 && freq[1]>0 && freq[2]>0){

                ans += n - i;
                freq[s.charAt(j)-'a']--;
                j++;
            }

        }
        return ans;
    }
}
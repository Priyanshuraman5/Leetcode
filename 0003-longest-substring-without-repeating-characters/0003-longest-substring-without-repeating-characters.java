class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int j = 0;
        int maxLen = 1;
        Set<Character> set = new HashSet<>();
        for(int i=0;i<n;i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(s.charAt(i));
            
            maxLen = Math.max(maxLen,i-j+1);
        }
        return maxLen;
    }
}
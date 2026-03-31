class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> ch = new HashSet<>();
        int n=s.length();
        int j=0;
        int maxlen=0;
        for(int i=0;i<n;i++){
            while(ch.contains(s.charAt(i))){
                ch.remove(s.charAt(j));
                j++;
            }
            ch.add(s.charAt(i));
            maxlen=Math.max(maxlen,i-j+1);
        }
        return maxlen;
    }
}






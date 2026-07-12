class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n==0) return 0;
        int j = 0;
        int max = 1;
        Set<Character> set = new HashSet<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(ch);
            max = Math.max(max,i - j + 1);
        }
        return max;
    }
}
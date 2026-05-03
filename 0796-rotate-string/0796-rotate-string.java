class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        int n = s.length();
        int m = goal.length();
        char ch1 = goal.charAt(0);
        for(int index=0;index<n;index++){

            if(ch1 != s.charAt(index)) continue;

            int i=index;
            int j = 0;

            while(i<n && j<m){
                if(s.charAt(i)!=goal.charAt(j)){
                    break;
                }
                i++;
                j++;
            }

            i = 0;

            while(i<n && j<m){
                if(s.charAt(i)!=goal.charAt(j)){
                    break;
                }
                i++;
                j++;
            }
            if(j==n) return true;
        }
        return false;

    }
}
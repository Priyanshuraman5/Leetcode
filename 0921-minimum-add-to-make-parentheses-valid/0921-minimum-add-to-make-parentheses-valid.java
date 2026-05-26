class Solution {
    public int minAddToMakeValid(String s) {
        int count1 = 0;
        int bracket = 0;
        for(int i=0;i<s.length();i++){
            if(count1>0 && s.charAt(i)==')'){
                count1--;
                bracket++;
            }
            else if(s.charAt(i)=='('){
                count1++;
            }    
        }
        return s.length()-2*bracket;
    }
}
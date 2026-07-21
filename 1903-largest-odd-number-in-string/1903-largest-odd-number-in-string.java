class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        int idx = -1;
        for(int i=n-1;i>=0;i--){
            int digit = num.charAt(i) - '0';
            if(digit%2!=0){
                idx = i;
                break;
            }
        }
        if(idx==-1){
            return "";
        }
        StringBuilder str = new StringBuilder();
        for(int i=0;i<=idx;i++){
            str.append(num.charAt(i));
        }
        return str.toString();
    }
}
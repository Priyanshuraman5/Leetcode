class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n = strs.length;
        String last = strs[n-1];
        String first = strs[0];
        int i=0;
        StringBuilder sb = new StringBuilder();
        while(i<last.length() && i<first.length()){
            if(last.charAt(i)==first.charAt(i)) sb.append(last.charAt(i));
            else{
                break;
            }
            i++;
        }
        if(i==0) return "";
        return sb.toString();
    }
}
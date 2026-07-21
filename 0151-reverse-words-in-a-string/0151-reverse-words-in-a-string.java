class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        Stack<String> st = new Stack<String>();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                if(str.length()>0){
                    st.push(str.toString());
                    str.setLength(0);
                }
            }
            else{
                str.append(ch);
            }
        }
        if(str.length()>0){
            st.push(str.toString());
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
            if(!st.isEmpty()){
                ans.append(' ');
            }
        }
        return ans.toString();
        
    }
}
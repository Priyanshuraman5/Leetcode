class Solution {
    
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        
        int n = s.length();
        int count = 0;
        st.push(-1);
        
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    count = Math.max(count,i-st.peek());
                }
            }
        }
        return count;
        

    }
}
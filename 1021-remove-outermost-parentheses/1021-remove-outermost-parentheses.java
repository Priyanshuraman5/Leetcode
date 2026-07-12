class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        StringBuilder str = new StringBuilder();
        int counter = 0;
        Stack<Character> st = new Stack();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='('){
                if(counter>0){
                    str.append(ch);
                }
                counter++;
            }
            else if(ch==')'){
                counter--;
                if(counter>0) {
                    str.append(ch);
                }
            }
        }
        return str.toString();
        
    }
}
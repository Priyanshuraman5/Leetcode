class Solution {
    public String decodeString(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch==']'){
                StringBuilder str = new StringBuilder();
                while(!st.isEmpty()){
                    char store = st.pop();
                    if(store=='['){
                        break;
                    }
                    str.append(store);
                }
                str.reverse();
                StringBuilder newstr = new StringBuilder();
                while(!st.isEmpty() && Character.isDigit(st.peek())){    
                    newstr.append(st.pop());   
                }
                int x = Integer.parseInt(newstr.reverse().toString());
                StringBuilder sb = new StringBuilder();
                for(int k=0;k<x;k++){
                    sb.append(str);
                }
                String stri = sb.toString();
                int j = 0;
                while(j<stri.length()){
                    st.push(stri.charAt(j));
                    j++;
                }
            }

            else{
                st.push(ch);
            }
        }
        StringBuilder ans = new StringBuilder();

        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();

    }
}
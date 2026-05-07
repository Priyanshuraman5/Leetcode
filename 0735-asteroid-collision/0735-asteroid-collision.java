class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]>0){
                st.push(asteroids[i]);
            }
            else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(asteroids[i])){
                    st.pop();
                }                    
                if(st.isEmpty() || st.peek()<0 ){
                    st.push(asteroids[i]);
                }
                if(st.peek()==Math.abs(asteroids[i])){
                    st.pop();
                }
            }
        }
        int size = st.size();
        int[] ans = new int[size];
        int i =0;
        for(i=size-1;i>=0;i--){
            ans[i] = st.pop();
        }
        return ans;
    }
}

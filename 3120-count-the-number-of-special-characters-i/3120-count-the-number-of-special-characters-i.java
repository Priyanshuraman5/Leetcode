class Solution {
    public int numberOfSpecialChars(String word) {
        
        int n = word.length();

        int[] small = new int[26];
        int[] big = new int[26];

        for(int i=0;i<n;i++){
            char ch = word.charAt(i);

            if(ch>='a' && ch <='z'){
                small[ch-'a'] = 1;
            }
            else if(ch>='A' && ch <= 'Z'){
                big[ch-'A'] = 1;
            }
        }

        int count = 0;
        for(int i=0;i<26;i++){
            if(small[i]==1 && big[i]==1){
                count++;
            }
        }
        return count;

    }
}
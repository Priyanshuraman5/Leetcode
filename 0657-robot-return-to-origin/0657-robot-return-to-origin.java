class Solution {
    public boolean judgeCircle(String moves) {
        int Ucount = 0;
        int Lcount = 0;
        int Dcount = 0;
        int Rcount = 0;
        for(int i=0;i<moves.length();i++){
            char ch = moves.charAt(i);
            if(ch=='U') Ucount++;
            else if(ch=='D') Dcount++;
            else if(ch=='L') Lcount++;
            else Rcount++;
        }
        if(Ucount == Dcount && Lcount == Rcount) return true;
        return false;
        
        
    }
}
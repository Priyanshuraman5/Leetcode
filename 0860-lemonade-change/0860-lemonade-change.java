class Solution {
    public boolean lemonadeChange(int[] bills) {
   
        int count5 = 0;
        int count10 = 0;
        int count20 = 0;
        int n = bills.length;
        for(int i=0;i<n;i++){
            if(bills[i]==5) count5++;
            else if(bills[i]==10){
                count10++;
                count5--;
            }
            else{
                if(count10==0){
                    count5 -= 3;
                }
                else{
                    count10--;
                    count5--;
                }
                count20++;
                
            }
            if(count5<0 || count10<0 || count20<0) return false;
        }
        return true;
    }
}
class Solution {
    public boolean checkPerfectNumber(int num) {
        int x = num;
        if(num==0){
            return true;
        }
        int sum = 0;
        for(int i=1;i<=num/2;i++){
            if(x % i==0){
                sum += i;
            }
            
        }
        if(sum==num){
            return true;
        }
        return false;
    }
}
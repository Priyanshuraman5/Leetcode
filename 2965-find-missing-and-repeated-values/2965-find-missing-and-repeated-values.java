class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long sum = 0;
        long sq = 0;
        int m = grid.length;
        int n = m*m;
        long Nsum = 1L*n*(n+1)/2;
        long Nsq = 1L*n*(n+1)*(2*n+1)/6;

        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                sum += grid[i][j];
                sq += (1L) * grid[i][j]*grid[i][j];
            }
        }

        long diffsum = Nsum - sum;
        long diffsq = Nsq - sq;

        long div = (diffsq/diffsum);

        int missing =(int) ((div+diffsum)/2);
        int repeating = (int) (missing - diffsum);

        return new int[]{repeating,missing};



    }
}
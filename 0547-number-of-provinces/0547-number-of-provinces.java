class Solution {
    public int findCircleNum(int[][] isConnected) {
        int m = isConnected.length;
        int n = isConnected[0].length;
        int count = 0;
        boolean[] isVis = new boolean[m];
        for(int i=0;i<m;i++){
            if(!isVis[i]){
                bfs(isConnected,i,isVis);
                count++;
            }
        }
        return count;
    }
    public void bfs(int[][] isConnected,int src,boolean[] isVis){
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        isVis[src] = true;
        while(!q.isEmpty()){
            int poll = q.poll();
            for(int i=0;i<isConnected.length;i++){
                if(isConnected[poll][i]==1 && !isVis[i]){
                    isVis[i] = true;
                    q.add(i);
                }
            }
        }
    }
    // class Pair{
    //     int row;
    //     int col;
    //     public Pair(int row, int col){
    //         this.row = row;
    //         this.col = col;
    //     }
    // }
    // public void bfs(int[][] isConnected,int row, int col,boolean[][] isVis){
    //     int m = isConnected.length;
    //     int n = isConnected[0].length;
    //     Queue<Pair> q = new LinkedList<>();
    //     q.add(new Pair(row,col));
    //     isVis[row][col] = true;
    //     while(!q.isEmpty()){
    //         Pair p = q.poll();
    //         int currRow = p.row;
    //         int currCol = p.col;
    //         int[] remRow = {1,-1,0,0};
    //         int[] remCol = {0,0,-1,1};
    //         for(int i=0;i<4;i++){
    //             int newRow = remRow[i] + currRow;
    //             int newCol = remCol[i] + currCol;
    //             if(newRow>=0 && newCol>=0 && newRow<m && newCol<n && isConnected[newRow][newCol]==1 && !isVis[newRow][newCol]){
    //                 q.add(new Pair(newRow,newCol));
    //                 isVis[newRow][newCol] = true;
    //             }
    //         }
    //     }
    // }
}